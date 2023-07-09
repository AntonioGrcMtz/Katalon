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

WebUI.openBrowser('https://opencart.abstracta.us/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_Your Store/a_MacBook'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_MacBook/img'))

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_MacBook/button_'))

WebUI.setText(findTestObject('Spy_Web_2_Objects/Page_MacBook/input_Qty_quantity'), '2')

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_MacBook/button_Add to Cart'))

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_MacBook/button_1 item(s) - 602.00'))

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_MacBook/strong_View Cart'))

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Spy_Web_2_Objects/Page_Shopping Cart/a_Checkout'))

WebUI.closeBrowser()

