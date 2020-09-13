package javaCodingWeek1;

public class App {

	public static void main(String[] args) {

		double itemPrice = 34.56; 		// item price
		double moneyAvailable = 75.00; 	// Amount of money in wallet
		
		double moneyRemaining = moneyAvailable - itemPrice;
		System.out.println("Balance remaining after transaction: " + moneyRemaining);
		
		
		int friendsQty = 841;			// Number of friends
		int myAge = 38;					// Age in years (as a whole number)
		
		int averageFriendsYear = friendsQty / myAge;
		System.out.println("On average, I gain " + averageFriendsYear + " friends per year.");
		
		
		String firstName = "Daniel";	// first name
		String lastName = "Hunt";		// last name
		char middleInitial = 'F';		// middle initial
		
		String fullName = firstName + " " + middleInitial + ". " + lastName;
		System.out.println("My full name is: " + fullName);
		
		
		
	}

}
