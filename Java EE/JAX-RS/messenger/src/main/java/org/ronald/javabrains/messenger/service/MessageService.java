package org.ronald.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.ronald.javabrains.messenger.model.Message;

public class MessageService {
	
	
	public List<Message> getAllMessages() {
		List<Message> list = new ArrayList<Message>();
		Message m1 = new Message(1L, "Hello World", "Ronald");
		Message m2 = new Message(2L, "Hello Africa", "Ronald");
		
		list.add(m1);
		list.add(m2);
		
		return list;
	}
}