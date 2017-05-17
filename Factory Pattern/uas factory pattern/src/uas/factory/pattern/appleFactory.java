package uas.factory.pattern;

public abstract class appleFactory {
    apple comp;
    
    abstract apple CreateAppleComputer(String type);
    
    public void spec (){
        System.out.println("Spesifikasi notebook : ");
        System.out.println("Processor : " + comp.processor);
        System.out.println("RAM : "+ comp.RAM);
        System.out.println("Harddisk : "+comp.memory);
    }
}
