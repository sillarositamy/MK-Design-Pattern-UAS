package uas.factory.pattern;

public class MacProFactory extends appleFactory {
    
    @Override
    apple CreateAppleComputer (String type){
        if(type.equals("beginner"))
            comp = new MacProBeginner();
        else if (type.equals("advance"))
            comp = new MacProAdvance();
        return comp;
    }
    
}
