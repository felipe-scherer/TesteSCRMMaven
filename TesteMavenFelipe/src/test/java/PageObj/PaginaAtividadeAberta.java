package PageObj;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PaginaAtividadeAberta {
	
	private WebElement titulo;

	

	public PaginaAtividadeAberta() {
		
		titulo = Driver.getDriver().findElement(By.xpath("//form[@id='formInsereAtividade']/div/div[2]/fieldset/div/label"));
		
		
	}



	public WebElement getTitulo() {
		return titulo;
	}



	public void setTitulo(WebElement titulo) {
		this.titulo = titulo;
	}



	
	

}
