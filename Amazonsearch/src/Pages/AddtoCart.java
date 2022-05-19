package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class AddtoCart{

		WebDriver driver;
		
		//Constructor that will be automatically called as soon as the object of the class is created
		public AddtoCart(WebDriver driver) {
	          this.driver = driver;
		}
		
		//Locator for yellow and green socks title
		By sock = By.xpath("//a[contains(@href,'Zelda Hyrule Crest Crew Sock Pair Yellow/Green')]");
		
				//Method to click on product link
				public void clickproduct() {
				driver.findElement(sock).click();}
				
		By A2C = By.id("add-to-cart-button");
		//Method to click on add to cart button
		public void addtocart() {
		driver.findElement(A2C).click();}
		
		By P2C = By.id("proceedToRetailCheckout");
		
		//Method to click proceed to checkout button
		public void proceedtocheckout() {
		driver.findElement(P2C).click();}
				
		
				
	}


