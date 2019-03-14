package com.org.messenger.messengerapp.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.org.messenger.messengerapp.pojo.Message;

public class MessageService {

	public List<Message> getAllMessages()
	{
		Message m = new Message();
		
		List<Message> list =  new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		return list;
		
	}
}
