package headphones;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Vova on 23.02.2017.
 */
public class Reboot extends HttpServlet{
    public Reboot() {
        super();
    }
    public void init() throws ServletException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* Headphones pas = new Headphones();
        pas.setSize(2);
        pas.setColor("черный");
        pas.setVolume(3);*/
       String json = new Gson().toJson(Headph.getheadphones());
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
        }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


       /* Headphones pas = new Headphones();
        String color = request.getHeader("color");
        pas.setColor(color);
        Integer size = request.getIntHeader("size");
        pas.setSize(size);
        Integer volume = request.getIntHeader("volume");
        pas.setVolume(volume);
        System.out.println(color + size + volume);*/
        }
    }



