package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.RegisterPageModel;

public class RegisterSteps {
	private RegisterPageModel registerScreen= new RegisterPageModel();
	
	@Given("^Потребителя отваря екрана за регистрация$")
	public void openRegisterScreen() throws Throwable {
		registerScreen.navigateToMe();
	}

	@When("^Въведете потребителско име\"([^\"]*)\"$")
	public void addUsername(String username) throws Throwable {
		registerScreen.setUsername(username);
	}

	@When("^Въведете парола\"([^\"]*)\"$")
	public void addPassword(String password) throws Throwable {
		registerScreen.setPassword(password);
	}

	@When("^Въведете втора парола\"([^\"]*)\"$")
	public void addPassword2(String password2) throws Throwable {
		registerScreen.setPassword2(password2);
	}

	@When("^Въведете електронна поща \"([^\"]*)\"$")
	public void addEmail(String email) throws Throwable {
		registerScreen.setEmail(email);
	}

	@When("^Натисне върху бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
		registerScreen.clickRegisterButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkRegisterMessage(String expectedMessage) throws Throwable {
	   assertEquals(expectedMessage,registerScreen.getRegisterMessage());
	}


}
