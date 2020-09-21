/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import git.GitRepo;
import gitController.*;

/**
 *
 * @author centr
 */
public class Menu extends javax.swing.JFrame {
    GitRepo gitRep;
    
    /** Creates new form Menu */
    public Menu() {
        initComponents();
        messageTxt.setVisible(false);
        this.gitRep = new git.GitRepo();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gitInnit = new javax.swing.JButton();
        addFileBtn = new javax.swing.JButton();
        gitAddBtn = new javax.swing.JButton();
        gitPushBtn = new javax.swing.JButton();
        gitCommitBtn = new javax.swing.JButton();
        gitPullBtn = new javax.swing.JButton();
        gitStatusBtn = new javax.swing.JButton();
        remRepoBtn = new javax.swing.JButton();
        wrkspcBtn = new javax.swing.JButton();
        indexBtn = new javax.swing.JButton();
        locRepoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        statShow = new javax.swing.JTextArea();
        messageTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gitInnit.setText("gitInnit");
        gitInnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitInnitActionPerformed(evt);
            }
        });

        addFileBtn.setText("add Files");
        addFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileBtnActionPerformed(evt);
            }
        });

        gitAddBtn.setText("gitAdd");
        gitAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitAddBtnActionPerformed(evt);
            }
        });

        gitPushBtn.setText("gitPush");
        gitPushBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitPushBtnActionPerformed(evt);
            }
        });

        gitCommitBtn.setText("gitCommit");
        gitCommitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitCommitBtnActionPerformed(evt);
            }
        });

        gitPullBtn.setText("gitPull");
        gitPullBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitPullBtnActionPerformed(evt);
            }
        });

        gitStatusBtn.setText("gitStatus");
        gitStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitStatusBtnActionPerformed(evt);
            }
        });

        remRepoBtn.setText("Remote Repository");
        remRepoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remRepoBtnActionPerformed(evt);
            }
        });

        wrkspcBtn.setText("Workspace");
        wrkspcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrkspcBtnActionPerformed(evt);
            }
        });

        indexBtn.setText("Index");
        indexBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexBtnActionPerformed(evt);
            }
        });

        locRepoBtn.setText("Local Repository");
        locRepoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locRepoBtnActionPerformed(evt);
            }
        });

        statShow.setEditable(false);
        statShow.setColumns(20);
        statShow.setRows(5);
        jScrollPane1.setViewportView(statShow);

        messageTxt.setText("PullOrPush Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gitStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(gitPushBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gitInnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addFileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gitAddBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gitCommitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gitPullBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(indexBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addComponent(remRepoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wrkspcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(locRepoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap(173, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(locRepoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(remRepoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indexBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(wrkspcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gitInnit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gitAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gitCommitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gitPushBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gitPullBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(gitStatusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(messageTxt)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gitInnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitInnitActionPerformed
        // TODO add your handling code here:
        new GitInnitFrame(this).setVisible(true);
        messageTxt.setVisible(false);
    }//GEN-LAST:event_gitInnitActionPerformed

    private void addFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileBtnActionPerformed
        // TODO add your handling code here:
        if(gitRep.autor.equals("") || gitRep.nombreProyecto.equals("")){
            messageTxt.setText("Debe hacer gitInnit primero!");
            messageTxt.setVisible(true);
        }else{
           new AddFilesPanel(this).setVisible(true);
           messageTxt.setVisible(false);
        }
        
    }//GEN-LAST:event_addFileBtnActionPerformed

    private void gitAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitAddBtnActionPerformed
        // TODO add your handling code here:
        if(gitRep.autor.equals("") || gitRep.nombreProyecto.equals("")){
            messageTxt.setText("Debe hacer gitInnit primero!");
            messageTxt.setVisible(true);
        }else{
            if(!gitRep.zonas.workspace.list.FL.isEmpty()){
                new GitAdd(this).setVisible(true);
                messageTxt.setVisible(false);
            }else{
                messageTxt.setText("No hay archivos en el workspace para añadir.");
                messageTxt.setVisible(true);
            }
        }
    }//GEN-LAST:event_gitAddBtnActionPerformed

    private void gitPushBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitPushBtnActionPerformed
        // TODO add your handling code here:
        if(gitRep.autor.equals("") || gitRep.nombreProyecto.equals("")){
            messageTxt.setText("Debe hacer gitInnit primero!");
            messageTxt.setVisible(true);
        }else{
            if(gitRep.zonas.local.commitList.CL.size() != gitRep.zonas.remote.commitList.CL.size()){
               gitRep.gitPush();
               messageTxt.setText("Push Completo");
               messageTxt.setVisible(true); 
            }else{
               messageTxt.setText("No hay Commits para hacer Push");
               messageTxt.setVisible(true); 
            }
        }
    }//GEN-LAST:event_gitPushBtnActionPerformed

    private void gitCommitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitCommitBtnActionPerformed
        // TODO add your handling code here:
        if(gitRep.autor.equals("") || gitRep.nombreProyecto.equals("")){
            messageTxt.setText("Debe hacer gitInnit primero!");
            messageTxt.setVisible(true);
        }else{
            if(!gitRep.zonas.index.list.FL.isEmpty()){
                new GitCommit(this).setVisible(true);
                messageTxt.setVisible(false);
            }else{
                messageTxt.setText("No hay archivos en el index para trabajar.");
                messageTxt.setVisible(true);
            }
        }
    }//GEN-LAST:event_gitCommitBtnActionPerformed

    private void gitPullBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitPullBtnActionPerformed
        // TODO add your handling code here:
        if(gitRep.autor.equals("") || gitRep.nombreProyecto.equals("")){
            messageTxt.setText("Debe hacer gitInnit primero!");
            messageTxt.setVisible(true);
        }else{
            if(!gitRep.zonas.remote.repoFileList.FL.isEmpty()){
               gitRep.gitPull();
               messageTxt.setText("Pull Completo");
               messageTxt.setVisible(true); 
            }else{
               messageTxt.setText("No hay Commits para hacer Pull");
               messageTxt.setVisible(true); 
            }
        }
    }//GEN-LAST:event_gitPullBtnActionPerformed

    private void gitStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitStatusBtnActionPerformed
        // TODO add your handling code here:
        if(gitRep.autor.equals("") || gitRep.nombreProyecto.equals("")){
            messageTxt.setText("Debe hacer gitInnit primero!");
            messageTxt.setVisible(true);
        }else{
            GitController controlador = new GitController(); 
            statShow.setText(controlador.gitStatus(gitRep));
            messageTxt.setVisible(false);
        }
    }//GEN-LAST:event_gitStatusBtnActionPerformed

    private void wrkspcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrkspcBtnActionPerformed
        GitController controlador = new GitController(); 
        statShow.setText(controlador.LocFoldToString(gitRep.zonas.workspace));
        messageTxt.setVisible(false);
    }//GEN-LAST:event_wrkspcBtnActionPerformed

    private void indexBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexBtnActionPerformed
        GitController controlador = new GitController(); 
        statShow.setText(controlador.LocFoldToString(gitRep.zonas.index));
        messageTxt.setVisible(false);
    }//GEN-LAST:event_indexBtnActionPerformed

    private void remRepoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remRepoBtnActionPerformed
        // TODO add your handling code here:
        GitController controlador = new GitController(); 
        statShow.setText(controlador.RepoToString(gitRep.zonas.remote));
        messageTxt.setVisible(false);
    }//GEN-LAST:event_remRepoBtnActionPerformed

    private void locRepoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locRepoBtnActionPerformed
        // TODO add your handling code here:
        GitController controlador = new GitController(); 
        statShow.setText(controlador.RepoToString(gitRep.zonas.local));
        messageTxt.setVisible(false);
    }//GEN-LAST:event_locRepoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFileBtn;
    private javax.swing.JButton gitAddBtn;
    private javax.swing.JButton gitCommitBtn;
    private javax.swing.JButton gitInnit;
    private javax.swing.JButton gitPullBtn;
    private javax.swing.JButton gitPushBtn;
    private javax.swing.JButton gitStatusBtn;
    private javax.swing.JButton indexBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton locRepoBtn;
    private javax.swing.JLabel messageTxt;
    private javax.swing.JButton remRepoBtn;
    private javax.swing.JTextArea statShow;
    private javax.swing.JButton wrkspcBtn;
    // End of variables declaration//GEN-END:variables

}