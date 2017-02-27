package headphones;

/**
 * Created by Vova on 26.02.2017.
 */
public  class Headph {
    public static Headphones getheadphones(){
        Headphones pas = new Headphones();
        pas.setSize(2);
        pas.setColor("черный");
        pas.setVolume(3);
        return pas;
    }
}
