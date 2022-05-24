package RACTAR;

import BAY.*;

public class main {
    public static void main(String [] args)
    {
        AFU arena1=new AFU(12, 12.2);
        TEROBORONA coliseum1=new TEROBORONA(12, 12.2);
        Person[] chmo= {arena1,coliseum1};
        for (Person poz:chmo) {
            System.out.println(poz.getName()+"="+poz.getFunctionOne()+","+poz.getFunctionTwo());
        }

    }
}
