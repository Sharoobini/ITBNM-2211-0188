/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.sql.*;
import Model.DatabaseConnection;
import javax.swing.JOptionPane;
/**
 *
 * @author KESTROY
 */
public class deleteDonor extends javax.swing.JFrame {

    /**
     * Creates new form addNewDonor
     */
    public deleteDonor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullnameTF = new javax.swing.JTextField();
        fathernameTF = new javax.swing.JTextField();
        mothernameTF = new javax.swing.JTextField();
        mobileNoTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cityTF = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        CityTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTF = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        donoridTF = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        genderTF = new javax.swing.JTextField();
        bloodgroupTF = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        dobTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Delete Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 700, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Donor ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 126, 15, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Full Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Father Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mother Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mobile No");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        fullnameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fullnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTFActionPerformed(evt);
            }
        });
        getContentPane().add(fullnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 159, -1));

        fathernameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(fathernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 159, -1));

        mothernameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mothernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 159, -1));

        mobileNoTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mobileNoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 162, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Blood Group");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        cityTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityTF.setText("City");
        getContentPane().add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Address.setText("Address");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        emailTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 162, -1));

        CityTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityTFActionPerformed(evt);
            }
        });
        getContentPane().add(CityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 162, -1));

        addressTF.setColumns(20);
        addressTF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addressTF.setRows(5);
        jScrollPane1.setViewportView(addressTF);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 700, 0));

        donoridTF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        donoridTF.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(donoridTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 700, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        genderTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(genderTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 160, -1));

        bloodgroupTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(bloodgroupTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 160, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 700, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 402, 700, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update details.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        Close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit application.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        dobTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTFActionPerformed(evt);
            }
        });
        getContentPane().add(dobTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
    }//GEN-LAST:event_formComponentShown

    private void fullnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameTFActionPerformed

    private void CityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityTFActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String donorid=jTextField1.getText();
        try{
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("delete from donor where donorid='"+donorid+"'");
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
            setVisible(false);
            new deleteDonor().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"connectionError");
        }
       
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deleteDonor().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void dobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTFActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String donorid=jTextField1.getText();
        try{
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select *from donor where donorId='"+donorid+"'");
            if(rs.next())
            {
                fullnameTF.setText(rs.getString(2));
                fathernameTF.setText(rs.getString(3));
                mothernameTF.setText(rs.getString(4));
                dobTF.setText(rs.getString(5));
                mobileNoTF.setText(rs.getString(6));
                genderTF.setText(rs.getString(7));
                emailTF.setText(rs.getString(8));
                bloodgroupTF.setText(rs.getString(9));
                CityTF.setText(rs.getString(10));
                addressTF.setText(rs.getString(11));
                jTextField1.setEditable(false); 
            }
            else
                JOptionPane.showMessageDialog(null,"DonorID does not Exist");
        }
        catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(deleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField CityTF;
    private javax.swing.JButton Close;
    private javax.swing.JTextArea addressTF;
    private javax.swing.JTextField bloodgroupTF;
    private javax.swing.JLabel cityTF;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dobTF;
    private javax.swing.JLabel donoridTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField fathernameTF;
    private javax.swing.JTextField fullnameTF;
    private javax.swing.JTextField genderTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mobileNoTF;
    private javax.swing.JTextField mothernameTF;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
