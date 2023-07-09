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

WebUI.openBrowser('https://testsheepnz.github.io/BasicCalculator.html#main-body')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Drop_Box_Objects/First_Number_Drop_Box_Objects'), '2')

WebUI.sendKeys(findTestObject('Drop_Box_Objects/Second_Number_Drop_Box_Objects'), '2')

WebUI.scrollToElement(findTestObject('Drop_Box_Objects/Button_Clear_Drop_Box_Objects'), 0)

WebUI.selectOptionByValue(findTestObject('Drop_Box_Objects/Operations_Drop_Box_Object'), '0', false)

WebUI.delay(2)

WebUI.click(findTestObject('Drop_Box_Objects/Button_Calculate_Drop_Box_Object'))

WebUI.delay(2)

WebUI.click(findTestObject('Drop_Box_Objects/Button_Clear_Drop_Box_Objects'))

WebUI.delay(2)

WebUI.closeBrowser()

