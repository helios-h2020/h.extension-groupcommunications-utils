package eu.h2020.helios_social.modules.groupcommunications_utils.util;

// Java program for the haversine formula
public class Haversine {

    public Haversine() {
    }

    // output in meters
    public static Double haversine(Double lat1, Double lon1,
                                   Double lat2, Double lon2)
    {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        // multiply *1000 to convert kilometers to meters
        return rad * c * 1000;
    }

}