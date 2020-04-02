package week02HomeworkBooleanConditionalsLoops;

public class Week02HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  2. In Eclipse, create the following Boolean variables and choose what values they hold:
		 *	a. isHotOutside
		 *	b. isWeekday
		 *	c. hasMoneyInPocket
		 */ 
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		/*3. Create the following variables (not boolean type, choose the best data type for the variable):
		 *a. costOfMilk
		 *b. moneyInWallet
		 *c. thirstLevel (how thirsty you are on a scale of 1-10)
		*/
		
		double costOfMilk = 2.69;
		double moneyInWallet = 5.54;
		int thirstLevel = 8;
		
		/*4. Using the variables you created above and Boolean operators, create variables for the following scenarios:
		* a. shouldByIcecream � this should be true if it is hot outside and there is money in your pocket
        * b. willGoSwimming � this should be true if it is hot outside and it is not a weekday
		* c. isAGoodDay � this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
		* d. willBuyMilk � this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.
		*/
		
		boolean shouldByIceCream = (isHotOutside == true && hasMoneyInPocket == true); 
		boolean willGoSwimming = (isHotOutside == true && isWeekday == false);
		boolean isAGoodDay = (isHotOutside == true && hasMoneyInPocket == true && isWeekday == false);
		boolean willBuyMilk = (isHotOutside == true && thirstLevel <= 3 && moneyInWallet <= 2 * costOfMilk);
		
		// Variables in action If/Else Statements
		
		if (shouldByIceCream == true) {
			System.out.println("It is hot today, I will buy some ice cream!");
			                          }	
		else {
			System.out.println("It is hot, but I don't have enough money!");
			 }
		}		
		
}
