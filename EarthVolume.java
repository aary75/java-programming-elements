// Create a class EarthVolume to get Earth's volume in kilometer and miles
public class EarthVolume {
    public static void main(String[] args) {
        // Constants
        double radiusKm = 6378;  // Radius of Earth in kilometers
        double pi = Math.PI;     // Value of pi

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert radius to miles (1 mile = 1.60934 km)
        double radiusMiles = radiusKm / 1.60934;

        // Calculate volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Output the results
        System.out.printf("The volume of Earth in cubic kilometers is %.2f km^3 and the cubic miles is %.2f miles^3%n", volumeKm3, volumeMiles3);
    }
}
