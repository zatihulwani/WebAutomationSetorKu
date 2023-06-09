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

WebUI.callTestCase(findTestCase('TC01-Login dan User dapat melihat halaman Upload Bulk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Upload Bulk  Web Report/input_SetorKu  Upload Bulk_start_date'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/th_'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/td_7'))

WebUI.click(findTestObject('Page_Upload Bulk  Web Report/input_SetorKu  Upload Bulk_end_date'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/th_'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/th_'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/td_18'))

WebUI.click(findTestObject('Page_Upload Bulk  Web Report/button_Search'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

