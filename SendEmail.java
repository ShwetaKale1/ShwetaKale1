package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendEmail {
	  @Given("Verify the Email application Page")
	   public void navigateToEmailApplication() {
		   System.out.println("User Navigates to Email Application page");
	      
	   }

	   @When("User will enter the email credentials")
	   public void enterCredentialsAndLogin() {
		   System.out.println("Enter the email credentials");
	      
	   }

	   @And("User will compose an email")
	   public void clickComposeButton() {
		   System.out.println("User composes an Email");
	      
	   }

	   @And("User enters the recipient email address")
	   public void enterRecipientEmailAddress() {
		   System.out.println("Recipient Email Address");
	     
	   }

	   @And("User enters the {Incubyte Deliverables}")
	   public void enterSubject(String subject) {
		   System.out.println("Incubyte Deliverables");
	     
	   }

	   @And("User enters the {Automation QA Test for Incubyte}")
	   public void enterBody(String body) {
		   System.out.println("Automation QA Test for Incubyte");
	     
	   }

	   @And("User clicks on send button")
	   public void clickSendButton() {
		   System.out.println();
	     
	   }

	   @Then("email should be sent successfully")
	   public void verifyEmailSent() {
		   System.out.println("Email Sent");
	      
	   }
	
	   @And("User should see a confirmation message")
	    public void verifyConfirmationMessage() {
		   System.out.println("Mail recieved");
	        
	    }
}
