import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class windows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	WebElement src = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
src.sendKeys("iphones");

WebElement search = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/button"));
search.click();
		
		
	WebElement firstpad = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]"));
		firstpad.click();
		
			String oneid = driver.getWindowHandle();
              System.out.println(oneid);
             
             Set<String> allid = driver.getWindowHandles();
              System.out.println(allid);
        
             for (String eachid : allid)
             {
				if(!oneid.equals(eachid)){
					driver.switchTo().window(eachid);
					System.out.println(eachid);}}
             WebElement l = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button"));
				l.click();
				
			ArrayList <String> li=new ArrayList<String>();
			li.addAll(allid);
			driver.switchTo().window(li.get(1));
			System.out.println(li.get(1));
      int count=1;
              for(String eachid1:allid){
              if(count==2){
            	  driver.switchTo().window(eachid1);
            	  System.out.println(eachid1);
          	}
              
              count=count+1;
}}}
              
	