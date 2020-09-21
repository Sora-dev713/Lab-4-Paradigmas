package git;
import java.util.ArrayList;


/**
 * FileList es la clase diseñada para representar el listado de archivos (clase 
 * File) que compondra tanto los LocalFolder como los Commits y el repositorio.
 * @author Bastian Onetto
 */
public class FileList {
    public ArrayList<File> FL;

    public FileList() {
    }
    
    /**
     *Inicializador con los valores por defectos predeterminados de FileList 
     * (lista vacia)
     */
    public void startFileList() {
        ArrayList<File> fl = new ArrayList<File>();
        this.FL = fl;
    }
    
    /**
     * Metodo diseñado para separar visualmente cuando se refiere a la cantidad 
     * de elementos en la lista de archivos.
     * @return la cantidad de elementos de la lista 
     */
    public int largo(){
        return this.FL.size();
    }
    
    /**
     * Funcion que verifica si es que existe un archivo ya con el mismo
     * nombre en la lista
     * @param f que representa el archivo entrante
     * @return Verdadero o Falso dependiendo del caso
     */
    public boolean checkDuplicate(File f){
        //generamos el valor por defecto
        boolean verif = false;
        //vemos si hay archivos que analizar
        if(!this.FL.isEmpty()){
            //en caso de haber archivos, se revisa uno por uno
            for(int i= 0; i < FL.size(); i++){
                if (this.FL.get(i).nombre.equals(f.nombre)){
                    //si el nombre es el mismo, el verificador queda en true
                    verif = true;
                }
            }
        }
        return verif;
    }
    
    /**
     * Metodo diseñado para crear un archivo y luego insertarlo dentro de
     * la lista de archivos
     */
    void addFile() {
        //Creamos el archivo
        File f = new File();
        f.createFile();
        //Lo añadimos a la lista
        this.addFiles(f);
    }
    /**
     * Metodo que toma un archvo y lo ingresa en una lista, siguientdo las
     * comprobaciones necesarias, puesto que este puede existir ya
     * @param f que representa el archivo entrante a la lista
     */
    public void addFiles(File f){
        //si la lista no esta vacia
        if(!this.FL.isEmpty()){
            //comprobamos si ya existe
            if(this.checkDuplicate(f)){
                //de existir, lo sobrescribimos
                this.updateFile(f);
            }else{
                //si no, lo agregamos
                this.appendFile(f);
            }
        //si lo está, lo agregamos
        }else{
            this.appendFile(f);
        }
    }
    
    /**
     * Metodo encargado de agregar el archivo a la lista
     * @param f que es el archivo entrante
     */ 
    public void appendFile(File f){
        this.FL.add(f);
    }
    
    /**
     * Metodo que reemplaza un FileList por uno nuevo/entrante.
     * @param fl que representa el FileList entrante
     */
    public void setFileList(FileList fl){
        this.FL = fl.FL;
    }
    
    /**
     * Metodo encargado de reemplazar el archivo en la lista por otro 
     * del mismo nombre
     * @param f que es el nuevo archivo entrante
     */  
    public void updateFile(File f){
        for(int i = 0; i < this.FL.size() ; i++){
            if (this.FL.get(i).nombre.equals(f.nombre)){
                this.FL.set(i, f);
            }
        }
    }
    
    /**
     * Metodo por el cual se mezclan 2 listas de archivos, reemplazando en caso
     * de haber archivos repetidos o con el mismo nombre
     * @param fl que indica la lista de archivos entrantes
     */
    public void mergeFiles(FileList fl){
        //Generamos una lista de archivos vacia
        FileList newFileList;
        newFileList = new FileList();
        newFileList.startFileList();
        //Luego, añadimos todos los archivos de la lista base
        File f;
        for(int i=0; i<this.FL.size(); i++){
            f = this.FL.get(i);
            newFileList.addFiles(f);
        }
        //luego, agregamos a la lista cada archivo de la lista entrante
        for(int i=0; i<fl.FL.size(); i++){
            f = fl.FL.get(i);
            newFileList.addFiles(f);
        }
        //terminado eso, reemplazamos la lista anterior.
        this.FL = newFileList.FL;
    }
    
    /**
     * Clase encargada de generar una lista de archivos a partir de una lista 
     * con los nombres.
     * @param sl que representa la lista de nombres
     * @return una lista de archivos.
     */
    public FileList getFromFileList(ArrayList<String> sl){
        //Inicializamos una nueva lista de archivos
        FileList newFileList = new FileList();
        newFileList.startFileList();
        //iniciamos un validador
        int validador;
        for(int i = 0; i < sl.size(); i++){
            //por cada iteracion se lleva el validador a 0
            validador = 0;
            /*revisamos cada archivo de la lista, si existe, el validador cambia
            a 1 y se agrega a la lista*/
            for(int j = 0; j < this.largo(); j++){
                File f = this.FL.get(j);
                if(f.nombre.equals(sl.get(i))){
                    validador = 1;
                    newFileList.addFiles(f);
                }
            }
            //en el caso de terminar la revision y no encontrar el archivo.
            if (validador == 0){
                System.out.printf("No se encontro el archivo %s.\n", sl.get(i));
            }
        }
        return newFileList;
    }
    
    /**
     * Metodo utilizado para limpiar la lista de archivos
     */
    public void clearFileList(){
        this.FL.clear();
    }
    
    /**
     * Metodo que imprime la lista de archivos, mostrando todos los componentes
     * del archivo
     */
    public void printFileList(){
        for(int i=0; i < this.largo(); i++){
            this.FL.get(i).printFile();
            System.out.println("");
        }
    }
    
    /**
     * Metodo que entrega visualmente una lista de archivos, mostrando solamente
     * el nombre de estos
     */
    public void printFileNames() {
        //verificamos que la lista no este vacia
        if(!this.FL.isEmpty()){
            for(int i= 0; i < this.FL.size(); i++){
                // en el caso de que sea el final, imprimimos con un "."
                if(i == (this.FL.size()-1)){
                    System.out.printf("%s.\n", this.FL.get(i).nombre);
                //si no, se imprime con una coma de separacion
                }else{
                    System.out.printf("%s, ", this.FL.get(i).nombre);
                }
            }
        }else{
            System.out.print("La lista de archivos esta vacia.");
        }
    }
}
