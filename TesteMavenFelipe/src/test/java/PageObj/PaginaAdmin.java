package PageObj;
import driver.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class PaginaAdmin {
	
	private WebElement labelVertical;
	
	

	public PaginaAdmin() {
		
		labelVertical = Driver.getDriver().findElement(By.xpath("//form[@id='form7']/div[2]/div/div[3]"));
				
	}


	public WebElement getlabelVertical() {
		return labelVertical;
	}



	public void setlabelVertical(WebElement labelVertical) {
		this.labelVertical = labelVertical;
	}




	
	

}
