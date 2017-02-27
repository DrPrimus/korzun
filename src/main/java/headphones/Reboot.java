package headphones;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
   /*     byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Vova\\korzun\\src\\main\\resources\\headphones\\test.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Headphones headphones = objectMapper.readValue(jsonData, Headphones.class);*/
      /*  byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Vova\\korzun\\src\\main\\resources\\headphones\\test.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Headphones headphones = objectMapper.readValue(jsonData, Headphones.class);
        System.out.println("Employee Object\n"+headphones.toString());*/



   /*    String json = new Gson().toJson(Headph.getheadphones());
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);*/
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
/*        Headphones pas = new Headphones();
        String color = request.getHeader("color");
        pas.setColor(color);
        Integer size = request.getIntHeader("size");
        pas.setSize(size);
        Integer volume = request.getIntHeader("volume");
        pas.setVolume(volume);
        System.out.println(color + size + volume);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if(br != null){
            json = br.readLine();
        }
        /*ObjectMapper mapper = new ObjectMapper();
        Headphones headphones = mapper.readValue(json, Headphones.class);
        response.getWriter().write(json);*/
        System.out.println(json);
    }
    }




