package com.akash.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	List<IUser> users = null;

	public ChatMediator() {
		users = new ArrayList<IUser>();
	}

	@Override
	public void addUser(IUser user) {
		users.add(user);

	}

	@Override
	public void sendMessage(String msg) {
		for (IUser user : users) {
			user.receiveMessage(msg);
		}

	}

}
