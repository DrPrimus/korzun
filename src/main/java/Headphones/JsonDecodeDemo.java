package headphones;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

class JsonDecodeDemo {

    public static void main(String[] args) throws JSONException {
        Headphones panasonik = new Headphones();
        panasonik.setSize(12);
        panasonik.setColor("черный");
        panasonik.setVolume(2);

        JSONObject obj = new JSONObject();
        obj.put("Size",panasonik.getSize());
        obj.put("Color",panasonik.getColor());
        obj.put("Volume",panasonik.volume);



        obj.put("num", new String("Panasonik"));
        obj.put("model", new Integer(123212));
        obj.put("turnon", new Boolean(true));
        try (FileWriter file = new FileWriter("C:\\Users\\Vova\\korzun\\src\\main\\resources\\Headphones\\test.json")) {
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
    }
}

