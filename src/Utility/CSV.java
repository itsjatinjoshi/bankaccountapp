package Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    public static List<String[]> readCSV(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String row;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((row = br.readLine()) != null) {
                String[] rowData = row.split(",");
                data.add(rowData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found" + e.getMessage());
        } catch (IOException e) {
            System.out.println("File Not Readable" + e.getMessage());
        }
        return data;
    }
}
