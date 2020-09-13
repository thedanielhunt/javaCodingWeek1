package javaCodingWeek1;

public class App {

	public static void main(String[] args) {

		double merlotPrice = 8.25; 		// item price
		double briePrice = 12.09; 		// item price

		double checkingAvailable = 75.00; 	// Amount of money in wallet
		double savingsAvailable = 200.00; 	// Amount of money in savings
		
		double moneyRemaining = checkingAvailable - (merlotPrice + briePrice);
		double totalMoneyRemaining = checkingAvailable + savingsAvailable;
		
		System.out.println("Total cash remaining after transactions: " + totalMoneyRemaining);
		
		int friendsQty = 841;			// Number of friends
		int boatsQty = 3;				// Number of friends with boats
		
		int myAge = 38;					// Age in years (as a whole number)
		int adultAge = myAge - 18;			// Years as an adult
		
		int averageFriendsYear = friendsQty / myAge;
		float adultFriendsYear = friendsQty / adultAge;
		System.out.println("On average, I gain " + averageFriendsYear + " friends per year.");
		System.out.println("If all those friends were gained in adulthood, it'd average to " + adultFriendsYear + " friends per year.");
		System.out.println("Friends without boats: " + (friendsQty - boatsQty));
		System.out.println("Average friends per boat: " + (friendsQty / boatsQty));
		
		String preambleTraderJoes = "If I bought wine and cheese for every one of my friends with boats, it would cost me: ";
		double totalOutlayForBoats = round((merlotPrice + briePrice) * boatsQty,2);
		System.out.println(preambleTraderJoes + "$" + totalOutlayForBoats);
		
		
		String firstName = "Daniel";	// first name
		String lastName = "Hunt";		// last name
		char middleInitial = 'F';		// middle initial
		
		String fullName = firstName + " " + middleInitial + ". " + lastName;
		System.out.println("My full name is: " + fullName);

	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}

}
