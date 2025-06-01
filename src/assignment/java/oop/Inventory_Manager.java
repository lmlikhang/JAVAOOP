
package assignment.java.oop;

import Classes.Item;
import Classes.PurchaseOrders;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class Inventory_Manager extends javax.swing.JFrame {

    private Administrator adminRef;

    public Inventory_Manager(Administrator adminRef) {
        this.adminRef = adminRef;
        initComponents();

                
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(KeyStroke.getKeyStroke("ESCAPE"), "goBack");

        this.getRootPane().getActionMap().put("goBack", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            adminRef.setVisible(true);               
            adminRef.showAccessDashboard();           
            dispose();                                
        }
    });
        
    }
    public Inventory_Manager(JFrame previousPage) {
        this.previousPage = previousPage;
        initComponents();
    }
    private JFrame previousPage;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        EmptyPanel = new javax.swing.JPanel();
        ApprovedPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ApprovePOtable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        RecivedBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Items_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UpdateStockPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        Change_btn = new javax.swing.JButton();
        txtnewquantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lowStock_btn = new javax.swing.JButton();
        HighStock_btn = new javax.swing.JButton();
        ShowAll_btn = new javax.swing.JButton();
        StockReportPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportStockArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        GenerateReport_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ApprovedBtn = new javax.swing.JButton();
        UpdateStockBtn = new javax.swing.JButton();
        StockReportBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.CardLayout());

        EmptyPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout EmptyPanelLayout = new javax.swing.GroupLayout(EmptyPanel);
        EmptyPanel.setLayout(EmptyPanelLayout);
        EmptyPanelLayout.setHorizontalGroup(
            EmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        EmptyPanelLayout.setVerticalGroup(
            EmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jPanel2.add(EmptyPanel, "card2");

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

        RecivedBtn.setText("Received");
        RecivedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecivedBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Select the item above to set Recived:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(RecivedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(RecivedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Items_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(Items_table);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PO table (Approved):");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Items table:");

        javax.swing.GroupLayout ApprovedPanelLayout = new javax.swing.GroupLayout(ApprovedPanel);
        ApprovedPanel.setLayout(ApprovedPanelLayout);
        ApprovedPanelLayout.setHorizontalGroup(
            ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApprovedPanelLayout.createSequentialGroup()
                .addGroup(ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ApprovedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApprovedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        ApprovedPanelLayout.setVerticalGroup(
            ApprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApprovedPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel2.add(ApprovedPanel, "card4");

        UpdateStockPanel.setBackground(new java.awt.Color(51, 51, 51));

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(ItemTable);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        Change_btn.setText("Change");
        Change_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_btnActionPerformed(evt);
            }
        });

        jLabel4.setText("Change quantity :");

        jLabel6.setText("Select the item above to set quantity");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(txtnewquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Change_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnewquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(Change_btn)
                .addGap(20, 20, 20))
        );

        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("GREEN is sufficient");

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("RED is low on stock");

        lowStock_btn.setText("Low Stock filter");
        lowStock_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowStock_btnActionPerformed(evt);
            }
        });

        HighStock_btn.setText("High Stock filter");
        HighStock_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighStock_btnActionPerformed(evt);
            }
        });

        ShowAll_btn.setText("All");
        ShowAll_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAll_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateStockPanelLayout = new javax.swing.GroupLayout(UpdateStockPanel);
        UpdateStockPanel.setLayout(UpdateStockPanelLayout);
        UpdateStockPanelLayout.setHorizontalGroup(
            UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UpdateStockPanelLayout.createSequentialGroup()
                        .addGroup(UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowAll_btn)
                        .addGap(18, 18, 18)
                        .addComponent(HighStock_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lowStock_btn))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        UpdateStockPanelLayout.setVerticalGroup(
            UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(UpdateStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lowStock_btn)
                        .addComponent(HighStock_btn)
                        .addComponent(ShowAll_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(UpdateStockPanel, "card5");

        StockReportPanel.setBackground(new java.awt.Color(51, 51, 51));

        ReportStockArea.setColumns(20);
        ReportStockArea.setRows(5);
        jScrollPane1.setViewportView(ReportStockArea);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Report");

        GenerateReport_btn.setText("Generate Report");
        GenerateReport_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReport_btnActionPerformed(evt);
            }
        });

        jLabel10.setText("Generate current stock report");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GenerateReport_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GenerateReport_btn)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout StockReportPanelLayout = new javax.swing.GroupLayout(StockReportPanel);
        StockReportPanel.setLayout(StockReportPanelLayout);
        StockReportPanelLayout.setHorizontalGroup(
            StockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockReportPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(StockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        StockReportPanelLayout.setVerticalGroup(
            StockReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockReportPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(StockReportPanel, "card6");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventory Manager");

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
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(StockReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpdateStockBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApprovedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ApprovedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StockReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void ApprovedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApprovedBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(ApprovedPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
        PurchaseOrders POtable = new PurchaseOrders();
        POtable.LoadtoPOTable_Approved(ApprovePOtable);
        Item ITtable = new Item();
        ITtable.loadItemsToTable(Items_table);
    }//GEN-LAST:event_ApprovedBtnActionPerformed

    private void UpdateStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStockBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(UpdateStockPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
        Item table = new Item();
        table.loadItemsToTable(ItemTable);
    }//GEN-LAST:event_UpdateStockBtnActionPerformed

    private void StockReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockReportBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(StockReportPanel);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_StockReportBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        this.dispose(); 
        new MainF().setVisible(true);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void RecivedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecivedBtnActionPerformed
        int selectedRow = ApprovePOtable.getSelectedRow();
        
        if (selectedRow != -1){
            String selectedPOID = ApprovePOtable.getValueAt(selectedRow, 0).toString();
            String itemName = ApprovePOtable.getValueAt(selectedRow, 2).toString();
            int qtyToAdd = Integer.parseInt(ApprovePOtable.getValueAt(selectedRow, 3).toString());
            
            PurchaseOrders PO = new PurchaseOrders();
            boolean success = PO.ReceivedAndUpdateStock(selectedPOID, "Received");
            
            if (success){
                
                Item item = new Item();
                int existingQty = item.getExistingQuantity(itemName);
                int finalQuantity = existingQty + qtyToAdd;
                item.addOrUpdateStock(itemName, finalQuantity);
                JOptionPane.showMessageDialog(this, "PO marked as received. Stock updated.");
                PO.LoadtoPOTable_Approved(ApprovePOtable);
                item.loadItemsToTable(ItemTable);
            }else{
                JOptionPane.showMessageDialog(this, "Failed to update PO.");
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Please select a PO to mark as received.");
        }
    }//GEN-LAST:event_RecivedBtnActionPerformed

    private void Change_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_btnActionPerformed
        int selectedRow = ItemTable.getSelectedRow();
        
        if (selectedRow != -1){
            try{
                String itemName = ItemTable.getValueAt(selectedRow, 1).toString();

                int qty = Integer.parseInt(txtnewquantity.getText().trim());
                if (qty < 0) {
                    JOptionPane.showMessageDialog(this, "Quantity cannot be negative.");
                    return;
                }

                Item Manage = new Item();
                Manage.addOrUpdateStock(itemName, qty);
                Manage.loadItemsToTable(ItemTable);
                JOptionPane.showMessageDialog(this, "Quantity updated successfully.");
                txtnewquantity.setText(""); 
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Please enter a valid number for quantity.");
            }    
        }            
    
    }//GEN-LAST:event_Change_btnActionPerformed

    private void GenerateReport_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReport_btnActionPerformed
        Item item = new Item();
        
        String reportText = item.generateStockReportToTextArea();
        ReportStockArea.setText(reportText);
    }//GEN-LAST:event_GenerateReport_btnActionPerformed

    private void HighStock_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighStock_btnActionPerformed
        Item h = new Item();
        h.loadItemsToTable_High(ItemTable);
    }//GEN-LAST:event_HighStock_btnActionPerformed

    private void lowStock_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowStock_btnActionPerformed
        Item h = new Item();
        h.loadItemsToTable_Low(ItemTable);
    }//GEN-LAST:event_lowStock_btnActionPerformed

    private void ShowAll_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAll_btnActionPerformed
        Item h = new Item();
        h.loadItemsToTable(ItemTable);
    }//GEN-LAST:event_ShowAll_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ApprovePOtable;
    private javax.swing.JButton ApprovedBtn;
    private javax.swing.JPanel ApprovedPanel;
    private javax.swing.JButton Change_btn;
    private javax.swing.JPanel EmptyPanel;
    private javax.swing.JButton GenerateReport_btn;
    private javax.swing.JButton HighStock_btn;
    private javax.swing.JTable ItemTable;
    private javax.swing.JTable Items_table;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton RecivedBtn;
    private javax.swing.JTextArea ReportStockArea;
    private javax.swing.JButton ShowAll_btn;
    private javax.swing.JButton StockReportBtn;
    private javax.swing.JPanel StockReportPanel;
    private javax.swing.JButton UpdateStockBtn;
    private javax.swing.JPanel UpdateStockPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton lowStock_btn;
    private javax.swing.JTextField txtnewquantity;
    // End of variables declaration//GEN-END:variables
}
