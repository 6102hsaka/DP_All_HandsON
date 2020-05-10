package com.akash.observerpattern;

public class MessageSubscriberThree implements Observer {

	@Override
	public void update(Message msg) {
		System.out.println("MessageSubscriberThree :: " + msg.getMessageContent());
	}
}
