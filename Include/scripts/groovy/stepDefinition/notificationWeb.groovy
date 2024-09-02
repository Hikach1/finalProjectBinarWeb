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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

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

	String randomNameProd = this.randomInteger(5)

	@Given("User as A seller success login")
	public void user_as_a_seller_success_login() {

		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.urlSecondhand);

		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_TestNotif'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User as A seller success login again")
	public void user_as_a_seller_success_login_again() {

		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_TestNotif'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User as A seller success Add Product")
	public void user_as_A_seller_success_Add_Product() {

		//		String randomNameProd = this.randomInteger(5)

		WebUI.callTestCase(findTestCase('Pages/Add Product Page/Add Product'), [('namaproduk') : 'Produk Tes Notif ' + randomNameProd, ('hargaproduk') : '90000'
			, ('deskripsi') : 'Gas'], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller click notif button")
	public void user_as_A_seller_click_notif_button() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Notif Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller click notif button to clear redmark")
	public void user_as_A_seller_click_notif_button_to_clear_redmark() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Notif Button'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Prod Notif Pop UP'), [:], FailureHandling.STOP_ON_FAILURE)
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
		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Prod Notif Pop UP'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(4)
	}

	@Then("User as A seller verify date and time product offer")
	public void user_as_A_seller_verify_date_and_time_product_offer() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Verify Time Date Product'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
	}

	@Given("User as A buyer success login")
	public void user_as_A_buyer_success_login() {

		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.urlSecondhand);

		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_TestNotifOffer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User as A buyer success login again")
	public void user_as_A_buyer_success_login_again() {

		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_TestNotifOffer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User as A buyer search product")
	public void user_as_A_buyer_search_product() {

		WebUI.callTestCase(findTestCase('Pages/Search Page/Search Product'), [('searchProduct') : 'Produk Tes Notif '], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A buyer select product")
	public void user_as_A_buyer_select_product() {

		WebUI.callTestCase(findTestCase('Pages/Search Page/Select Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A buyer offer product")
	public void user_as_A_buyer_offer_product() {

		WebUI.callTestCase(findTestCase('Pages/Search Page/Offer Product'), [('offerProduct') : '20000'], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A buyer logout")
	public void user_as_A_buyer_logout() {

		WebUI.callTestCase(findTestCase('Pages/Logout/Logout From Offer Product Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User as A seller logout")
	public void user_as_A_seller_logout() {

		WebUI.callTestCase(findTestCase('Pages/Logout/Logout From Offer Product Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User as A seller verify new product offer notification")
	public void user_as_A_seller_verify_new_product_offer_notification() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Verify Product Offer'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User success login")
	public void user_success_login() {

		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.urlSecondhand);

		WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_TestNotif'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User as A seller open notification bell")
	public void user_a_seller_open_notification_bell() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Notif Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click notif button")
	public void user_click_notif_button() {

		WebUI.callTestCase(findTestCase('Pages/Notifications/Click Notif Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click latest notification which has not been opened")
	public void user_click_latest_notification_which_has_not_been_opened() {

		WebUI.click(findTestObject('Notifications/elementProductDesc'))
		WebUI.delay(3)
	}

	@Then("User verify red mark in notification bell is disappear")
	public void user_verify_red_mark_in_notification_bell_is_disappear() {

		WebUI.verifyElementNotPresent(findTestObject('Notifications/redmarkNotif'), 0)
	}

	@And("User scroll down to list notification button")
	public void user_scroll_down_to_list_notification_button() {

		WebUI.scrollToElement(findTestObject('Notifications/buttonOpenListNotification'), 0)
	}

	@And("User as A seller scroll down to list notification button")
	public void user_as_a_seller_scroll_down_to_list_notification_button() {

		WebUI.scrollToElement(findTestObject('Notifications/buttonOpenListNotification'), 0)
	}

	@And("User click list notification button")
	public void user_click_list_notification_button() {

		WebUI.click(findTestObject('Notifications/buttonOpenListNotification'))
		WebUI.delay(3)
	}

	@And("User as A seller click list notification button")
	public void user_a_seller_click_list_notification_button() {

		WebUI.click(findTestObject('Notifications/buttonOpenListNotification'))
		WebUI.delay(3)
	}

	@When("User verify list notification page")
	public void user_verify_list_notification_page() {

		WebUI.verifyElementPresent(findTestObject('Notifications/containerListNotification'), 0)
	}

	@When("User click Product Offer In List Notification Page")
	public void user_click_Product_Offer_In_List_Notification_Page() {

		WebUI.click(findTestObject('Notifications/elementLattestProductOffer'))
		WebUI.delay(3)
	}

	@When("User as A seller click Product Offer In List Notification Page")
	public void user_as_a_seller_click_Product_Offer_In_List_Notification_Page() {

		WebUI.click(findTestObject('Notifications/elementLattestProductOffer'))
		WebUI.delay(3)
	}

	@And("Click accept Product Offer")
	public void click_accept_Product_Offer() {

		WebUI.scrollToElement(findTestObject('Notifications/textPenawaranProduk'), 0)
		WebUI.click(findTestObject('Notifications/buttonAcceptOffer'))

		WebUI.delay(3)
	}

	@When("Verify product offer accepted")
	public void verify_product_offer_accepted() {

		WebUI.verifyElementPresent(findTestObject('Notifications/verifyElementAcceptedOffer'), 0)
	}

	@And("Click reject Product Offer")
	public void click_reject_Product_Offer() {

		WebUI.click(findTestObject('Notifications/buttonRejectOffer'))
	}

	@Then("Verify product offer rejected")
	public void verify_product_offer_rejected() {

		WebUI.verifyElementPresent(findTestObject('Notifications/verifyOfferRejected'), 0)
		String verifyOfferReject = WebUI.getText(findTestObject('Notifications/verifyOfferRejected'))
		if(verifyOfferReject == 'Penawaran produk ditolak'){
			WebUI.comment('Valid')
		}else {
			WebUI.comment('Tidak Valid')
		}
	}

	@When("Click product which have a accepted status")
	public void click_product_which_have_a_accepted_status() {

		WebUI.scrollToElement(findTestObject('Notifications/textLattestStatusDiterima'), 0)
		WebUI.click(findTestObject('Notifications/textLattestStatusDiterima'))
	}

	@And("Click status button")
	public void click_status_button() {

		WebUI.scrollToElement(findTestObject('Notifications/textLattestStatusDiterima'), 0)
		WebUI.click(findTestObject('Notifications/buttonStatusLattest'))
	}

	@Then("Verify user navigate to whatsapp")
	public void verify_user_navigate_to_whatsapp() {

		WebUI.verifyElementPresent(findTestObject('Notifications/elementVerifyWhatsapp'), 0)
		WebUI.delay(3)
	}

	@And("Click button send")
	public void click_button_send() {
		WebUI.click(findTestObject('Notifications/buttonSendCancelProd'))
	}

	@And("Verify teks penjualan dibatalkan")
	public void verify_teks_penjualan_dibatalkan() {
		WebUI.verifyElementPresent(findTestObject('Notifications/textPenjualanDibatalkan'), 0)
		String teksPenjualanBatal = WebUI.getText(findTestObject('Notifications/textPenjualanDibatalkan'))
		if (teksPenjualanBatal=='Penjualan dibatalkan') {
			WebUI.comment('Valid')
		}else {
			WebUI.comment('Tidak Valid')
		}
	}

	@When("Click radio button cancel product transaction")
	public void click_radio_button_cancel_product_transaction() {

		WebUI.click(findTestObject('Notifications/radioButtonOfferStatusCanceled'))
	}

	@When("Click radio button Berhasil terjual")
	public void click_radio_button_Berhasil_terjual() {

		WebUI.click(findTestObject('Notifications/radioButtonBerhasilTerjual'))
	}

	@Then("Verify teks Berhasil terjual")
	public void verify_teks_Berhasil_terjual() {

		WebUI.verifyElementPresent(findTestObject('Notifications/textBerhasilTerjual'), 0)
		String teksPenjualanBerhasil = WebUI.getText(findTestObject('Notifications/textBerhasilTerjual'))
		if (teksPenjualanBerhasil=='Berhasil terjual') {
			WebUI.comment('Valid')
		}else {
			WebUI.comment('Tidak Valid')
		}
	}
}