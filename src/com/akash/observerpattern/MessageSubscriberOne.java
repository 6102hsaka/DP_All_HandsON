package com.akash.observerpattern;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message msg) {
		System.out.println("MessageSubscriberOne :: " + msg.getMessageContent());
	}

}
