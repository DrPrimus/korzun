package headphones;

import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
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

    /*  Headphones hp1 = new Headphones();
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
       HeadphonesDAO.getINSTANCE().add(hp1);
       HeadphonesDAO.getINSTANCE().add(hp2);
       HeadphonesDAO.getINSTANCE().add(hp3);*/

        Map<UUID, Headphones> listHeadphones = HeadphonesDAO.getINSTANCE().list();
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(listHeadphones.toString());

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Headphones headphones = createHeadphones(request);
        UUID key = HeadphonesDAO.getINSTANCE().add(headphones);
        response.getWriter().write(key.toString());

    }
    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String key = req.getRequestURI().replace("/HeadphonesController/", "");
        UUID keyUUID = UUID.fromString(key);
        HeadphonesDAO.getINSTANCE().remove(keyUUID);
    }

    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
         IOException {
        Headphones headphones = createHeadphones(req);
        String key = req.getRequestURI().replace("/HeadphonesController/","");
        UUID keyUUID = UUID.fromString(key);
        HeadphonesDAO.getINSTANCE().update(keyUUID,headphones);

    }
   private Headphones createHeadphones(HttpServletRequest request) throws ServletException,
           IOException {
       BufferedReader rd = new BufferedReader(new InputStreamReader(request.getInputStream()));
       StringBuffer json = new StringBuffer();
       while (rd.ready()) {
           json.append(rd.readLine());
           json.append("\n");
       }
       ObjectMapper mapper = new ObjectMapper();
       Headphones headphones = mapper.readValue(json.toString(), Headphones.class);
        return headphones;

   }

    public void destroy() {
        super.destroy();
    }
}

