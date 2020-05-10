package com.akash.mediatorpattern;

public class PremiumUser implements IUser {

	private String name;
	private IChatMediator chatMediator;

	public PremiumUser() {
		super();
	}

	public PremiumUser(String name, IChatMediator chatMediator) {
		super();
		this.name = name;
		this.chatMediator = chatMediator;
	}

	@Override
	public void sendMessage(String msg) {
		chatMediator.sendMessage(msg);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("[ Message received by " + name + " ] : " + msg);
	}

}
