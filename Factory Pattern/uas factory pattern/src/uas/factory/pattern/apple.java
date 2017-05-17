package uas.factory.pattern;

public abstract class apple {
    String RAM;
    String memory;
    String processor;
    String komputer;
    
    public void spec (){
        System.out.println("Nama Komputer : " + komputer);
        System.out.println("Spesifikasi notebook : ");
        System.out.println("Processor : " + processor);
        System.out.println("RAM : "+ RAM);
        System.out.println("Harddisk : "+ memory);
    }
    
}
