package eu.h2020.helios_social.modules.groupcommunications_utils.util;

public class Location {
    private double lat;
    private double lon;
    private double radius;

    public Location(double lat, double lon, double radius) {
        this.lat = lat;
        this.lon = lon;
        this.radius = radius;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
