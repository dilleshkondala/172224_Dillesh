package com.org.messenger.messengerapp.databse;

import java.util.HashMap;
import java.util.Map;

import com.org.messenger.messengerapp.pojo.Message;
import com.org.messenger.messengerapp.pojo.Profile;

public class DataBaseClass {
	
	private static Map<Integer, Message> messages = new HashMap<>();
	private static Map<Integer, Profile> profiles = new HashMap<>();

	public static Map<Integer, Message> getMessages()
	{
		return messages;
	}
	
	public static Map<Integer, Profile> getProfiles()
	{
		return profiles;
	}

}
