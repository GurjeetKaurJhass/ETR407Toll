package org.example;

import java.util.List;
import java.util.Objects;

public class Location {
    private int id;
    private String name;
    private Double lat;
    private Double lng;
    private List<Route> routes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public Location() {}

    public Location(int id, String name, Double lat, Double lng, List<Route> routes) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.routes = routes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id == location.id && Objects.equals(name, location.name) && Objects.equals(lat, location.lat) && Objects.equals(lng, location.lng) && Objects.equals(routes, location.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lat, lng, routes);
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", routes=" + routes +
                '}';
    }
}