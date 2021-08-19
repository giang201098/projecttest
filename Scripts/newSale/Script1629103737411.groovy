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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser(GlobalVariable.url_KV)

WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_UserName'), GlobalVariable.username_KV)

WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_Password'), GlobalVariable.password_KV)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_KiotViet/button_Bn hng'), 0)

WebUI.delay(3)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_chi nhnh - Bn hng/a_Bn thng'), 0)

WebUI.delay(2)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_chi nhnh - Bn hng/a_Bn giao hng'), 0)

WebUI.delay(2)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_chi nhnh - Bn hng/i_Trong ngy_fas fa-bell'), 0)

WebUI.getText(findTestObject('Page_chi nhnh - Bn hng/p_S dng ngay dch v mi ca Giao hng nhanh'))

if (WebUI.getText(findTestObject('Page_chi nhnh - Bn hng/p_S dng ngay dch v mi ca Giao hng nhanh')) != GlobalVariable.content) {
    KeywordUtil.markErrorAndStop('Content not match')
}

WebUI.delay(2)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_chi nhnh - Bn hng/a_Xem dch v'), 0)

WebUI.switchToWindowIndex(1)

WebUI.getUrl()

if (WebUI.getUrl() != GlobalVariable.url_quangcao) {
    KeywordUtil.markErrorAndStop('Link not match')
}

WebUI.click(findTestObject('Page_chi nhnh - Bn hng/a_Xem dch v'))

WebUI.setText(findTestObject('Page_chi nhnh - Bn hng/a_Bn giao hng'), GlobalVariable.content)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Page_chi nhnh - Bn hng/i_Trong ngy_fas fa-bell'), 0)

