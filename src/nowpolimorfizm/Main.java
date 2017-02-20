package nowpolimorfizm;

/**
 * Created by Vova on 19.02.2017.
 */
public class Main {
    public static void main (String []args) {
       Computer asus = new Notebook();
       asus.setHdd(2);
       asus.setName("LG");
       asus.on();
       asus.load();
       asus.of();

       Notebook hp = new Notebook();
       hp.setHdd(3);
       hp.setName("HP");
       hp.on();
       hp.load();
       hp.charge();
       hp.of();

      /* Comp cp = new Comp();
       cp.m1("что-то");
       cp.m1(23);*/
    }
}
