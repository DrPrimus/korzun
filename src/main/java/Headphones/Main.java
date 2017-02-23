package Headphones;

import java.io.IOException;

/**
 * Created by Vova on 03.02.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Thing panosonik = new Headphones();
        panosonik.setColor("черный");
        panosonik.setSize(2);
        panosonik.getSize();
        panosonik.getColor();

        Iother other = new Headphones();
        other.say("sdf");
        other.setVolume(2);
    }
}
