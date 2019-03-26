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
import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Login/input_Username_username'), 30)

WebUI.setText(findTestObject('NewPatent_Import/Page_Login/input_Username_username'), 'dev.admin@symphony.com')

WebUI.waitForElementVisible(findTestObject('NewPatent/Page_Login/input_Password_pw'), 30)

WebUI.setEncryptedText(findTestObject('NewPatent_Import/Page_Login/input_Password_pw'), 'JoIhoEp72ZeVlgc3r+fsUQ==')

WebUI.click(findTestObject('NewPatent_Import/Page_Login/input_Password_Login'))

WebUI.waitForPageLoad(30)

CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('NewPatent_Import/Page_ImportMenu/span_Import'), 30)

WebUI.waitForPageLoad(30)

WebUI.switchToFrame(findTestObject('NewPatent_Import/Page_Import/iframe_import'), 30)

WebUI.setText(findTestObject('NewPatent_Import/Page_Import/textarea_Please enter'), 'US7475786B2')

WebUI.click(findTestObject('NewPatent_Import/Page_Import/button_Import'))

WebUI.switchToWindowTitle('ImportView | Salesforce')

WebUI.click(findTestObject('NewPatent_Import/Page_Import/a_here'))

WebUI.waitForPageLoad(30)

not_run: WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex('1')

WebUI.waitForElementPresent(findTestObject('NewPatent_Import/Page_ImportBatch/div_flexipage_tabset'), 30)

CustomKeywords.'package1.clickUsingJavaScript.clickJS'(findTestObject('NewPatent_Import/Page_ImportBatch/span_Details'), 
    30)

WebUI.getText(findTestObject('Testimport/Page_MVIB-379  Salesforce/span_Submitted (1)'), FailureHandling.STOP_ON_FAILURE)

/*WebUI.verifyTextPresent('Submitted', false)*/
WebUI.refresh()
println()
WebUI.waitForPageLoad(30)

/*while (WebUI.verifyTextPresent('Submitted', false)) {
    WebUI.refresh()

   
}
*/
/*if (WebUI.verifyTextPresent('Submitted', false)) {*/
WebUI.click(findTestObject('NewPatent_Import/Page_ImportBatch/span_Related'))

WebUI.waitForPageLoad(30)

not_run: WebUI.switchToWindowIndex('1')

/*WebDriver driver = DriverFactory.getWebDriver()
'Expected value from Table'
String ExpectedValue = "Completed";
'To locate table'
WebElement Table = driver.findElement(By.xpath("//table/tbody"))
'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
'To calculate no of rows In table'
int rows_count = rows_table.size()
 
'Loop will execute for all the rows of the table'
Loop:
for (int row = 0; row < rows_count; row++) {
'To locate columns(cells) of that specific row'
List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
 
'To calculate no of columns(cells) In that specific row'
int columns_count = Columns_row.size()
 
println((('Number of cells In Row ' + row) + ' are ') + columns_count)
 
'Loop will execute till the last cell of that specific row'
for (int column = 0; column < columns_count; column++) {
'It will retrieve text from each cell'
String celltext = Columns_row.get(column).getText()
 
println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
 
'Checking if Cell text is matching with the expected value'
if (celltext == ExpectedValue) {
'Getting the Country Name if cell text i.e Company name matches with Expected value'
println('Text present in row number 3 is: ' + Columns_row.get(2).getText())
 
'After getting the Expected value from Table we will Terminate the loop'
break Loop;
}
}
}
*/
WebUI.waitForPageLoad(30)
String ExpectedValue = 'Completed'

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebUI.delay(10)
WebElement Table = driver.findElement(By.xpath('//table/tbody'))

'To locate rows of table it will Capture all the rows available in the table '

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

/*KeywordLogger log = new KeywordLogger()
log.logInfo(Rows.size().toString())

println('No. of rows: ' + Rows.size())*/

'Find a matching text in a table and performing action'

'Loop will execute for all the rows of the table'

table: for (int i = 0; i < Rows.size(); i++) {

'To locate columns(cells) of that specific row'

List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

/*KeywordLogger log = new KeywordLogger()*/
/*log.logInfo(Cols.size().toString())
*/
/*int k = 0*/
for (int j = 0; j < Cols.size(); j++) {

'Verifying the expected text in the each cell'
/*k = k + 1*/
if (Cols.get(j).getText().equalsIgnoreCase(ExpectedValue)) {

'To locate anchor in the expected value matched row to perform action'


KeywordLogger log = new KeywordLogger()
log.logInfo(Cols.get(j).getText() )

WebUI.verifyElementText(Cols.get(j).getText(), ExpectedValue)
table: break
}
/*KeywordLogger log = new KeywordLogger()*/
/*log.logInfo(Cols.get(j).getText() )
}*/
/*WebUI.verifyElementText(Cols.get(j).getText(), ExpectedValue)
table: break*/
}
}



/*WebUI.waitForPageLoad(30)

WebUI.getText(findTestObject('NewPatent_Import/Page_ImportBatch/span_Completed'))

WebUI.verifyTextPresent('Completed', false)
*/
/*}*/
WebUI.closeBrowser()

