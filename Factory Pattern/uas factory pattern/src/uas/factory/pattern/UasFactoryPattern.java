package uas.factory.pattern;
import java.util.Scanner;

public class UasFactoryPattern {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        appleFactory MBPfactory = new MacBookProFactory();
        appleFactory MPfactory = new MacProFactory();
        
        
        System.out.print("Masukkan type (advance or beginner): ");
        String type = input.next();
        apple a = MBPfactory.CreateAppleComputer(type);
        apple b = MPfactory.CreateAppleComputer(type);
        
        System.out.println("Nama Komputer : " + a.komputer);
        System.out.println("Processor "+ a.processor);
        System.out.println("Memory "+ a.memory);
        System.out.println("RAM "+ a.RAM);
        System.out.println();
        
        System.out.println("Nama Komputer : " + b.komputer);
        System.out.println("Processor "+ b.processor);
        System.out.println("Memory "+ b.memory);
        System.out.println("RAM "+ b.RAM);
        
        
        
        
    }
    
}
