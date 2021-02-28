package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.CreateTopicModel;

public class CreateNewTopic {
	CreateTopicModel createTopicModel= new  CreateTopicModel();
	@Given("^Потребителят отваря формата за създаване на тема$")
	public void openTopicForm() throws Throwable {
		createTopicModel.navigateToTopic();
	}

	@When("^Писане на заглавна част за тема \"([^\"]*)\"$")
	public void AddTopic(String addTopic) throws Throwable {
		createTopicModel.setTopic(addTopic);
	}

	@When("^Писане на съдържанието на темата \"([^\"]*)\"$")
	public void AddContent(String addContent) throws Throwable {
		createTopicModel.setContent(addContent);
		}

	@When("^Клика на бутона за добавяне на тема$")
	public void clickAddTopic() throws Throwable {
		createTopicModel.addNewTopic();
	}

	@Then("^Получава съобщение \"([^\"]*)\"$")
	public void ReceiveMessage(String ReceivedMessage) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals( ReceivedMessage,createTopicModel.getReceivedMessage());
	}

}
