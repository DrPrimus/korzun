package headphones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Vova on 15.03.2017.
 */
public class HeadphonesController extends HttpServlet {
    public HeadphonesController() {
        super();
    }
    public void init() throws ServletException {


    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    request.getParameter("Color");
    request.getParameter("size");
    request.getParameter("volume");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Headphones hp1 = new Headphones();
        hp1.setColor("color1");
        hp1.setSize(1);
        hp1.setVolume(1);
        Headphones hp2 = new Headphones();
        hp2.setColor("color2");
        hp2.setSize(2);
        hp2.setVolume(2);
        Headphones hp3 = new Headphones();
        hp3.setColor("color3");
        hp3.setSize(3);
        hp3.setVolume(3);
        UUID key1 = HeadphonesDAO.getINSTANCE().add(hp1);
        System.out.println(HeadphonesDAO.getINSTANCE().one(key1));
        UUID key2 = HeadphonesDAO.getINSTANCE().add(hp2);
        UUID key3 = HeadphonesDAO.getINSTANCE().add(hp3);
        hp2.setColor("color4");
        HeadphonesDAO.getINSTANCE().update(key2, hp2);
        System.out.println(HeadphonesDAO.getINSTANCE().list());
        HeadphonesDAO.getINSTANCE().remove(key3);
        System.out.println(HeadphonesDAO.getINSTANCE().list());
    }
    public void destroy() {
        super.destroy();
    }



}

