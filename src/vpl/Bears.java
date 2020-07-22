package vpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bears {
    
    public static void main(String[] args) {
        Scanner fileScanner = null;
        String fileLine;
        int dataSets;
        int bearCounter = 0;
        char[] firstLine, secondLine, thirdLine, fourthLine, fifthLine, sixthLine, seventhLine, eighthLine, ninthLine, tenthLine;
        
        try {
            fileScanner = new Scanner(new FileInputStream("data/bears.dat"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        
        dataSets = Integer.parseInt(fileScanner.nextLine());
        
        for (int i = 0; i < dataSets && fileScanner.hasNextLine(); i++) {
            
            fileLine = fileScanner.nextLine();
            firstLine = fileLine.toCharArray();
            
            for (int index = 0; index < firstLine.length; index++) {
                if (firstLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            secondLine = fileLine.toCharArray();
            
            for (int index = 0; index < secondLine.length; index++) {
                if (secondLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            thirdLine = fileLine.toCharArray();
            
            for (int index = 0; index < thirdLine.length; index++) {
                if (thirdLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            fourthLine = fileLine.toCharArray();
            
            for (int index = 0; index < fourthLine.length; index++) {
                if (fourthLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            fifthLine = fileLine.toCharArray();
            
            for (int index = 0; index < fifthLine.length; index++) {
                if (fifthLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            sixthLine = fileLine.toCharArray();
            
            for (int index = 0; index < sixthLine.length; index++) {
                if (sixthLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            seventhLine = fileLine.toCharArray();
            
            for (int index = 0; index < seventhLine.length; index++) {
                if (seventhLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            eighthLine = fileLine.toCharArray();
            
            for (int index = 0; index < eighthLine.length; index++) {
                if (eighthLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            ninthLine = fileLine.toCharArray();
            
            for (int index = 0; index < ninthLine.length; index++) {
                if (ninthLine[index] == 'B') {
                    bearCounter++;
                }
            }
            
            fileLine = fileScanner.nextLine();
            tenthLine = fileLine.toCharArray();
            
            for (int index = 0; index < tenthLine.length; index++) {
                if (tenthLine[index] == 'B') {
                    bearCounter++;
                }
            }
        }
        System.out.println(bearCounter);
    }
}