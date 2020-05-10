package com.akash.mediatorpattern;

public class Client {
	
	public static void main(String[] args) {

		IChatMediator chatMediator = new ChatMediator();

		// Creating users (Receivers)
		IUser first = new BasicUser("MR. First", chatMediator);
		IUser second = new PremiumUser("MR. Second", chatMediator);

		// Adding users to ChatMediator's List
		chatMediator.addUser(first);
		chatMediator.addUser(second);

		// Creating user (Sender)
		IUser sender = new PremiumUser("MR. Sender", chatMediator);
		sender.sendMessage("Hello All....");
	}
}