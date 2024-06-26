/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//22:22
/*
 * Stock.java
 *
 * Created on Jun 8, 2024, 1:15:45 AM
 */

package pos;

import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Stock extends javax.swing.JPanel {

    /** Creates new form Stock */
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public Stock() {
        initComponents();
        con=db.mycon();
        tbload();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    
     public void tbload()
    {
      try{
             String sql= " SELECT * FROM product";
                     pst=con.prepareStatement(sql);
                     rs=pst.executeQuery();
                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             
         }
         catch(SQLException e)
         {
             System.out.print(e);
         }
      }
      
    
     public void paras(){
         //table search
         String bcod= txt_bcode.getText();
         String pname=txt_pnaame.getText();
         String supp=txt_supp.getText();
         
         try{
             String sql= " SELECT * FROM product where Product_Name LIKE '%" +pname+ "%' AND Supplier_Name LIKE '%" +supp+"%' AND Bar_code LIKE '%"+bcod+"%' ";
                     pst=con.prepareStatement(sql);
                     rs=pst.executeQuery();
                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             
         }
         catch(SQLException e)
         {
             System.out.print(e);
         }
         cal();
     }
         public void cal(){
             int numberRow= jTable1.getRowCount();
             double total=0;
             for(int i=0;i<numberRow;i++)
             {
                 double value=Double.valueOf(jTable1.getValueAt(i,5).toString());
                 total += value;
             }
             date_new1.setText(Double.toString(total));
         }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_bcode = new javax.swing.JTextField();
        txt_pnaame = new javax.swing.JTextField();
        txt_supp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        date_new1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        inid1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_bcode1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_pnaame1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_stkqty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_supp2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Bar Code:");

        inid.setFont(new java.awt.Font("Tahoma", 1, 14));
        inid.setText("ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Product Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Supplier Name:");

        txt_bcode.setFont(new java.awt.Font("Tahoma", 0, 14));
        txt_bcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bcodeActionPerformed(evt);
            }
        });
        txt_bcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bcodeKeyReleased(evt);
            }
        });

        txt_pnaame.setFont(new java.awt.Font("Tahoma", 0, 14));
        txt_pnaame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pnaameActionPerformed(evt);
            }
        });
        txt_pnaame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pnaameKeyReleased(evt);
            }
        });

        txt_supp.setFont(new java.awt.Font("Tahoma", 0, 14));
        txt_supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_suppActionPerformed(evt);
            }
        });
        txt_supp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_suppKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Product Name", "Bar code", "Cost Price", "Stock Price", "Supplier_ID", "Supplier_Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        date_new1.setBackground(new java.awt.Color(153, 255, 153));
        date_new1.setFont(new java.awt.Font("Tahoma", 0, 18));
        date_new1.setText("0");
        date_new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_new1ActionPerformed(evt);
            }
        });
        date_new1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                date_new1KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Table QTY:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_new1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_new1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inid))
                    .addComponent(txt_bcode, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_pnaame, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(478, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inid)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pnaame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Stock", jPanel2);

        inid1.setFont(new java.awt.Font("Tahoma", 1, 14));
        inid1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Bar Code:");

        txt_bcode1.setFont(new java.awt.Font("Tahoma", 0, 14));
        txt_bcode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bcode1ActionPerformed(evt);
            }
        });
        txt_bcode1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bcode1KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Product Name:");

        txt_pnaame1.setFont(new java.awt.Font("Tahoma", 0, 14));
        txt_pnaame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pnaame1ActionPerformed(evt);
            }
        });
        txt_pnaame1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pnaame1KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Stock Quantity:");

        txt_stkqty.setFont(new java.awt.Font("Tahoma", 0, 14));
        txt_stkqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stkqtyActionPerformed(evt);
            }
        });
        txt_stkqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_stkqtyKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("New Add-Less Qty:");

        txt_supp2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_supp2.setText("0");
        txt_supp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supp2ActionPerformed(evt);
            }
        });
        txt_supp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_supp2KeyReleased(evt);
            }
        });

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inid1))
                                    .addComponent(txt_bcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_pnaame1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_stkqty, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(14, 14, 14)
                                .addComponent(txt_supp2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1)))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inid1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bcode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pnaame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stkqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_supp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Stock", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void txt_bcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bcodeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_bcodeActionPerformed

private void txt_bcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bcodeKeyReleased
paras();     
}//GEN-LAST:event_txt_bcodeKeyReleased

private void txt_pnaameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pnaameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_pnaameActionPerformed

private void txt_pnaameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pnaameKeyReleased
paras();
}//GEN-LAST:event_txt_pnaameKeyReleased

private void txt_suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_suppActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_suppActionPerformed

private void txt_suppKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_suppKeyReleased
paras();
}//GEN-LAST:event_txt_suppKeyReleased

private void date_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_new1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_date_new1ActionPerformed

private void date_new1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_new1KeyReleased
// TODO add your handling code here:
}//GEN-LAST:event_date_new1KeyReleased

private void txt_bcode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bcode1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_bcode1ActionPerformed

private void txt_bcode1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bcode1KeyReleased
String name=txt_bcode1.getText();
       try
       {
           Statement s=db.mycon().createStatement();
           ResultSet rs=s.executeQuery("SELECT * FROM product WHERE Bar_code='"+name+"'");
           if(rs.next())
           {
              txt_pnaame1.setText(rs.getString("Product_Name"));
              txt_stkqty.setText(rs.getString("Qty"));
              
           }
       
       }
       catch(SQLException e)
       {
           System.out.print(e);
       }
}//GEN-LAST:event_txt_bcode1KeyReleased

private void txt_pnaame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pnaame1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_pnaame1ActionPerformed

private void txt_pnaame1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pnaame1KeyReleased
// TODO add your handling code here:
}//GEN-LAST:event_txt_pnaame1KeyReleased

private void txt_stkqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stkqtyActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_stkqtyActionPerformed

private void txt_stkqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stkqtyKeyReleased
// TODO add your handling code here:
}//GEN-LAST:event_txt_stkqtyKeyReleased

private void txt_supp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supp2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txt_supp2ActionPerformed

private void txt_supp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_supp2KeyReleased
// TODO add your handling code here:
}//GEN-LAST:event_txt_supp2KeyReleased

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date_new1;
    private javax.swing.JLabel inid;
    private javax.swing.JLabel inid1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_bcode;
    private javax.swing.JTextField txt_bcode1;
    private javax.swing.JTextField txt_pnaame;
    private javax.swing.JTextField txt_pnaame1;
    private javax.swing.JTextField txt_stkqty;
    private javax.swing.JTextField txt_supp;
    private javax.swing.JTextField txt_supp2;
    // End of variables declaration//GEN-END:variables
}
