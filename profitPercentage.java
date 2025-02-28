// Create a class profitPercentage to calculate profit and profit percentage from given cost and selling price

public class profitPercentage{
    public static void main(String[] args){
       // Create a variable costPrice to show the cost price
       double costPrice = 129;

       // Create a variable sellingPrice to show the selling price
       double sellingPrice = 191;

       // create a variable progit to calculate the profit we gain
       double profit = sellingPrice - costPrice;

       // Create a variable profitPercentage to calculate the percentage of profit we gain
       double profitPercentage = (profit/costPrice) * 100;
 
       // Printing the cost price, selling price , profit and profit percentage
       System.out.println("Cost Price is INR " + costPrice + " and Selling Price is " + sellingPrice);
       System.out.print("The Profit is INR " + profit + " and the profit percentage is " + profitPercentage);

}}

