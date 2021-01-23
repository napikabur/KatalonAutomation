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

if (iScenarioTest == 'Scenario 1') {
	
    WebUI.click(findTestObject('Exercise 2/Home/btn-CreateNew'))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/New Gist/txt-GistDesc'), GlobalVariable.intMaxDelay)

    WebUI.setText(findTestObject('Exercise 2/Home/New Gist/txt-GistDesc'), 'napikabur desc')

    WebUI.setText(findTestObject('Exercise 2/Home/New Gist/txt-FileName'), iFileName)

    WebUI.setText(findTestObject('Exercise 2/Home/txt-TextArea'), 'napikabur text area')

    WebUI.click(findTestObject('Exercise 2/Home/New Gist/btn-GistType'))

    WebUI.click(findTestObject('Exercise 2/Home/New Gist/btn-GistTypeDetail', [('varGistType') : 'Create public gist']))

    WebUI.click(findTestObject('Exercise 2/Home/New Gist/btn-SubmitGist'))
	
} else if (iScenarioTest == 'Scenario 2') {
    WebUI.click(findTestObject('Exercise 2/Home/btn-DropdownMenu'))

    WebUI.click(findTestObject('Exercise 2/Home/btn-ListDropdown', [('varList') : 'Your gists']))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/Action Gist/txt-SelectFile', [('varFileName') : iFileName]), 
        GlobalVariable.intMaxDelay)

    WebUI.click(findTestObject('Exercise 2/Home/Action Gist/txt-SelectFile', [('varFileName') : iFileName]))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/Action Gist/btn-Edit'), GlobalVariable.intMaxDelay)

    WebUI.click(findTestObject('Exercise 2/Home/Action Gist/btn-Edit'))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/txt-TextArea'), GlobalVariable.intMaxDelay)

    WebUI.setText(findTestObject('Exercise 2/Home/txt-TextArea'), 'napikabur text area edit')

    WebUI.click(findTestObject('Exercise 2/Home/Action Gist/btn-UpdateGist'))
	
} else if (iScenarioTest == 'Scenario 3') {
    WebUI.click(findTestObject('Exercise 2/Home/btn-DropdownMenu'))

    WebUI.click(findTestObject('Exercise 2/Home/btn-ListDropdown', [('varList') : 'Your gists']))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/Action Gist/txt-SelectFile', [('varFileName') : iFileName]), 
        GlobalVariable.intMaxDelay)

    WebUI.click(findTestObject('Exercise 2/Home/Action Gist/txt-SelectFile', [('varFileName') : iFileName]))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/Action Gist/btn-Delete'), GlobalVariable.intMaxDelay)

    WebUI.click(findTestObject('Exercise 2/Home/Action Gist/btn-Delete'))

    WebUI.acceptAlert()
	
} else if (iScenarioTest == 'Scenario 4') {
    WebUI.click(findTestObject('Exercise 2/Home/btn-DropdownMenu'))

    WebUI.click(findTestObject('Exercise 2/Home/btn-ListDropdown', [('varList') : 'Your gists']))

    WebUI.waitForElementClickable(findTestObject('Exercise 2/Home/Action Gist/txt-AllFile'), 
        GlobalVariable.intMaxDelay)
}

