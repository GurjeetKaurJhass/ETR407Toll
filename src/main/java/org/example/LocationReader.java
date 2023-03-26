package org.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class LocationReader
{


    public static void main(String[] args ) throws IOException {
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(new FileReader("/Users/gurjeet/ETR407Toll/src/main/resources/interchanges.json"));
        JSONParser parser = new JSONParser();

//        try (Reader reader = new FileReader("/Users/gurjeet/ETR407Toll/src/main/resources/interchanges.json")) {
//            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);
            JsonObject locations = (JsonObject) jsonObject.get("locations");

//           JsonObject one = (JsonObject) locations.get("1");
//            System.out.println(one);
//            String name =one.get("name").getAsString();
//            System.out.println(name);

        Iterator<JsonObject> iterator = Arrays.asList(locations).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //String id = (String) jsonChildObject.get("toId");
            // get locations array from the JSON Object and store it into JSONArray
            JsonObject two = (JsonObject) locations.get("2");
            JsonArray routes= (JsonArray)two.get("routes");
            JsonObject routes0= routes.get(0).getAsJsonObject();
            System.out.println(routes0);
            //JsonArray toID = (JsonObject) routes.get(Integer.parseInt("distance"));


        }
        //iterator.forEachRemaining(System.out::println);

//             System.out.println(name);
//            JsonObject lat = (JsonObject) one.get("lat");
//            System.out.println(lat);
//            JsonObject lng = (JsonObject) one.get("lng");
//            System.out.println(lng);
//        JsonObject two = (JsonObject) locations.get("2");
//        System.out.println(two);
//        JsonArray routes= (JsonArray)two.get("routes");
//        JsonObject routes0= routes.get(0).getAsJsonObject();
//        System.out.println(routes0);
            // loop array

//            JsonArray routes = (JSONArray) one.get("routes");
//            JsonArray toID = (JsonObject) routes.get("toId");
            //JsonObject patient0 = patientbody.get(0).getAsJsonObject();






    }


    }
