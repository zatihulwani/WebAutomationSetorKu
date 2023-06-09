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

WebUI.click(findTestObject('Page_Dashboard  Web Report/span_SetorKu'))

WebUI.click(findTestObject('Page_Dashboard  Web Report/span_Bulk Upload'))

WebUI.click(findTestObject('Page_Upload Bulk  Web Report/a_2 (3)'))

WebUI.click(findTestObject('Page_Upload Bulk  Web Report/a_Waiting_glyphicon glyphicon-option-horizontal (8)'))

WebUI.click(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/a_Add Data'))

WebUI.setText(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/input_Merchant Transaction ID_merchant1'), 
    'ghwun8')

WebUI.setText(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/input_User Code_usercode1'), '12hun')

WebUI.setText(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/input_Username_username1'), 'akuy7')

WebUI.setText(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/input_Customer ID_customerid1'), 'tyndj8')

WebUI.setText(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/input_Total Amount_totalamount1'), '564899')

WebUI.setText(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/input_Periode_periode1'), '1f')

WebUI.click(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/button_TAMBAH'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/button_OK (Failed 1)'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

