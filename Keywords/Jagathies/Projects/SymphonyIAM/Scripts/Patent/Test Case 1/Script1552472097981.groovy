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

WebUI.setText(findTestObject('Page_Login  Salesforce/input_Username_username'), 'dev.admin@symphony.com')

WebUI.setEncryptedText(findTestObject('Page_Login  Salesforce/input_Password_pw'), 'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('Page_Login  Salesforce/input_Password_Login'))

WebUI.doubleClick(findTestObject('Page_ImportView  Salesforce/div_US6775575'))

WebUI.setText(findTestObject('Page_ImportView  Salesforce/textarea_Please enter                            patentpublication number (One per line)_textAreaId'), 
    'US6775575')

WebUI.click(findTestObject('Page_ImportView  Salesforce/button_Import'))

WebUI.switchToWindowTitle('ImportView | Salesforce')

WebUI.doubleClick(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/span_22212 (1)'))

WebUI.click(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/span_Cancel (1)'))

WebUI.click(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/span_Submitted (1)'))

WebUI.click(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/span_Related (1)'))

WebUI.click(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/span_Completed (1)'))

WebUI.click(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/html_MVIB-379  Salesforce        auraMsgMaskpositionabsolutetop0bottom0left0right0background-webkit-radial-gradient(circlergba(0002)000)z-index1000displaynoneauraMsgBoxdisplaynonewidth100margin120px auto 0background-colo'))

WebUI.click(findTestObject('Object Repository/testimport1/Page_MVIB-379  Salesforce/a_SYMP101506USORG1'))

