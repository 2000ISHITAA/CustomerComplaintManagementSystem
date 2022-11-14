package com.mjk.complaint.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.mjk.complaint.entity.Conversation;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Integer> , ConversationCustomRepository 
{

	Conversation getConversationByIssueId(int issueId);
	Conversation getConversationByUserName1(String userName);
	Conversation getConversationByTitle(String title);
    Conversation getConversationByDescription(String description);
    Conversation getConversationByPostingDate(String postingDate);
	
	
	
	

	
}


