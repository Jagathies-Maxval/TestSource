import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Login/input_Username_username'), 30)

WebUI.setText(findTestObject('NewPatent/Page_Login/input_Username_username'), 'dev.admin@symphony.com')

WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Login/input_Password_pw'), 30)

WebUI.setEncryptedText(findTestObject('NewPatent/Page_Login/input_Password_pw'), 'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('NewPatent/Page_Login/input_Password_Login'))

WebUI.waitForPageLoad(30)

not_run: WebUI.click(findTestObject('NewPatent/Page_Home/span_Patents'))

CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('NewPatent/Page_Home/span_Patents'), 30)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('NewPatent/Page_Recently Viewed Patents/div_New'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Recently Viewed Patents/input__231609a'), 30)

WebUI.setText(findTestObject('NewPatent/Page_Recently Viewed Patents/input__231609a'), 'Patent#3 Auto')

not_run: WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Recently Viewed Patents/input__591609a'), 30)

WebUI.setText(findTestObject('NewPatent/Page_Recently Viewed Patents/input__591609a'), 'Patent#6 Asset')

WebUI.click(findTestObject('NewPatent/Page_Recently Viewed Patents/span_Save'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Patent Detailed View/span_Patent4'), 30)

String text2 = WebUI.getAttribute(findTestObject('NewPatent/Page_Patent Detailed View/span_Patent4'), 'value')

not_run: println(WebUI.getAttribute(findTestObject('NewPatent/Page_Patent Detailed View/span_Patent4'), 'value'))

not_run:WebUI.verifyElementText(WebUI.getAttribute(findTestObject('NewPatent/Page_Patent Detailed View/span_Patent4'), 'value'), 'Patent#3 Auto')
not_run:WebUI.verifyElementText(findTestObject('NewPatent/Page_Patent Detailed View/span_Patent4'),'Patent#3 Auto')
WebUI.verifyTextPresent('Patent#3 Auto', false)

WebUI.delay(15)

WebUI.closeBrowser()

