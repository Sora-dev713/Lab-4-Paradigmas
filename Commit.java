
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * Clase que representa los commit, los cuales presentan los siguientes
 * atributos:
 * -Fecha del Commit: commDate
 * -Mensaje descriptivo del commit: mensaje
 * -lista de archivos perteneciente al commit: fileList.
 * @author Bastian Onetto
 */
public class Commit {
    Date commDate;
    String mensaje;
    FileList fileList;
    
    
    //constructor
    public Commit(){
    }

    /**
     * creador del Commit, el cual toma la lista de archivos como parametro
     * y luego pregunta por el mensaje y la fecha, para asignar los valores que 
     * corresponden en cada punto.
     * @param Fl que es la lista de archivos para el commit 
     */
    public void makeCommit(FileList Fl) {
        //inicializamos la fecha y la lista de archivos
        this.commDate = new Date();
        this.fileList = new FileList();
        //inicilizamos la lista de archivos
        this.fileList.startFileList();
        //mezclamos esa lista con la entrante.
        this.fileList.mergeFiles(Fl);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca el mensaje descriptivo: ");
        String msj = sc.nextLine();
        //verificamos si el mensaje es de minimo 1 caracter de largo o no.
        while(msj.length() == 0){
            System.out.printf("El mensaje no puede quedar vacio, reintente: ");
            msj = sc.nextLine();
        }
        //agregamos el mensaje
        this.mensaje = msj;   
    }
    
    /**
     * Metodo de caracter informativo, la cual nos imprime por pantalla los 
     * commits, dandole un numero para reconocerlos.
     * @param i que es el numero del commit
     */
    public void printCommit(int i){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.printf("Commit Numero: %d\nFecha: %s\nMensaje: '%s'\nArchivos:", i, formatter.format(this.commDate), this.mensaje);
        //imprimimos solamente los nombres de los archivos.
        this.fileList.printFileNames();
        System.out.println("");
    }
}
