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
import java.sql.Connection as Connection
import java.sql.DriverManager as DriverManager
import java.sql.Statement as Statement
import java.sql.ResultSet as ResultSet
import java.sql.SQLException as SQLException
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Page Login CMS/input_KTarget-CMS_username'), GlobalVariable.CMS_username)

WebUI.setText(findTestObject('Page Login CMS/input_KTarget-CMS_password'), GlobalVariable.CMS_password)

WebUI.delay(5)

WebUI.click(findTestObject('Page Login CMS/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Admin  Dashboard/a_Admin'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Admin  Dashboard/a_Blacklist'))

WebUI.setText(findTestObject('Page_Admin  Blacklist/textarea_Danh sach blacklist noi bo'), GlobalVariable.retailerID1)

WebUI.scrollToElement(findTestObject('Page_Admin  Blacklist/button_Luu'), 0)

WebUI.click(findTestObject('Page_Admin  Blacklist/button_Luu'))

WebUI.verifyTextPresent('Cập nhật blacklist thành công !', false)

WebUI.verifyTextPresent('640499', false)

//kết nối Database
//So sánh với retailerID lưu trong DB
CustomKeywords.'database.ConnectDB.connectDB'('42.112.30.176', 'ktarget', '41027', 'navicat', 'ktargetNavicat')

String query = 'SELECT COUNT(*) FROM blacklists WHERE (retailer_id LIKE 640499 AND type_campaign = 1 AND type_blacklist = 1)'

ResultSet result = CustomKeywords.'database.ConnectDB.executeQuery'(query)

result.last()

int retailerID_DB = result.getInt(1)

println("$retailerID_DB")

if (retailerID_DB != 1) {
    KeywordUtil.markErrorAndStop('Giá trị retailerID và type_campaign, type_blacklist  lưu vào DB sai')
}



