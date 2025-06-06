/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment.java.oop.panelsFM;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;

public class ProcessPayments_Panel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessPayments_Panel
     */
    private DefaultTableModel model;
    
    public ProcessPayments_Panel() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        loadApprovedPOs();
        btnMarkPaid.addActionListener(evt -> markAsPaid());
        applyStatusColorRenderer();
    }
    
    private void loadApprovedPOs() {
        String path = "src/assignment/java/oop/FM data/purchase_orders.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 7 && parts[5].equalsIgnoreCase("Received")) {
                    model.addRow(parts);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading file:\n" + e.getMessage());
        }
    }
    
     private void markAsPaid() {
        int row = jTable1.getSelectedRow();
        if (row == -1) {
        JOptionPane.showMessageDialog(this, "Select a PO to mark as Paid.");
        return;
    }

    String poID = model.getValueAt(row, 0).toString(); 

    model.setValueAt("Paid", row, 5);

    updatePOStatus(poID, "Paid");

    JOptionPane.showMessageDialog(this, "PO marked as Paid and saved.");
    }
     
     private void updatePOStatus(String targetPoID, String newStatus) {
    String path = "src/assignment/java/oop/FM data/purchase_orders.txt";
    StringBuilder updatedContent = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length >= 7 && parts[0].equals(targetPoID)) {
                parts[5] = newStatus; 
                line = String.join(",", parts);
            }
            updatedContent.append(line).append("\n");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error updating PO:\n" + e.getMessage());
        return;
    }

    // Rewrite file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
        writer.write(updatedContent.toString());
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving updated PO:\n" + e.getMessage());
    }
}

     
     private void saveAllPOs() {
        String path = "src/assignment/java/oop/FM data/purchase_orders.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    sb.append(model.getValueAt(i, j));
                    if (j < model.getColumnCount() - 1) sb.append(",");
                }
                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving:\n" + e.getMessage());
        }
    }
     
    private void applyStatusColorRenderer() {
    jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            String status = table.getValueAt(row, 5).toString(); 

            if ("Received".equalsIgnoreCase(status)) {
                c.setBackground(new java.awt.Color(255, 255, 180)); // Yellow
            } else if ("Paid".equalsIgnoreCase(status)) {
                c.setBackground(new java.awt.Color(180, 220, 255)); // Light blue
            } else {
                c.setBackground(Color.WHITE);
            }
            c.setForeground(Color.BLACK);
            return c;
        }
    });
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMarkPaid = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Process Payments for Suppliers");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PO ID", "Supplier", "Item", "Qty", "Price", "Status", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnMarkPaid.setText("Mark as Paid");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnMarkPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMarkPaid)
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarkPaid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
