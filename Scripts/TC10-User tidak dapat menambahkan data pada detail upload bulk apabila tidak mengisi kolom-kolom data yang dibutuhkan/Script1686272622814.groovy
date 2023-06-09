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

WebUI.navigateToUrl('https://dev140.ids.id:93/auth/login')

WebUI.setText(findTestObject('Page_Solusipay Admin/input_User_email'), 'oto011')

WebUI.setEncryptedText(findTestObject('Page_Solusipay Admin/input_Password_password'), '7hpJmdzDyuw=')

WebUI.click(findTestObject('Page_Solusipay Admin/button_SIGN IN'))

WebUI.click(findTestObject('Page_Dashboard  Web Report/span_SetorKu'))

WebUI.click(findTestObject('Page_Dashboard  Web Report/span_Bulk Upload'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/a_2 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Upload Bulk  Web Report/a_Waiting_glyphicon glyphicon-option-horizontal (8)'))

WebUI.click(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/a_Add Data (4)'))

WebUI.click(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/button_TAMBAH (4)'))

WebUI.click(findTestObject('Object Repository/Page_Detail Upload Bulk  Web Report/button_OK (6)'))

