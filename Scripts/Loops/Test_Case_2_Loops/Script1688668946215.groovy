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

WebUI.waitForPageLoad(10)

for(int x = 1 ; x <= 6 ; x++) {
	
	int num = ((Math.random()) * (1000) as int)
	
	def z = ["Juan" , "Carlos" , "Karen" , "Perla" , "Stephany" , "Antonio"]
	
	Random nom = new Random()
	
	tx_nombre = z [nom.nextInt(z.size)]
	
	def y = ["juan" , "carlos" , "karen" , "perla" , "stephany" , "antonio"]
	
	Random user = new Random()
	
	tx_userEmail = y[user.nextInt(z.size())]
		
	WebUI.setText(findTestObject('Loops_Objects/fullName_Field'), tx_nombre)
	
	WebUI.setText(findTestObject('Loops_Objects/email_Field'), tx_userEmail + '@gmail.com')
	
	WebUI.setText(findTestObject('Loops_Objects/currentAddress_Field'), 'Current Address ' + num)
	
	WebUI.setText(findTestObject('Loops_Objects/permanentAddress_Field'), 'Permanent Address ' + num)
	
	WebUI.scrollToPosition(0, 300)
	
	WebUI.click(findTestObject('Loops_Objects/buttonSubmit'))
			
}

WebUI.closeBrowser()


