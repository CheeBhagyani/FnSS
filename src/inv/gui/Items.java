/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inv.gui;

import com.sun.glass.events.KeyEvent;
import fnss.functions.DB;
import fnss.functions.DocNumGenerator;
import fnss.test.TestDB;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sachini
 */
public class Items extends javax.swing.JFrame {

    /**
     * Creates new form Items
     */
    public Items() {
        initComponents();
        this.setLocationRelativeTo(null);
        
         Date now = new Date();
        //Set date format as you want
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd"); 
        txtDate.setText(sf.format(now));
        
        
        try
        {
        String sql="SELECT CategoryName FROM category";
        ResultSet rs=DB.getDbCon().query(sql);
        while(rs.next())
        {
        iCategory.addItem(rs.getString("CategoryName"));
       
        }
        }
        catch(Exception e)
        {}
        
        try
        {
        String sql="Select SubCatName from subcategory";
        ResultSet rs=DB.getDbCon().query(sql);
        while(rs.next())
        {
        iSubCategory.addItem(rs.getString("SubCatName"));
     
        }
        
        }
        catch(Exception e)
        {}
     
      
        String sql1="select  ItemCode,ItemName,Date,Quantity,BuyingPrice,SellingPrice,Category,SubCategory,ReorderLevel FROM `stock` where Status=1 and Quantity>ReorderLevel";
        try
        {
        ResultSet rs=DB.getDbCon().query(sql1);
          tblItems.setModel(DbUtils.resultSetToTableModel(rs));
          
        }
        catch(Exception e)
        {
            System.out.println(e);
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

        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iCategory = new javax.swing.JComboBox();
        iSubCategory = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuyingPrice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSellingPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtSearchItems = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtReOrder = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1180, 750));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1180, 750));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(810, 690));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 365, 1180, 10));

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
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 54, 50));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inv/gui/back (3).png"))); // NOI18N
        lblBack.setText("Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 55, -1));

        jLabel1.setBackground(new java.awt.Color(52, 73, 94));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ITEMS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Item Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel2.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 124, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Item Code");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 25));

        txtItemCode.setEditable(false);
        jPanel2.add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 124, -1));

        txtDate.setEditable(false);
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 133, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Category");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 91, -1));

        iCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel2.add(iCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 120, -1));

        iSubCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jPanel2.add(iSubCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 99, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Sub-Category");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel7.setBackground(new java.awt.Color(52, 73, 94));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 123, 40));

        jLabel8.setBackground(new java.awt.Color(52, 73, 94));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 118, 40));

        jLabel9.setBackground(new java.awt.Color(52, 73, 94));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Delete");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 122, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Buying Price");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, -1, -1));

        txtBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuyingPriceActionPerformed(evt);
            }
        });
        txtBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuyingPriceKeyTyped(evt);
            }
        });
        jPanel2.add(txtBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 131, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Selling Price");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        txtSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSellingPriceKeyTyped(evt);
            }
        });
        jPanel2.add(txtSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 131, -1));

        tblItems.setBackground(new java.awt.Color(52, 73, 94));
        tblItems.setForeground(new java.awt.Color(255, 255, 255));
        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Item Name", "Date", "Quantity", "Buying Price", "Selling Price", "Category", "Sub Category", "Reorder Level"
            }
        ));
        tblItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItems);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 960, 194));

        jLabel10.setBackground(new java.awt.Color(52, 73, 94));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 84, 40));
        jPanel2.add(txtSearchItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 450, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("ReorderLevel");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        txtReOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReOrderKeyTyped(evt);
            }
        });
        jPanel2.add(txtReOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 80, -1));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("OUT OF STOCK");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 190, 40));

        jLabel12.setBackground(new java.awt.Color(52, 73, 94));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Generate Code");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 120, 30));

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1180, 660));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       String srch=new String(txtSearchItems.getText());
       String sql= "SELECT ItemCode,ItemName,Date,Quantity,BuyingPrice,SellingPrice,Category,SubCategory,ReorderLevel FROM `stock` where ItemName LIKE '%"+srch+"%' and Quantity>ReorderLevel and Status=1";
       try
       {
           ResultSet rs=DB.getDbCon().query(sql);
           tblItems.setModel(DbUtils.resultSetToTableModel(rs));
           
       
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       String icode=new String(txtItemCode.getText());
       String iname=new String(txtItemName.getText());
       String cat=String.valueOf(iCategory.getSelectedItem());
       String subcat=String.valueOf(iSubCategory.getSelectedItem());
      String date=new String(txtDate.getText());
      
      String buy=new String(txtBuyingPrice.getText());
      String sell=new String(txtBuyingPrice.getText());
      String ro=new String(txtReOrder.getText());
      String sql="INSERT INTO stock values('"+icode+"','"+iname+"','"+date+"','0','"+buy+"','"+sell+"','"+cat+"','"+subcat+"','"+ro+"','1')";
      try
      {
      DB.getDbCon().insert(sql);
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      txtItemCode.setText("");
      txtItemName.setText("");
     
      iCategory.setSelectedIndex(0);
      iSubCategory.setSelectedIndex(0);
      txtBuyingPrice.setText("");
      txtSellingPrice.setText("");
      txtReOrder.setText("");
     
      
      
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       String icode=new String(txtItemCode.getText());
     
      String sql ="UPDATE stock SET Status='0' where ItemCode='"+icode+"'";
      try{
      DB.getDbCon().insert(sql);
      }
      catch(Exception e)
      { 
          System.out.println(e);
      }
      
       txtItemCode.setText("");
      txtItemName.setText("");
      iCategory.setSelectedIndex(0);
      iSubCategory.setSelectedIndex(0);
     
      txtBuyingPrice.setText("");
      txtSellingPrice.setText("");
      txtReOrder.setText("");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        
        String icode=new String(txtItemCode.getText());
       String iname=new String(txtItemName.getText());
       String cat=String.valueOf(iCategory.getSelectedItem());
       String subcat=String.valueOf(iSubCategory.getSelectedItem());
      String date=new String(txtDate.getText());
      
      String buy=new String(txtBuyingPrice.getText());
      String sell=new String(txtBuyingPrice.getText());
       String ro=new String(txtReOrder.getText());
      String sql="UPDATE stock SET ItemName='"+iname+"',BuyingPrice='"+buy+"',SellingPrice='"+sell+"',Category='"+cat+"',SubCategory='"+subcat+"',Date='"+date+"',ReorderLevel='"+ro+"' where ItemCode='"+icode+"'";
      
      try
      {
      DB.getDbCon().insert(sql);
      }
      catch(Exception e)
      {
          System.out.println(e);
      
      }
      
       txtItemCode.setText("");
      txtItemName.setText("");
       iCategory.setSelectedIndex(0);
      iSubCategory.setSelectedIndex(0);
     
      txtBuyingPrice.setText("");
      txtSellingPrice.setText("");
      txtReOrder.setText("");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuyingPriceActionPerformed

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        close();
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        new StockManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtBuyingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuyingPriceKeyTyped
         char c = evt.getKeyChar();
         if(!((Character.isDigit(c)) || (c==KeyEvent.VK_BACKSPACE) 
               || (c==KeyEvent.VK_DELETE))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtBuyingPriceKeyTyped

    private void txtSellingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellingPriceKeyTyped
         char c = evt.getKeyChar();
         if(!((Character.isDigit(c)) || (c==KeyEvent.VK_BACKSPACE) 
               || (c==KeyEvent.VK_DELETE))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtSellingPriceKeyTyped

    private void txtReOrderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReOrderKeyTyped
         char c = evt.getKeyChar();
         if(!((Character.isDigit(c)) || (c==KeyEvent.VK_BACKSPACE) 
               || (c==KeyEvent.VK_DELETE))){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtReOrderKeyTyped

    private void tblItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsMouseClicked
         int index=tblItems.getSelectedRow();
       TableModel model=tblItems.getModel();
       String id=model.getValueAt(index, 0).toString();
       String iname=model.getValueAt(index, 1).toString();
       String cat=model.getValueAt(index, 6).toString();
       String sub=model.getValueAt(index, 7).toString();
       String Dt=model.getValueAt(index, 2).toString();
       String re=model.getValueAt(index, 8).toString();
       String b=model.getValueAt(index, 4).toString();
       String sell=model.getValueAt(index, 5).toString();
       
       txtItemCode.setText(id);
       txtItemName.setText(iname);
       txtDate.setText(Dt);
       txtReOrder.setText(re);
       txtSellingPrice.setText(sell);
       txtBuyingPrice.setText(b);
       iCategory.setSelectedItem(cat);
       iSubCategory.setSelectedItem(sub);
    }//GEN-LAST:event_tblItemsMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

     new OutOfStock().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
 try {
            txtItemCode.setText((new DocNumGenerator().curVal("ITM")));
            txtItemCode.setText((new DocNumGenerator().nextVal("ITM")));
        } catch (SQLException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox iCategory;
    private javax.swing.JComboBox iSubCategory;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtBuyingPrice;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtReOrder;
    private javax.swing.JTextField txtSearchItems;
    private javax.swing.JTextField txtSellingPrice;
    // End of variables declaration//GEN-END:variables
private void close() {
        if (JOptionPane.showConfirmDialog(null, "Are you Sure?") == JOptionPane.OK_OPTION) {
            this.dispose();
        }
 }




}
