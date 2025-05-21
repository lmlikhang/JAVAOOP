package Classes;


public interface Saveable {
    void saveToFile();
    void removeFromFile(String id);
    String generateNextID(String filePath);
}
