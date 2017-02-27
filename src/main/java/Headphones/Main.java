package headphones;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Vova on 03.02.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Vova\\korzun\\src\\main\\resources\\headphones\\test.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Headphones headphones = objectMapper.readValue(jsonData, Headphones.class);
        System.out.println("Employee Object\n"+headphones.getColor());



     /*Headphones pas = new Headphones();
     pas.setSize(2);
     pas.setColor("черный");
     pas.setVolume(2);
     ObjectMapper mapper = new ObjectMapper();
     mapper.writeValue(new File("C:\\Users\\Vova\\korzun\\src\\main\\resources\\headphones\\test.json"),pas);*/

    }
}
