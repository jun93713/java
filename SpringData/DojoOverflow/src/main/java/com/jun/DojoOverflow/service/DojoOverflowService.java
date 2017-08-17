package com.jun.DojoOverflow.service;

import org.springframework.stereotype.Service;

import com.jun.DojoOverflow.models.*;
import com.jun.DojoOverflow.repositories.*;

@Service
public class DojoOverflowService {
	private QuestionRepository questionRepo;
	private AnswerRepository answerRepo;
	private TagRepository tagRepo;

	public DojoOverflowService(QuestionRepository questionRepo, AnswerRepository answerRepo, TagRepository tagRepo) {
		this.questionRepo = questionRepo;
		this.answerRepo = answerRepo;
		this.tagRepo = tagRepo;
	}
	
	public void newQuestion(Question question) {
		questionRepo.save(question);
	}
	
	public void newAnswer(Answer answer) {
		answerRepo.save(answer);
	}
	
	public void newTag(Tag tag) {
		tagRepo.save(tag);
	}
	

}
