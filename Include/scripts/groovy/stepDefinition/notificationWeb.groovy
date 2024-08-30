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



class notificationWeb {

	def randomInteger(int length) {

		String chars = "0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return sb.toString();
	}

	@Given("User success login")
	public void user_success_login() {

		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.urlSecondhand);

		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_TestNotif'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller success Add Product")
	public void user_as_A_seller_success_Add_Product() {

		String randomNameProd = this.randomInteger(5)

		WebUI.callTestCase(findTestCase('Pages/Add Product Page/Add Product'), [('namaproduk') : 'Produk Tes Notif ' + randomNameProd, ('hargaproduk') : '90000'
			, ('deskripsi') : 'Gas'], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller click notif button")
	public void user_as_A_seller_click_notif_button() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Notif Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User as A seller verify redmark notification appear")
	public void user_as_A_seller_verify_redmark_notification_appear() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Verify Redmark Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller verify product successfully published")
	public void user_as_A_seller_verify_product_successfully_published() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Verify Product Published'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller verify product description")
	public void user_as_A_seller_verify_product_description() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Verify Product Description'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller verify date and time product published")
	public void user_as_A_seller_verify_date_and_time_product_published() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Verify Time Date Product'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)
	}
}