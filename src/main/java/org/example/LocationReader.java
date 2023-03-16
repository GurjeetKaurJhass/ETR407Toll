package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LocationReader
{
    public static void main( String[] args ) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        File locateJson = new File("/Users/gurjeet/ETR407Toll/src/main/resources/interchanges.json");
        List<Location> location = Arrays.asList(objectMapper.readValue(locateJson, Location[].class));
        System.out.println(Arrays.asList(location));

    }
}