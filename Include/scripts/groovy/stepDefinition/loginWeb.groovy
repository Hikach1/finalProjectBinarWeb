package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginWeb {

	@Given("User success landing in secondhand binar website")
	public void user_success_landing_in_secondhand_binar_website() {

		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.urlSecondhand);

		WebUI.callTestCase(findTestCase('Pages/Landing Page/Verify Content Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click Masuk button on the top right side")
	public void user_click_Masuk_button_on_the_top_right_side() {

		WebUI.callTestCase(findTestCase('Pages/Landing Page/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input valid Email {string}")
	public void user_input_valid_Email(String emailLog) {

		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Email Login'), [('emailLog') : emailLog], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input valid Password {string}")
	public void user_input_valid_Password(String passwordLog) {

		WebUI.callTestCase(findTestCase('Pages/Login Page/Set Password Login'), [('passwordLog') : passwordLog], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click button Masuk")
	public void user_click_button_Masuk() {

		WebUI.callTestCase(findTestCase('Pages/Login Page/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can login after input correct credential")
	public void user_can_login_after_input_correct_credential() {
	}

	@And("User navigate to Homepage")
	public void user_navigate_to_Homepage() {

		WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Content Homepage'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@And("User stay in Loginpage")
	public void user_stay_in_Loginpage() {
	
		WebUI.callTestCase(findTestCase('Pages/Login Page/Verify Content Login Page'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@And("User close browser")
	public void user_close_browser() {
		WebUI.closeBrowser();
	}
	
}