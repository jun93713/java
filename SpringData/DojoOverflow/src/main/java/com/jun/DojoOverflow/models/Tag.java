package com.jun.DojoOverflow.models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="tags")
public class Tag {
	@Id
    @GeneratedValue
    private Long id;
	private String subject;
	private Date createdAt;
    private Date updatedAt;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name = "questions_tags",
    		joinColumns = @JoinColumn(name = "tag_id"),
    		inverseJoinColumns = @JoinColumn(name = "question_id")
    	)
    private List<Question> questions;
    
    public Tag() {
    	
    }
    
    public Tag(String subject) {
    		this.subject = subject;
    		this.createdAt = new Date();
        this.updatedAt = new Date();   
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
