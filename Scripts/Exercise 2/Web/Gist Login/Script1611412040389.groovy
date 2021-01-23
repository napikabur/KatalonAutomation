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

WebUI.openBrowser(GlobalVariable.webGist, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Exercise 2/Login/btn-SignIn'), GlobalVariable.intMaxDelay)

WebUI.click(findTestObject('Exercise 2/Login/btn-SignIn'))

WebUI.waitForElementClickable(findTestObject('Exercise 2/Login/btn-SignIn2'), GlobalVariable.intMaxDelay)

WebUI.setText(findTestObject('Exercise 2/Login/txt-Email'), iEmail)

WebUI.setText(findTestObject('Exercise 2/Login/txt-Password'), iPassword)

WebUI.click(findTestObject('Exercise 2/Login/btn-SignIn2'))

WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/btn-DropdownMenu'), GlobalVariable.intMaxDelay)