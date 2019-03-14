package com.org.messenger.messengerapp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.messenger.messengerapp.pojo.Message;
import com.org.messenger.messengerapp.services.MessageService;

@Path("/message")
public class MessageResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		String 
		return (List<Message>) new MessageService().getAllMessages();
	}

}
