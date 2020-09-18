package git;
import java.util.ArrayList;


/**
 * Clase que representa la lista de commits, representando asi tambien las 
 * operaciones sobre esta misma.
 * @author Bastian Onetto
 */
public class CommitList {
    ArrayList<Commit> CL;
    
    //constructor
    public CommitList(){
    }

    /**
     * inicializador del commit con los valores por defecto (lista vacia).
     */
    public void startCommitList() {
        this.CL = new ArrayList<Commit>();
    }
    
    /**
     * Metodo el cual ingresa un commit nuevo a la lista.
     * @param c que representa el commit entrante, el que sera agregado.
     */
    public void addCommit(Commit c){
        Commit com = c;
        this.CL.add(com);
    }
    
    /**
     * Metodo con el cual podemos reemplazar la lista de commit entera con
     * una nueva/entrante .
     * @param cl que representa la lista de commits entrante
     */
    public void setCommitList(CommitList cl){
        this.CL = cl.CL;
    }
    
    /**
     * Metodo con el cual se agregan los commits desde el local repository
     * al remote repository, partiendo desde el primer commit que no exista en 
     * el remote repository.
     * @param cl el cual representa una lista de commits para agregar al
     *           repositorio
     */
    public void pushCommits(CommitList cl){
        int inicio = this.CL.size();
        //comenzamos desde la cantidad de archivos que tenemos
        for(int i = inicio; i<cl.CL.size(); i++){
            cl.CL.get(i).printCommit(i);
            this.addCommit(cl.CL.get(i));
        }
    }
    
    /**
     * Metodo que nos entrega por pantalla cada commit en la lista.
     */
    public void printCommitList(){
        //verificamos si la lista no esta vacia
        if(!this.CL.isEmpty()){
            //de no estar vacia, se imprime cada uno de los commits
            for(int i = 0; i < this.CL.size(); i++){
                this.CL.get(i).printCommit(i+1);
            }
        }else{
            //de estar vacia, se imprime lo siguiente
            System.out.print("Lista de Commits Vacia\n");
        }
    }

}
