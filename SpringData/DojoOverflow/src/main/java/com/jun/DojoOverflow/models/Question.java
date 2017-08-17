package com.jun.DojoOverflow.models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="questions")
public class Question {
	@Id
    @GeneratedValue
    private Long id;
	private String question;
	private Date createdAt;
    private Date updatedAt;
    @OneToMany(mappedBy="question", fetch = FetchType.LAZY)
    private List<Answer> answers;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name = "questions_tags",
    		joinColumns = @JoinColumn(name = "question_id"),
    		inverseJoinColumns = @JoinColumn(name = "tag_id")
    	)
    private List<Tag> tags;
    
    
    public Question() {
    	
    }
    
    public Question(String question) {
    		this.question = question;
    		this.createdAt = new Date();
        this.updatedAt = new Date();     
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
    
}
