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
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/NewTrademark_Import/Page_Login  Salesforce/input_Username_username'), 'dev.admin@symphony.com')

WebUI.setEncryptedText(findTestObject('Object Repository/NewTrademark_Import/Page_Login  Salesforce/input_Password_pw'), 
    'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_Home  Salesforce/span_Import'))

WebUI.setText(findTestObject('Object Repository/NewTrademark_Import/Page_ImportView  Salesforce/textarea_Please enter                            trademark serial number (One per line)_txtTrademarkSerialNos'), 
    '87500601')

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_ImportView  Salesforce/button_Import'))

WebUI.switchToWindowTitle('ImportView | Salesforce')

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_ImportView  Salesforce/a_here'))

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_MVIB-245  Salesforce/span_Related'))

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_MVIB-245  Salesforce/a_AKERSCOUT'))

WebUI.click(findTestObject('Object Repository/NewTrademark_Import/Page_AKERSCOUT  Salesforce/span_87500601'))

WebUI.closeBrowser()

