package headphones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * soczdanue classa nayshuku ,opisuvaem class,rabota c naychikamu
 *
 * @author Vova
 */
public class Headphones implements Thing,Iother {

    public int volume = 0;
    private boolean turnonoff = false;
    private int size;
    private String color;
    /**
     * dli poluchemia color
     * @return color
     */

    /**
     * nayshiki mogyt buti ulu man ulu girl,opredelietsia color naychikov
     */
    /**
     * medot dlia kotoruu hranit 2 zna4enia,nauchuku vtklu4enu/vuklu4enu
     */
    public void turnonoff() {
        if (turnonoff) {
            turnonoff = false;
        } else {
            turnonoff = true;
        }
    }
    /**
     * medot dlia ocenivania yrovnia gromcosti
     * prinimaem znachinie tolko v tom slu4ae eslu ono ot 0 do 5
     *
     * @param volume
     */
    @Override
    public void setVolume(int volume) {
        if ((volume >= 0 && volume < 6)) {
            this.volume = volume;
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }

    /**
     * metod dlia provetki eslu naychiki vkluchenu  u mu govorim po microfonu,to nas doljnu cluchati,4to mu govotim
     *
     * @param word
     */
    @Override
    public void say(String word) {
        String kol = "";
        for (int i = 0; i < volume; i++) {
            kol += "!";
        }
        if (turnonoff && volume > 0) {
            System.out.println(word + kol);
        }
    }



    class ButListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getSource());
        }
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color ;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

