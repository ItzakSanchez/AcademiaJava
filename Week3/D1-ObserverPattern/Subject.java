package com.edgaritzak.observerpattern;

public interface Subject {
	
	 void notifyObservers();
	 void addObserver(Observer o);
	 Observer removeObserver(Observer o);

}
