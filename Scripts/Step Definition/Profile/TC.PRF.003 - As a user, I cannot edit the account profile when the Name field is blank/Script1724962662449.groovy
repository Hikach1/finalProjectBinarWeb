import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Step Definition/Login/User Login - Success_'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Homepage_/Click Icon Profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Homepage_/Click Icon Profile Popup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Verify Content Profile Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Photo Profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Delete Nama'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Kota'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Input Alamat'), [('alamat') : 'Jalan Jakarta'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Input No Handphone'), [('noHp') : '08123456789'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SecondHand/Profile/Click Simpan'), [:], FailureHandling.STOP_ON_FAILURE)

