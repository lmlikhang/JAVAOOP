
package assignment.java.oop;

import Classes.Item;
import Classes.PurchaserOrders;
import javax.swing.JOptionPane;


public class Inventory_Manager extends javax.swing.JFrame {


    public Inventory_Manager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ViewItemPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewItemTable = new javax.swing.JTable();
        ApprovedPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ApprovePOtable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        RecivedBtn = new javax.swing.JButton();
        UpdateStockPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        StockReportPanel = new javax.swing.JPanel();
        EmptyPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ViewItemBtn = new javax.swing.JButton();
        ApprovedBtn = new javax.swing.JButton();
        UpdateStockBtn = new javax.swing.JButton();
        StockReportBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.CardLayout());

        ViewItemPanel.setBackground(new java.awt.Color(51, 51, 51));

        ViewItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ViewItemTable);

        javax.swing.GroupLayout ViewItemPanelLayout = new javax.swing.GroupLayout(ViewItemPanel);
        ViewItemPanel.setLayout(ViewItemPanelLayout);
        ViewItemPanelLayout.setHorizontalGroup(
            ViewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewItemPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        ViewItemPanelLayout.setVerticalGroup(
            ViewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewItemPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel2.add(ViewItemPanel, "card3");

        ApprovedPanel.setBackground(new java.awt.Color(51, 51, 51));

        ApprovePOtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ApprovePOtable);

        RecivedBtn.setText("Recived");
        RecivedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecivedBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(RecivedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(RecivedBtn)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout ApprovedPanelLayout = new javax.swing.GroupLayout(ApprovedPanel);
        ApprovedPanel.setLayout(ApprovedPanelLayout);
        ApprovedPanelLayout.setHorizontalGroup(
            ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApprovedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        ApprovedPanelLayout.setVerticalGroup(
            ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApprovedPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(ApprovedPanel, "card4");

        UpdateStockPanel.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout UpdateStockPanelLayout = new javax.swing.GroupLayout(UpdateStockPanel);
        UpdateStockPanel.setLayout(UpdateStockPanelLayout);
        UpdateStockPanelLayout.setHorizontalGroup(
            UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        UpdateStockPanelLayout.setVerticalGroup(
            UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jPanel2.add(UpdateStockPanel, "card5");

        StockReportPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout StockReportPanelLayout = new javax.swing.GroupLayout(StockReportPanel);
        StockReportPanel.setLayout(StockReportPanelLayout);
        StockReportPanelLayout.setHorizontalGroup(
            StockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        StockReportPanelLayout.setVerticalGroup(
            StockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jPanel2.add(StockReportPanel, "card6");

        EmptyPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout EmptyPanelLayout = new javax.swing.GroupLayout(EmptyPanel);
        EmptyPanel.setLayout(EmptyPanelLayout);
        EmptyPanelLayout.setHorizontalGroup(
            EmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        EmptyPanelLayout.setVerticalGroup(
            EmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jPanel2.add(EmptyPanel, "card2");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventory Manager");

        ViewItemBtn.setText("View Items");
        ViewItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewItemBtnActionPerformed(evt);
            }
        });

        ApprovedBtn.setText("Approved POs");
        ApprovedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApprovedBtnActionPerformed(evt);
            }
        });

        UpdateStockBtn.setText("Update Stock");
        UpdateStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStockBtnActionPerformed(evt);
            }
        });

        StockReportBtn.setText("Stock Report");
        StockReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockReportBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setText("Log out");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ApprovedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StockReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(ViewItemBtn)
                .addGap(38, 38, 38)
                .addComponent(ApprovedBtn)
                .addGap(51, 51, 51)
                .addComponent(UpdateStockBtn)
                .addGap(48, 48, 48)
                .addComponent(StockReportBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutBtn)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewItemBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(ViewItemPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
        Item table = new Item();
        table.loadItemsToTable(ViewItemTable);
    }//GEN-LAST:event_ViewItemBtnActionPerformed

    private void ApprovedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovedBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(ApprovedPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
        PurchaserOrders table = new PurchaserOrders();
        table.LoadtoPOTable_Approved(ApprovePOtable);
    }//GEN-LAST:event_ApprovedBtnActionPerformed

    private void UpdateStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStockBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(UpdateStockPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_UpdateStockBtnActionPerformed

    private void StockReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockReportBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(StockReportPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_StockReportBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void RecivedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecivedBtnActionPerformed
        int selectedRow = ApprovePOtable.getSelectedRow();
        
        if (selectedRow != -1){
            String selectedPOID = ApprovePOtable.getValueAt(selectedRow, 0).toString();
            String itemName = ApprovePOtable.getValueAt(selectedRow, 2).toString();
            int qty = Integer.parseInt(ApprovePOtable.getValueAt(selectedRow, 3).toString());
            
            PurchaserOrders PO = new PurchaserOrders();
            boolean success = PO.ReceivedAndUpdateStock(selectedPOID, "Received");
            
            if (success){
                 Item item = new Item();
                item.addOrUpdateStock(itemName, qty);
                JOptionPane.showMessageDialog(this, "PO marked as received. Stock updated.");
                PO.LoadtoPOTable_Approved(ApprovePOtable);
            }else{
                JOptionPane.showMessageDialog(this, "Failed to update PO.");
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Please select a PO to mark as received.");
        }
    }//GEN-LAST:event_RecivedBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApprovePOtable;
    private javax.swing.JButton ApprovedBtn;
    private javax.swing.JPanel ApprovedPanel;
    private javax.swing.JPanel EmptyPanel;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton RecivedBtn;
    private javax.swing.JButton StockReportBtn;
    private javax.swing.JPanel StockReportPanel;
    private javax.swing.JButton UpdateStockBtn;
    private javax.swing.JPanel UpdateStockPanel;
    private javax.swing.JButton ViewItemBtn;
    private javax.swing.JPanel ViewItemPanel;
    private javax.swing.JTable ViewItemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
