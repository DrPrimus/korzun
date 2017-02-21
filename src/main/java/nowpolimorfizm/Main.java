package main.java.nowpolimorfizm;

import main.java.nowpolimorfizm.api.IRebootable;

/**
 * Created by Vova on 19.02.2017.
 */
public class Main {
    public static void main (String []args) {
       Notebook asus = new Notebook();
        asus.setName("Asus12-21");
        asus.on();
        PK Lg = new PK();
        Lg.setName("Lg 12434");
        Lg.setHdd(12312);
        Lg.on();

        //TODO Хочу перегружать твои компьютеры
        Rebooter rebooter = Rebooter.getInstance();
        rebooter.rebootDevice((IRebootable)new Notebook());
        rebooter.rebootDevice((IRebootable)new Computer());
        rebooter.reboot();


        /* Comp cp = new Comp();
       cp.m1("что-то");
       cp.m1(23);
       */
    }
}
