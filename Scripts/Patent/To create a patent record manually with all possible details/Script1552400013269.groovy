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

WebUI.setText(findTestObject('null'), 'dev.admin@symphony.com')

WebUI.setEncryptedText(findTestObject('null'), 'PJsvI95x3icXKMjomuuB48CCEdKbBaao')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'dev.admin@symphony.com')

WebUI.setEncryptedText(findTestObject('null'), 'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/div_New'))

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input__231510a'), 'US Patent #2')

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input__591510a'), 'Asset#2')

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input_Application No_71510a'), 
    'US7788994')

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input_Publication No_791510a'), 
    'US123456789')

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/span_12'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/span_13'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/span_14'))

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input_Issue Date of Patent_1811510a'), 
    '3/14/2019')

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input_Patent No_1221510a'), 
    'US7418529')

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input_Priority No_2081510a'), 
    'US12345678')

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/input_Attorney Docket Number_2241510a'), 
    '741852')

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/a_Drafting'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/a_Drafting'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/div_US'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/div_Dev Admin'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/div_Dev Admin'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/div_Tech1'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/div_Inventor'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/a_Patent'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/a_Patent_1'))

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/textarea_Inventors_7711510a'), 
    'Inventor1')

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/a_Primary'))

WebUI.setText(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/textarea_Priority Dates_14181510a'), 
    '2000-01-01')

WebUI.click(findTestObject('Object Repository/NewPatent/Page_Recently Viewed  Patents  Salesforce/span_Save'))

WebUI.click(findTestObject('NewPatent/Page_Success message/div_successPatent Asset2 was createdClose'))

WebUI.click(findTestObject('NewPatent/Page_Success message/div_successPatent Asset2 was createdClose'))

WebUI.closeBrowser()

