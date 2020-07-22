package vpl;

import java.util.Random;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiceRoll {

    public static void main(String[] args) {
        long seed;
        int r1, r2;
        String color = "WHITE";
        Scanner fileScanner = null;
        int dataSets;
        
        try {
            fileScanner = new Scanner(new FileInputStream("data/diceroll.dat"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        
        dataSets = Integer.parseInt(fileScanner.nextLine());
        
        for(int i = 0; i < dataSets && fileScanner.hasNextLine(); i++) {
            seed = Long.parseLong(fileScanner.nextLine());
            
            Random randomGenerator = new Random(seed);
                    
            r1 = randomGenerator.nextInt(4);
            r1++;
            
            r2 = randomGenerator.nextInt(25);
            r2++;
            
            for(int i2 = 0; i2 < r2; i2++) {
                
                if(r1 == 1 && color.equals("WHITE"))
                    color = "RED";
                else if(r1 == 1 && color.equals("RED"))
                    color = "WHITE";
                else if(r1 == 2 && color.equals("WHITE"))
                    color = "RED";
                else if(r1 == 2 && color.equals("RED"))
                    color = "WHITE";
                else if(r1 == 3 && color.equals("WHITE"))
                    color = "BLUE";
                else if(r1 == 3 && color.equals("BLUE"))
                    color = "WHITE";
                else if(r1 == 4 && color.equals("WHITE"))
                    color = "BLUE";
                else if(r1 == 4 && color.equals("BLUE"))
                    color = "WHITE";
                
            }
            
            System.out.println(color);
            color = "WHITE";
        }
    }
}
