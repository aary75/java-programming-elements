// Create a DistributionOfPens class to calculate how many pens a student get and how many remained

public class DistributionOfPens{
     public static void main(String[] args){
         // Create a variable numberOfPens to show the number of pens we have
         int numberOfPens = 14;

         // Create a variable numberOfChildren to show the number of children
         int numberOfChildren = 3;
 
         // Create a variable distributedPens to show how many pens a student gain
         int distributedPens = (numberOfPens / numberOfChildren);

         // Create a variable remainingPens to show the remaining pens
         int remainingPens = (numberOfPens % numberOfChildren);
 
         // Printing the distributed pens and remaining pens
         System.out.print("The Pen Per Student is " + distributedPens + " and the remaining pen not distriuted is " + remainingPens);

}}
