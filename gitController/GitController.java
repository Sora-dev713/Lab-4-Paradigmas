/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitController;
import git.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author centr
 */
public class GitController {
    
    public ArrayList<String> getWorkNameList(LocalFolder W ){
        ArrayList<String> ListaNombres = new ArrayList<>();
        for (int i = 0; i<W.list.largo(); i++){
            ListaNombres.add(W.list.FL.get(i).getName());
        }
        return ListaNombres;
    }
    
    public String LocFoldToString(LocalFolder L){
        String s = L.indicator + ": \n Archivos presentes: " + L.list.FL.size()+ "\n Archivos: ";
        for(int i = 0; i< L.list.FL.size(); i++){
            if(i != 0){
                s = s+ ", ";
            }
            s = s + L.list.FL.get(i).getName();
        }
        s = s + ".";
        return s;
    }
    
    public String CommitToString(Commit C){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String s = "Commit:\n Fecha: " + formatter.format(C.commDate) + "\n Mensaje: '"+ C.mensaje +"'\n Lista de archivos: ";
        for(int i = 0; i< C.fileList.FL.size(); i++){
            if(i != 0){
                s = s+ ", ";
            }
            s = s + C.fileList.FL.get(i).getName();
        }
        s = s + ".";
        return s;
    }
    
    public String RepoToString(Repository R){
        String s = R.repoName + ":\n Numero Commits: " + R.commitList.CL.size()+ "\n Ultimos 3 Commits: ";
        if(R.commitList.CL.size()>= 3){
            for (int i = 1; i <= 3; i++){
                s = s+ "\n" + CommitToString(R.commitList.CL.get(R.commitList.CL.size() - i));
            }
        }else{
            for (int i = 1; i <= R.commitList.CL.size(); i++){
                s = s+ "\n" + CommitToString(R.commitList.CL.get(R.commitList.CL.size() - i));
            }
        }
        return s;
    }
    
    public String gitStatus(GitRepo G){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String s = "Nombre Proyecto: "+ G.nombreProyecto + "\nAutor: " + G.autor + "\nFecha: "+ formatter.format(G.fecha);
        s = s + "\n" + LocFoldToString(G.zonas.workspace);
        s = s + "\n" + LocFoldToString(G.zonas.index);
        s = s + "\n" + RepoToString(G.zonas.local);
        s = s + "\n" + RepoToString(G.zonas.remote);
        return s;
    }

}
