package com.akash.handson1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOrder = sc.nextLine();
		
		String productDetail = null;
		
		switch (processOrder) {
		case "order":
			IProcessOrder iProcessOrder = new ProcessOrderImpl();
			System.out.println("Please provide Phone Model Name");
			productDetail = sc.nextLine();
			iProcessOrder.processOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine();
			if (productType.equals("phone")) {
				IProcessPhoneRepair iProcessPhoneRepair = new ProcessPhoneRepairImpl();
				System.out.println("Please provide the Phone Model Name");
				productDetail = sc.nextLine();
				iProcessPhoneRepair.processPhoneRepair(productDetail);
			} else {
				IProcessAccessoryRepair iProcessAccessoryRepair = new ProcessAccessoryRepairImpl();
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine();
				iProcessAccessoryRepair.processAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
		sc.close();
	}
}
