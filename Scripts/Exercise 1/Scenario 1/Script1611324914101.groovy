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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

String strSearch = 'i phone'
String strCategory = 'Cell Phones & Accessories'
String strIDRStart = '7000000'
String strIDRTo = '22000000'
int intCountSkenarioFilter = 0

WebUI.openBrowser(GlobalVariable.webEbay, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Exercise 1/btn-Category'), GlobalVariable.intMaxDelay)

WebUI.setText(findTestObject('Exercise 1/txt-Search'), strSearch)

WebUI.click(findTestObject('Exercise 1/btn-Category'))

WebUI.click(findTestObject('Exercise 1/btn-CategoryDetail',[('paramCategoryDetail') : strCategory]), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Exercise 1/btn-Search'))

WebUI.waitForElementClickable(findTestObject('Exercise 1/btn-MoreFilters'), GlobalVariable.intMaxDelay)

WebUI.click(findTestObject('Exercise 1/btn-MoreFilters'))

WebUI.waitForElementClickable(findTestObject('Exercise 1/More Filters/btn-ScreenSize'), GlobalVariable.intMaxDelay)

WebUI.click(findTestObject('Exercise 1/More Filters/btn-ScreenSize'))

WebUI.waitForElementClickable(findTestObject('Exercise 1/More Filters/cb-ScreenSizeDetail'), GlobalVariable.intMaxDelay)

intCountSkenarioFilter = intCountSkenarioFilter + 1

WebUI.click(findTestObject('Exercise 1/More Filters/cb-ScreenSizeDetail'))

WebUI.click(findTestObject('Exercise 1/More Filters/btn-Price'))

WebUI.waitForElementClickable(findTestObject('Exercise 1/More Filters/txt-Price',[('varPrice') : 'Minimum']), GlobalVariable.intMaxDelay)

WebUI.setText(findTestObject('Exercise 1/More Filters/txt-Price',[('varPrice') : 'Minimum']), strIDRStart)

WebUI.setText(findTestObject('Exercise 1/More Filters/txt-Price',[('varPrice') : 'Maximum']), strIDRTo)

intCountSkenarioFilter = intCountSkenarioFilter + 1

WebUI.click(findTestObject('Exercise 1/More Filters/btn-ItemLocation'))

WebUI.waitForElementClickable(findTestObject('Exercise 1/More Filters/rb-ItemLocationDetail'), GlobalVariable.intMaxDelay)

WebUI.click(findTestObject('Exercise 1/More Filters/rb-ItemLocationDetail'))

intCountSkenarioFilter = intCountSkenarioFilter + 1

WebUI.verifyElementText(findTestObject('Exercise 1/More Filters/lbl-TotalFilter'), '('+intCountSkenarioFilter.toString()+') Filter(s) selected')

