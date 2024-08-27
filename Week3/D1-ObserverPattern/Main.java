package com.edgaritzak.observerpattern;

public class Main {
	public static void main(String[] args) {
		
		//Create accounts
		Viewer viewer1 = new Viewer("User1");
		Viewer viewer2 = new Viewer("User2");
		Viewer viewer3 = new Viewer("User3");
		Viewer viewer4 = new Viewer("User4");
		
		//Create channels
		Channel channel1 = new Channel("Veritasium");
		Channel channel2 = new Channel("Vsauce");
		
		//Users subscribe to channel 1
		channel1.addObserver(viewer1);
		channel1.addObserver(viewer2);
		channel1.addObserver(viewer3);
		
		//Users subscribe to channel 2
		channel2.addObserver(viewer2);
		channel2.addObserver(viewer3);
		channel2.addObserver(viewer4);
		
		//Channel1 posts a video
		channel1.postVideo();
		
		//Check viewers notifications viewer 1
		System.out.println("\nViewer 1 notification list:");
		for (String s : viewer1.notificationList) {
			System.out.println(s);
		}
		
		System.out.println("");
		//Channel2 posts a video
				channel2.postVideo();
		
		//Check viewers notifications viewer 2
		System.out.println("\nViewer 2 notification list:");
		for (String s : viewer2.notificationList) {
			System.out.println(s);
		}
	}
}
