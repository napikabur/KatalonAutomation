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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

String strSearch = 'Macbook'
String strCategory = 'Computers/Tablets & Networking'
String strResult = ''

WebUI.openBrowser(GlobalVariable.webEbay, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Exercise 1/btn-Category'), GlobalVariable.intMaxDelay)

WebUI.setText(findTestObject('Exercise 1/txt-Search'), strSearch)

WebUI.click(findTestObject('Exercise 1/btn-Category'))

WebUI.click(findTestObject('Exercise 1/btn-CategoryDetail',[('paramCategoryDetail') : strCategory]), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Exercise 1/btn-Search'))

WebUI.waitForPageLoad(GlobalVariable.intMaxDelay)

strResult = WebUI.getText(findTestObject('Exercise 1/lbl-SearchResult'))

if (strResult.contains(strSearch)) {
	WebUI.comment('OK !')
} else {
	KeywordUtil.markFailedAndStop('Not OK!')
}
