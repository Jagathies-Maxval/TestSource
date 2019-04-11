import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('Page_Login/input_Username_username'), 30)

WebUI.setText(findTestObject('Page_Login/input_Username_username'), 'dev.admin@symphony.com')

WebUI.waitForElementVisible(findTestObject('Page_Login/input_Password_pw'), 30)

WebUI.setText(findTestObject('Page_Login/input_Password_pw'), 'MaxSymp@2018')

WebUI.click(findTestObject('Page_Login/input_Password_Login'))

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Invention_Disclosure_New__c/list?filterName=Recent')

WebUI.click(findTestObject('Invention Disclosure/Page_Recently Viewed Invention Disclosures/div_New'))

WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/input_Title'), 'Invention#3')

WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/input_Email'), 'jagathies@maxval.com')

WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/input_Jurisdiction'), 'United States of America')

WebUI.delay(5)

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/select_Jurisdiction'))

/*WebUI.selectOptionByValue(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/select_Jurisdiction'), 
    'a0r1K00000LdXcYQAV', true)*/
/*WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/div_Question 1 answer'), '<p style="">Question 1 answer</p>')

WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/div_Question 2 answer'), '<p style="">Question 2 answer</p>')

WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/div_Question 3 answer'), '<p style="">Question 3 answer</p>')

WebUI.setText(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/div_Question 4 answer'), '<p style="">Question 4 answer</p>')

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_Have you made or used this Invention_slds-checkbox--faux'))

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_1'))

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_Has the Invention or derivative products or services been sold or offered for sale_slds-checkbox--faux'))

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_2'))

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_Export Control and Open Source_slds-checkbox--faux'))

WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_Export Control_slds-checkbox--faux'))

WebUI.selectOptionByValue(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/select_Additional Inv2'), 
    'a1g1K000005H4xBQAS', true)
*/
/*WebUI.click(findTestObject('Page_New Invention_Disclosure_New__c  Salesforce/span_Upload Files'))

WebUI.click(findTestObject('Page_New Invention_Disclosure_New__c  Salesforce/span_Done'))*/
WebUI.click(findTestObject('Invention Disclosure/Page_New Invention_Disclosure_New__c/span_Next'))

WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Invention_Disclosure_New__c/list?filterName=Recent')

String text = WebUI.getText(findTestObject('Invention Disclosure/Page_Recently Viewed Invention Disclosures/span_Invention3'))

println(text)

/*WebUI.click(findTestObject('Invention Disclosure/Page_Recently Viewed Invention Disclosures/a_SYMI101926US'))

WebUI.click(findTestObject('Invention Disclosure/Page_SYMI101926US  Salesforce/span_Invention3'))*/
WebUI.delay(15)

WebUI.verifyElementText(findTestObject('Invention Disclosure/Page_Recently Viewed Invention Disclosures/span_Invention3'), 
    'Invention#3')

WebUI.closeBrowser()

