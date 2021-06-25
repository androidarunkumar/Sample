package oneproj;



	import org.openqa.selenium.By;  
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
	
	  
	public class Test {  
		static WebDriver driver;
	    public static void main(String[] args) {  
	      try {
	           // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver","C:/Users/arunp/Downloads/chromedriver.exe");  
	    	 driver=new ChromeDriver();  

	             // Instantiate a ChromeDriver class.     
	       
	          
	           // Launch Website  
	        driver.get("http://www.javatpoint.com/");  
	          
	         //Maximize the browser  
	          driver.manage().window().maximize();  
	          
	          //Scroll down the webpage by 5000 pixels  
	         JavascriptExecutor jse = (JavascriptExecutor)driver;
	          jse.executeScript("window.scrollBy(0,5000)");  
	          
	         // Click on the Search button  
	        driver.findElement(By.linkText("Core Java")).click();   }
	      
	        finally {
	            driver.close();
	            driver.quit();
	        }	  
	    }  
	  
	}  

