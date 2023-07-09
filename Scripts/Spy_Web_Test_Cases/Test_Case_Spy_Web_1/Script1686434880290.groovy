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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Spy_Web_1_Objects/Page_DEMOQA/input_Full Name_userName'), 'Antonio Garcia')

WebUI.setText(findTestObject('Spy_Web_1_Objects/Page_DEMOQA/input_Email_userEmail'), 'antonio.garcia@test.com')

WebUI.setText(findTestObject('Spy_Web_1_Objects/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Current address test')

WebUI.setText(findTestObject('Spy_Web_1_Objects/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'Permanent address test')

WebUI.scrollToPosition(0, 160)

WebUI.click(findTestObject('Spy_Web_1_Objects/Page_DEMOQA/button_Submit'))

WebUI.verifyTextPresent('Text Box', false)

WebUI.closeBrowser()

