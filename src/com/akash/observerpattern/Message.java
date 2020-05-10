package com.akash.observerpattern;

public class Message {
	
	final String messageContent;

	public Message(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageContent() {
		return this.messageContent;
	}
}
