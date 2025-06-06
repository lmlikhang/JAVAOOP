/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.java.oop;

import Classes.Item;
import Classes.PurchaseRequisition;
import Classes.PurchaseOrders;
import Classes.Supplier;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author alvin
 */
public class Purchase_Manager extends javax.swing.JFrame {

    /**
     * Creates new form Purchase_Manager
     * @param previousPage
     */
    
 
    
    public Purchase_Manager(JFrame previousPage) {
        this.previousPage = previousPage;
        initComponents();
        
    }
    private Administrator adminRef;
    
    public Purchase_Manager(Administrator admin) {
        initComponents();
        
        this.adminRef = admin;

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
    private JFrame previousPage;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListOfItem_btn = new javax.swing.JButton();
        ListOfSupplier_btn = new javax.swing.JButton();
        GeneratePO_btn3 = new javax.swing.JButton();
        ListOfPO_btn = new javax.swing.JButton();
        Logout_btn = new javax.swing.JButton();
        Panels = new javax.swing.JPanel();
        Empty = new javax.swing.JPanel();
        ListOfItem = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        ListOfSuppliers = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplier_table = new javax.swing.JTable();
        GeneratePO = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Requisition_Table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Reject_btn = new javax.swing.JButton();
        Approve_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ListOfPO = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        POtable = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Purchase manager");

        ListOfItem_btn.setText("List of Items ");
        ListOfItem_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfItem_btnActionPerformed(evt);
            }
        });

        ListOfSupplier_btn.setText("List of Suppliers ");
        ListOfSupplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfSupplier_btnActionPerformed(evt);
            }
        });

        GeneratePO_btn3.setText("Generate Purchase Order ");
        GeneratePO_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratePO_btn3ActionPerformed(evt);
            }
        });

        ListOfPO_btn.setText("List of Purchaser Orders ");
        ListOfPO_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfPO_btnActionPerformed(evt);
            }
        });

        Logout_btn.setText("Logout");
        Logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListOfItem_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListOfSupplier_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GeneratePO_btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListOfPO_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logout_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(116, 116, 116)
                .addComponent(ListOfItem_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListOfSupplier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GeneratePO_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListOfPO_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panels.setBackground(new java.awt.Color(51, 51, 51));
        Panels.setLayout(new java.awt.CardLayout());

        Empty.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout EmptyLayout = new javax.swing.GroupLayout(Empty);
        Empty.setLayout(EmptyLayout);
        EmptyLayout.setHorizontalGroup(
            EmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        EmptyLayout.setVerticalGroup(
            EmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        Panels.add(Empty, "card2");

        ListOfItem.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("List of items");

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ItemsTable);

        javax.swing.GroupLayout ListOfItemLayout = new javax.swing.GroupLayout(ListOfItem);
        ListOfItem.setLayout(ListOfItemLayout);
        ListOfItemLayout.setHorizontalGroup(
            ListOfItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListOfItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(ListOfItemLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ListOfItemLayout.setVerticalGroup(
            ListOfItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        Panels.add(ListOfItem, "card3");

        ListOfSuppliers.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("List of Supplier");

        supplier_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(supplier_table);

        javax.swing.GroupLayout ListOfSuppliersLayout = new javax.swing.GroupLayout(ListOfSuppliers);
        ListOfSuppliers.setLayout(ListOfSuppliersLayout);
        ListOfSuppliersLayout.setHorizontalGroup(
            ListOfSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListOfSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListOfSuppliersLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 408, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
        );
        ListOfSuppliersLayout.setVerticalGroup(
            ListOfSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        Panels.add(ListOfSuppliers, "card4");

        GeneratePO.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Generate Purchase Order ");

        Requisition_Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(Requisition_Table);

        Reject_btn.setText("Reject");
        Reject_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reject_btnActionPerformed(evt);
            }
        });

        Approve_btn.setText("Approve");
        Approve_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Approve_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Reject_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Approve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reject_btn)
                    .addComponent(Approve_btn))
                .addGap(19, 19, 19))
        );

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Requisition Table:");

        javax.swing.GroupLayout GeneratePOLayout = new javax.swing.GroupLayout(GeneratePO);
        GeneratePO.setLayout(GeneratePOLayout);
        GeneratePOLayout.setHorizontalGroup(
            GeneratePOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneratePOLayout.createSequentialGroup()
                .addGroup(GeneratePOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeneratePOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(GeneratePOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)))
                    .addGroup(GeneratePOLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        GeneratePOLayout.setVerticalGroup(
            GeneratePOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneratePOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Panels.add(GeneratePO, "card6");

        ListOfPO.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("List of Purchaser Orders ");

        POtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(POtable);

        javax.swing.GroupLayout ListOfPOLayout = new javax.swing.GroupLayout(ListOfPO);
        ListOfPO.setLayout(ListOfPOLayout);
        ListOfPOLayout.setHorizontalGroup(
            ListOfPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfPOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListOfPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        ListOfPOLayout.setVerticalGroup(
            ListOfPOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfPOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Panels.add(ListOfPO, "card7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListOfItem_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfItem_btnActionPerformed
        Panels.removeAll();
        Panels.add(ListOfItem);
        Panels.revalidate();
        Panels.repaint();
        
        Item table = new Item();
        
        table.loadItemsToTable(ItemsTable);
    }//GEN-LAST:event_ListOfItem_btnActionPerformed

    private void ListOfSupplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfSupplier_btnActionPerformed
        Panels.removeAll();
        Panels.add(ListOfSuppliers);
        Panels.revalidate();
        Panels.repaint();
        
        Supplier table = new Supplier();
        
        table.loadToSupplierTable(supplier_table);
    }//GEN-LAST:event_ListOfSupplier_btnActionPerformed

    private void GeneratePO_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratePO_btn3ActionPerformed
        Panels.removeAll();
        Panels.add(GeneratePO);
        Panels.revalidate();
        Panels.repaint();
        PurchaseRequisition set = new PurchaseRequisition();
        set.loadRequestToTable(Requisition_Table);
    }//GEN-LAST:event_GeneratePO_btn3ActionPerformed

    private void ListOfPO_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfPO_btnActionPerformed
        Panels.removeAll();
        Panels.add(ListOfPO);
        Panels.revalidate();
        Panels.repaint();
        
        PurchaseOrders table = new PurchaseOrders();
        
        table.LoadtoPOTable(POtable);
    }//GEN-LAST:event_ListOfPO_btnActionPerformed

    private void Logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btnActionPerformed
        this.dispose(); 
        new MainF().setVisible(true);
    }//GEN-LAST:event_Logout_btnActionPerformed

    private void Approve_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Approve_btnActionPerformed
        int selectedRow = Requisition_Table.getSelectedRow();
        String POID = "";
        String supplierID = Requisition_Table.getValueAt (selectedRow,4).toString();
        String Itemname = Requisition_Table.getValueAt (selectedRow,1).toString();
        int Quantity = Integer.parseInt(Requisition_Table.getValueAt (selectedRow,2).toString());
        double Price = Double.parseDouble(Requisition_Table.getValueAt (selectedRow,3).toString());
        String requiredDate = new java.text.SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date());
        PurchaseOrders add = new PurchaseOrders();
        add.setPOID(POID);
        add.setSupplierID(supplierID);
        add.setItemname(Itemname);
        add.setQuantity(Quantity);
        add.setPrice(Price);
        add.setRequiredDate(requiredDate);
        add.saveToFile();
        
        String selectedID = Requisition_Table.getValueAt(selectedRow, 0).toString();
        PurchaseRequisition remove = new PurchaseRequisition();
        remove.removeFromFile(selectedID);
        PurchaseRequisition set = new PurchaseRequisition();
        set.loadRequestToTable(Requisition_Table);
        JOptionPane.showMessageDialog(rootPane, "Approved");
    }//GEN-LAST:event_Approve_btnActionPerformed

    private void Reject_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reject_btnActionPerformed
        int selectedRow = Requisition_Table.getSelectedRow();
        String selectedID = Requisition_Table.getValueAt(selectedRow, 0).toString();
        PurchaseRequisition remove = new PurchaseRequisition();
        remove.removeFromFile(selectedID);
        PurchaseRequisition set = new PurchaseRequisition();
        set.loadRequestToTable(Requisition_Table);
        JOptionPane.showMessageDialog(rootPane, "Rejected");
    }//GEN-LAST:event_Reject_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approve_btn;
    private javax.swing.JPanel Empty;
    private javax.swing.JPanel GeneratePO;
    private javax.swing.JButton GeneratePO_btn3;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JPanel ListOfItem;
    private javax.swing.JButton ListOfItem_btn;
    private javax.swing.JPanel ListOfPO;
    private javax.swing.JButton ListOfPO_btn;
    private javax.swing.JButton ListOfSupplier_btn;
    private javax.swing.JPanel ListOfSuppliers;
    private javax.swing.JButton Logout_btn;
    private javax.swing.JTable POtable;
    private javax.swing.JPanel Panels;
    private javax.swing.JButton Reject_btn;
    private javax.swing.JTable Requisition_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable supplier_table;
    // End of variables declaration//GEN-END:variables
}
