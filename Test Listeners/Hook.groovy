import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.core.cucumber.keyword.internal.CucumberGlueGenerator


class Hook {

//  Config Katalon Versi 9	
//	@BeforeTestCase
//	def beforeTestCases(TestCaseContext context) {
//	CucumberGlueGenerator.addDefaultPackages();
//	}

	def openBrowser() {
		
	}	
	def closeBrowser() {
		WebUI.closeBrowser();
	}
	
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		this.openBrowser()
	}
	
	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		this.closeBrowser()
	}
	
}