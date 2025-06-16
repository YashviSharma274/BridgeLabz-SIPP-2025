package AssignmentLevel1;

public class Soln4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int costprice=129;
int sellingprice=191;
int profit=sellingprice-costprice;
int profitpercentage=profit/costprice*100;
int loss=costprice-sellingprice;
int losspercentage=loss/costprice*100;
System.out.println("The Cost Price is INR"+costprice+" and Selling Price is INR"+sellingprice);
System.out.println("TheProfit is INR"+profit+" and the profit percentage INR"+profitpercentage+"loss in INR"+loss+" and loss percentage"+losspercentage);
}

}
