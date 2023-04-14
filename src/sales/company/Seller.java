/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sales.company;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sales.company.Products.departure;
import static sales.company.Products.flightname;
import static sales.company.Products.flightnumber;
import static sales.company.Products.source;
import static sales.company.Products.takeoff;
import static sales.company.Products.z;

/**
 *
 * @author VINAY
 */
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        autofill();
    }
     public void autofill(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sales","root","");
            pst = conn.prepareStatement("select * from seller");
            ResultSet rs= pst.executeQuery();
            ResultSetMetaData rsm = (ResultSetMetaData) rs.getMetaData();
            int c;
            c= rsm.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int i=1;i<c;i++){
                    
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("password"));
                    v2.add(rs.getString("gender"));
     
                       
                }
                Df.addRow(v2);
            }     
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
                                           
}
Connection conn;
         PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        namea = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("SELLERS  LIST");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("SELLER ID");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("NAME");

        pid.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pid.setForeground(new java.awt.Color(255, 102, 0));
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 102, 0));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        namea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        namea.setForeground(new java.awt.Color(255, 102, 0));
        namea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameaActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 102, 0));
        jTextField7.setText("GENDER");
        jTextField7.setBorder(null);

        jTextField8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 102, 0));
        jTextField8.setText("PASSWORD");
        jTextField8.setBorder(null);

        gender.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 102, 0));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", " " }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Delete");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 153));
        jButton3.setText("Add");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 153, 153));
        jButton4.setText("Edit");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 153, 153));
        jButton5.setText("Clear");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("MANAGE SELLERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namea, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel8)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField8)
                                .addGap(11, 11, 11)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        jLabel11.setBackground(new java.awt.Color(255, 102, 51));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 102, 0));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Admin");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 102, 0));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("LOGOUT");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 102, 0));
        jButton10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Product");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void nameaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameaActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
      UpdateAdmin rgf = new UpdateAdmin();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        Products rgf = new Products();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         Login rgf = new Login();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String id =pid.getText();
         
         String namee =namea.getText();
         String quantityy =password.getText();
         String categoryy = gender.getSelectedItem().toString().trim();
         int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sales","root","");
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter seller ID");
                count=1;
            }
            else if( namee.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Name");
                count=1;
            }
            else if(quantityy.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter password");
                count=1;
            }
          
        
            
            while(count==0){
            pst=conn.prepareStatement("insert into seller(id,name,password,gender)values(?,?,?,?)");
            pst.setString(1,id);
            pst.setString(2,namee);
            pst.setString(3,quantityy);
          
            pst.setString(4,categoryy);
           
            pst.executeUpdate();
             autofill();
            JOptionPane.showMessageDialog(null, "Added Successfully");
           
            conn.close();
                    
                    count=1;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         String id =pid.getText();
         String namee =namea.getText();
         String quantityy =password.getText();
     
         String categoryy = gender.getSelectedItem().toString().trim();
         int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sales","root","");
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter seller ID");
                count=1;
            }
            else if( namee.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Name");
                count=1;
            }
            else if(quantityy.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter password");
                count=1;
            }
          
            else if(z!=0){
                JOptionPane.showMessageDialog(null, "Select iteam to Edit");
                count=1;
            }
        
            while(count==0){
            pst=conn.prepareStatement("update seller set id=?,name=?,password=?,gender=? where id =? and name=? and password=? and gender=? ");
            pst.setString(1,id);
            pst.setString(2,namee);
            pst.setString(3,quantityy);
         
            pst.setString(4,categoryy);
            pst.setString(5,flightname);
           pst.setString(6,flightnumber);
           pst.setString(7,source);
           pst.setString(8,departure);
      
            pst.executeUpdate();
            autofill();
            JOptionPane.showMessageDialog(null, "Edited Successfully");
            
            conn.close();
                    
                    count=1;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
         flightname = Df.getValueAt(selectIndex,0).toString();
         flightnumber = Df.getValueAt(selectIndex,1).toString();
        source = Df.getValueAt(selectIndex,2).toString();
        departure = Df.getValueAt(selectIndex,3).toString();
       
         z=0;
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
          // TODO add your handling code here:
         String id =pid.getText();
         String namee =namea.getText();
         String quantityy =password.getText();
         
         String categoryy = gender.getSelectedItem().toString().trim();
         int count = 0;
         int y=10;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sales","root","");
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter seller ID");
                count=1;
               z=0;
            }
            while(count==0){
            pst=conn.prepareStatement("delete from seller where id=?");
            pst.setString(1,id);  
            pst.executeUpdate();
            y=0;
             autofill();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
           
            conn.close();
                    
                    count=1;
            }
            if(y!=0){
                JOptionPane.showMessageDialog(null, "Enter valid Id");
                z=0;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
         pid.setText("");
                namea.setText("");
                password.setText("");
              
    }//GEN-LAST:event_jButton5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField namea;
    private javax.swing.JTextField password;
    private javax.swing.JTextField pid;
    // End of variables declaration//GEN-END:variables
}
