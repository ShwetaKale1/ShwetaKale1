Feature: Send an Email
  
Scenario: Compose an Email using subject and Body
    Given Verify the Email application Page
    When User will enter the email credentials
    And User will compose an email
    And User enters the "<Recipient>" email address
    And User enters the "<Subject>"
    And User enters the "<Body>"
    And User clicks on send button
    Then email should be sent successfully 
    And User should see confirmation messages
    
    
    Examples:
    |Recipient    |Subject              |                Body           |
    |abc@gmail.com|Incubyte Deliverables|Automation QA Test for Incubyte|