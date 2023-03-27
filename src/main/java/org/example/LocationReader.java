package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class LocationReader {
    private static final int routeHighNum = 46;
    private static final double tollRatePerKilometer = 0.25;
    public static void main(String[] args) throws IOException {
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(new FileReader("./src/main/resources/interchanges.json"));
        JsonObject locations = (JsonObject) jsonObject.get("locations");
        for (int i = 1; i <= routeHighNum; i++) {
            try {
                // Get origin locations
                JsonObject origin = (JsonObject) locations.get(String.valueOf(i));
                Location data = new Gson().fromJson(origin, Location.class);
                data.setId(i);

                // Read routes
                for (Route route: data.getRoutes()
                ) {

                    // Calculate the cost
                    BigDecimal cost = BigDecimal.valueOf(route.getDistance() * tollRatePerKilometer);
                    route.setCost(cost);

                    // Get destination
                    JsonObject destination = (JsonObject) locations.get(String.valueOf(route.getToId()));
                    Location destinationData = new Gson().fromJson(destination, Location.class);

                    System.out.println("costOfTrip('" + data.getName() + "', '" + destinationData.getName() + "')");
                    System.out.println("Distance: " + route.getDistance());
                    System.out.println("Cost: " + route.getCost());
                    System.out.println("");
                }

                //System.out.println(data);
            } catch(Exception e) {
                //skip
            }

        }
    }
}