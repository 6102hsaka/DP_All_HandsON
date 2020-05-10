package com.akash.mediatorpattern;

public interface IChatMediator {
	
	public void addUser(IUser user);
	public void sendMessage(String msg);
	
}
