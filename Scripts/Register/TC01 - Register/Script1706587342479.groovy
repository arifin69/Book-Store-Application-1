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

WebUI.navigateToUrl('https://demoqa.com/login')

WebUI.click(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/button_New User'))

WebUI.setText(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/inputfirstname'), 'Abdul')

WebUI.setText(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/inputlastname'), 'Aziz')

WebUI.setText(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/inputuserName'), 'Aziz69')

WebUI.setEncryptedText(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/inputpassword'), 'FShOIFZHZUZ4R+qHGCH3lg==')

WebUI.click(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/div_Privacy - Terms'))

WebUI.click(findTestObject('Object Repository/ObjectRegister/Page_DEMOQA/button_Register'))

WebUI.closeBrowser()

