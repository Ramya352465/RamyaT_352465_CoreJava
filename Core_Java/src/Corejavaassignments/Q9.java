package Corejavaassignments;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
        double lat1 = 25;
        double lon1 = 35;
        double lat2 = 35.5;
        double lon2 = 25.5;
        System.out.print("Input the latitude of coordinate 1:"+lat1);
        System.out.print("\nInput the longitude of coordinate 1:"+lon1);
        System.out.print("\nInput the latitude of coordinate 2:"+lat2);
        System.out.print("\nInput the longitude of coordinate 2:"+lon2);
        System.out.print("\nThe distance between those points is:" + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
    }
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }
}
