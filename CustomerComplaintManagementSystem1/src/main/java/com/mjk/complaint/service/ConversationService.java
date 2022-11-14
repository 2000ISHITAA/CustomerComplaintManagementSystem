package com.mjk.complaint.service;


import java.util.List;


import org.springframework.stereotype.Service;

import com.mjk.complaint.entity.Conversation;

@Service
public interface ConversationService {
	public List<Conversation> getAllConversations()throws Exception;
	public Conversation insertConversation(Conversation user)throws Exception;
    public Conversation getConversationByIssueId(int issueId) throws Exception;
    public String deleteConversation(int issueId) throws Exception;
	public Conversation getConversationByName(String userName)throws Exception;
	public String deleteConversation(String userName) throws Exception;
	public Conversation getConversationByTitle(String title)throws Exception;
	public String deleteConversation1(String title) throws Exception;
	public Conversation getConversationByDescription(String description) throws Exception;
	public String deleteConversation2(String description)throws Exception;
	public Conversation getConversationByPostingDate(String postingDate) throws Exception;
	public String deleteConversation3(String postingDate)throws Exception;
	
	
	}