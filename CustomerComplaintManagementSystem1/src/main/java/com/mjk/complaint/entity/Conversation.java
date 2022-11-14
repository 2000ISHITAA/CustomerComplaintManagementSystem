package com.mjk.complaint.entity;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Conversation")
public class Conversation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int conversationId;
    private int issueId;
	private String title;
    private String description;
    private String userName;
    private String postingDate;
	public Conversation(String title,String description, String userName, String postingDate) {
		super();
		this.title = title;
		this.description = description;
		this.userName = userName;
		this.postingDate = postingDate;
	}
    
    
}

