package uas.factory.pattern;

public class MacBookProFactory extends appleFactory {
    
    @Override
    apple CreateAppleComputer (String type){
        if(type.equals("beginner"))
            comp = new MacBookBeginner();
        else if (type.equals("advance"))
            comp = new MacBookAdvance();
        return comp;
    }
    
}
