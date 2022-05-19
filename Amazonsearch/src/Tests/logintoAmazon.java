package Tests;

import org.junit.Test;

import Pages.Login;

public class logintoAmazon extends workflow {
	
	     @Test    
	     public void init() throws Exception {    
	    	  
	    	 Login login = new Login(driver);
	           
	    	 login.enteremail("aparnatest94@gmail.com");    
	          login.clickcontinue();    
	          login.enterPassword("Welcome12345");    
	          login. clicksignin();    
	            
	     }    
	}

