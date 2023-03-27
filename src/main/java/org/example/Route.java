package org.example;

import java.math.BigDecimal;
import java.util.Objects;

public class Route {
    private int toId;
    private Double distance;
    private BigDecimal cost;

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Route() {}

    public Route(int toId, Double distance, BigDecimal cost) {
        this.toId = toId;
        this.distance = distance;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return toId == route.toId && Objects.equals(distance, route.distance) && Objects.equals(cost, route.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toId, distance, cost);
    }

    @Override
    public String toString() {
        return "Route{" +
                "toId=" + toId +
                ", distance=" + distance +
                ", cost=" + cost +
                '}';
    }
}