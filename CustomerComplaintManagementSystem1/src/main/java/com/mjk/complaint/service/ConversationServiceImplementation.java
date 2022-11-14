package com.mjk.complaint.service;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjk.complaint.entity.Conversation;
import com.mjk.complaint.repository.ConversationRepository;

@Service
public abstract class ConversationServiceImplementation implements ConversationService{
	@Autowired
	ConversationRepository conversationRepository;
	
	@Override
	@Transactional
	public Conversation insertConversation(Conversation user) throws Exception {
		Conversation savedUser =  conversationRepository.save(user);  // Note :  save() is already implemented by Spring Data JPA
		if(savedUser != null)
		{
			return savedUser;
		}
		else return null;
        }


	@Override
	public List<Conversation> getAllConversations() throws Exception {
		
		// may contains other code like security , loggging , validation 
		
		List<Conversation> allUsers =  conversationRepository.findAll(); // Note : same as save
		return allUsers;
	}
	@Override
	public Conversation getConversationByIssueId(int issueId) throws Exception {
		Conversation outputUser=conversationRepository.getConversationByIssueId(issueId);
		return outputUser;
		
	}
	
	@Override
	public String deleteConversation(int issueId) throws Exception{
		Conversation UserToBeDeleted=conversationRepository.getConversationByIssueId(issueId);
		conversationRepository.delete(UserToBeDeleted);
		return "Deleted";
	}
	@Override
	public Conversation getConversationByTitle(String title) throws Exception {
		Conversation outputUser=conversationRepository.getConversationByTitle(title);
		return outputUser;
		
	}
	
	@Override
	public String deleteConversation(String title) throws Exception{
		Conversation UserToBeDeleted=conversationRepository.getConversationByIssueId(title);
		conversationRepository.delete(UserToBeDeleted);
		return "Deleted";
	
	
}
	@Override
	public Conversation getConversationByDescription(String description) throws Exception {
		Conversation outputUser=conversationRepository.getConversationByDescription(description));
		return outputUser;
		
	}
	
	@Override
	public String deleteConversation1(String description) throws Exception{
		Conversation UserToBeDeleted=conversationRepository.getConversationByDescription(description);
		conversationRepository.delete(UserToBeDeleted);
		return "Deleted";
	
}
	@Override
	public Conversation getConversationByPostingDate(String postingDate) throws Exception {
		Conversation outputUser=conversationRepository.getConversationByPostingDate(postingDate);
		return outputUser;
		
	}
	
	@Override
	public String deleteConversation3(String postingDate) throws Exception{
		Conversation UserToBeDeleted=conversationRepository.getConversationByPostingDate(postingDate);
		conversationRepository.delete(UserToBeDeleted);
		return "Deleted";
	

}

