package headphones;

import org.codehaus.jackson.map.ObjectMapper;

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
public class Reboot extends HttpServlet {

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
        BufferedReader rd = new BufferedReader(new InputStreamReader(request.getInputStream()));
        StringBuffer json = new StringBuffer();
        while (rd.ready()) {
            json.append(rd.readLine());
            json.append("\n");
        }
        ObjectMapper mapper = new ObjectMapper();
      /*Headphones headphones = mapper.readValue(new FileInputStream("classpath:headphones/test.json"), Headphones.class);*/
       Headphones headphones = mapper.readValue(json.toString(), Headphones.class);
       headphones.setVolume(5);
       headphones.setSize(6);
       headphones.setColor("black");
        /*String json2 = new Gson().toJson("максимальная громкость" + headphones.getVolume())*/;


        String jsonObject = mapper.writeValueAsString(headphones);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonObject.toString());
        System.out.println("громкость"+ headphones.getVolume());
        //тут никаких new. Отдай jackson'у строку json И попроси его сконструировать объект типа Headphones
     }
 }



