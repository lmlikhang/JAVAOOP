/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.java.oop;

/**
 *
 * @author alvin
 */
import assignment.java.oop.panelsFM.ApprovePO_Panel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;




public class Finance_Manager extends javax.swing.JFrame {

    /**
     * Creates new form Finance_Manager
     */
    private Administrator adminRef;
    
    public Finance_Manager() {
    initComponents();
}

    public Finance_Manager(Administrator admin) {
        
    this.adminRef = admin;
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


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnApprovePO = new javax.swing.JButton();
        BtnViewInventory = new javax.swing.JButton();
        BtnProcessPayments = new javax.swing.JButton();
        BtnGenerateFinancialReports = new javax.swing.JButton();
        BtnViewPRs_POs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btnlgout = new javax.swing.JButton();
        mainContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        BtnApprovePO.setBackground(new java.awt.Color(0, 153, 51));
        BtnApprovePO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnApprovePO.setForeground(new java.awt.Color(255, 255, 255));
        BtnApprovePO.setText("Approve PO");
        BtnApprovePO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApprovePOActionPerformed(evt);
            }
        });

        BtnViewInventory.setBackground(new java.awt.Color(0, 153, 51));
        BtnViewInventory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnViewInventory.setForeground(new java.awt.Color(255, 255, 255));
        BtnViewInventory.setText("View Inventory Updates");
        BtnViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewInventoryActionPerformed(evt);
            }
        });

        BtnProcessPayments.setBackground(new java.awt.Color(0, 153, 51));
        BtnProcessPayments.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnProcessPayments.setForeground(new java.awt.Color(255, 255, 255));
        BtnProcessPayments.setText("Process Payments ");
        BtnProcessPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProcessPaymentsActionPerformed(evt);
            }
        });

        BtnGenerateFinancialReports.setBackground(new java.awt.Color(0, 153, 51));
        BtnGenerateFinancialReports.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnGenerateFinancialReports.setForeground(new java.awt.Color(255, 255, 255));
        BtnGenerateFinancialReports.setText("Generate Financial Reports ");
        BtnGenerateFinancialReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerateFinancialReportsActionPerformed(evt);
            }
        });

        BtnViewPRs_POs.setBackground(new java.awt.Color(0, 153, 51));
        BtnViewPRs_POs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnViewPRs_POs.setForeground(new java.awt.Color(255, 255, 255));
        BtnViewPRs_POs.setText("View PRs and POs");
        BtnViewPRs_POs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewPRs_POsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Financial Manager ");

        Btnlgout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnlgout.setForeground(new java.awt.Color(255, 255, 255));
        Btnlgout.setText("Log Out");
        Btnlgout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnlgoutActionPerformed(evt);
            }
        });

        mainContentPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout mainContentPanelLayout = new javax.swing.GroupLayout(mainContentPanel);
        mainContentPanel.setLayout(mainContentPanelLayout);
        mainContentPanelLayout.setHorizontalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnApprovePO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnViewInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnProcessPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnGenerateFinancialReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnViewPRs_POs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btnlgout, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(mainContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(BtnApprovePO)
                .addGap(47, 47, 47)
                .addComponent(BtnViewInventory)
                .addGap(58, 58, 58)
                .addComponent(BtnProcessPayments)
                .addGap(57, 57, 57)
                .addComponent(BtnGenerateFinancialReports)
                .addGap(65, 65, 65)
                .addComponent(BtnViewPRs_POs)
                .addGap(91, 91, 91)
                .addComponent(Btnlgout)
                .addGap(21, 21, 21))
            .addComponent(mainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    
 
    private void BtnApprovePOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApprovePOActionPerformed
        loadPanel(new ApprovePO_Panel());

    }//GEN-LAST:event_BtnApprovePOActionPerformed

    private void BtnViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewInventoryActionPerformed
        loadPanel(new assignment.java.oop.panelsFM.InventoryUpdate_Panel());
    }//GEN-LAST:event_BtnViewInventoryActionPerformed

    private void BtnGenerateFinancialReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerateFinancialReportsActionPerformed
        loadPanel(new assignment.java.oop.panelsFM.FinancialReports_Panel());
    }//GEN-LAST:event_BtnGenerateFinancialReportsActionPerformed

    private void BtnProcessPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProcessPaymentsActionPerformed
        loadPanel(new assignment.java.oop.panelsFM.ProcessPayments_Panel());
    }//GEN-LAST:event_BtnProcessPaymentsActionPerformed

    private void BtnViewPRs_POsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewPRs_POsActionPerformed
        loadPanel(new assignment.java.oop.panelsFM.ViewPRsPOs_Panel());
    }//GEN-LAST:event_BtnViewPRs_POsActionPerformed

    private void BtnlgoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnlgoutActionPerformed
        this.dispose(); 
        new MainF().setVisible(true); 
    }//GEN-LAST:event_BtnlgoutActionPerformed

    private void loadPanel(JPanel panel) {
    mainContentPanel.removeAll();
    mainContentPanel.setLayout(new GridBagLayout());

    JPanel wrapper = new JPanel();
    wrapper.setLayout(new BorderLayout());

    
    if (panel instanceof assignment.java.oop.panelsFM.InventoryUpdate_Panel) {
    wrapper.setPreferredSize(new Dimension(600, 400)); // Inventory panel
    } else if (panel instanceof assignment.java.oop.panelsFM.FinancialReports_Panel) {
    wrapper.setPreferredSize(new Dimension(600, 500)); // Financial reports
    } else if (panel instanceof assignment.java.oop.panelsFM.ApprovePO_Panel) {
    wrapper.setPreferredSize(new Dimension(600, 400)); // Approve PO
    } else if (panel instanceof assignment.java.oop.panelsFM.ViewPRsPOs_Panel) {
    wrapper.setPreferredSize(new Dimension(700, 700)); // PRs and POs panel (larger)
    } else {
    wrapper.setPreferredSize(new Dimension(600, 350)); // Default size
}



    wrapper.add(panel, BorderLayout.CENTER);
    wrapper.setOpaque(false);
    wrapper.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.insets = new java.awt.Insets(50, 50, 50, 50);

    mainContentPanel.add(wrapper, gbc);
    mainContentPanel.revalidate();
    mainContentPanel.repaint();
}



    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApprovePO;
    private javax.swing.JButton BtnGenerateFinancialReports;
    private javax.swing.JButton BtnProcessPayments;
    private javax.swing.JButton BtnViewInventory;
    private javax.swing.JButton BtnViewPRs_POs;
    private javax.swing.JButton Btnlgout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainContentPanel;
    // End of variables declaration//GEN-END:variables
}
