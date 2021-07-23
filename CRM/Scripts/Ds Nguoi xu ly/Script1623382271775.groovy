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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kvcrm.kvpos.com:9062/')

WebUI.setText(findTestObject('Page_dev - Users/input_Tn ng nhp_username'), 'golive')

WebUI.setText(findTestObject('Page_dev - Users/input_Mt khu_password'), 'Golive12345')

WebUI.click(findTestObject('Page_dev - Users/button_ng nhp'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_dev - Home/a_Contacts'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_dev - Contacts/a_Nguyn Thu Tho'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_dev - Contacts/td_H Th Bo Linh - TSHN1 Anguoi_xu_ly'))

WebUI.delay(10)

id_test = WebUI.getAttribute(findTestObject('select_assigned_user'), 'id')

int Entries = WebUI.getNumberOfTotalOption(findTestObject('select_assigned_user'))

for (def Entry : (1..10)) {
    WebUI.getAttribute(findTestObject('option', [('id2') : id_test, ('count') : Entry]), 'data-picklistvalue', FailureHandling.STOP_ON_FAILURE)
}

