package Headphones;

import org.json.JSONException;
import org.json.JSONObject;

class JsonDecodeDemo {

    public static void main(String[] args) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("name", "Headphones");
        obj.put("num", new String("Panasonik"));
        obj.put("model", new Integer(123212));
        obj.put("turnon", new Boolean(true));
        System.out.print(obj);
    }
}

