package Classes;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

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
                int qty = Integer.parseInt(table.getValueAt(row, 3).toString());
                if (qty < LOW_STOCK_THRESHOLD) {
                    cell.setBackground(java.awt.Color.RED);
                } else {
                    cell.setBackground(new java.awt.Color(144, 238, 144));
                }

                if (isSelected) {
                    cell.setBackground(java.awt.Color.BLUE);
                    cell.setForeground(java.awt.Color.WHITE);
                } else {
                    cell.setForeground(java.awt.Color.BLACK);
                }

            } catch (Exception e) {
                cell.setBackground(java.awt.Color.WHITE);
            }

            return cell;
        }
    });
    }
    
    public void loadItemsToTable_High(javax.swing.JTable itemsTable) {
        String filePath = "src/assignment/java/oop/FM data/item.txt"; 


        String[] columns = {"itemID", "Item name", "Price(RM)", "Quantity", "Supplier"};
        DefaultTableModel model = new DefaultTableModel(columns, 0); 
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");


                if (itemData.length == 5) {
                    try{
                        int quantity = Integer.parseInt(itemData[3]);
                        if (quantity > 5){
                            model.addRow(itemData);
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "An error occurred: ");
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }


        itemsTable.setModel(model);
    }    
    
    public void loadItemsToTable_Low(javax.swing.JTable itemsTable) {
        String filePath = "src/assignment/java/oop/FM data/item.txt"; 


        String[] columns = {"itemID", "Item name", "Price(RM)", "Quantity", "Supplier"};
        DefaultTableModel model = new DefaultTableModel(columns, 0); 
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");
                if (itemData.length == 5) {
                    try{
                        int quantity = Integer.parseInt(itemData[3]);
                        if (quantity <= 5){
                            model.addRow(itemData);
                        }
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "An error occurred: ");
                    }

                    
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }


        itemsTable.setModel(model);
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
        try (
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            
        ) {
            
            report.append("=== STOCK REPORT ===\n");
            report.append("Generated on: ").append(date).append("\n\n");
            report.append(String.format("%-10s %-25s %-10s %-10s %-15s %-12s\n", "Item ID", "Item Name", "Price", "Qty", "Supplier", "Status"));
            report.append("-------------------------------------------------------------------------------------\n");

           
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int qty = Integer.parseInt(parts[3]);
                    String status = qty < LOW_STOCK_THRESHOLD ? "LOW STOCK" : "sufficient";

                    String csvLine = String.join(" | ", parts[0], parts[1], parts[2], parts[3], parts[4], status ,"\n");
                    report.append(csvLine).append("\n");
                    
                }
            }

        } catch (IOException e) {
            return "Error generating stock report: " + e.getMessage();
        }

        return report.toString();
    }
    
    public static void exportStockReportToPDF(JTextArea textArea, JFrame parentFrame) {
        String content = textArea.getText();
        if (content.isEmpty()) {
            JOptionPane.showMessageDialog(parentFrame, "Stock report is empty. Generate it first.");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Stock Report as PDF");
        fileChooser.setSelectedFile(new File("Stock_Report.pdf"));
        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(fileToSave));
                document.open();

                Font font = FontFactory.getFont(FontFactory.COURIER, 10);
                Paragraph paragraph = new Paragraph(content, font);
                document.add(paragraph);

                document.close();
                JOptionPane.showMessageDialog(parentFrame, "PDF saved to:\n" + fileToSave.getAbsolutePath());
            } catch (DocumentException | IOException e) {
                JOptionPane.showMessageDialog(parentFrame, "Error exporting to PDF:\n" + e.getMessage());
            }
        }
    }

}
