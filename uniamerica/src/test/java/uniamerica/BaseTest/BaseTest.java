package uniamerica.BaseTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import uniamerica.Test.Rota;
import uniamerica.UniamericaPO.GooglePO;

public class BaseTest extends Rota {
	public static GooglePO googlePage;

	@BeforeClass
	public  static void inicializaPAgina(){
		googlePage = new GooglePO(chrome);
	}
	
	@Test
	public void TesteWebDriver() {
		googlePage.inputPEsquisa.sendKeys("brics venezuela"+Keys.ENTER);
		String data = googlePage.resutadoPEsquisa.getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Aproximadamentee"));
	}

}










