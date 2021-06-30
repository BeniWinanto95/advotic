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

'Given user want registry in Amazon.com'

'When user open website Amazon.com'
WebUI.openBrowser("https://www.amazon.com/")

'And user click button registry'
WebUI.click(findTestObject('Object Repository/registry/buttonRegistry'))

'Then user verify label Registry and Gifting'
WebUI.verifyElementPresent(findTestObject('Object Repository/registry/labelRegistryAndGifting'), 5)

'And user input registranrt name'
WebUI.setText(findTestObject('Object Repository/registry/inputRegistryName'), 'John')

'And user click button dropdown'
WebUI.click(findTestObject('Object Repository/registry/buttonDropDown'))

'And user choose birthday gift list'
WebUI.click(findTestObject('Object Repository/registry/labelBirthdayGiftList'))

'And user click button search'
WebUI.click(findTestObject('Object Repository/registry/buttonSearch'))

'Then user verify find list of result jhon'
WebUI.verifyElementPresent(findTestObject('Object Repository/registry/labelResultJohn'), 3)

'And user click button dropdown date range month'
WebUI.click(findTestObject('Object Repository/registry/buttonDropDownDateRangeMonth'))

'And user choose month january'
WebUI.click(findTestObject('Object Repository/registry/textJanuary'))

'And user click button dropdown range year'
WebUI.click(findTestObject('Object Repository/registry/buttonDropdownDateRangeYear'))

'And user choose year 2021'
WebUI.click(findTestObject('registry/textRange2021'))

'And user click button dropdown to month'
WebUI.click(findTestObject('Object Repository/registry/buttonDropdownToMonth'))

'And user chooser month april'
WebUI.click(findTestObject('Object Repository/registry/textApril'))

'And user click button dropdown to year'
WebUI.click(findTestObject('Object Repository/registry/buttonDropdownToYear'))

'And user choose year 2021'
WebUI.click(findTestObject('registry/textTo2021'))

'And user click button search for birthday gift list'
WebUI.click(findTestObject('Object Repository/registry/buttonSearchBithdayGiftList'))

WebUI.closeBrowser()