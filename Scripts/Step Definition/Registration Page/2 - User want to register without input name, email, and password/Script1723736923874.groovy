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

WebUI.callTestCase(findTestCase('Pages/Landing Page/Verify Content Landing Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Landing Page/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login Page/Verify Content Login Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login Page/Click Button Daftar Di Sini'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Registration Page/Verify Content Registration Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Username'), [('usernameReg') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Email'), [('emailReg') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Registration Page/Set Password'), [('passwordReg') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Registration Page/Click Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Registration Page/Verify Content Registration Page'), [:], FailureHandling.STOP_ON_FAILURE)

