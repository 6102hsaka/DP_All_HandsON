package com.akash.observerpattern;

public class Main {

	public static void main(String[] args) {

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();

		MessagePublisher p = new MessagePublisher();

		p.attach(s1);
		p.attach(s2);

		// s1 and s2 will receive the update
		p.notifyUpdate(new Message(" This is the First Message")); 

		p.detach(s1);
		p.attach(s3);
		
		// s2 and s3 will receive the update
		p.notifyUpdate(new Message(" This is the Second Message")); 

		p.detach(s2);
		p.attach(s1);

		// s1 and s3 will receive the update
		p.notifyUpdate(new Message(" This is the Third Message"));

	}

}
