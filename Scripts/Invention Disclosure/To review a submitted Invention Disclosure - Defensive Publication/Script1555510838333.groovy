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
import groovy.time.TimeCategory as TimeCategory
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

use(TimeCategory, { 
        today = new Date()

        lastWeek = (today - 1.week)

        NextWeek = (today + 1.week)

        NextMonth = (today + 1.month)

        twodaysAgo = (today - 2.days)
    })

DateFormat dateFormat = new SimpleDateFormat('dd MMM yyyy')

Date date = new Date()

String today = dateFormat.format(date)

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

not_run: WebUI.click(findTestObject('Invention Disclosure Review/Page_Home/span_Invention Disclosures'))

WebUI.click(findTestObject('Invention Disclosure Review/Page_Recently Viewed Invention Disclosures/a_Docket Number'))

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/span_Defensive Publication'))

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/span_Next'))

WebUI.selectOptionByValue(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_Detection Ease'), 
    'choiceRatingParameter.Choice2', true)

WebUI.selectOptionByValue(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_Claim Value'), 
    'choiceRatingParameter.Choice3', true)

WebUI.selectOptionByValue(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_Internal Value'), 
    'choiceRatingParameter.Choice4', true)

WebUI.selectOptionByValue(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_Competitive Value'), 
    'choiceRatingParameter.Choice2', true)

not_run: WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/label_Competitive Value0123'))

WebUI.setText(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/textarea_Review Comments'), 
    'Review comments')

WebUI.setText(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/textarea_Instruction for Outside Counsel'), 
    'Instruction for OC')

WebUI.setText(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/span_Today'), today)

WebUI.delay(5)

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_Law Firm'))

WebUI.selectOptionByValue(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_Law Firm'), 
    'a1o1K000003GkXAQA0', false)

WebUI.waitForElementVisible(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_OC'), 
    30)

WebUI.delay(5)

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_OC'))

WebUI.selectOptionByValue(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/select_OC'), 
    'a1g1K000005H4hoQAC', false)

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/span_Next_2'))

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/a_Related Patent'))

WebUI.click(findTestObject('Invention Disclosure Review/Page_Invention Disclosure Detailed View/a_Related Patent'))

WebUI.click(findTestObject('Invention Disclosure Review/Page_Patent Detailed View/div_Outside Counsel'))

WebUI.doubleClick(findTestObject('Invention Disclosure Review/Page_Patent Detailed View/div_Outside Counsel'))

