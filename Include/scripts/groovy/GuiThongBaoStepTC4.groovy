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



class GuiThongBaoStepTC4 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Cpanel khong setting quang cao")
	def Cpanel_khong_setting_quang_cao() {
		WebUI.openBrowser(GlobalVariable.url)

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_email'), GlobalVariable.username)

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_password'), GlobalVariable.password)

		WebUI.delay(4)

		def custom = new newpackage.newKeyword()

		custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/button_ng nhp'), 0)

		WebUI.maximizeWindow()

		WebUI.delay(3)

		custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/a_H thng'), 0)

		WebUI.delay(3)

		custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/a_Ci t'), 0)

		WebUI.delay(4)

		custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/a_Qung co trn widget'), 0)

		WebUI.delay(3)

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgetcontent'), '')

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgeturl'), '')

		WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgeturl_text'), '')

		custom.clickUsingJS(findTestObject('Page_Kiotviet Giao Van/button_Cp nht'), 0)
	}

	@When("Mo widget Giao hang")
	def Mo_widget_Giao_hang() {
		WebUI.navigateToUrl(GlobalVariable.url_KV)

		WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_UserName'), GlobalVariable.username_KV)

		WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_Password'), GlobalVariable.password_KV)

		WebUI.click(findTestObject('Page_KiotViet/input_Qun mt khu_loginNewSaleOld'))

		WebUI.delay(4)

		WebUI.click(findTestObject('Page_chi nhnh A - Bn hng/span_Giao hng'))
	}


	@Then("Khong hien thi icon chuong")
	def Khong_hien_thi_icon_chuong() {
		println ("ssss")
	}
}