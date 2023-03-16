package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Location
{
    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", routes=" + routes +
                '}';
    }

    public Location(String name, double lat, double lng, ArrayList<Double> routes) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.routes = routes;
    }

    public String name;
    public double lat;
    public double lng;

    public ArrayList<Objects> locations;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public ArrayList<Double> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Double> routes) {
        this.routes = routes;
    }

    public ArrayList<Double> routes;
}