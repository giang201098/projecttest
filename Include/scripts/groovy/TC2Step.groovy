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



class TC2Step {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	def custom = new newpackage.newKeyword()
	
	@Given("Cpanel chi setting noi dung thong bao")
	def Cpanel_chi_setting_noi_dung_thong_bao() {
		        WebUI.openBrowser(GlobalVariable.url)
		
				WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_email'), GlobalVariable.username)
		
				WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_password'), GlobalVariable.password)
		
				WebUI.delay(2)
		
				custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/button_ng nhp'), 0)
		
				WebUI.maximizeWindow()
		
				WebUI.delay(2)
		
				custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/a_H thng'), 0)
		
				WebUI.delay(2)
		
				custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/a_Ci t'), 0)
		
				WebUI.delay(2)
		
				custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/a_Qung co trn widget'), 0)
		
				WebUI.delay(2)
		
				WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgetcontent'), GlobalVariable.content)
				
				WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgeturl'), "")
				
				WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgeturl_text'), "")
				
		
				custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/button_Cp nht'), 0)
	}

	@When("Mo widget ban hang")
	def Mo_widget_ban_hang() {
		    	WebUI.openBrowser(GlobalVariable.url_KV)
		
				WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_UserName'), GlobalVariable.username_KV)
		
				WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_Password'), GlobalVariable.password_KV)
		
				custom.clickUsingJS(findTestObject('Page_KiotViet/button_Bn hng'), 0)
		
				WebUI.delay(2)
		
				custom.clickUsingJS(findTestObject('Page_chi nhnh - Bn hng/a_Bn thng'), 0)
		
				WebUI.delay(2)
		
				custom.clickUsingJS(findTestObject('Page_chi nhnh - Bn hng/a_Bn giao hng'), 0)
		
				WebUI.delay(2)
	}
	
	@And("Click vao icon chuong")
	def Click_vao_icon_chuong() {
		custom.clickUsingJS(findTestObject('Page_chi nhnh - Bn hng/i_Trong ngy_fas fa-bell'), 0)
		WebUI.getText(findTestObject('Page_chi nhnh - Bn hng/p_S dng ngay dch v mi ca Giao hng nhanh'))
		WebUI.delay(2)
	}

	@Then("Kiem tra noi dung thong bao")
	def Kiem_tra_noi_dung_thong_bao() {
		if (WebUI.getText(findTestObject('Page_chi nhnh - Bn hng/p_S dng ngay dch v mi ca Giao hng nhanh')) != GlobalVariable.content) {
			KeywordUtil.markErrorAndStop('Content not match')
		}
	}
}