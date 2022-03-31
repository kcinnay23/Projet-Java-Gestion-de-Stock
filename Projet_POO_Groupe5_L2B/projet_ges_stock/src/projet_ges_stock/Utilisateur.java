/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ges_stock;

import BDS.Mycon;
import BDS.ResultSetTableModel;
import BDS.db_con;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author midek
 */
public class Utilisateur extends javax.swing.JFrame {
       ResultSet rst;
    db_con db;
   
    public Utilisateur() {
       db = new db_con(new Mycon().HOST_DB, new Mycon().USERNAME_DB, new Mycon().PASSWORD_DB, new Mycon().IPHOST, new Mycon().PORT); 
        initComponents();
        table();
    }
     public void table() {
        String a[] = {"id", "username", "password", "type"};
        rst = db.querySelect(a, "utilisateur");
        table1.setModel(new ResultSetTableModel(rst));
    }
     void actualiser() {
        username1.setText("");
        password1.setText("");
        type.setSelectedItem("Type");}
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        actualiser = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        rechercher = new javax.swing.JButton();
        deconnexion1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modifier1 = new javax.swing.JButton();
        rech = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        password1 = new javax.swing.JTextField();
        categorie = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        supprimer1 = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(860, 541));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Utilisateur");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 10, 300, 50);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "username", "password", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 830, 100);

        actualiser.setBackground(new java.awt.Color(0, 0, 0));
        actualiser.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        actualiser.setForeground(new java.awt.Color(204, 204, 255));
        actualiser.setText("actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });
        getContentPane().add(actualiser);
        actualiser.setBounds(710, 200, 120, 40);

        ajouter.setBackground(new java.awt.Color(0, 0, 0));
        ajouter.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        ajouter.setForeground(new java.awt.Color(204, 204, 255));
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(ajouter);
        ajouter.setBounds(10, 200, 120, 40);

        rechercher.setBackground(new java.awt.Color(0, 0, 0));
        rechercher.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        rechercher.setForeground(new java.awt.Color(204, 204, 255));
        rechercher.setText("rechercher");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });
        getContentPane().add(rechercher);
        rechercher.setBounds(430, 340, 130, 40);

        deconnexion1.setBackground(new java.awt.Color(0, 0, 0));
        deconnexion1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        deconnexion1.setForeground(new java.awt.Color(204, 204, 255));
        deconnexion1.setText("Deconnexion");
        deconnexion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexion1ActionPerformed(evt);
            }
        });
        getContentPane().add(deconnexion1);
        deconnexion1.setBounds(660, 440, 150, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("         type :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 380, 90, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("categorie");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 280, 90, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 330, 90, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("username :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 280, 90, 30);

        modifier1.setBackground(new java.awt.Color(0, 0, 0));
        modifier1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        modifier1.setForeground(new java.awt.Color(204, 204, 255));
        modifier1.setText("modifier");
        modifier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier1ActionPerformed(evt);
            }
        });
        getContentPane().add(modifier1);
        modifier1.setBounds(250, 200, 120, 40);

        rech.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(rech);
        rech.setBounds(560, 340, 210, 40);

        username1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(username1);
        username1.setBounds(100, 280, 150, 30);

        password1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(password1);
        password1.setBounds(100, 330, 150, 30);

        categorie.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        categorie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "username", "password", "type", " " }));
        getContentPane().add(categorie);
        categorie.setBounds(560, 280, 180, 30);

        type.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "caissier", "directeur", " " }));
        getContentPane().add(type);
        type.setBounds(100, 380, 150, 30);

        supprimer1.setBackground(new java.awt.Color(0, 0, 0));
        supprimer1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        supprimer1.setForeground(new java.awt.Color(204, 204, 255));
        supprimer1.setText("supprimer");
        supprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer1ActionPerformed(evt);
            }
        });
        getContentPane().add(supprimer1);
        supprimer1.setBounds(490, 200, 120, 40);

        exit1.setBackground(new java.awt.Color(0, 0, 0));
        exit1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        exit1.setForeground(new java.awt.Color(204, 204, 255));
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1);
        exit1.setBounds(80, 440, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_ges_stock/20180412141617-95e65038.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
         if (username1.getText().equals("") || password1.getText().equals("") || type.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "informations incomplete");
        } else {
            String[] colon = {"username", "password", "type"};
            String[] inf = {username1.getText(), password1.getText(),type.getSelectedItem().toString()};
            System.out.println(db.queryInsert("utilisateur", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void modifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier1ActionPerformed
       if (username1.getText().equals("") || password1.getText().equals("") || type.getSelectedItem().equals("Type")) {
            JOptionPane.showMessageDialog(this, "informations incomplete");
        } else {
                 String[] colon = { "username", "password", "type"};
            String[] inf = {username1.getText(), password1.getText(),type.getSelectedItem().toString()};
            String id = String.valueOf(table1.getValueAt(table1.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("utilisateur", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_modifier1ActionPerformed

    private void supprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer1ActionPerformed
      String id = String.valueOf(table1.getValueAt(table1.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "êtes vous sure de vouloir supprimer ", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("utilisateur", "id=" + id);
        } else {
            return;
        }
        table();
    }//GEN-LAST:event_supprimer1ActionPerformed

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
       actualiser();
        table();
    }//GEN-LAST:event_actualiserActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        if (rech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "entrer les données");
        } else {
            if (categorie.getSelectedItem().equals("username")) {
                rst = db.querySelectAll("utilisateur", "username LIKE '%" + rech.getText() + "%' ");
                table1.setModel(new ResultSetTableModel(rst));
            } else if (categorie.getSelectedItem().equals("password")) {
                rst = db.querySelectAll("utilisateur", "password LIKE '%" + rech.getText() + "%' ");
                table1.setModel(new ResultSetTableModel(rst));
            } else if (categorie.getSelectedItem().equals("type")) {
                rst = db.querySelectAll("utilisateur", "type LIKE '%" + rech.getText() + "%' ");
                table1.setModel(new ResultSetTableModel(rst));
            }
        } 
    }//GEN-LAST:event_rechercherActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
         Menu m= new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void deconnexion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexion1ActionPerformed
        int p= JOptionPane.showConfirmDialog(null, "Voulez vous quitter", "Quitter", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
       
        if (p == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_deconnexion1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       username1.setText(String.valueOf(table1.getValueAt(table1.getSelectedRow(), 1)));
        password1.setText(String.valueOf(table1.getValueAt(table1.getSelectedRow(), 2)));
        type.setSelectedItem(String.valueOf(table1.getValueAt(table1.getSelectedRow(), 3)));
    }//GEN-LAST:event_table1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiser;
    private javax.swing.JButton ajouter;
    private javax.swing.JComboBox<String> categorie;
    private javax.swing.JButton deconnexion1;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier1;
    private javax.swing.JTextField password1;
    private javax.swing.JTextField rech;
    private javax.swing.JButton rechercher;
    private javax.swing.JButton supprimer1;
    private javax.swing.JTable table1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}
