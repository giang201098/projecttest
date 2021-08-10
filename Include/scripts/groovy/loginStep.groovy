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


class loginStep {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User nagatives to login page")
	def User_nagatives_to_login_page() {
		WebUI.openBrowser(null)
		WebUI.openBrowser(GlobalVariable.url)
	}

	@When("User enters (.*) and (.*)")
	def User_enters_username_and_password(String username, String password) {

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_email'), GlobalVariable.username)

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_password'), GlobalVariable.password)
	}

	@And("Click on login button")
	def  Click_on_login_button(){
		def custom = new newpackage.newKeyword()
		custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/button_ng nhp'), 0)
	}



	def User_is_nagatived_to_homepage() {
		println ("Nagatived to homepage test Giang")
	}
}