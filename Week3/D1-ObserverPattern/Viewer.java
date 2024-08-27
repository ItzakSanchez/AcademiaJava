package com.edgaritzak.observerpattern;

import java.util.ArrayList;

public class Viewer implements Observer{
	
	static int counter =0;
	int id;
	String Username;
	ArrayList<String> notificationList = new ArrayList<>();

	public Viewer(String username) {
		super();
		id = counter++;
		Username = username;
	}

	@Override
	public void update(Channel c) {
		notificationList.add(c.getChannelName()+" uploaded a new video.");
	}
}
