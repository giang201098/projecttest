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

WebUI.openBrowser(GlobalVariable.url)

WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_email'), GlobalVariable.username)

WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_KiotViet_password'), GlobalVariable.password)

WebUI.delay(4)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_Kiotviet Giao Van/button_ng nhp'), 0)

WebUI.maximizeWindow()

WebUI.delay(3)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_Kiotviet Giao Van/a_H thng'), 0)

WebUI.delay(3)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_Kiotviet Giao Van/a_Ci t'), 0)

WebUI.delay(3)

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_Kiotviet Giao Van/a_Qung co trn widget'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgetcontent'), 'adv')

WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgeturl'), 'https://kiotviet.vn')

WebUI.setText(findTestObject('Page_Kiotviet Giao Van/input_Qung co trn menu widget_promotionWidgeturl_text'), 'adc')

CustomKeywords.'newpackage.newKeyword.clickUsingJS'(findTestObject('Page_Kiotviet Giao Van/button_Cp nht'), 0)

WebUI.navigateToUrl('https://binhdt20.kvpos.com:59913/#/DashBoard')

WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_UserName'), 'admin')

WebUI.setText(findTestObject('Page_KiotViet/input_ng nhp_Password'), '123456')

WebUI.click(findTestObject('Page_KiotViet/input_Qun mt khu_loginNewSaleOld'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_chi nhnh A - Bn hng/span_Giao hng'))

WebUI.click(findTestObject('Page_Kiotviet Giao Van/button_ng nhp'))

WebUI.click(findTestObject(null))

