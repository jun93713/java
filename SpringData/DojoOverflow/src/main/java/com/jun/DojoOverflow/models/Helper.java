package com.jun.DojoOverflow.models;

public class Helper {
	private String question;
	private String tags;
	
	public Helper() {
		
	}
	
	public Helper(String question, String tags) {
		this.question = question;
		this.tags = tags;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
}
