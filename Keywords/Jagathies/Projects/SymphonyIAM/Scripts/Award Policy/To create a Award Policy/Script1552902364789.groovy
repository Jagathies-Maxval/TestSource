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

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Login  Salesforce/input_Username_username'), 'dev.admin@symphony.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Award Policy/Page_Login  Salesforce/input_Password_pw'), 'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Home  Salesforce/div_View profile_slds-r4'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Home  Salesforce/div_App LauncherSearch apps or itemsClear searchVisit AppExchangeClose this window'))

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Home  Salesforce/input_Search apps or items_18922a'), 
    'award')

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Home  Salesforce/span_Award Policies'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/div_New'))

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/input__71789a'), 
    'Award Test policy #1')

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/textarea_Description_501789a'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/div_United States of America'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_Invention Disclosure'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/div_Tech1'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_Draft'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_Irrespective of the no of inventors'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_--None--'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_This rule doesnt require approval'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_For each Inventor'))

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/a_For each Inventor'))

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/input_Award Amount_12851789a'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/input_Award Points_13531789a'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/input_Additional Awards (If Any)_13751789a'), 
    'Extra perks')

WebUI.click(findTestObject('Object Repository/Award Policy/Page_Recently Viewed  Award Policies  Salesforce/span_Save'))

WebUI.closeBrowser()

