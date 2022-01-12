package stepDefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   
		
		System.out.println("user is on login page");
	}

	@When("^user gets the title of the page$")
	public void user_gets_the_title_of_the_page() throws Throwable {
	    
		
		System.out.println("user gets the title of the page");
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {

         System.out.println("page title should be");
		
		
	}

	/*
	 * @Then("^forgot your password link should be displayed$") public void
	 * forgot_your_password_link_should_be_displayed() throws Throwable { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 * 
	 * @When("^user enters username \"([^\"]*)\"$") public void
	 * user_enters_username(String arg1) throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @When("^user enters password \"([^\"]*)\"$") public void
	 * user_enters_password(String arg1) throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @When("^user clicks on login button$") public void
	 * user_clicks_on_login_button() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @Then("^user gets the title of the home page$") public void
	 * user_gets_the_title_of_the_home_page() throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 * 
	 * @Then("^home page title should be \"([^\"]*)\"$") public void
	 * home_page_title_should_be(String arg1) throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 */

}
