package git;

import java.util.ArrayList;

/**
 * Clase Zonas:
 * Representa las 4 zonas de trabajo de un repositorio en git:
 * Workspace: es donde se concentran los archivos que se esten manipulando
 * Index: donde se preparan los archivos que se quieran llevar a un commit
 * Local Repository: lugar en el computador donde se guarda la informacion
 *                   sobre los commits hechos
 * Remote Repository: espacio "en la nube" donde se encuentren los commits 
 *                    respaldados.
 * @author Bastian Onetto
 */
public class Zonas {
    public LocalFolder workspace;
    public LocalFolder index;
    public Repository local;
    public Repository remote;

    //constructor
    public Zonas() {
    }

    
    
    /**
     * Inicializador de los datos de Zonas, con esto, cada uno de las zonas gana
     * su identificador y sus valores por defecto respectivos.
     */
    public void initZonas(){
        //generamos un nuevo objeto de cada uno
        LocalFolder w = new LocalFolder();
        w.LocalFolder("Workspace");
        LocalFolder i = new LocalFolder();
        i.LocalFolder("Index");
        Repository l;
        l= new Repository();
        l.Repository("Local Repository");
        Repository r;
        r = new Repository();
        r.Repository("Remote Repository");
        //asignamos los valores
        this.workspace = w;
        this.index = i;
        this.local = l;
        this.remote = r; 
    }
    
    /**
     * Metodo el cual llama a addToFolder, lo cual agrega archivos al Workspace.
     */
    public void agregarAWorkspace(){
        this.workspace.addToFolder();
    }
    
    /**
     * Metodo que pide una lista de nombres para obtener los archivos desde el 
     * workspace y pasarlos uno por uno al index, para realizar las revisiones 
     * necesarias
     * @param SL, que corresponde a una lista de nombres de archivos. 
     */
    public void addToIndex(ArrayList<String> SL){
        //Llamamos la lista de archivos
        FileList listaWorks;
        listaWorks = this.workspace.list.getFromFileList(SL);
        File f;
        /*colocamos uno por uno los archivos en el index, para realizar las
        revisiones necesarias*/
        for(int i = 0; i < listaWorks.largo(); i++){
            f = listaWorks.FL.get(i);
            this.index.list.addFiles(f);
        }
    }
    /**
     * Metodo el cual agrega todos los archivos del Workspace encontrados al 
     * Index.
     */
    public void addAllToIndex() {
        //Llamamos la lista de archivos
        FileList listaWorks;
        listaWorks = this.workspace.list;
        /*colocamos uno por uno los archivos en el index, para realizar las
        revisiones necesarias*/
        File f;
        for(int i = 0; i < listaWorks.largo(); i++){
            f = listaWorks.FL.get(i);
            this.index.list.addFiles(f);
        }   
    }
    
    /**
     * Funcion que permite crear un commit llamando a todos los archivos del 
     * Index y luego pidiendo el comentario respectivo, para luego colocar este 
     * commit a la cola de la lista de commits del repositorio Local
     */
    public void doCommit(){
        FileList fL = this.index.list;
        if(fL.FL.isEmpty()){
            System.out.println("El index se encuentra vacio.\n"
                    + "No se pudo acer un Commit");
        }else{
            Commit c;
        c = new Commit();
        c.makeCommit(fL);
        this.local.repoCommit(c);
        }
    }
    
    public void doCommit(String m){
        FileList fL = this.index.list;
        Commit c;
        c = new Commit();
        c.makeCommit(fL, m);
        this.local.repoCommit(c);
    }
    
    
    /**
     * Metodo que toma los commits hechos en el repositorio Local y los pasa
     * al repositorio remoto, pasando tambien la lista de archivos.
     */
    public void push(){
        //Primero llamamos la lista de commits y la pasamos al repositorio Remoto
        CommitList c1;
        c1 = this.local.commitList;
        this.remote.commitList.pushCommits(c1);
        //una vez pasados los commits, entregamos la lista de archivos
        FileList f1;
        f1 = this.local.repoFileList;
        this.remote.repoFileList.mergeFiles(f1);
    }
    
    /**
     * Metodo el cual llama los archivos del Remote Repository y los pasa a la
     * lista de archivos del workspace
     */
    public void pull(){
        FileList listToWorkspace;
        listToWorkspace = this.remote.repoFileList;
        this.workspace.list.mergeFiles(listToWorkspace);
    }
    /**
     * Metodo que comprueba si la cantidad de commits en el repositorio
     * remoto coincide con la cantidad de commits del repositorio local.
     * @param cant que representa la cantidad de Commits en el Local Repository
     * @return Verdadero o Falso segun sea el caso
     */
    public boolean remAlDia(int cant){
        boolean verif = false;
        if(this.remote.commitList.CL.size() == cant){
            verif = true;
        }
        return verif;
    }
}
