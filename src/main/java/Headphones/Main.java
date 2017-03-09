package headphones;

import java.io.IOException;

/**
 * Created by Vova on 03.02.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
      /*  byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\Vova\\korzun\\src\\main\\resources\\headphones\\test.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Headphones headphones = objectMapper.readValue(jsonData, Headphones.class);
        System.out.println("Employee Object\n"+headphones.getColor());
*/


     /*Headphones pas = new Headphones();
     pas.setSize(2);
     pas.setColor("черный");
     pas.setVolume(2);
     ObjectMapper mapper = new ObjectMapper();
     mapper.writeValue(new File("C:\\Users\\Vova\\korzun\\src\\main\\resources\\headphones\\test.json"),pas);*/
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

        String key1 = HeadphonesDAO.getINSTANCE().add(hp1);
        System.out.println(HeadphonesDAO.getINSTANCE().one(key1));
        String key2 = HeadphonesDAO.getINSTANCE().add(hp2);
        String key3 = HeadphonesDAO.getINSTANCE().add(hp3);
        hp2.setColor("color4");
        HeadphonesDAO.getINSTANCE().update(key2, hp2);
        System.out.println(HeadphonesDAO.getINSTANCE().list());
        HeadphonesDAO.getINSTANCE().remove(key3);
        System.out.println(HeadphonesDAO.getINSTANCE().list());
    }
}
