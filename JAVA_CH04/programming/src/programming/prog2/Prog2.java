package programming.prog2;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		int price, pay, vat, change;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter price: ");
		price = in.nextInt();
		
		System.out.print("Enter pay: ");
		pay = in.nextInt();
		vat = (int)(price * 0.1);
		change = pay - (price + vat);
		
		System.out.println("Price :" + price);
		System.out.println("Payment :" + pay);
		System.out.println("Vat :" + vat);
		System.out.println("Change :" + change);
		
		in.close();
	}

}
