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

String strScenario = 'True'
String strPrefix = 'PT'
String strName = 'Sejahtera'
String strSuffix = 'Tbk'
String strIndustryID = '1'
String strEmployeeSize = '100'
String strStreet = 'Jl.Sudirman kav. 21'
String strPlace = 'Sudirman Tower'
String strPhone = '08561290092'

def response = WS.sendRequest(findTestObject('Exercise 3/Mocky',
	[('varPrefix') : strPrefix,
	 ('varName') : strName,
	 ('varSuffix') : strSuffix,
	 ('varIndustry_Id') : strIndustryID,
	 ('varEmployee_Size') : strEmployeeSize,
	 ('varStreet') : strStreet,
	 ('varPlace') : strPlace,
	 ('varPhone') : strPhone]))

WebUI.comment(response.getStatusCode())

if (response.getStatusCode() != 200 && strScenario == 'True') {
	KeywordUtil.markFailedAndStop("Scenario Fail!")
} else if (response.getStatusCode() == 400 && strScenario != 'True') {
	KeywordUtil.markFailedAndStop("Scenario Response 400 Bad Request OK!")
} else if (response.getStatusCode() == 404 && strScenario != 'True') {
	KeywordUtil.markFailedAndStop("Scenario Response 404 Not Found OK!")
} else if (response.getStatusCode() == 500 && strScenario != 'True') {
	KeywordUtil.markFailedAndStop("Scenario Response 500 Internal Server Error OK!")
} else if (response.getStatusCode() == 200 && strScenario == 'True') {
	def jsonSlurper = new JsonSlurper()
	object = jsonSluper.parseText(response.getResponseBodyContent())
	if (object.code == 'STATUS_CREATED') {
		WebUI.comment("Scenario Success !!")
	} else (object.code != 'STATUS_CREATED') {
		KeywordUtil.markFailedAndStop("Scenario Failed !!")
	}
}
