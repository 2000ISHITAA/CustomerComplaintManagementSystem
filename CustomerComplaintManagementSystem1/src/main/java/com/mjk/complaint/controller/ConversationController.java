package com.mjk.complaint.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjk.complaint.entity.Conversation;
import com.mjk.complaint.service.ConversationService;


@RestController
@RequestMapping("/Conversation")
public class ConversationController {
      
	@Autowired
	ConversationService conversationService;
	public ConversationController() {
		System.out.println("\n\n\n====>> Inside Constructor "+this);
	}

	@PostMapping("/addconversation")
	public ResponseEntity<String> addConversation(@RequestBody Conversation conversation) 
	{
		/*
		 * // request body annotation  , help u 
		 * to take user information as JSON , so it convert JSON object to AppIser Object
		 * */
		try {
			Conversation savedUser =  conversationService.addConversation(conversation);
			String responseMsg = savedUser.getTitle()+" save ";
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg =  "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/userName/{userName}")
	public Conversation abc1(@PathVariable String userName)throws Exception
	{
		return conversationService.getConversationByUserName(userName); {
		}
	}
	@GetMapping("/title/{title}")
	public List <Conversation> abc2(@PathVariable String title)throws Exception
	{
	
		return  conversationService.getConversationByTitle(String title);
	}
	@GetMapping("/description/{description}")
	public Conversation abc3(@PathVariable String description)throws Exception
	{
		
		return conversationService.getConversationByDescription(description);
	}
	public Conversation abc5<Conversation> getAllConversations()
	{
		// write some code to extract users
		try {
			List<Conversation>  allExtractedConversations = conversationService.getAllConversations();
			
			return allExtractedConversations;
			
		} catch (Exception e) {
			// code missing for expection handling 
			System.out.println(e);
			
		}
		
		return null;
	}
	@GetMapping("\"/conversation/{searchUsername}\"")
	public ResponseEntity<String> delete(@PathVariable String searchUsername){
		try {
			
			conversationService.deleteConversation(searchUsername);
			String responseMsg="Conversation is deleted";
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		}catch(Exception e) {
			String errorMsg =  "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}


