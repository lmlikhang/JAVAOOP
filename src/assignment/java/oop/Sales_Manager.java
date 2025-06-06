package assignment.java.oop;

import Classes.Supplier;
import Classes.Item;
import Classes.PurchaseRequisition;
import Classes.PurchaseOrders;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;



public class Sales_Manager extends javax.swing.JFrame {

    /**
     * Creates new form Sales_Manager
     */
    private Administrator adminRef;
    
    public Sales_Manager(Administrator admin) {
        initComponents();
        
        this.adminRef = admin;

        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
        .put(KeyStroke.getKeyStroke("ESCAPE"), "goBack");

        this.getRootPane().getActionMap().put("goBack", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            adminRef.setVisible(true);                // restore Admin
            adminRef.showAccessDashboard();           // show dashboard
            dispose();                                // close Sales Manager
        }
    });
        
    }
    public Sales_Manager(JFrame previousPage) {
        this.previousPage = previousPage;
        initComponents();
        
    }
    

    private JFrame previousPage;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ItemEntry_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SupplierEntry_btn = new javax.swing.JButton();
        DailyItemSalesEntry_btn = new javax.swing.JButton();
        CreatePurchaseRequisiton_btn = new javax.swing.JButton();
        PurchaseOrder_btn = new javax.swing.JButton();
        Logout_btn = new javax.swing.JButton();
        Panels = new javax.swing.JPanel();
        empty = new javax.swing.JPanel();
        ListOfItem_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtItemName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        Item_Save_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Remove_Item_btn = new javax.swing.JButton();
        Edit_Item_btn = new javax.swing.JButton();
        SupplierID_comboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        SuppliersEntry_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        suppliertable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtSupplierName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtProduct = new javax.swing.JTextField();
        Suppliers_Save_btn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Suppliers_Remove_btn1 = new javax.swing.JButton();
        Edit_supplier_btn = new javax.swing.JButton();
        DailyItemSalesEntry_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SalesEntry_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtquantitySold = new javax.swing.JTextPane();
        Submit_SIWSE_btn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        GenerateNDisplayRequisition = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ItemsTablePR = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtquantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Request_PR_btn = new javax.swing.JButton();
        Delete_PR_btn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PurchaseOrder = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        PO_table = new javax.swing.JTable();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        ItemEntry_btn.setText("Item Entry");
        ItemEntry_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEntry_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sales manager");

        SupplierEntry_btn.setText("Supplier Entry");
        SupplierEntry_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierEntry_btnActionPerformed(evt);
            }
        });

        DailyItemSalesEntry_btn.setText("Daily Item Sales");
        DailyItemSalesEntry_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyItemSalesEntry_btnActionPerformed(evt);
            }
        });

        CreatePurchaseRequisiton_btn.setText("Create Purchase Requisiton");
        CreatePurchaseRequisiton_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePurchaseRequisiton_btnActionPerformed(evt);
            }
        });

        PurchaseOrder_btn.setText("Purchase Order");
        PurchaseOrder_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseOrder_btnActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemEntry_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SupplierEntry_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DailyItemSalesEntry_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreatePurchaseRequisiton_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PurchaseOrder_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ItemEntry_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SupplierEntry_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DailyItemSalesEntry_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreatePurchaseRequisiton_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PurchaseOrder_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(Logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panels.setBackground(new java.awt.Color(0, 0, 0));
        Panels.setVerifyInputWhenFocusTarget(false);
        Panels.setLayout(new java.awt.CardLayout());

        empty.setBackground(new java.awt.Color(51, 51, 51));
        empty.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout emptyLayout = new javax.swing.GroupLayout(empty);
        empty.setLayout(emptyLayout);
        emptyLayout.setHorizontalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        emptyLayout.setVerticalGroup(
            emptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        Panels.add(empty, "card7");

        ListOfItem_Panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Entry");

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Item name", "Price", "quantity"
            }
        ));
        jScrollPane1.setViewportView(ItemsTable);

        Item_Save_btn.setText("Save");
        Item_Save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_Save_btnActionPerformed(evt);
            }
        });

        jLabel13.setText("Item name :");

        jLabel14.setText("Price :");

        jLabel15.setText("Quantity :");

        Remove_Item_btn.setText("Remove");
        Remove_Item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_Item_btnActionPerformed(evt);
            }
        });

        Edit_Item_btn.setText("Edit");
        Edit_Item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Item_btnActionPerformed(evt);
            }
        });

        SupplierID_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1", "1", "1" }));
        SupplierID_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierID_comboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Supplier name:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Item_Save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edit_Item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Remove_Item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(SupplierID_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(SupplierID_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item_Save_btn)
                    .addComponent(Remove_Item_btn)
                    .addComponent(Edit_Item_btn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ListOfItem_PanelLayout = new javax.swing.GroupLayout(ListOfItem_Panel);
        ListOfItem_Panel.setLayout(ListOfItem_PanelLayout);
        ListOfItem_PanelLayout.setHorizontalGroup(
            ListOfItem_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfItem_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListOfItem_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ListOfItem_PanelLayout.setVerticalGroup(
            ListOfItem_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListOfItem_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Panels.add(ListOfItem_Panel, "card2");

        SuppliersEntry_panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier Entry");

        suppliertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Supplier name", "Email", "Product"
            }
        ));
        jScrollPane2.setViewportView(suppliertable);

        Suppliers_Save_btn.setText("Save");
        Suppliers_Save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suppliers_Save_btnActionPerformed(evt);
            }
        });

        jLabel16.setText("Supplier name :");

        jLabel17.setText("Email :");

        jLabel18.setText("Product :");

        Suppliers_Remove_btn1.setText("Remove");
        Suppliers_Remove_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Suppliers_Remove_btn1ActionPerformed(evt);
            }
        });

        Edit_supplier_btn.setText("Edit");
        Edit_supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_supplier_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Suppliers_Save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edit_supplier_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Suppliers_Remove_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suppliers_Save_btn)
                    .addComponent(Suppliers_Remove_btn1)
                    .addComponent(Edit_supplier_btn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SuppliersEntry_panelLayout = new javax.swing.GroupLayout(SuppliersEntry_panel);
        SuppliersEntry_panel.setLayout(SuppliersEntry_panelLayout);
        SuppliersEntry_panelLayout.setHorizontalGroup(
            SuppliersEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuppliersEntry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuppliersEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        SuppliersEntry_panelLayout.setVerticalGroup(
            SuppliersEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuppliersEntry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Panels.add(SuppliersEntry_panel, "card3");

        DailyItemSalesEntry_panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daily Item-Wise Sales Entry");

        SalesEntry_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(SalesEntry_table);

        jLabel8.setText("Sold Quantity :");

        jScrollPane4.setViewportView(txtquantitySold);

        Submit_SIWSE_btn.setText("Submit");
        Submit_SIWSE_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_SIWSE_btnActionPerformed(evt);
            }
        });

        jLabel21.setText("Select the item and enter the quantity sold on the text box below");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Submit_SIWSE_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Submit_SIWSE_btn)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout DailyItemSalesEntry_panelLayout = new javax.swing.GroupLayout(DailyItemSalesEntry_panel);
        DailyItemSalesEntry_panel.setLayout(DailyItemSalesEntry_panelLayout);
        DailyItemSalesEntry_panelLayout.setHorizontalGroup(
            DailyItemSalesEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DailyItemSalesEntry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DailyItemSalesEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(DailyItemSalesEntry_panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DailyItemSalesEntry_panelLayout.setVerticalGroup(
            DailyItemSalesEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DailyItemSalesEntry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        Panels.add(DailyItemSalesEntry_panel, "card4");

        GenerateNDisplayRequisition.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Generate and Display Purchase Requisition");

        ItemsTablePR.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(ItemsTablePR);

        jLabel10.setText("Quantity :");

        Request_PR_btn.setText("Request");
        Request_PR_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_PR_btnActionPerformed(evt);
            }
        });

        Delete_PR_btn.setText("Delete");
        Delete_PR_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PR_btnActionPerformed(evt);
            }
        });

        jLabel20.setText("Select an item on item table to request the Requisition");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Delete_PR_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Request_PR_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_PR_btn)
                    .addComponent(Request_PR_btn))
                .addGap(15, 15, 15))
        );

        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(RequestTable);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Items table:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Requisition:");

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("RED is low on stock");

        jLabel19.setForeground(new java.awt.Color(51, 255, 51));
        jLabel19.setText("GREEN is sufficient");

        javax.swing.GroupLayout GenerateNDisplayRequisitionLayout = new javax.swing.GroupLayout(GenerateNDisplayRequisition);
        GenerateNDisplayRequisition.setLayout(GenerateNDisplayRequisitionLayout);
        GenerateNDisplayRequisitionLayout.setHorizontalGroup(
            GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                        .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29))))
        );
        GenerateNDisplayRequisitionLayout.setVerticalGroup(
            GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panels.add(GenerateNDisplayRequisition, "card5");

        PurchaseOrder.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Purchase Order");

        PO_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(PO_table);

        javax.swing.GroupLayout PurchaseOrderLayout = new javax.swing.GroupLayout(PurchaseOrder);
        PurchaseOrder.setLayout(PurchaseOrderLayout);
        PurchaseOrderLayout.setHorizontalGroup(
            PurchaseOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchaseOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PurchaseOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PurchaseOrderLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 412, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        PurchaseOrderLayout.setVerticalGroup(
            PurchaseOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PurchaseOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Panels.add(PurchaseOrder, "card6");

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ItemEntry_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEntry_btnActionPerformed
        new Supplier().loadSpplierOntoComboBox(SupplierID_comboBox);
        Panels.removeAll();
        Panels.add(ListOfItem_Panel);
        Panels.revalidate();
        Panels.repaint();
        Item table = new Item();
        table.loadItemsToTable(ItemsTable);
    }//GEN-LAST:event_ItemEntry_btnActionPerformed

    private void SupplierEntry_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierEntry_btnActionPerformed
        Panels.removeAll();
        Panels.add(SuppliersEntry_panel);
        Panels.revalidate();
        Panels.repaint();
        Supplier table = new Supplier();
        table.loadToSupplierTable(suppliertable);
    }//GEN-LAST:event_SupplierEntry_btnActionPerformed

    private void DailyItemSalesEntry_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyItemSalesEntry_btnActionPerformed
        Panels.removeAll();
        Panels.add(DailyItemSalesEntry_panel);
        Panels.revalidate();
        Panels.repaint();
        Item table = new Item();
        table.loadItemsToTable(SalesEntry_table);
    }//GEN-LAST:event_DailyItemSalesEntry_btnActionPerformed

    private void CreatePurchaseRequisiton_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePurchaseRequisiton_btnActionPerformed
        Panels.removeAll();
        Panels.add(GenerateNDisplayRequisition);
        Panels.revalidate();
        Panels.repaint();
        Item table = new Item();
        table.loadItemsToTable(ItemsTablePR);
        PurchaseRequisition set = new PurchaseRequisition();
        set.loadRequestToTable(RequestTable);
    }//GEN-LAST:event_CreatePurchaseRequisiton_btnActionPerformed

    private void PurchaseOrder_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseOrder_btnActionPerformed
        Panels.removeAll();
        Panels.add(PurchaseOrder);
        Panels.revalidate();
        Panels.repaint();
        
        PurchaseOrders set = new PurchaseOrders();
        set.LoadtoPOTable(PO_table);
    }//GEN-LAST:event_PurchaseOrder_btnActionPerformed

    private void Logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btnActionPerformed
        this.dispose(); 
        new MainF().setVisible(true);
    }//GEN-LAST:event_Logout_btnActionPerformed
  
    private void Item_Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_Save_btnActionPerformed
        String ItemName = txtItemName.getText();
        double Price = Double.parseDouble(txtPrice.getText());
        String supplierID = SupplierID_comboBox.getSelectedItem().toString();
        Supplier supplier = new Supplier();
        supplier.setSupplierID(supplierID);
        int Quantity = 0;
        
        try {
            Quantity = Integer.parseInt(txtQuantity.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please,Enter a valid number.") ;
            return;
        }
        if(ItemName.equals("")){
            JOptionPane.showMessageDialog(this,"Please,Enter all details.") ;
        }else{
            Item AddItems = new Item();
            AddItems.setItemID(""); 
            AddItems.setItemName(ItemName);
            AddItems.setPrice(Price);
            AddItems.setQuantity(Quantity);
            AddItems.setSupplier(supplier);
            AddItems.saveToFile();
            txtItemName.setText("");
            txtPrice.setText("");
            txtQuantity.setText("");
            Item items = new Item();
            items.loadItemsToTable(ItemsTable);
            JOptionPane.showMessageDialog(this, "Item are saved successfully.");
        }

    }//GEN-LAST:event_Item_Save_btnActionPerformed

    private void Remove_Item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_Item_btnActionPerformed
        int selectedRow = ItemsTable.getSelectedRow();
            if (selectedRow != -1) {
                String selectedID = ItemsTable.getValueAt(selectedRow, 0).toString();
                Item s = new Item();
                s.removeFromFile(selectedID);
                s.loadItemsToTable(ItemsTable); 
                JOptionPane.showMessageDialog(this, "Item deleted.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_Remove_Item_btnActionPerformed
    

    private void Suppliers_Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suppliers_Save_btnActionPerformed
        String SupplierName = txtSupplierName.getText();
        String Email = txtEmail.getText();
        String Product = txtProduct.getText();
        
        if(SupplierName.equals("")||Email.equals("")||Product.equals("")){
            JOptionPane.showMessageDialog(this,"Please,Enter all details.") ;
        }else{
            Supplier AddSupplier = new Supplier();
            AddSupplier.setSupplierID("");
            AddSupplier.setSupplierName(SupplierName);
            AddSupplier.setEmail(Email);
            AddSupplier.setProduct(Product);        
            AddSupplier.saveToFile();

            txtSupplierName.setText("");
            txtEmail.setText("");
            txtProduct.setText("");
            Supplier table = new Supplier();
            table.loadToSupplierTable(suppliertable);
            JOptionPane.showMessageDialog(this, "Supplier are saved successfully.");
        }
    }//GEN-LAST:event_Suppliers_Save_btnActionPerformed
    
    private void Suppliers_Remove_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suppliers_Remove_btn1ActionPerformed
        int selectedRow = suppliertable.getSelectedRow();
            if (selectedRow != -1) {
                String selectedID = suppliertable.getValueAt(selectedRow, 0).toString();
                Supplier s = new Supplier();
                s.removeFromFile(selectedID);
                s.loadToSupplierTable(suppliertable);
                JOptionPane.showMessageDialog(this, "Item deleted.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_Suppliers_Remove_btn1ActionPerformed

    private void Edit_supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_supplier_btnActionPerformed
        int selectedRow = suppliertable.getSelectedRow();
            if (selectedRow != -1) {
                
                String selectedID = suppliertable.getValueAt(selectedRow, 0).toString();
                String supplierName = suppliertable.getValueAt (selectedRow, 1).toString();
                String Email = suppliertable.getValueAt (selectedRow, 2).toString();
                String Product = suppliertable.getValueAt (selectedRow, 3).toString();
                
                Supplier s = new Supplier();
                s.setSupplierName(supplierName);
                s.setEmail(Email);
                s.setProduct(Product);
                txtSupplierName.setText(s.getSupplierName());
                txtEmail.setText(s.getEmail());
                txtProduct.setText(s.getProduct());
                s.removeFromFile(selectedID); 
                s.loadToSupplierTable(suppliertable);
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
            
    }//GEN-LAST:event_Edit_supplier_btnActionPerformed

    private void Edit_Item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Item_btnActionPerformed
        int selectedRow = ItemsTable.getSelectedRow();
            if (selectedRow != -1) {
                String selectedID = ItemsTable.getValueAt(selectedRow, 0).toString();
                String ItemName = ItemsTable.getValueAt (selectedRow, 1).toString();
                double Price = Double.parseDouble(ItemsTable.getValueAt (selectedRow, 2).toString());
                int Quantity = Integer.parseInt(ItemsTable.getValueAt (selectedRow, 3).toString());
                String supplierName = ItemsTable.getValueAt (selectedRow, 4).toString();
                
                Supplier supplier = new Supplier();
                supplier.setSupplierName(supplierName);
                
                Item s = new Item();
                s.setItemName(ItemName);
                s.setPrice(Price);
                s.setQuantity(Quantity);
                s.setSupplier(supplier);
                txtItemName.setText(s.getItemName());
                txtPrice.setText(String.valueOf(s.getPrice()));
                txtQuantity.setText(String.valueOf(s.getQuantity()));
                SupplierID_comboBox.setSelectedItem(s.getSupplier().getSupplierName());
                
                
                s.removeFromFile(selectedID);
                s.loadItemsToTable(ItemsTable); 
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_Edit_Item_btnActionPerformed

    private void Submit_SIWSE_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_SIWSE_btnActionPerformed
    int selectedRow = SalesEntry_table.getSelectedRow();
        
        if (selectedRow != -1){
            try{
                String itemName = SalesEntry_table.getValueAt(selectedRow, 1).toString();
                int qtyTominus = Integer.parseInt(txtquantitySold.getText().trim());
                if (qtyTominus < 0) {
                    JOptionPane.showMessageDialog(this, "Quantity cannot be negative.");
                    return;
                }
                Item Manage = new Item();
                int existingQty = Manage.getExistingQuantity(itemName);
                int finalQuantity = existingQty - qtyTominus;
                Manage.addOrUpdateStock(itemName, finalQuantity);
                Manage.loadItemsToTable(SalesEntry_table);
                JOptionPane.showMessageDialog(this, "Quantity updated successfully.");
                txtquantitySold.setText(""); 
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Please enter a valid number for quantity.");
            }    
        }      
    }//GEN-LAST:event_Submit_SIWSE_btnActionPerformed

    private void SupplierID_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierID_comboBoxActionPerformed
        
    }//GEN-LAST:event_SupplierID_comboBoxActionPerformed

    private void Request_PR_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_PR_btnActionPerformed
        int selectedRow = ItemsTablePR.getSelectedRow();
        
        
        String ItemName = ItemsTablePR.getValueAt(selectedRow, 1).toString();
        double Price = Double.parseDouble(ItemsTablePR.getValueAt(selectedRow,2).toString());
        String SupplierID = ItemsTablePR.getValueAt(selectedRow,4).toString();
        int Quantity = 0;
        String requiredDate = new  java.text.SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date());
        try {
            Quantity = Integer.parseInt(txtquantity.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please,Enter a valid number.") ;
            return;
        }
        PurchaseRequisition s = new PurchaseRequisition ();
        s.setRequisitionID(""); 
        s.setItemName(ItemName);
        s.setSupplierID(SupplierID);
        s.setQuantity(Quantity);
        s.setPrice(Price);
        s.setRequiredDate(requiredDate);        
        s.saveToFile();
        PurchaseRequisition set = new PurchaseRequisition();
        set.loadRequestToTable(RequestTable);
        JOptionPane.showMessageDialog(this, "Request successfully.");
    }//GEN-LAST:event_Request_PR_btnActionPerformed

    private void Delete_PR_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PR_btnActionPerformed
        int selectedRow = RequestTable.getSelectedRow();
            if (selectedRow != -1) {
                String selectedID = RequestTable.getValueAt(selectedRow, 0).toString();
                PurchaseRequisition s = new PurchaseRequisition();
                s.removeFromFile(selectedID); // delete from file
                s.loadRequestToTable(RequestTable); // refresh table
                JOptionPane.showMessageDialog(this, "Item deleted.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_Delete_PR_btnActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatePurchaseRequisiton_btn;
    private javax.swing.JButton DailyItemSalesEntry_btn;
    private javax.swing.JPanel DailyItemSalesEntry_panel;
    private javax.swing.JButton Delete_PR_btn;
    private javax.swing.JButton Edit_Item_btn;
    private javax.swing.JButton Edit_supplier_btn;
    private javax.swing.JPanel GenerateNDisplayRequisition;
    private javax.swing.JButton ItemEntry_btn;
    private javax.swing.JButton Item_Save_btn;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JTable ItemsTablePR;
    private javax.swing.JPanel ListOfItem_Panel;
    private javax.swing.JButton Logout_btn;
    private javax.swing.JTable PO_table;
    private javax.swing.JPanel Panels;
    private javax.swing.JPanel PurchaseOrder;
    private javax.swing.JButton PurchaseOrder_btn;
    private javax.swing.JButton Remove_Item_btn;
    private javax.swing.JTable RequestTable;
    private javax.swing.JButton Request_PR_btn;
    private javax.swing.JTable SalesEntry_table;
    private javax.swing.JButton Submit_SIWSE_btn;
    private javax.swing.JButton SupplierEntry_btn;
    private javax.swing.JComboBox<String> SupplierID_comboBox;
    private javax.swing.JPanel SuppliersEntry_panel;
    private javax.swing.JButton Suppliers_Remove_btn1;
    private javax.swing.JButton Suppliers_Save_btn;
    private javax.swing.JPanel empty;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JTable suppliertable;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextPane txtquantitySold;
    // End of variables declaration//GEN-END:variables
}
