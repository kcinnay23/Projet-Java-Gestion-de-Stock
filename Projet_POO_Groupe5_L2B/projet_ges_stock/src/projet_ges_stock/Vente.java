/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ges_stock;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Vente extends javax.swing.JFrame {
  
     Connection con;
    PreparedStatement prst;
    ResultSet rst;
    Double total = 0.0;
     int nombre;
   
    public Vente() {
       
        initComponents();
         ArrayList<String> list=new ArrayList<String>();
        String sql = "SELECT designation FROM produit ;";
        try{
            ScriptConnect();
            Statement state = (Statement) con.createStatement();
            rst = state.executeQuery(sql);
            String s = new String();
            while(rst.next()){
                s=rst.getString("designation");
                list.add(s);
            }
            con.close();
            for(int i=0;i<=list.size();i++){
                cmbproduit.addItem(list.get(i));
            }
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
        
    }
      public void ScriptConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ges_stock","root","");
            //JOptionPane.showMessageDialog(null, "Connexion réussie");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbproduit = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtprix = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lstachat = new java.awt.List();
        jLabel9 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        btneffacer = new javax.swing.JButton();
        btnsupprimer = new javax.swing.JButton();
        btnajouter = new javax.swing.JButton();
        exit2 = new javax.swing.JButton();
        deconnexion = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        lstprix = new java.awt.List();
        montant = new javax.swing.JLabel();
        vente = new javax.swing.JButton();
        txtnombre = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 470));
        getContentPane().setLayout(null);

        cmbproduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbproduitActionPerformed(evt);
            }
        });
        getContentPane().add(cmbproduit);
        cmbproduit.setBounds(150, 90, 170, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestion de Vente d'articles");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 0, 410, 42);

        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });
        getContentPane().add(txtprix);
        txtprix.setBounds(150, 150, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText(" PRODUIT :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("   PRIX :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 150, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 210, 100, 30);

        lstachat.setBackground(new java.awt.Color(0, 0, 0));
        lstachat.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lstachat.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lstachat);
        lstachat.setBounds(490, 90, 90, 110);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Liste d'Achat");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 52, 140, 30);

        lblnombre.setBackground(new java.awt.Color(0, 0, 0));
        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setOpaque(true);
        getContentPane().add(lblnombre);
        lblnombre.setBounds(490, 210, 90, 30);

        btneffacer.setBackground(new java.awt.Color(0, 0, 0));
        btneffacer.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btneffacer.setForeground(new java.awt.Color(204, 204, 255));
        btneffacer.setText("Effacer");
        btneffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneffacerActionPerformed(evt);
            }
        });
        getContentPane().add(btneffacer);
        btneffacer.setBounds(480, 280, 130, 40);

        btnsupprimer.setBackground(new java.awt.Color(0, 0, 0));
        btnsupprimer.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnsupprimer.setForeground(new java.awt.Color(204, 204, 255));
        btnsupprimer.setText("Supprimer");
        btnsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnsupprimer);
        btnsupprimer.setBounds(250, 280, 130, 40);

        btnajouter.setBackground(new java.awt.Color(0, 0, 0));
        btnajouter.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        btnajouter.setForeground(new java.awt.Color(204, 204, 255));
        btnajouter.setText("Ajouter");
        btnajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajouterActionPerformed(evt);
            }
        });
        getContentPane().add(btnajouter);
        btnajouter.setBounds(30, 280, 130, 40);

        exit2.setBackground(new java.awt.Color(0, 0, 0));
        exit2.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        exit2.setForeground(new java.awt.Color(204, 204, 255));
        exit2.setText("Exit");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });
        getContentPane().add(exit2);
        exit2.setBounds(40, 370, 100, 40);

        deconnexion.setBackground(new java.awt.Color(0, 0, 0));
        deconnexion.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        deconnexion.setForeground(new java.awt.Color(204, 204, 255));
        deconnexion.setText("Deconnexion");
        deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(deconnexion);
        deconnexion.setBounds(660, 370, 150, 40);

        lbltotal.setBackground(new java.awt.Color(0, 0, 0));
        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(255, 255, 255));
        lbltotal.setOpaque(true);
        getContentPane().add(lbltotal);
        lbltotal.setBounds(690, 210, 90, 30);

        lstprix.setBackground(new java.awt.Color(0, 0, 0));
        lstprix.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lstprix.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lstprix);
        lstprix.setBounds(690, 90, 90, 110);

        montant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        montant.setText("Montant");
        getContentPane().add(montant);
        montant.setBounds(690, 60, 90, 22);

        vente.setBackground(new java.awt.Color(0, 0, 0));
        vente.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        vente.setForeground(new java.awt.Color(204, 204, 255));
        vente.setText("vente");
        vente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venteActionPerformed(evt);
            }
        });
        getContentPane().add(vente);
        vente.setBounds(680, 283, 110, 40);

        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(txtnombre);
        txtnombre.setBounds(150, 210, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/istockphoto-939377430-1024x1024.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbproduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbproduitActionPerformed
        
       String sql = "SELECT prix FROM produit WHERE designation = '"+cmbproduit.getSelectedItem().toString()+"';";
        String[] afficher = new String[2];
        try{
            ScriptConnect();
            Statement state = (Statement) con.createStatement();
            rst = state.executeQuery(sql);
            if(rst.next()){
                afficher[0]=rst.getString("prix");
            }
            con.close();
            txtprix.setText(afficher[0]);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cmbproduitActionPerformed

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed

    }//GEN-LAST:event_txtprixActionPerformed

    private void btneffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneffacerActionPerformed
      txtnombre.setSelectedItem("");
        lstachat.removeAll();
        lstprix.removeAll();
        lblnombre.setText("");
        lbltotal.setText("");
    }//GEN-LAST:event_btneffacerActionPerformed

    private void btnsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupprimerActionPerformed
      int index,nombre;
        Double montant,total;
        nombre = Integer.parseInt(lblnombre.getText());
        total = Double.parseDouble(lbltotal.getText());
        index = lstachat.getSelectedIndex();
        montant = Double.parseDouble(lstprix.getItem(index));
        nombre = nombre - 1;
        total = total - montant;
        lstachat.remove(index);
        lblnombre.setText(String.valueOf(nombre));
        lbltotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnsupprimerActionPerformed

    private void btnajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajouterActionPerformed
      String produit;
        Double prix,montant;
        int nombreproduit;
        
        produit = cmbproduit.getSelectedItem().toString();
        prix = Double.parseDouble(txtprix.getText());
        nombre = Integer.parseInt((String) txtnombre.getSelectedItem());
        montant = prix * nombre ;
        lstachat.add(produit);
        lstprix.add(String.valueOf(montant));
        nombreproduit = lstachat.getItemCount();
        lblnombre.setText(String.valueOf(nombreproduit));
        total = total + montant;
        lbltotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnajouterActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        Produit p= new Produit();
        p.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_exit2ActionPerformed

    private void deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionActionPerformed
        int p= JOptionPane.showConfirmDialog(null, "Voulez vous quitter", "Quitter", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (p == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_deconnexionActionPerformed

    private void venteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venteActionPerformed
         int a=0;
        while(a<lstachat.countItems()){
        String query="update produit set stock=stock-"+String.valueOf(nombre)+" where designation='"+lstachat.getItem(a)+"';";
        try{
            ScriptConnect();
            prst= (PreparedStatement) con.prepareStatement(query);
            prst.executeUpdate();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        a++;
        }
        JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(this,
                    "Article vendu avec succès ."); 
    }//GEN-LAST:event_venteActionPerformed

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
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnajouter;
    private javax.swing.JButton btneffacer;
    private javax.swing.JButton btnsupprimer;
    private javax.swing.JComboBox<String> cmbproduit;
    private javax.swing.JButton deconnexion;
    private javax.swing.JButton exit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltotal;
    private java.awt.List lstachat;
    private java.awt.List lstprix;
    private javax.swing.JLabel montant;
    private javax.swing.JComboBox<String> txtnombre;
    private javax.swing.JTextField txtprix;
    private javax.swing.JButton vente;
    // End of variables declaration//GEN-END:variables
}
