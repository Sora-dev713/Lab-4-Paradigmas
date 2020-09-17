
/**
 * Clase que representa tanto al Workspace como al Index, puesto que estos
 * tienen caracteristicas similares
 * cada LocalFolder consiste de su indicador, que es el "Nombre" (Workspace o
 * Index) y la lista de archivos de este.
 * @author Bastian Onetto
 */
public class LocalFolder {
    String indicator;
    FileList list;

    //constructor
    public LocalFolder() {
    }
    
    
    
    
    /**
     * Metodo que inicializa el LocalFolder con sus valores por defecto 
     * predeterminados, tomando como entrada el nombre.
     * @param s que representa el nombre del LocalFolder 
     */
    public void LocalFolder(String s){
        //comprobamos el nombre
        if ("Index".equals(s) || "Workspace".equals(s)){
            this.indicator = s;
        }
        //iniciamos la lista de archivos
        FileList fl = new FileList();
        fl.startFileList();
        //la agregamos.
        this.list = fl;
    }
    
    /**
     * Metodo que sobreescribe la lista de archivos por una nueva/entrante. 
     * @param ls que representa la lista de archivos. 
     */
    public void setFileList(FileList ls){
        this.list = ls;
    }
    
    /**
     * Metodo el cual intenta añadir un archivo a la lista de archivo del Folder
     */
    void addToFolder() {
        this.list.addFile();
    }
    
    /**
     * Funcion que dado el local folder, borra su lista de archivos, dejandola 
     * vacia
     */
    public void clearFolder(){
        this.list.clearFileList();
    }
    
    /**
     * Metodo de caracter informativo que imprime el folder
     */
    void printFolder(){
        System.out.printf("Folder: %s\nFiles:\n", this.indicator);
        this.list.printFileList();
    }
}
