/**
 * Clase que representa los Repositorios de las Zonas, siendo estos los que 
 * comparten las siguientes caracteristicas:
 * -Nombre del Repositorio: repoName
 * -Lista de Commits: commitList
 * -Lista de archivos en comun: repoFileList.
 * @author Bastian Onetto
 */
public class Repository {
    String repoName;
    CommitList commitList;
    FileList repoFileList;
    
    //constructor
    public Repository() {
    }


    /**
     * Metodo que inicializa el repositorio con los valores por defecto, 
     * pidiendo como parametro el identificador del repositorio.
     * @param local que es el nombre del repositorio (puede ser Local Repository
     *              o Remote Repository)
     */
    public void Repository(String local){
        //comprobamos el string
        if(local.equals("Local Repository") || local.equals("Remote Repository")){
            this.repoName = local;
            CommitList cl;
            //inicializamos una lista de commits vacia
            cl = new CommitList();
            cl.startCommitList();
            this.commitList = cl;
            //inicializamos una lista de archivos vacia
            FileList fl = new FileList();
            fl.startFileList();
            this.repoFileList = fl;
        }
    }
    /**
     * Metodo el cual agrega un commit a la lista de commits del repositorio
     * y mezcla los archivos de este en la lista de archivos del repositorio.
     * @param c que representa el commit a agregar 
     */
    public void repoCommit(Commit c){
        this.commitList.addCommit(c);
        this.repoFileList.mergeFiles(c.fileList);
    }
    
    /**
     * Funcion de prueba la cual nos entrega una representacion del estado del 
     * repositorio
     */
    void printRepo(){
        System.out.printf("\nNow Showing: %s\nCommits:\n", this.repoName);
        //imprimimos la lista de commits
        this.commitList.printCommitList();
        System.out.print("La lista de archivos es: ");
        //imprimimos la lista de archivos (solo nombre)
        this.repoFileList.printFileNames();
        
    }
}
