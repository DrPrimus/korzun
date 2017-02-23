package Headphones;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

class JsonDecodeDemo {

    public static void main(String[] args) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("name", "Headphones");
        obj.put("num", new String("Panasonik"));
        obj.put("model", new Integer(123212));
        obj.put("turnon", new Boolean(true));


        try (FileWriter file = new FileWriter("D:\\test.json")) {
            file.write(obj.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*System.out.print(obj);
        obj.put("name", "Headphones");
        obj.put("num", new String("Panasonik"));
        obj.put("model", new Integer(123212));
        obj.put("turnon", new Boolean(true));
        StringWriter out = new StringWriter();
        obj.write(out);
        String jsonText = out.toString();
        System.out.print(jsonText); */
        Headphones pan = new Headphones();
        pan.getColor();
        pan.setVolume(324);
        pan.setColor("ЧЕРНЫЙ");
        pan.turnonoff();

    }
}

