package com.briup.app02.bean;

public class Survey {
	private long id;
	private String state;
	private double average;
	private String surveydate;
	private long questionnaire_id;
	private long user_id;
	private long clazz_id;
	private long course_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getSurveydate() {
		return surveydate;
	}
	public void setSurveydate(String surveydate) {
		this.surveydate = surveydate;
	}
	public long getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(long questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(long clazz_id) {
		this.clazz_id = clazz_id;
	}
	public long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}
													
	
	
}
