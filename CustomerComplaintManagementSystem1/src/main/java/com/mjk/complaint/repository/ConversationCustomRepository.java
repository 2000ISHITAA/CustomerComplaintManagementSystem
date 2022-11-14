package com.mjk.complaint.repository;
import com.mjk.complaint.entity.Conversation;

public interface ConversationCustomRepository {
	public Conversation getConversationByName(String userName)throws Exception;
	public Conversation getConversationBytitle(String title) throws Exception;
}

