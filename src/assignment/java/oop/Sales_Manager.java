package assignment.java.oop;

import Classes.Supplier;
import Classes.Item;
import Classes.PurchaseRequisition;
import Classes.PurchaserOrders;
import javax.swing.JOptionPane;


public class Sales_Manager extends javax.swing.JFrame {

    /**
     * Creates new form Sales_Manager
     */
    public Sales_Manager() {
        initComponents();
        
    }
    private String selectedItemName = null;
    private int selectedItemStock = 0;
    private String selectedSupplierID =null;

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
        Save_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Remove_btn = new javax.swing.JButton();
        EditItem_btn = new javax.swing.JButton();
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
        Edit_btn = new javax.swing.JButton();
        DailyItemSalesEntry_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SalesEntry_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtquantitySold = new javax.swing.JTextPane();
        Submit_btn = new javax.swing.JButton();
        lblSelectedItem = new javax.swing.JLabel();
        Select_btn = new javax.swing.JButton();
        lblCurrentStock = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        GenerateNDisplayRequisition = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ItemsTablePR = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtquantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Request_requisition = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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

        Save_btn.setText("Save");
        Save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_btnActionPerformed(evt);
            }
        });

        jLabel13.setText("Item name :");

        jLabel14.setText("Price :");

        jLabel15.setText("Quantity :");

        Remove_btn.setText("Remove");
        Remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_btnActionPerformed(evt);
            }
        });

        EditItem_btn.setText("Edit");
        EditItem_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditItem_btnActionPerformed(evt);
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
                        .addComponent(Save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EditItem_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(Save_btn)
                    .addComponent(Remove_btn)
                    .addComponent(EditItem_btn))
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

        Edit_btn.setText("Edit");
        Edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_btnActionPerformed(evt);
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
                        .addComponent(Edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(Edit_btn))
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

        Submit_btn.setText("Submit");
        Submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_btnActionPerformed(evt);
            }
        });

        lblSelectedItem.setText("Selected Item : ");

        Select_btn.setText("Select");
        Select_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_btnActionPerformed(evt);
            }
        });

        lblCurrentStock.setText("Stock : ");

        lblSupplier.setText("Supplier name :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentStock)
                            .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelectedItem)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Select_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(Submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSelectedItem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentStock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSupplier)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_btn)
                    .addComponent(Select_btn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DailyItemSalesEntry_panelLayout = new javax.swing.GroupLayout(DailyItemSalesEntry_panel);
        DailyItemSalesEntry_panel.setLayout(DailyItemSalesEntry_panelLayout);
        DailyItemSalesEntry_panelLayout.setHorizontalGroup(
            DailyItemSalesEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DailyItemSalesEntry_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DailyItemSalesEntry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        Request_requisition.setText("Request");
        Request_requisition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_requisitionActionPerformed(evt);
            }
        });

        Delete_btn.setText("Delete");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Request_requisition, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquantity))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_btn)
                    .addComponent(Request_requisition))
                .addGap(19, 19, 19))
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

        javax.swing.GroupLayout GenerateNDisplayRequisitionLayout = new javax.swing.GroupLayout(GenerateNDisplayRequisition);
        GenerateNDisplayRequisition.setLayout(GenerateNDisplayRequisitionLayout);
        GenerateNDisplayRequisitionLayout.setHorizontalGroup(
            GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateNDisplayRequisitionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GenerateNDisplayRequisitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6))
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
        table.loadTSupplieroTable(suppliertable);
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
        
        PurchaserOrders set = new PurchaserOrders();
        set.LoadtoPOTable(PO_table);
    }//GEN-LAST:event_PurchaseOrder_btnActionPerformed

    private void Logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btnActionPerformed
        MainF mainpage = new MainF();
        mainpage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Logout_btnActionPerformed

    private void Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_btnActionPerformed
        
        String itemID = "";
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
            Item AddItems = new Item(itemID, ItemName, Price, Quantity, supplier);
            AddItems.saveToFile();
            txtItemName.setText("");
            txtPrice.setText("");
            txtQuantity.setText("");
            Item items = new Item();
            items.loadItemsToTable(ItemsTable);
        }

    }//GEN-LAST:event_Save_btnActionPerformed

    private void Remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_btnActionPerformed
        int selectedRow = ItemsTable.getSelectedRow();
            if (selectedRow != -1) {
                String selectedID = ItemsTable.getValueAt(selectedRow, 0).toString();
                Item s = new Item();
                s.removeFromFile(selectedID); // delete from file
                s.loadItemsToTable(ItemsTable); // refresh table
                JOptionPane.showMessageDialog(this, "Item deleted.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_Remove_btnActionPerformed

    private void Suppliers_Save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suppliers_Save_btnActionPerformed
        String SupplierID = "";
        String SupplierName = txtSupplierName.getText();
        String Email = txtEmail.getText();
        String Product = txtProduct.getText();
        
        if(SupplierName.equals("")||Email.equals("")||Product.equals("")){
            JOptionPane.showMessageDialog(this,"Please,Enter all details.") ;
        }else{
            Supplier AddSupplier = new Supplier(SupplierID, SupplierName, Email, Product);
            AddSupplier.saveToFile();

            txtSupplierName.setText("");
            txtEmail.setText("");
            txtProduct.setText("");
            Supplier table = new Supplier();
            table.loadTSupplieroTable(suppliertable);
        }
    }//GEN-LAST:event_Suppliers_Save_btnActionPerformed

    private void Suppliers_Remove_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Suppliers_Remove_btn1ActionPerformed
        int selectedRow = suppliertable.getSelectedRow();
            if (selectedRow != -1) {
                String selectedID = suppliertable.getValueAt(selectedRow, 0).toString();
                Supplier s = new Supplier();
                s.removeFromFile(selectedID); // delete from file
                s.loadTSupplieroTable(suppliertable); // refresh table
                JOptionPane.showMessageDialog(this, "Item deleted.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_Suppliers_Remove_btn1ActionPerformed

    private void Edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_btnActionPerformed
        int selectedRow = suppliertable.getSelectedRow();
            if (selectedRow != -1) {
                
                String selectedID = suppliertable.getValueAt(selectedRow, 0).toString();
                String supplierName = suppliertable.getValueAt (selectedRow, 1).toString();
                String Email = suppliertable.getValueAt (selectedRow, 2).toString();
                String Product = suppliertable.getValueAt (selectedRow, 3).toString();
                txtSupplierName.setText(supplierName);
                txtEmail.setText(Email);
                txtProduct.setText(Product);
                Supplier s = new Supplier();
                s.removeFromFile(selectedID); // delete from file
                s.loadTSupplieroTable(suppliertable); // refresh table
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
            
    }//GEN-LAST:event_Edit_btnActionPerformed

    private void EditItem_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditItem_btnActionPerformed
        int selectedRow = ItemsTable.getSelectedRow();
            if (selectedRow != -1) {
                
                String selectedID = ItemsTable.getValueAt(selectedRow, 0).toString();
                String ItemName = ItemsTable.getValueAt (selectedRow, 1).toString();
                String Price = ItemsTable.getValueAt (selectedRow, 2).toString();
                String Quantity = ItemsTable.getValueAt (selectedRow, 3).toString();
                String supplierID = ItemsTable.getValueAt (selectedRow, 4).toString();
                txtItemName.setText(ItemName);
                txtPrice.setText(Price.replace("$", ""));
                txtQuantity.setText(Quantity);
                SupplierID_comboBox.setSelectedItem(supplierID);
                
                Item s = new Item();
                s.removeFromFile(selectedID); // delete from file
                s.loadItemsToTable(ItemsTable); // refresh table
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item to remove.");
            }
    }//GEN-LAST:event_EditItem_btnActionPerformed

    private void Select_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_btnActionPerformed
        int selectedRow = SalesEntry_table.getSelectedRow();
    if (selectedRow != -1) {
        selectedItemName = SalesEntry_table.getValueAt(selectedRow, 1).toString(); // item name
        String stockStr = SalesEntry_table.getValueAt(selectedRow, 3).toString(); // quantity
        selectedSupplierID = SalesEntry_table.getValueAt(selectedRow, 4).toString();
        selectedItemStock = Integer.parseInt(stockStr);

        lblSelectedItem.setText("Selected Item: " + selectedItemName);
        lblCurrentStock.setText("Stock: " + selectedItemStock);
        lblSelectedItem.setToolTipText("Item Name: " + selectedItemName);
        lblSupplier.setText("Supplier name : " + selectedSupplierID);
    } else {
        JOptionPane.showMessageDialog(this, "Please select an item.");
    }
    }//GEN-LAST:event_Select_btnActionPerformed

    private void Submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_btnActionPerformed
        if (selectedItemName == null) {
        JOptionPane.showMessageDialog(this, "Please select an item first.");
        return;
    }

    int qtySold;
    try {
        qtySold = Integer.parseInt(txtquantitySold.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity.");
        return;
    }

    if (qtySold > selectedItemStock) {
        JOptionPane.showMessageDialog(this, "Not enough stock available.");
        return;
    }

    Item item = new Item();
    boolean success = item.reduceStock(selectedItemName, qtySold);
    if (success) {
        JOptionPane.showMessageDialog(this, "Stock updated successfully.");
        lblCurrentStock.setText("Stock: " + (selectedItemStock - qtySold));
        txtquantitySold.setText("");
        item.loadItemsToTable(SalesEntry_table);
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update stock.");
    }
    }//GEN-LAST:event_Submit_btnActionPerformed

    private void SupplierID_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierID_comboBoxActionPerformed
        
    }//GEN-LAST:event_SupplierID_comboBoxActionPerformed

    private void Request_requisitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_requisitionActionPerformed
        int selectedRow = ItemsTablePR.getSelectedRow();
        
        String RequisitionID = "";
        String ItemName = ItemsTablePR.getValueAt(selectedRow, 1).toString();
        String Price = ItemsTablePR.getValueAt(selectedRow,2).toString();
        String SupplierID = ItemsTablePR.getValueAt(selectedRow,4).toString();
        int Quantity = 0;
        String requiredDate = new  java.text.SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date());
        try {
            Quantity = Integer.parseInt(txtquantity.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please,Enter a valid number.") ;
            return;
        }
        PurchaseRequisition s = new PurchaseRequisition (RequisitionID, ItemName, SupplierID, Quantity, Price, requiredDate);
        s.saveToFile();
        PurchaseRequisition set = new PurchaseRequisition();
        set.loadRequestToTable(RequestTable);
        JOptionPane.showMessageDialog(this, "Request successfully.");
    }//GEN-LAST:event_Request_requisitionActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
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
    }//GEN-LAST:event_Delete_btnActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatePurchaseRequisiton_btn;
    private javax.swing.JButton DailyItemSalesEntry_btn;
    private javax.swing.JPanel DailyItemSalesEntry_panel;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton EditItem_btn;
    private javax.swing.JButton Edit_btn;
    private javax.swing.JPanel GenerateNDisplayRequisition;
    private javax.swing.JButton ItemEntry_btn;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JTable ItemsTablePR;
    private javax.swing.JPanel ListOfItem_Panel;
    private javax.swing.JButton Logout_btn;
    private javax.swing.JTable PO_table;
    private javax.swing.JPanel Panels;
    private javax.swing.JPanel PurchaseOrder;
    private javax.swing.JButton PurchaseOrder_btn;
    private javax.swing.JButton Remove_btn;
    private javax.swing.JTable RequestTable;
    private javax.swing.JButton Request_requisition;
    private javax.swing.JTable SalesEntry_table;
    private javax.swing.JButton Save_btn;
    private javax.swing.JButton Select_btn;
    private javax.swing.JButton Submit_btn;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCurrentStock;
    private javax.swing.JLabel lblSelectedItem;
    private javax.swing.JLabel lblSupplier;
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
