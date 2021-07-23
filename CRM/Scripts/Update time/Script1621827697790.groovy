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
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kvcrm.kvpos.com:9062/')

WebUI.setText(findTestObject('Page_dev - Users/input_Tn ng nhp_username'), 'golive')

WebUI.setText(findTestObject('Page_dev - Users/input_Mt khu_password'), 'Golive12345')

WebUI.click(findTestObject('Page_dev - Users/button_ng nhp'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Page_dev - Home/a_Leads'))

WebUI.click(findTestObject('Page_dev - Leads/td_Trn Vn Tun'))

WebUI.click(findTestObject('Object Repository/Page_dev - Leads/td_Email_Leads_detailView_fieldValue_email'))

int RD

RD = (int)(Math.random()*500)

WebUI.setText(findTestObject('Object Repository/Page_dev - Leads/input_Email_email'),RD + '@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_dev - Leads/span_Trn Vn Tun'))

Date today = new Date()

String todaysDate = today.format('dd-MM-yyyy HH:mm')

println(todaysDate)

WebUI.click(findTestObject('Page_dev - Leads/a_Updates'))

 String time = WebUI.getText(findTestObject('Page_dev - Leads/small_24-05-2021 110154'))

 String time2 = time.substring(0, 16)
  
 println(time2)

if (time2 != todaysDate) {
    KeywordUtil.markErrorAndStop('time is not match')
}


