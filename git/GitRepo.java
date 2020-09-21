package git;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Clase que representa el repositorio de Git completo, compuesto por el 
 * el  nombre del autor del Proyecto, el nombre del mismo, la fecha de creacion
 * y las zonas necesarias del Repositorio
 * @author Bastian Onetto
 */
public class GitRepo {
    public String autor;
    public Date fecha;
    public String nombreProyecto;	
    public Zonas zonas;

    //constructor    
        
    public GitRepo(){
        this.autor = "";
        this.fecha = null;
        this.nombreProyecto = "";
        this.zonas = new Zonas();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Zonas getZonas() {
        return zonas;
    }

    public void setZonas(Zonas zonas) {
        this.zonas = zonas;
    }

    /**
     * Inicializador del repositorio en Git, recibe como argumentos
     * tanto el nombre del autor y el nombre del proyecto mismo.
     * @param auth que es el nombre del autor del repositorio
     * @param nombre que es el nombre del proyecto
     */
    public void gitInit(String auth, String nombre) {
        this.autor = auth;
        this.nombreProyecto = nombre;
        //se inicializa la fecha como dato.
        Date d= new Date();
        this.fecha =d;
        //se crea el objeto Zonas
        Zonas z = new Zonas();
        //Se inicializan de forma concreta los valores de Zona.
        z.initZonas();
        this.zonas = z;
    }

    /**
     * Metodo gitCreateFile es el que nos permite crear archivos en el
     * workspace.
     */
    public void gitCreateFile(){
        this.zonas.agregarAWorkspace();
    }

    public void gitCreateFile(String a, String b){
        File file = new File();
        file.createFile(a, b);
        this.zonas.workspace.list.addFiles(file);
    }


    /**
     * Metodo que le pide al usuario una lista de archivos para agregarlos
     * al index, o con "all" que hace que se agreguen todos
     */
    public void gitAdd(){
        /*Llamamos a la lista de archios*/
        ArrayList<String> addInput;
        addInput = tomaDatosAdd();
        //verificamos si la entrada es o no "all"
        if(addInput.size() >= 1){
            if(addInput.size() == 1){
                if(addInput.get(0).equals("all")){
                    //si es all se agregan todos
                    this.zonas.addAllToIndex();
                }else{
                    //si no, se agregan los de la lista
                    this.zonas.addToIndex(addInput);
                }
            //si no, se agregan los de la lista
            }else{
                this.zonas.addToIndex(addInput);
            }
        }
    }
    /**
    * Metodo necesario para poder obtener, del usuario, 
    * @return una lista de Strings para usar en la funcion gitAdd. 
    */
    public ArrayList<String> tomaDatosAdd(){
        // 
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese la lista de archivos a añadir o 'add' para añadir todos.\n(Los archivos van eparados por nada mas que una coma):\n");
        String listaS = sc.nextLine();
        while(listaS.length() == 0){
            System.out.printf("La lista no puede quedar vacia, por favor reintente: ");
            listaS = sc.nextLine();
        }
        String[] splitList;
        splitList = listaS.split(",");
        ArrayList<String> newList;
        newList = new ArrayList<String>();
        for (String splitList1 : splitList) {
            if (!"".equals(splitList1)) {
                newList.add(splitList1);
            }
        }
        if(newList.isEmpty()){
            System.out.println("La lista ha quedado vacia, por favor reintente.");
            newList = tomaDatosAdd();
        }
        return newList;
    }
    /**
     * gitCommit es el metodo con el cual podemos crear un commit, el cual 
     * quedara guardado en el repositorio local, al terminar eso, se limpia 
     * el index para esperar mas archivos para un commit.
     */
    public void gitCommit(){
        this.zonas.doCommit();
        this.zonas.index.clearFolder();
    }
    
    public void gitCommit(String m){
        this.zonas.doCommit(m);
        this.zonas.index.clearFolder();
    }

    /**
     * Este es el metodo con el cual llevamos los commits desde el local 
     * repository al remote repository.
     */
    public void gitPush(){
        this.zonas.push();
    }
    /**
     * Metodo con el cual traemos al workspace todos los archivos del remote
     * repository.
     */
    public void gitPull(){
        this.zonas.pull();
    }

    /**
     * El metodo gitStatus() nos entrega de manera visual los datos del
     * estado actual en el cual se encuentra el repositorio del proyecto
     * con la identificacion correspondiente.
     */
    public void gitStatus(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        int work, ind, com;
        /*llamamos a la cantidad de archivos existentes en tanto el index
        como en el workspace, tambien llamamos la cantidad de commits en
        el local repository, lo cual servira para hacer la verificacion 
        del remote repository*/
        work = this.zonas.workspace.list.largo();
        ind = this.zonas.index.list.largo();
        com = this.zonas.local.commitList.CL.size();
        //llamamos al metodo verificador del estado del remote repository
        boolean rep = this.zonas.remAlDia(com);
        //luego mostramos todo por pantalla
        System.out.printf("Nombre Proyecto: %s.\n"
                + "Nombre Autor: %s.\n"
                + "Fecha Creacion: %s\n"
                + "####Estado Actual####\n"
                + "Cantidad de Archivos:\n"
                + "En Workspace: %d\n"
                + "En Index: %d\n"
                + "Cantidad de Commits en Local: %d\n"
                + "Remote al dia: %b\n\n",
                this.nombreProyecto, this.autor, formatter.format(this.fecha), work, ind, com, rep);
    }
        
}
