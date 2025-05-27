package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PurchaseRequisition{
    private String RequisitionID;
    private String ItemName;
    private int Quantity;
    private String SupplierID;
    private String Price;
    private String requiredDate;
    
    public PurchaseRequisition(String RequisitionID, String ItemName, String SupplierID, int Quantity, String Price, String requiredDate){
        this.RequisitionID = RequisitionID;
        this.ItemName = ItemName;
        this.SupplierID = SupplierID;
        this.Quantity = Quantity;
        this.Price = Price;
        this.requiredDate = requiredDate;
    }
    
    public PurchaseRequisition(){
        
    }

    public String getRequisitionID() {
        return RequisitionID;
    }

    public void setRequisitionID(String RequisitionID) {
        this.RequisitionID = RequisitionID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }
    
    
    
    public void saveToFile() {
        String filePath = "src/assignment/java/oop/FM data/purchase_requisitions.txt";
        this.RequisitionID = generateNextID(filePath);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(RequisitionID + "," + ItemName + "," + Quantity + "," + Price + ","+ SupplierID + "," + requiredDate);
            writer.newLine();
            
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while saving items: " + e.getMessage());
        }
    }
    
    public void loadRequestToTable(javax.swing.JTable itemsTable) {
        String filePath = "src/assignment/java/oop/FM data/purchase_requisitions.txt"; 


        String[] columns = {"RequisitionID", "ItemName", "Quantity", "Price", "SupplierName", "requiredDate"};
        DefaultTableModel model = new DefaultTableModel(columns, 0); 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");


                if (itemData.length == 6) {

                    model.addRow(itemData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        itemsTable.setModel(model);
    }
    public void removeFromFile(String Requisition){
        String filePath = "src/assignment/java/oop/FM data/purchase_requisitions.txt";
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");
        
        try(
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));   
                
        ){
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] data = currentLine.split(",");
                if (data.length > 0 && data[0].equals(Requisition)) {
                    continue; 
                }
                writer.write(currentLine);
                writer.newLine();
            }
            }catch (IOException e) {
            e.printStackTrace();
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
                    int lastID = Integer.parseInt(parts[0].replace("RQ", ""));
                    return "RQ" + String.format("%04d", lastID + 1);
                } catch (NumberFormatException ignored) {}
            }
        }
        return "RQ0001";
    }
}
