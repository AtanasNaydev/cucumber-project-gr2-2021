package uni.pl.fmi.models;

import uni.pl.fmi.services.CommentService;

public class CommentsWritingModel {


	private String message;
	private String comment;
	

	public void setComment(String comment) {
		this.comment=comment;
		
	}

	public void clickAddComment() {
		message=CommentService.addComment(comment);
		
	}

	public String getReceivedMessage() {
		
		return message;
	}

	
	

	

	

}
