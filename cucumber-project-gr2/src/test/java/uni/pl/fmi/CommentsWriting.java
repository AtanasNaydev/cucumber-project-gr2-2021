package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.CommentsWritingModel;

public class CommentsWriting {
	
	CommentsWritingModel commentsWriting= new CommentsWritingModel();
	@When("^Писане на коментар \"([^\"]*)\"$")
	public void writing(String addComment) throws Throwable {
		commentsWriting.setComment(addComment);
	}

	@When("^Кликне бутона за добавяне на коментар$")
	public void clickAddButton() throws Throwable {
		commentsWriting.clickAddComment();
	}

	@Then("^Получава съобщение \"([^\"]*)\"\\.$")
	public void ReceiveMessage(String ReceivedMessage) throws Throwable {
		assertEquals( ReceivedMessage,commentsWriting.getReceivedMessage());
	}


}
