 package com.org.messenger.messengerapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.org.messenger.messengerapp.databse.DataBaseClass;
import com.org.messenger.messengerapp.pojo.Message;

public class MessageService {
	
	private Map<Integer,Message> messages = DataBaseClass.getMessages();
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
		
	}
	
	public Message getMessage(int id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message)
	{	
		messages.put(message.getId(),message);
		
		return message;
		
	}
	
	
	
	
	
	
	
}
