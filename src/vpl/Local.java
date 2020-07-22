package vpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Local {
    
    public static void main(String[] args) {
        Scanner fileScanner = null;
        String fileLine;
        int dataSets;
        int y = 0;
        int b = 0;
        int w = 0;
        int arrayInt;
        String[] lineArray;
        final int TOTAL_DAYS = 31;
        
        try {
            fileScanner = new Scanner(new FileInputStream("data/local.dat"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        
        dataSets = Integer.parseInt(fileScanner.nextLine());
        
        for (int i = 0; i < dataSets && fileScanner.hasNextLine(); i++) {
            
            fileLine = fileScanner.nextLine();
            
            lineArray = fileLine.split(" ");
            
            y = Integer.parseInt(lineArray[0]);
            
            for(int index = 1; index <= TOTAL_DAYS; index++) {
                
                arrayInt = Integer.parseInt(lineArray[index]);
                
                if(arrayInt > 50)
                    w = w + 1;
                else if(arrayInt < 32)
                    b = b + 1;
                
            }
            
            System.out.println(y + " " + b + " " + w);
            
            y = 0;
            b = 0;
            w = 0;
            
        }
    }
}
