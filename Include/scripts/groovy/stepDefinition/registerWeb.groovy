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

class registerWeb {

	def randomString(int length) {

		String chars = "abcdefghijklmnopqrstuvwxyz"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	def randomInteger(int length) {

		String chars = "0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Given("User landing in secondhand binar website")
	public void user_landing_in_secondhand_binar_website() {

		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.urlSecondhand);

		WebUI.callTestCase(findTestCase('Pages/Landing Page/Verify Content Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Click Masuk button on the top right side")
	public void click_Masuk_button_on_the_top_right_side() {

		WebUI.callTestCase(findTestCase('Pages/Landing Page/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Click Daftar di sini button")
	public void click_Daftar_di_sini_button() {

		WebUI.callTestCase(findTestCase('Pages/Login Page/Click Button Daftar Di Sini'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Name field {string}")
	public void input_valid_Name_field(String usernameReg) {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Username'), [('usernameReg') : usernameReg], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Email field")
	public void input_valid_Email_field() {

		String randomStr = this.randomString(5)

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email'), [('emailReg') : "ValidEmail" + randomStr + "@gmail.com"], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input valid Password field {string}")
	public void input_valid_Password_field(String passwordReg) {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password'), [('passwordReg') : passwordReg], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Leave Name field blank")
	public void leave_name_field_blank() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Username'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Leave Email field blank")
	public void leave_Email_field_blank() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Leave Password field blank")
	public void leave_Password_field_blank() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Input invalid Email field")
	public void input_invalid_Email_field() {

		String randomStr = this.randomString(5);

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email'), [('emailReg') : "InvalidEmail" + randomStr + ""], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Input password under 6 digit {string}")

	public void input_password_under_digit(String invalidPassword) {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password'), [('passwordReg') : invalidPassword], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Click Daftar button")
	public void click_Daftar_button() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Click Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User success registration account")
	public void user_success_registration_account() {
	}

	@And("User can see homepage")
	public void user_can_see_homepage() {

		WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Content Homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User cannot registration account")
	public void user_cannot_registration_account() {
	}

	@And("User stay in login page")
	public void user_stay_in_login_page() {

		WebUI.callTestCase(findTestCase('Pages/Registration Page/Verify Content Registration Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}