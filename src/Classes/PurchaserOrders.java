/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alvin
 */
public class PurchaserOrders {
    private String POID;
    private String supplierID;
    private String Itemname;
    private int Quantity;
    private double Price;
    private String requiredDate;
        
    public PurchaserOrders (String POID, String supplierID, String Itemname, int Quantity, double Price, String requiredDate){
        this.POID = POID;
        this.supplierID = supplierID;
        this.Itemname = Itemname;
        this.Quantity = Quantity;
        this.Price = Price;
        this.requiredDate = requiredDate;
            
    }
    public PurchaserOrders (){
            
    }

    public String getPOID() {
        return POID;
    }

    public void setPOID(String POID) {
        this.POID = POID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getItemname() {
        return Itemname;
    }

    public void setItemname(String Itemname) {
        this.Itemname = Itemname;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }
        
        
        
        public void LoadtoPOTable(javax.swing.JTable table){
            String filePath = "src/assignment/java/oop/FM data/Purchase_Orders.txt"; 


        String[] columns = {"PO ID", "Supplier", "Item Name", "Quantity", "Price(RM)", "Status", "Date"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");


                if (itemData.length == 7) {

                    model.addRow(itemData);
                }
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
        


        table.setModel(model);
        }
                public void LoadtoPOTable_Approved(javax.swing.JTable table){
            String filePath = "src/assignment/java/oop/FM data/Purchase_Orders.txt"; 


        String[] columns = {"PO ID", "Supplier", "Item Name", "Quantity", "Price(RM)", "Status", "Date"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");


                if (itemData.length == 7 && itemData[5].equalsIgnoreCase("Approved")) {

                    model.addRow(itemData);
                }
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
        


        table.setModel(model);
        }
        
    
        public void saveToFile(){
            String filePath = "src/assignment/java/oop/FM data/Purchase_Orders.txt";
            this.POID = generateNextID(filePath);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))){

                writer.write(POID +","+ supplierID +","+ Itemname + "," + Quantity + "," + Price + "," + "Pending" + "," + requiredDate);
                writer.newLine();

            }catch (IOException e){
                JOptionPane.showMessageDialog(null, "An error occurred while saving items: " + e.getMessage());
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
                        int lastID = Integer.parseInt(parts[0].replace("PO", ""));
                        return "PO" + String.format("%04d", lastID + 1);
                    } catch (NumberFormatException ignored) {}
                }
            }
            return "PO0001";
        }
        
        public boolean  ReceivedAndUpdateStock(String selectedPOID, String newStatus){
            String filePath = "src/assignment/java/oop/FM data/Purchase_Orders.txt";
            File tempFile = new File("src/assignment/java/oop/FM data/PO.txt");
            boolean updated = false;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))){
                
                String line;
                while ((line = reader.readLine()) != null){
                    String[] parts = line.split(",");
                    if (parts.length == 7) {
                        if (parts[0].equals(selectedPOID)) {
                            parts[5] = newStatus;
                            updated = true;
                        }
                        writer.write(String.join(",", parts));
                        writer.newLine();
            }
                }
                
                
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error updating PO status: " + e.getMessage());
            }
            
            if (updated) {
                File original = new File(filePath);
                File temp = (tempFile);
                if (original.delete()) {
                    if (!temp.renameTo(original)) {
                        JOptionPane.showMessageDialog(null, "Error renaming temp file.");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error deleting original file.");
                    return false;
            }

            }
        return updated;
            
        }

}
