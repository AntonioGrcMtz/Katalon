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

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Combo_Box_Objects/Combo_Box_First_Name'))

WebUI.setText(findTestObject('Combo_Box_Objects/Combo_Box_First_Name'), 'Juan')

WebUI.setText(findTestObject('Combo_Box_Objects/Combo_Box_First_Name'), 'Antonio')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Combo_Box_Objects/Combo_Box_First_Name'), 'Manuel')

WebUI.delay(2)

WebUI.clearText(findTestObject('Combo_Box_Objects/Combo_Box_First_Name'))

WebUI.sendKeys(findTestObject('Combo_Box_Objects/Combo_Box_First_Name'), 'Juan')

WebUI.delay(2)

WebUI.check(findTestObject('Combo_Box_Objects/Combo_Box_Radio_Button_Male'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Combo_Box_Objects/Combo_Box_Checkbox_Sports'), 0)

WebUI.check(findTestObject('Combo_Box_Objects/Combo_Box_Checkbox_Sports'))

WebUI.delay(2)

WebUI.closeBrowser()

