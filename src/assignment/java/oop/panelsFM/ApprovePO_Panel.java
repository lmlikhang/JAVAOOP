/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment.java.oop.panelsFM;

/**
 *
 * @author user
 */
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.Color;
import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;



public class ApprovePO_Panel extends javax.swing.JPanel {
    private JTable poTable;
    private DefaultTableModel model;
    
    
    public ApprovePO_Panel() {
        initComponents();
        String[] columnNames = {"PO ID", "Supplier", "Item Name", "Quantity", "Price(RM)", "Status", "Date"};
        model = (DefaultTableModel) jTable1.getModel();
        loadPurchaseOrdersFromFile();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        loadPurchaseOrdersFromFile();
        applyStatusColorRenderer();



    }
    
//    private static class StatusColorRenderer extends javax.swing.table.DefaultTableCellRenderer {
//    @Override
//    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value,
//            boolean isSelected, boolean hasFocus, int row, int column) {
//        
//        java.awt.Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//
//       
//        if ("Approved".equals(value)) {
//            c.setForeground(new java.awt.Color(0, 153, 0)); 
//        } else if ("Declined".equals(value)) {
//            c.setForeground(java.awt.Color.RED); 
//        } else {
//            c.setForeground(java.awt.Color.BLACK); 
//        }
//        
//        return c;
//    }
//}
    private void saveTableToFile() {
    String filePath = "src/assignment/java/oop/FM data/purchase_orders.txt"; 
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        for (int i = 0; i < model.getRowCount(); i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < model.getColumnCount(); j++) {
                row.append(model.getValueAt(i, j));
                if (j < model.getColumnCount() - 1) {
                    row.append(",");
                }
            }
            writer.write(row.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving file:\n" + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnApprove = new javax.swing.JButton();
        BtnDecline = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Approve Purchase Orders");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PO ID", "Supplier", "Item Name", "Quantity", "Price (RM)", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BtnApprove.setText("Approve");
        BtnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApproveActionPerformed(evt);
            }
        });

        BtnDecline.setText("Decline");
        BtnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeclineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnApprove)
                    .addComponent(BtnDecline))
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApproveActionPerformed
   
    int row = jTable1.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row first.");
        return;
    }

    String currentStatus = model.getValueAt(row, 5).toString();
    if (currentStatus.equalsIgnoreCase("Paid")) {
        JOptionPane.showMessageDialog(this, "You cannot change the status of a Paid PO.");
        return;
    }

    model.setValueAt("Approved", row, 5);
    saveTableToFile();

    }//GEN-LAST:event_BtnApproveActionPerformed

    private void BtnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeclineActionPerformed
   
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        String currentStatus = model.getValueAt(selectedRow, 5).toString();
        if (currentStatus.equalsIgnoreCase("Paid")) {
            JOptionPane.showMessageDialog(this, "You cannot decline a PO that is already Paid.");
            return;
        }

        model.setValueAt("Declined", selectedRow, 5);
        saveTableToFile();
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row first!");
    }
        
        
    }//GEN-LAST:event_BtnDeclineActionPerformed
    
    private void loadPurchaseOrdersFromFile() {
    String filePath = "src/assignment/java/oop/FM data/purchase_orders.txt";
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split(",");
             if (rowData.length >= 7) {
             model.addRow(new Object[] {
        rowData[0], // PO ID
        rowData[1], // Supplier
        rowData[2], // Item Name
        rowData[3], // Quantity
        rowData[4], // Price
        rowData[5], // Status
        rowData[6]  // Date
    });
}
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading file:\n" + e.getMessage());
    }
}
     private void applyStatusColorRenderer() {
    jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Only style non-selected rows
            if (!isSelected) {
                try {
                    String status = table.getValueAt(row, 5).toString(); 
                    if ("Paid".equalsIgnoreCase(status)) {
                        c.setBackground(new Color(180, 220, 255)); 
                    } else if ("Approved".equalsIgnoreCase(status)) {
                        c.setBackground(new Color(200, 255, 200)); 
                    } else if ("Declined".equalsIgnoreCase(status)) {
                        c.setBackground(new Color(255, 200, 200)); 
                    } else {
                        c.setBackground(Color.WHITE);
                    }
                } catch (Exception e) {
                    c.setBackground(Color.WHITE);
                }
            } else {
                c.setBackground(table.getSelectionBackground());
            }

            c.setForeground(Color.BLACK);
            return c;
        }
    });
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApprove;
    private javax.swing.JButton BtnDecline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
