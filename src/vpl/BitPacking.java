package vpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BitPacking {
    
    public static void main(String[] args) {
        
        Scanner fileScanner = null;
        String fileLine;
        int dataSets, type, subType, inventory;
        
        try {
            fileScanner = new Scanner(new FileInputStream("data/bitpacking.dat"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        
        dataSets = Integer.parseInt(fileScanner.nextLine());
        
        for(int i = 0; i < dataSets; i++) {
            
        }
    }
    
}
