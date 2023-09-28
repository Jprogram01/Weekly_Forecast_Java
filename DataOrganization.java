import java.util.Map;

import flexjson.JSONDeserializer;
public class DataOrganization {

    //Get the JSON data and parse it to a FullJsonData object
    public JsonToJava returnData(String fullJsonData) {
    Map<String, Object> jsonMap = new JSONDeserializer<Map<String, Object>>()
            .deserialize(fullJsonData);

    //Use the JsonToJava class to organize the JSON data.
    JsonToJava jsonToJava = new JsonToJava();
    jsonToJava.setLocation((Map<String, Object>) jsonMap.get("location"));
    jsonToJava.setCurrent((Map<String, Object>) jsonMap.get("current"));
    jsonToJava.setForecast((Map<String, Object>) jsonMap.get("forecast"));

    return jsonToJava;
}
}