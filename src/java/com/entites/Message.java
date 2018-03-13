package com.entities;

public class Message {
	private int idMessage;
	private String textMessage;
	public Message(int idMessage, String textMessage) {
		super();
		this.idMessage = idMessage;
		this.textMessage = textMessage;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}
	public String getTextMessage() {
		return textMessage;
	}
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
}
