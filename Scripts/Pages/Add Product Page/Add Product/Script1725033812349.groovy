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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.entity.testsuite.RunConfigurationDescription as RunConfigurationDescription

WebUI.click(findTestObject('Add Product Page/buttonJual'))

WebUI.setText(findTestObject('Add Product Page/nameField'), namaproduk)

WebUI.setText(findTestObject('Add Product Page/hargaField'), hargaproduk)

WebUI.click(findTestObject('Add Product Page/categoryField'))

WebUI.click(findTestObject('Add Product Page/selectCategories'))

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('Add Product Page/deskripsiField'), deskripsi)

WebUI.uploadFile(findTestObject('Add Product Page/buttonUploadGambar'), RunConfiguration.getProjectDir() + '/Resources/TestUpload.jpg')

WebUI.click(findTestObject('Add Product Page/buttonTerbitkan'))

