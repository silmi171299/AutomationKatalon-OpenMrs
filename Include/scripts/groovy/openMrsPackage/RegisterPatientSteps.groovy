package openMrsPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterPatientSteps {
	
	@Given("User already login in OpenMrs as Inpatient Ward")
	def login_as_inpatient_ward() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputUsername'), GlobalVariable.usernameValid)
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputPassword'), GlobalVariable.passwordValid)
		WebUI.click(findTestObject('Object Repository/OpenMrs/Login/InpatientWardSession'))
		WebUI.click(findTestObject('Object Repository/OpenMrs/Login/BtnLogin'))
	}
	
	
	@Given("User is on Homepage")
	def on_homepage() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/OpenMrs/Homepage/homepage'), 4)
	}
	
	@When("User click Register a patient Menu")
	def registerPatientMenu() {
		WebUI.click(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/btnMenuRegister'))
	}

	@And("User input GvnName (.*)")
	def input_given_name(String givenname) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputGivenName'), givenname)
	}
	
	@And("User input MiddleName (.*)")
	def input_middle_name(String middlename) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputMiddleName'), middlename)
	}

	@And("User input FamilyName (.*)")
	def input_family_name(String familyname) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputFamilyName'), familyname)
	}
	
	@And("User click next button")
	def click_next_button() {
		WebUI.click(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/BtnNext'))
	}
	
	@And("User select Gender (.*)")
	def select_gender(String gender) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/SelectGender'), gender, true)
	}
	
	@And("User input BirthDate (.*)")
	def input_birth_date(String birthdate) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputBirthDate'), birthdate)
	}

	@And("User select BirthMonth (.*)")
	def select_birth_month(String birthmonth) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/SelectBirthMonth'), birthmonth, true)
	}
	
	@And("User input BirthYear (.*)")
	def select_birth_year(String birthyear) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputBirthYear'), birthyear)
	}
	
	@And("User input PatientAddress1 (.*)")
	def input_patient_address1(String address1) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputPatientAddress1'), address1)
	}
	
	@And("User input PatientAddress2 (.*)")
	def input_patient_address2(String address2) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputPatientAddress2'), address2)
	}
	
	@And("User input City (.*)")
	def input_city(String city) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputCity'), city)
	}
	
	@And("User input Province (.*)")
	def input_province(String province) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputProvince'), province)
	}
	
	@And("User input Country (.*)")
	def input_country(String country) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputCountry'), country)
	}
	
	@And("User input PostalCode (.*)")
	def input_postal_code(String postalcode) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputPostalCode'), postalcode)
	}
	
	@And("User input PhoneNumber (.*)")
	def input_phone_number(String phonenumber) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputPhoneNumber'), phonenumber)
	}
	
	@And("User select RelationType (.*)")
	def select_relation_type(String relationtype) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputRelationType'), relationtype, false)
	}
	
	@And("User input PersonName (.*)")
	def input_person_name(String personname) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/InputPersonName'), personname)
	}
	
	@And("User click Confirm button")
	def click_confirm_button() {
		WebUI.click(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/BtnConfirm'))
	}
	
	@Then("User successfully to register a new patient (.*)")
	def successfully_to_register_new_patient(String familyname) {
		//WebUI.waitForElementVisible(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/SuccessRegist'), 5)
		WebUI.verifyElementText(findTestObject('Object Repository/OpenMrs/Inpatient Ward/Register Patient/SuccessRegist'), familyname)
	}
}