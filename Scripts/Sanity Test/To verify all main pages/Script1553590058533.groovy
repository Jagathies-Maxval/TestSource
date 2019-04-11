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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('Sanity Test/Page_Login/input_Username_username'), 30)

WebUI.setText(findTestObject('Sanity Test/Page_Login/input_Username_username'), 'dev.admin@symphony.com')

WebUI.waitForElementVisible(findTestObject('Sanity Test/Page_Login/input_Password_pw'), 30)

WebUI.setText(findTestObject('Sanity Test/Page_Login/input_Password_pw'), 'MaxSymp@2018')

WebUI.click(findTestObject('Sanity Test/Page_Login/input_Password_Login'))

WebUI.waitForPageLoad(30)

/*Thread.sleep(3000)*/
/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_1Home/span_Home'), 30)*/
/*WebUI.click(findTestObject('Object Repository/Sanity Test/Page_1Home/span_Home'))*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/page/home')

/*Thread.sleep(3000)
WebUI.waitForPageLoad(60)*/
WebUI.delay(5)

WebUI.verifyTextPresent('Dashboard', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_2Admin/span_Admin'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/n/Admin')

/*WebUI.waitForPageLoad(70)
String title = WebUI.getWindowTitle()
println(title)*/
WebUI.delay(5)

not_run: WebUI.verifyTextPresent('', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_3Import/span_Import'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/n/Import')

WebUI.delay(5)

WebUI.verifyTextPresent('Import', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_4Invention Disclosures/span_Invention Disclosures'), 
    30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Invention_Disclosure_New__c/list?filterName=Recent')

WebUI.delay(5)

WebUI.verifyTextPresent('Invention Disclosures', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_5Patents/span_Patents'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Patent__c/list?filterName=Recent')

WebUI.delay(5)

WebUI.verifyTextPresent('Patents', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_6Trademarks/span_Trademarks'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Trademark_New__c/list?filterName=Recent')

WebUI.delay(5)

WebUI.verifyTextPresent('Trademarks', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_7Annuities/span_Annuities'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/n/Annuities')

WebUI.delay(5)

WebUI.verifyTextPresent('Dashboard', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_8PRC Meetings/span_PRC Meetings'), 
    30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/PRC_Meeting__c/list?filterName=Recent')

WebUI.delay(5)

WebUI.verifyTextPresent('PRC Meetings', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_9Reports/span_Reports'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Report/home?queryScope=mru')

WebUI.delay(5)

WebUI.verifyTextPresent('Reports', false)

/*CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('Sanity Test/Page_10Dashboard/span_Dashboards'), 30)*/
WebUI.navigateToUrl('https://maxval-ip-dev-ed.lightning.force.com/lightning/o/Dashboard/home?queryScope=mru')

WebUI.delay(5)

WebUI.verifyTextPresent('Dashboards', false)

WebUI.closeBrowser()

