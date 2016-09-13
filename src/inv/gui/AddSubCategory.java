/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inv.gui;

import fnss.functions.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sachini
 */
public class AddSubCategory extends javax.swing.JFrame {

    /**
     * Creates new form AddSubCategory
     */
    public AddSubCategory() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try{
     String cat="SELECT CategoryName FROM category";
       ResultSet rs=DB.getDbCon().query(cat);
       while(rs.next())
       {
           Category.addItem(rs.getString("CategoryName"));
       }
}
catch(Exception e)
{

}
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblBack1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSubCatName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtSubCatID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(400, 300));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fnss/images/close.png"))); // NOI18N
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 13, -1, -1));

        lblBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inv/gui/back (3).png"))); // NOI18N
        lblBack1.setText("Back");
        lblBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBack1MouseClicked(evt);
            }
        });
        jPanel1.add(lblBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 50));

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("ADD SUB-CATEGORY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 70));

        jPanel2.setBackground(new java.awt.Color(236, 240, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(52, 73, 94));
        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 100, 60));
        jPanel2.add(txtSubCatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 161, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 62, 80));
        jLabel4.setText("Sub-Category Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        Category.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        jPanel2.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 161, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 62, 80));
        jLabel3.setText("Category");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));
        jPanel2.add(txtSubCatID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 161, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("Sub-Category ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 630, 380));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       String subCatID=new String(txtSubCatID.getText());
       String subCatName=new String(txtSubCatName.getText());
       String Cat=String.valueOf(Category.getSelectedItem());
       String sql="INSERT INTO subcategory  values ('"+subCatID+"','"+Cat+"','"+subCatName+"')";
       try{
       DB.getDbCon().insert(sql);
       }
       catch(Exception e)
       {
       
       }
       
       txtSubCatID.setText("");
       txtSubCatName.setText("");
       Category.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
      
    }//GEN-LAST:event_CategoryActionPerformed

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        close();
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBack1MouseClicked
        new StockManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBack1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        
        
        
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
            java.util.logging.Logger.getLogger(AddSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSubCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Category;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtSubCatID;
    private javax.swing.JTextField txtSubCatName;
    // End of variables declaration//GEN-END:variables
private void close() {
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            this.dispose();
        }
 }


}
