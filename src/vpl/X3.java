package vpl;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class X3 {
    public static void main(String args[]) {
        Scanner kb = null;
        int times = 0;
        int count;
        String fileLine;
        String[] coefficient;
        int a,b,c,d;
        boolean found;
        
        try {  
            kb = new Scanner(new FileInputStream("data/x3.dat"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
            System.exit(0);
        }
        
        count = Integer.parseInt(kb.nextLine());
        
        while(times < count) { 
            times++;
            fileLine = kb.nextLine().trim();
            coefficient = fileLine.split(" ");
            String name = coefficient[0];
            a = Integer.parseInt(coefficient[0]);
            b = Integer.parseInt(coefficient[1]);
            c = Integer.parseInt(coefficient[2]);
            d = Integer.parseInt(coefficient[3]);
            found = false;
            for(int x=-100; x<=100; x++) {
                if(a*x*x*x + b*x*x + c*x + d ==0) {
                    System.out.print(x + " ");
                    found = true;
                }
            } if(!found) {
                System.out.println("NO INTEGER SOLUTION");
            } else {
                System.out.println();
            }
        }
    }
}