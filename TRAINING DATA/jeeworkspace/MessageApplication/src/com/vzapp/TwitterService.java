package com.vzapp;

public class TwitterService implements MessageService{

	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Message : "+msg +"  : sent to receiver :"+ receiverName+ " by Twitter");
		
	}
	
}