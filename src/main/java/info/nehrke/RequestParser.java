package info.nehrke;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RequestParser {
    JSONObject event;

    RequestParser(InputStream input) {
        JSONParser parser = new JSONParser();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        try {
            event = (JSONObject) parser.parse(reader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    <T> T bodyAs(Class<T> cls) {
        Gson gson = new Gson();
        String json = (String)event.get("body");
        return gson.fromJson(json, cls);
    }
}
