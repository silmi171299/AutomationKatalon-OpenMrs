package openMrsPackage
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class LoginSteps {

	@Given("User access OpenMrs website")
	def access_Openmrs_website() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
	}

	@When("User input valid username")
	def input_valid_username() {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputUsername'), GlobalVariable.usernameValid)
	}

	@And("User input valid password")
	def input_valid_password() {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputPassword'), GlobalVariable.passwordValid)
	}

	@And("User click location for session login")
	def click_location_for_session_login() {
		WebUI.click(findTestObject('Object Repository/OpenMrs/Login/InpatientWardSession'))
	}

	@And("User click login button")
	def click_Login_Button() {
		WebUI.click(findTestObject('Object Repository/OpenMrs/Login/BtnLogin'))
		WebUI.delay(1)
	}

	@Then("User Redirect to Homepage")
	def redirect_to_homepage() {
		WebUI.delay(5)
		WebUI.closeBrowser()
	}

	//Blank username password
	@When("Login with blank username")
	def blank_username() {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputPassword'), GlobalVariable.passwordValid)
	}

	@When("Login with blank password")
	def blank_password() {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputUsername'), GlobalVariable.usernameValid)
	}

	@When("Login with blank username password")
	def blank_username_password() {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputUsername'), GlobalVariable.usernameValid)
	}

	// Invalid Username Case

	@When("User input invalid username (.*) and password (.*)")
	def input_invalid_username_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputUsername'), username)
		WebUI.setText(findTestObject('Object Repository/OpenMrs/Login/InputPassword'), password)
	}

	@Then("User see error message on the Login page")
	def User_see_error_message_on_Login_Page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/OpenMrs/Login/AlertErrorMessage'))
	}


}