package com.org.pojoServices;

import java.util.List;

public class Question {

	private String questionId; 
	private String question;
	private List<Answer> answers;
	
	public Question() {
		super();
	}
	
	
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void displayQuestion() {
		
		System.out.println("Question Id= "+getQuestionId()+"\n"
				+"Question= "+getQuestion());
		
		for(Answer answer : answers)
		{
			System.out.println("\nAnswers were: \n"+answer.getAnswers());
		}
	}

	
	
	
	
}
