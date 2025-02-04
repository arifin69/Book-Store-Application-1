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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/login')

WebUI.setText(findTestObject('Object Repository/SearchValidData/Page_DEMOQA/inputuserName'), 'Zishan90')

WebUI.setEncryptedText(findTestObject('Object Repository/SearchValidData/Page_DEMOQA/inputpassword'), '/tOh0eOC9l0dv0cab18/vQ==')

WebUI.click(findTestObject('Object Repository/SearchValidData/Page_DEMOQA/button_Login'))

WebUI.click(findTestObject('Object Repository/SearchValidData/Page_DEMOQA/button_Go To Book Store'))

WebUI.setText(findTestObject('Object Repository/SearchValidData/Page_DEMOQA/inputsearchBox'), 'Addy')

WebUI.delay(6)

WebUI.verifyElementVisible(findTestObject('Object Repository/SearchValidData/Page_DEMOQA/div_Addy Osmani'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

