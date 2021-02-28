package uni.pl.fmi.models;

import uni.pl.fmi.services.CreateTopicService;

public class CreateTopicModel {


	private String message;

	private String header;
	private String content;

	public void navigateToTopic() {
	System.out.println("Навигинаре до създаване на тема");
		
	}

	public void setTopic(String header) {
		this.header=header;
		
	}

	public void setContent(String content) {
		this.content=content;
		
	}

	public void addNewTopic() {
		message=CreateTopicService.addNewTopic(header,content);
		
	}

	public String getReceivedMessage() {
		return message;
	}

}
