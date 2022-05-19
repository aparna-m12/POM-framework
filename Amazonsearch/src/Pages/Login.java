package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class Login{

		WebDriver driver;
		
		//Constructor that will be automatically called as soon as the object of the class is created
		public Login(WebDriver driver) {
	          this.driver = driver;
		}
		
		//Locator for email field
		By email = By.id("ap_email");
		
		//Locator for continue button
		By continuebutton = By.id("Continue");
		
		//Locator for password field
		By pswd = By.id("ap_password");
		
		//Locator for signin button
		By signin = By.id("signInSubmit");
		
		
		//Method to enter email
		public void enteremail(String Email) {
			driver.findElement(email).sendKeys(Email);
		}

		//Method to enter password
		public void enterPassword(String pass) {
			driver.findElement(pswd).sendKeys(pass);
		}
		//Method to click on signin button
		public void clicksignin() {
		driver.findElement(signin).click();}
		
		//Method to click on continue button
		public void clickcontinue() {
			driver.findElement(continuebutton).click();
		}
		
	}

