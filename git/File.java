package git;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Representacion de un archivo para ser trabajado, simulando un archivo de 
 * texto plano el cual consiste de el Nombre, la fecha de creacion/modificacion 
 * y el contenido de este.
 * @author Bastian Onetto
 */
public class File {
	String nombre;
        Date fecha;
	String contenido;
	
        
        //constructor
        public File(){
        }

    /**
     * Metodo que crea un archivo, para lo cual pide tanto el nombre y el
     * contenido que debera tener este
     */
    public void createFile() {
        Scanner sc = new Scanner(System.in);
        String n, c;
        System.out.printf("Indique el nombre del Archivo: ");
        n = sc.nextLine();
        while (n.isEmpty()){
            System.out.print("EL nombre no puede estar vacio, reintente: ");
            n = sc.nextLine();
        }
        System.out.printf("Contenido del archivo: ");
        c = sc.nextLine();
        while (c.isEmpty()){
            System.out.print("EL contenido no puede estar vacio, reintente: ");
            c = sc.nextLine();
        }
        this.fecha = new Date();
        this.nombre = n;
        this.contenido = c;
    }
        
        /**
         * Metodo que a partir de las 2 entradas genera un archivo con nombre, 
         * contenido y fecha
         * @param n que representa el nombre del archivo
         * @param c que representa el contenido del archivo
         */
	public void createFile(String n, String c){
            if(1 <= n.length()){
                this.nombre= n;
            }
            this.fecha = new Date();
            this.contenido = c;	
	}
        
        /**
         * Metodo de caracter informativo que muestra por pantalla el archivo.
         */
        public void printFile(){
            //le damos formato a la fecha como string
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.printf("Nombre del Archivo: %s\nFechaCreacion: %s\nContenido: %s\n", this.nombre,formatter.format(this.fecha),this.contenido);
        }
        
        
}
