public class discountedFee{
    public static void main(String[] args){
      int fee = 125000;

      double discountPercent = 10;

      double discount = (double)(discountPercent/100) * (double)fee;

      int discountedfee = fee - (int)discount;

      System.out.print("The discount amount is INR " + (int)discount + " and the discounted fee is INR " + discountedfee);
}}
