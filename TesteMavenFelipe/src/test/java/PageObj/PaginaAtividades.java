package PageObj;
import driver.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PaginaAtividades {
	
	private WebElement AtividadeCadastrada;

	

	public PaginaAtividades() {
		
		AtividadeCadastrada = Driver.getDriver().findElement(By.cssSelector("div[title=\"teste scherer\"]"));
		
		
	}


	public WebElement getAtividadeCadastrada() {
		return AtividadeCadastrada;
	}



	public void setAtividadeCadastrada(WebElement atividadeCadastrada) {
		AtividadeCadastrada = atividadeCadastrada;
	}
	
	
	

}
