package assignment;

import java.util.Scanner;

public class BhattaraiTakeOut {

	public static void displayMainMenu() {

		System.out.println("CHOSE	TYPE	OF	MEAL");
		System.out.println("1.Italian 2. Chinese 3. American");
		// System.out.println("2.Chinese");
		// System.out.println("3.American");
	}

	public static void displayItalianFoodMenu() {
		System.out.println(" CHOOSE	ONE :");
		System.out.println("1. Lasangna - Feeds 5 - 17.99");
		System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
		System.out.println("3. Gazpacho Soup,salad and bread sticks pack - Feeds 4 - 12.99");
	}

	public static void displayChineseFoodMenu() {
		System.out.println(" CHOOSE	ONE:");
		System.out.println("1. Chicken and Braccoli Tray(includes 7 wonton soups,7 egg rolls) - Feeds 7 - 18.99");
		System.out.println("2. Sweet and Sour Fork Tray(includes 7 hot and sour soups,7 egg rolls) - Feeds 7 - 18.99");
		System.out.println("3. Shrip Fried Rice Tray(includes 10 egg rolls)- Feeds 5 - 10.99");
	}

	public static void displayAmericanFoodMenu() {
		// System.out.println(" CHOOSE ONE:");
		System.out.println("1. Hamberger and Hot Dog Tray - includes buns and condiments - Feeds 8 - 21.99");
		System.out.println(
				"2. Grilled Chicken Sandwich and Mozzarella Sticks Tray-includes dipping sauces - Feeds 5 - 22.99");
		System.out.println("3. Barbeque Tray-includes buns and peach clobber - Feeds 10 - 26.99");
	}

	public static int determineTrays(int people, int feeds) {
		int nTrays = people / feeds;
		return nTrays;

	}

	public static double getSubtotal(double price, int trays) {

		return price * trays;
	}

	public static double getTax(double subtotal, double taxRate) {
		/*
		 * List price is $90 and tax percentage is 6.5% Divide tax percentage by 100:
		 * 6.5 / 100 = 0.065 Multiply price by decimal tax rate: 70 * 0.065 = 4.55 You
		 * will pay $4.55 in tax on a $70 item Add tax to list price to get total price:
		 * 70 + 4.55 = $74.55
		 */
		return subtotal * taxRate;
	}

	public static double getTip(double subtotal, double tipRate) {

		return subtotal * tipRate;
	}

	public static double getGrandTotal(double subtotal, double tax, double tip) {
		return subtotal + tax + tip;
	}

	public static double pricePerPerson(double grandTotal, int numberOfpeople) {
		return grandTotal / numberOfpeople;
	}

	public static int determineLeftOvers(int feeds, int trays, int numberOfpeople) {
		return (trays * feeds) - numberOfpeople;

	}

	public static void main(String[] args) {
		
		int feeds;
		double price;
		int trays;
		double subTotal;
		double getTax;
		double tipRate;
		double tip;
		double total;
		double pricePerPerson;
		double leftOver;
		int people;
		double taxRate;
		double tax;
 
		Scanner input = new Scanner(System.in);
		
		
		BhattaraiTakeOut obj = new BhattaraiTakeOut();
		System.out.println("PLEASE MENTION THE NUMBER OF PEOPLE : ");
		people = input.nextInt();
		if (people <10) {
			System.out.println("Extremly sorry!! we cant take your oder at this time .Thank You");
		} else {
			displayMainMenu();
		}	
		System.out.println("Enter the meal type :");
		String choice = input.next();

		if (choice == "Italian" || choice == "1" || choice == "Chinese" || choice == "2" || choice == "American"
				|| choice == "3") {
		}

		switch (choice) {

		case "Italian":
			displayItalianFoodMenu();
			System.out.println("Enter the meal type :");
		case "1":
			tipRate = 0.15;
			taxRate=0.07;
			feeds = 5;
			price = 17.99;
			
			trays = obj.determineTrays(people, feeds);
			System.out.println("feed:" + feeds);
			System.out.println("trays:" + trays);
			subTotal = obj.getSubtotal(price, trays);
			System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
			tax = obj.getTax(subTotal, taxRate);
			System.out.println("Tax:" + tax);
			tip = obj.getTip(subTotal, tipRate);
			System.out.println("Tip:" + tip);
			total = obj.getGrandTotal(subTotal, tax, tip);
			System.out.println("Total:" + total);
			pricePerPerson = obj.pricePerPerson(total, people);
			System.out.println("price per person:" + pricePerPerson);
			leftOver = obj.determineLeftOvers(feeds, trays, people);
			System.out.println("Leftover serving for the delivery:" + leftOver);
			break;

		case "2":
			taxRate=0.07;
			tipRate = 0.15;
			feeds = 7;
			price = 15.99;
			trays = obj.determineTrays(people, feeds);
			System.out.println("feed" + feeds);
			System.out.println("trays=" + trays);
			subTotal = obj.getSubtotal(price, trays);
			System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
		    tax  = obj.getTax(subTotal, taxRate);
			System.out.println("Tax:" + tax);
			tip = obj.getTip(subTotal, tipRate);
			System.out.println("Tip:" + tip);
			total = obj.getGrandTotal(subTotal, tax, tip);
			System.out.println("Total:" + total);
			pricePerPerson = obj.pricePerPerson(total, people);
			System.out.println("price per person:" + pricePerPerson);
			leftOver = obj.determineLeftOvers(feeds, trays, people);
			System.out.println("Leftover serving for the delivery:" + leftOver);
			break;

		case "3":
			taxRate=0.07;
			tipRate = 0.15;
			feeds = 4;
			price = 12.99;
			trays = obj.determineTrays(people, feeds);
			System.out.println("feed" + feeds);
			System.out.println("trays=" + trays);
			subTotal = obj.getSubtotal(price, trays);
			System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
			tax = obj.getTax(subTotal, taxRate);
			System.out.println("Tax:" + tax);
			tip = obj.getTip(subTotal, tipRate);
			System.out.println("Tip:" + tip);
			total = obj.getGrandTotal(subTotal, tax, tip);
			System.out.println("Total:" + total);
			pricePerPerson = obj.pricePerPerson(total, people);
			System.out.println("price per person:" + pricePerPerson);
			leftOver = obj.determineLeftOvers(feeds, trays, people);
			System.out.println("Leftover serving for the delivery:" + leftOver);
			break;

		case "Chinese":
			obj.displayChineseFoodMenu();
			System.out.println("Enter the meal type :");
			String choice2 = input.next();
			if (choice2 == "1" || choice2 == "2" || choice2 == "3") {
			}
			switch (choice2) {
			case "1":
				 taxRate=0.07;
				 tipRate = 0.15;
				 feeds = 7;
				 price = 18.99;
				 trays = obj.determineTrays(people, feeds);
				System.out.println("feed:"  + feeds);
				System.out.println("trays=" + trays);
			    subTotal = obj.getSubtotal(price, trays);
				System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
				 tax = obj.getTax(subTotal, taxRate);
				System.out.println("Tax:" + tax);
			     tip = obj.getTip(subTotal, tipRate);
				System.out.println("Tip:" + tip);
				 total = obj.getGrandTotal(subTotal, tax, tip);
				System.out.println("Total:" + total);
				pricePerPerson = obj.pricePerPerson(total, people);
				System.out.println("price per person:" + pricePerPerson);
				leftOver = obj.determineLeftOvers(feeds, trays, people);
				System.out.println("Leftover serving for the delivery:" + leftOver);
				break;
			case "2":
				taxRate=0.07;
				tipRate = 0.15;
				feeds = 7;
				price = 18.99;
				trays = obj.determineTrays(people, feeds);
				System.out.println("feed:" + feeds);
				System.out.println("trays=" + trays);
				subTotal = obj.getSubtotal(price, trays);
				System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
				tax = obj.getTax(subTotal, taxRate);
				System.out.println("Tax:" + tax);
				tip = obj.getTip(subTotal, tipRate);
				System.out.println("Tip:" + tip);
				total = obj.getGrandTotal(subTotal, tax, tip);
				System.out.println("Total:" + total);
				pricePerPerson = obj.pricePerPerson(total, people);
				System.out.println("price per person:" + pricePerPerson);
				leftOver = obj.determineLeftOvers(feeds, trays, people);
				System.out.println("Leftover serving for the delivery:" + leftOver);
			case "3":
				taxRate=0.07;
				tipRate = 0.15;
				feeds = 4;
				price = 12.99;
				trays = obj.determineTrays(people, feeds);
				System.out.println("feed:" + feeds);
				System.out.println("trays=" + trays);
				subTotal = obj.getSubtotal(price, trays);
				System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
				tax = obj.getTax(subTotal, taxRate);
				System.out.println("Tax:" + tax);
				tip = obj.getTip(subTotal, tipRate);
				System.out.println("Tip:" + tip);
				total = obj.getGrandTotal(subTotal, tax, tip);
				System.out.println("Total:" + total);
				pricePerPerson = obj.pricePerPerson(total, people);
				System.out.println("price per person:" + pricePerPerson);
				leftOver = obj.determineLeftOvers(feeds, trays, people);
				System.out.println("Leftover serving for the delivery:" + leftOver);}

				break;
			case "American":
				obj.displayAmericanFoodMenu();
				System.out.println("Enter the meal type :");
				String choice3 = input.next();
				if (choice3 == "1" || choice3 == "2" || choice3 == "3") {
				}
				switch (choice3) {

				case "1":
					taxRate=0.07;
					tipRate = 0.15;
					feeds = 8;
					price = 21.99;
					trays = obj.determineTrays(people, feeds);
					System.out.println("feed:" + feeds);
					System.out.println("trays=" + trays);
					subTotal = obj.getSubtotal(price, trays);
					System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
					tax = obj.getTax(subTotal, taxRate);
					System.out.println("Tax:" + tax);
					tip = obj.getTip(subTotal, tipRate);
					System.out.println("Tip:" + tip);
					total = obj.getGrandTotal(subTotal, tax, tip);
					System.out.println("Total:" + total);
					pricePerPerson = obj.pricePerPerson(total, people);
					System.out.println("price per person:" + pricePerPerson);
					leftOver = obj.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover serving for the delivery:" + leftOver);

				case "2":
					taxRate=0.07;
					tipRate = 0.15;
					feeds = 5;
					price = 22.99;
					trays = obj.determineTrays(people, feeds);
					System.out.println("feed:" + feeds);
					System.out.println("trays=" + trays);
					subTotal = obj.getSubtotal(price, trays);
					System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
					tax= obj.getTax(subTotal, taxRate);
					System.out.println("Tax:" + tax);
					tip = obj.getTip(subTotal, tipRate);
					System.out.println("Tip:" + tip);
					total = obj.getGrandTotal(subTotal, tax, tip);
					System.out.println("Total:" + total);
					pricePerPerson = obj.pricePerPerson(total, people);
					System.out.println("price per person:" + pricePerPerson);
					leftOver = obj.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover serving for the delivery:" + leftOver);
				case "3":
					taxRate=0.07;
					tipRate = 0.15;
					feeds = 5;
					price = 10.99;
					trays = obj.determineTrays(people, feeds);
					System.out.println("feed:" + feeds);
					System.out.println("trays=" + trays);
					subTotal = obj.getSubtotal(price, trays);
					System.out.println("price for" + people + "people" + "(" + trays + "trays" + ")" + ":" + subTotal);
					tax = obj.getTax(subTotal, taxRate);
					System.out.println("Tax:" + tax);
					tip = obj.getTip(subTotal, tipRate);
					System.out.println("Tip:" + tip);
					total = obj.getGrandTotal(subTotal, tax, tip);
					System.out.println("Total:" + total);
					pricePerPerson = obj.pricePerPerson(total, people);
					System.out.println("price per person:" + pricePerPerson);
					leftOver = obj.determineLeftOvers(feeds, trays, people);
					System.out.println("Leftover serving for the delivery:" + leftOver);

				}
			}
		}
	}

