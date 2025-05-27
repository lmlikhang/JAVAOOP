package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        String lastLine = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) lastLine = line;
        } catch (IOException ignored) {}

        if (!lastLine.isEmpty()) {
            String[] parts = lastLine.split(",");
            if (parts.length > 0) {
                try {
                    int lastID = Integer.parseInt(parts[0].replace("IT", ""));
                    return "IT" + String.format("%04d", lastID + 1);
                } catch (NumberFormatException ignored) {}
            }
        }
        return "IT0001";
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
    
    
    
}
