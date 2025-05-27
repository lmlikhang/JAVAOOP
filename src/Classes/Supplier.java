package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Supplier implements Saveable{
    private String SupplierID;
    private String SupplierName;
    private String Email;
    private String Product;  
    
    
    public Supplier(String SupplierID, String SupplierName, String Email, String Product){
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.Email = Email;
        this.Product = Product;
    }
    
    @Override
    public String toString() {
        return SupplierID;
    }
    
    public Supplier() {
   
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    
    
    
    public void loadTSupplieroTable(javax.swing.JTable supplierinfo) {
        String filePath = "src/assignment/java/oop/FM data/suppliers.txt"; 


        String[] columns = {"SupplierID", "supplier name", "Email", "Product"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while ((line = reader.readLine()) != null) {

                String[] itemData = line.split(",");


                if (itemData.length == 4) {

                    model.addRow(itemData);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }


        supplierinfo.setModel(model);
    }
    
    @Override
    public void saveToFile(){
        String filePath = "src/assignment/java/oop/FM data/suppliers.txt";
        this.SupplierID = generateNextID(filePath);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) !=null){
                if (line.contains("," + SupplierName + ",")){
                    JOptionPane.showMessageDialog(null, "Dublicate Supplier name are not allow! ");
                    
                    return;
                }
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(SupplierID + "," + SupplierName + "," + Email + "," + Product);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while saving items: " + e.getMessage());
        }
    }
    
    @Override
    public void removeFromFile(String id) {
        String filePath = "src/assignment/java/oop/FM data/suppliers.txt";
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
                    continue; // skip this line (deletes it)
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
                    int lastID = Integer.parseInt(parts[0].replace("SP", ""));
                    return "SP" + String.format("%04d", lastID + 1);
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return "SP0001";
    }
    
    public void loadSpplierOntoComboBox(javax.swing.JComboBox<String> comboBox){
        comboBox.removeAllItems();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/assignment/java/oop/FM data/suppliers.txt"))) {
            String line;
            while((line = reader.readLine())!=null){
                String[] data = line.split(",");
                if (data.length >= 1){
                    comboBox.addItem(data[1]);
                }
        }
        }catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error loading supplier IDs: " + e.getMessage());
    }
    }
}


