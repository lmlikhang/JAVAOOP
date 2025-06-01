/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alvin
 */
public class IDGenerator {
    public static String generateNextID(String filePath, String prefix) {
        String lastLine = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) lastLine = line;
        } catch (IOException ignored) {}

        if (!lastLine.isEmpty()) {
            String[] parts = lastLine.split(",");
            if (parts.length > 0) {
                try {
                    int lastID = Integer.parseInt(parts[0].replace(prefix, ""));
                    return prefix + String.format("%04d", lastID + 1);
                } catch (NumberFormatException ignored) {}
            }
        }
        return prefix + "0001";
    }
}
