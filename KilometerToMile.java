// Create a class KilometerToMile to convert from Kilometer to Miles

public class KilometerToMile{
   public static void main(String[] args){
      // Create a variable distanceInKilometer to show the distance travelled in kms
      double distanceInKilometer = 10.8;

      // Create a variable kmInMiles to show relation of kms and miles
      double kmInMiles = 1.6;
 
      // Create a variable distanceInMiles to convert  given distance into miles
      double distanceInMiles = distanceInKilometer * kmInMiles;

      // Printing the distance in miles
      System.out.print("The distance "+ distanceInKilometer + " km in miles is " + distanceInMiles);

}}
