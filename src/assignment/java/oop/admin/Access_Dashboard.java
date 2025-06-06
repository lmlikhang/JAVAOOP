/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment.java.oop.admin;

import assignment.java.oop.Sales_Manager;
import assignment.java.oop.Inventory_Manager;
import assignment.java.oop.Purchase_Manager;
import assignment.java.oop.Finance_Manager;
import assignment.java.oop.Administrator;



public class Access_Dashboard extends javax.swing.JPanel {

    private Administrator adminRef;
          
    public Access_Dashboard(Administrator adminRef) {
        initComponents();
        
        this.adminRef = adminRef;
        
        btnSales.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalesManagerActionPerformed(evt);
    }
    });

        btnInventory.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnInventoryManagerActionPerformed(evt);
    }
    });

        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPurchaseManagerActionPerformed(evt);
    }
    });

        btnFinance.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFinanceManagerActionPerformed(evt);
    }
    });

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        btnSales = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        btnFinance = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));

        jTextField1.setBackground(new java.awt.Color(255, 255, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Please Choose the Dashboard you want to access ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnSales.setBackground(new java.awt.Color(153, 153, 153));
        btnSales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSales.setForeground(new java.awt.Color(102, 102, 102));
        btnSales.setText("Sales Manager");

        btnInventory.setBackground(new java.awt.Color(153, 153, 153));
        btnInventory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(102, 102, 102));
        btnInventory.setText("Inventory Manager");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        btnPurchase.setBackground(new java.awt.Color(153, 153, 153));
        btnPurchase.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(102, 102, 102));
        btnPurchase.setText("Purchase Manager");

        btnFinance.setBackground(new java.awt.Color(153, 153, 153));
        btnFinance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFinance.setForeground(new java.awt.Color(102, 102, 102));
        btnFinance.setText("Finance Manager");

        BtnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnHome.setForeground(new java.awt.Color(0, 0, 0));
        BtnHome.setText("Home");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 153));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Press ESC to go back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPurchase))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInventory)
                            .addComponent(btnFinance, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinance, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        adminRef.showAdminHome();
    }//GEN-LAST:event_BtnHomeActionPerformed
 
    private void btnSalesManagerActionPerformed(java.awt.event.ActionEvent evt) {
        new Sales_Manager(adminRef).setVisible(true);

        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void btnInventoryManagerActionPerformed(java.awt.event.ActionEvent evt) {
        new Inventory_Manager(adminRef).setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void btnPurchaseManagerActionPerformed(java.awt.event.ActionEvent evt) {
        new Purchase_Manager(adminRef).setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }

    private void btnFinanceManagerActionPerformed(java.awt.event.ActionEvent evt) {
        new Finance_Manager(adminRef).setVisible(true);
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton btnFinance;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnSales;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
