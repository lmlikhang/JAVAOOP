package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Item implements Saveable {
    private String itemID;
    private String ItemName;
    private double Price;
    private int Quantity;
    private Supplier supplier;

    public Item(String itemID, String ItemName, double Price, int Quantity, Supplier supplier){
        this.itemID = itemID;
        this.ItemName = ItemName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.supplier = supplier;
    }
    
    public Item(){
    
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


    
    public void loadItemsToTable(javax.swing.JTable itemsTable) {
        String filePath = "src/assignment/java/oop/FM data/item.txt"; 


        String[] columns = {"itemID", "Item name", "Price(RM)", "Quantity", "Supplier"};
        DefaultTableModel model = new DefaultTableModel(columns, 0); 
        final int LOW_STOCK_THRESHOLD = 10;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");


                if (itemData.length == 5) {

                    model.addRow(itemData);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }


        itemsTable.setModel(model);
        itemsTable.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {

            java.awt.Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            try {
                int qty = Integer.parseInt(table.getValueAt(row, 3).toString()); // Quantity is column 3
                if (qty < LOW_STOCK_THRESHOLD) {
                    cell.setBackground(java.awt.Color.RED); // Low stock
                } else {
                    cell.setBackground(new java.awt.Color(144, 238, 144)); // Light green
                }

                if (isSelected) {
                    cell.setBackground(java.awt.Color.BLUE);
                    cell.setForeground(java.awt.Color.WHITE);
                } else {
                    cell.setForeground(java.awt.Color.BLACK);
                }

            } catch (Exception e) {
                cell.setBackground(java.awt.Color.WHITE); // fallback
            }

            return cell;
        }
    });
    }
    
    @Override
    public void saveToFile() {
        String filePath = "src/assignment/java/oop/FM data/item.txt";
        this.itemID = generateNextID(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
            
                if (line.contains("," + ItemName + ",")){
                    JOptionPane.showMessageDialog(null, "Dublicate item name are not allowed! ");
                    return;
                }
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(itemID + "," + ItemName + "," + Price + "," + Quantity + "," + supplier.getSupplierID());
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while saving items: " + e.getMessage());
        }
    }
    
    @Override
    public void removeFromFile(String id) {
        String filePath = "src/assignment/java/oop/FM data/item.txt";
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
        ) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] data = currentLine.split(",");
                if (data.length > 0 && data[0].equals(id)) {
                    continue; 
                }
                writer.write(currentLine);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error removing item: " + e.getMessage());
            return;
        }

        // Replace old file with updated file
        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        } else {
        JOptionPane.showMessageDialog(null, "Could not replace the file.");
    }
    }
    
    @Override
     public String generateNextID(String filePath) {
        return IDGenerator.generateNextID(filePath, "IT");
    }
     
    public boolean reduceStock(String itemName, int qtySold) {
        String filePath = "src/assignment/java/oop/FM data/item.txt";
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");

        boolean updated = false;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5 && parts[1].equals(itemName)) {
                    int currentQty = Integer.parseInt(parts[3]);
                    int newQty = currentQty - qtySold;
                    writer.write(parts[0] + "," + parts[1] + "," + parts[2] + "," + newQty + "," + parts[4]);
                    writer.newLine();
                    updated = true;
                } else {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            return false;
        }

        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
        }

        return updated;
    }
    
    
    public void addOrUpdateStock(String itemName, int finalQuantity) {
        String filePath = "src/assignment/java/oop/FM data/item.txt";
        File tempFile = new File("src/assignment/java/oop/FM data/items_temp.txt");
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4 && parts[1].equalsIgnoreCase(itemName)) {
                    
                    parts[3] = String.valueOf(finalQuantity);
                    line = String.join(",", parts);
                    found = true;
                }
                writer.write(line);
                writer.newLine();
            }
            if (!found) {
                writer.write(itemName + "," + itemName + ",0.00," + finalQuantity);
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating item stock: " + e.getMessage());
        }
        File original = new File(filePath);
        if (original.delete()) {
            tempFile.renameTo(original);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to replace item file.");
        }

    }
    
    public int getExistingQuantity(String itemName) {
        String filePath = "src/assignment/java/oop/FM data/item.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4 && parts[1].equalsIgnoreCase(itemName)) {
                    return Integer.parseInt(parts[3]);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading item quantity: " + e.getMessage());
        }
        return 0;
    }
    
    public String generateStockReportToTextArea() {
        String filePath = "src/assignment/java/oop/FM data/item.txt";
        final int LOW_STOCK_THRESHOLD = 10;
        StringBuilder report = new StringBuilder();

        LocalDate today = LocalDate.now();
        String date = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        String baseName = "src/assignment/java/oop/FM data/StockReports/stock_report_" + date;
        String outputPath = baseName + ".txt";
        int count = 1;
        while (new File(outputPath).exists()) {
            outputPath = baseName + "_" + count + ".txt";
            count++;
        }
        
        try (
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ) {
            
            report.append("=== STOCK REPORT ===\n");
            report.append("Generated on: ").append(date).append("\n\n");
            report.append(String.format("%-10s %-25s %-10s %-10s %-15s %-12s\n", "Item ID", "Item Name", "Price", "Qty", "Supplier", "Status"));
            report.append("-------------------------------------------------------------------------------------\n");

            writer.write(report.toString());

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int qty = Integer.parseInt(parts[3]);
                    String status = qty < LOW_STOCK_THRESHOLD ? "LOW STOCK" : "sufficient";

                    String csvLine = String.join(",", parts[0], parts[1], parts[2], parts[3], parts[4], status);
                    report.append(csvLine).append("\n");
                    writer.write(csvLine + "\n");
                }
            }

        } catch (IOException e) {
            return "Error generating stock report: " + e.getMessage();
        }

        return report.toString();
    }

}
