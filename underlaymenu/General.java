package underlaymenu;
 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	 
	    public class General extends Global {
	    
	    
	    //Re-usable function
		FirefoxDriver driver ;
		
		public void openApplication () {
		System.setProperty ("webdriver.gecko.driver","C:\\Selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
		driver = new FirefoxDriver ();
		driver.navigate ().to (url) ;
		
        //normally it is FirefoxDriver driver = new FirefoxDriver but here we have defined the method at the top to use else where too
		}
		
		//Hover function (underlay)
		
		public void hoverUnderlay () {
		Actions ac= new Actions (driver);
		ac.moveToElement(driver.findElement (By.xpath(underlay))).perform();
		}
		
		//Click function (carpetunderlay)
		
		public void carpetUnderlay () {
		driver.findElement (By.xpath(carpetunderlay)). click();
		}
		
		//Woodunderlay
		
		public void woodUnderlay () {
		driver.findElement(By.xpath(woodunderlay)).click();
		}
		
		//Click on the next button
		
		public void next () {
		driver.findElement(By.xpath(next)). click ();
		
		}
		//lastpage
		
		public void lastpage () {
			driver.findElement(By.linkText("2")). click ();
		}
		//click on previous button
		
		public void previous () {
			driver.findElement(By.xpath(prev)).click();
		}
		//firstpage
		
		public void firstpage () {
		driver.findElement(By.linkText("1")).click();
		}
			    				
		//Dropdown (show by 30)
		
			
		public void show30 () {
		Select st = new Select (driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/select")));
		st.selectByVisibleText("30");
							 						
		}
		
		//Dropdown (show by 30a)
		
		public void show30a () {
		Select st = new Select (driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/select")));
		st.selectByVisibleText("30");
		}
			
		//Dropdown (show by 60)
		
		public void show60 () {
		Select st = new Select (driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[1]/div/select")));
		st.selectByVisibleText("60"); 
		}
		
		//Dropdown (show by 60a)
		
		public void show60a () {
		Select st = new Select (driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/select")));
		st.selectByVisibleText("60"); 
		}
		
		
		//Dropdown (show by All)
		
		public void all () {
		Select st = new Select (driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[1]/div/select")));
		st.selectByVisibleText("All");
		}
		
		
		//Dropdown (show by All1)
		
		public void all1 () {
		Select st = new Select (driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/select")));
		st.selectByVisibleText("All");
		}
			
		//Dropdown by position
		
		public void position () {
		Select st = new Select (driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/select"))) ;
		st.selectByVisibleText("Position");
		}
		
		//Dropdown by position1
		
		public void position1 () {
		Select st = new Select (driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div/select"))) ;
		st.selectByVisibleText("Position");
		}
		
		//Dropdown by price
		
		public void price () {
		Select st =new Select (driver.findElement(By.xpath( "/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/select")));
		st.selectByVisibleText("Price");
		}
		
		//Dropdown by price1
		
		public void price1 () {
		Select st =new Select (driver.findElement(By.xpath( "/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div/select")));
		st.selectByVisibleText("Price");
			
		}
			
		//Dropdown by Brand
		
		public void brand () {
		Select st= new Select (driver.findElement(By.xpath( "/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/select")));
		st.selectByVisibleText("Brand");
			
		}
		
		//Dropdown by Brand1
		
		public void brand1 () {
		Select st= new Select (driver.findElement(By.xpath( "/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div/select")));
		st.selectByVisibleText("Brand");
			
		}
		
					
		//Dropdown by name
		
		public void name () {
		Select st= new Select (driver.findElement(By.xpath( "/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/select")));
		st.selectByVisibleText("Name");
		}
		
		//Dropdown by name1
		
		public void name1 () {
		Select st= new Select (driver.findElement(By.xpath( "/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div/select")));
		st.selectByVisibleText("Name");
		}
		
			
		//Enter into a frame
			
			
		//Keyboard function	(down arrow)
		
		public void downarrow () throws Exception   {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
			
		}
			
		//Keyboard function up arrow)
		
		public void uparrow () throws Exception   {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		}
	   //Up arrow button
		
		public void arrowup() {
		driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/div/a")).click();
				
		}
	   //Up arrow button1
		
	   public void arrowup1() {
	   driver.findElement (By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div/div/a")).click();
					
		}
							
		//Down arrow button
		
		public void arrowdown () {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/div/a")).click();
		}
		
		//Down arrow button1
		
		public void arrowdown1 () {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div[2]/div/div/a")).click();
		}
			
		//Grid View
		
		public void gridview () {
	    driver.findElement(By.linkText("Grid")).click();
		    
		}
				
		//List View
		
		public void listview () {
		driver.findElement(By.linkText("List")).click();
		}
			
		//Add to Cart
		
		public void addtocart () {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/ul[1]/li[1]/div/div[2]/div[2]/div[1]/button/span/span")).click();
		
		}
		
		//Magic Carpert Underlay 15m2
		
		public void  magiccarpetunderlay () {
		driver.findElement(By.linkText ("Magic Carpet Underlay 15m2")).click();
					
		}
		
		//XL Underlay
		
		public void  xlunderlay () {
		driver.findElement(By.linkText ("XL Underlay")).click();
					
		}
		
		//Add to wishlist
		
		public void  addtowishlist () {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/ul[1]/li[1]/div/div[2]/div[2]/div[2]/a[1]/img")).click();
		}
		
		//Add to comparison
		
		public void addtocompare () {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[1]/div/div[3]/ul[1]/li[1]/div/div[2]/div[2]/div[2]/a[2]/img")). click();
		}
		
		//Featured Product
		
		public void featuredproduct () {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[12]/div/div/div/div/div/div[2]/ul[1]/li/div/a/img")). click();
		}
		
		
			
		//closebrowser
		
		public void closebrowser () {
		driver.quit();
			
		}
			
		}
			
		

		
		


