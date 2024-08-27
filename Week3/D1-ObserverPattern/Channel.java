package com.edgaritzak.observerpattern;
import java.util.ArrayList;

public class Channel implements Subject{
	
	static int counter =0;
	int id;
	String channelName;
	ArrayList<Observer> viewerList = new ArrayList<>();
	
	
	public Channel(String channelName) {
		super();
		id = counter++;
		this.channelName = channelName;
	}

	public void postVideo() {
		System.out.println("Video posted successfully!");
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o:viewerList) {
			o.update(this);
		}
	}

	@Override
	public void addObserver(Observer o) {
		viewerList.add(o);
	}

	@Override
	public Observer removeObserver(Observer o) {
		viewerList.remove(o);
		return o;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}
