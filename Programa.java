import java.util.Scanner;

/**
 * Clase para representar el Programa Completo
 * y el menu.
 * Cada programa queda definido como el Repositorio Git que se ira
 * modificando.
 * @author Bastian Onetto
 */
public class Programa {
    private GitRepo gitRep;

    /**
     * Metodo main que ejecuta en orden las funciones necesarias para el funcionamiento
     * como el menu y el start
     * @param args 
     */
    public static void main(String[] args){
        Programa myPrograma = new Programa();
        myPrograma.start();
        myPrograma.menu();
    }

    public Programa() {
        this.gitRep = new GitRepo();
    }
    
    /**
     * Metodo inicializador del programa, lo cual lo que hace es preparar el 
     * repositorio git para su uso con los parametros correspondientes
     */
    public void start(){
        Scanner sc = new Scanner(System.in);
        String n;
        String a;
        System.out.printf("Indique el nombre del Proyecto: ");
        n = sc.nextLine();
        System.out.printf("Indique el autor del Repositorio: ");
        a = sc.nextLine();
        GitRepo g = new GitRepo();
        //Aqui es cuando le damos los 2 strings al Repositorio
        g.gitInit(a, n);
        this.gitRep = g;
    }
    /**
     * Metodo que muestra un menú, enumerando las opciones disponibles en el programa,
     * cada funcion nos entrega los cambios en el repositorio Git.
     */
    public void menu(){
        /*creamos una variable par a inicuar un ciclo, el cual indicará la ejecucion del
        menu del programa*/
        int exit = 0;
        String opcion; 
        while (exit == 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Indique la siguiente Accion: ");
            System.out.println("1. Crear Archivo.");
            System.out.println("2. Add.");
            System.out.println("3. Commit.");
            System.out.println("4. Push.");
            System.out.println("5. Pull.");
            System.out.println("6. Status.");
            System.out.println("7. Opciones de Muestra.");
            System.out.println("8. Salir.");
            System.out.printf("Opcion: ");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    this.gitRep.gitCreateFile();
                    break;
                case "2":
                    this.gitRep.gitAdd();
                    break;
                case "3":
                    this.gitRep.gitCommit();
                    break;
                case "4":
                    this.gitRep.gitPush();
                    break;
                case "5":
                    this.gitRep.gitPull();
                    break;
                case "6":
                    this.gitRep.gitStatus();
                    break;
                case "7":
                    //Esta opcion es la cual nos lleva al menu de Debug
                    this.debug();
                case "8":
                    System.out.println("Terminando.");
                    exit = 1;
                    break;
                default:
                    System.out.println("Por favor ingrese un valor coherente");
                    break; 
            }
            
        }
    }
    /**
     * Funcion que entrega un par de opciones para ver en detalles el estado del
     * repositorio git.
     */
    public void debug(){
        int exit = 0;
        String opcion; 
        while (exit == 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nMenu Muestras: ");
            System.out.println("a. Imprimir Workspace.");
            System.out.println("b. Imprimir Index.");
            System.out.println("c. Imprimir Local repo.");
            System.out.println("d. Imprimir Remote repo.");
            System.out.println("e. Imprimir all git / status.");
            System.out.println("f. Go Back");
            System.out.printf("Opcion: ");
            opcion = sc.nextLine();
            switch(opcion){
                //Cada opcion va con su formato respectivo y titulo
                case "a":
                    System.out.println("------------Workspace--------------");
                    this.gitRep.getZonas().workspace.printFolder();
                    System.out.println("------------------------------------");
                    break;
                case "b":
                    System.out.println("--------------Index----------------");
                    this.gitRep.getZonas().index.printFolder();
                    System.out.println("------------------------------------");
                    break;
                case "c":
                    System.out.println("---------Local-Repository----------");
                    this.gitRep.getZonas().local.printRepo();
                    System.out.println("------------------------------------");
                    break;
                case "d":
                    System.out.println("---------Remote-Repository----------");
                    this.gitRep.getZonas().remote.printRepo();
                    System.out.println("------------------------------------");
                    break;
                case "e":
                    System.out.println("------------------------------------");
                    System.out.println("------------Workspace--------------");
                    this.gitRep.getZonas().workspace.printFolder();
                    System.out.println("--------------Index----------------");
                    this.gitRep.getZonas().index.printFolder();
                    System.out.println("---------Local-Repository----------");
                    this.gitRep.getZonas().local.printRepo();
                    System.out.println("---------Remote-Repository----------");
                    this.gitRep.getZonas().remote.printRepo();
                    System.out.println("------------------------------------");
                    break;
                case "f":
                    exit = 1;
                    break;
                default:
                    System.out.println("Por favor ingrese un valor coherente");
            }
        }           
    }

}
