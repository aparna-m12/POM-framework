package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class SearchProduct{

		WebDriver driver;
		
		//Constructor that will be automatically called as soon as the object of the class is created
		public SearchProduct(WebDriver driver) {
	          this.driver = driver;
		}
		
		//Locator for search field
		By search = By.id("twotabsearchtextbox");
		
		//Locator for submit button
		By navsearchsubmit = By.id("nav-search-submit-button");
		
				
		
		//Method to enter search
		public void search(String Search) {
			driver.findElement(search).sendKeys(Search);
		}
		
		
		//Method to click on submit button
		public void searchsubmit() {
		driver.findElement(navsearchsubmit).click();}
		
	}

