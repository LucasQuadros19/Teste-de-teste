package uniamerica.UniamericaPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{
    @FindBy(name="q")
    public WebElement inputPEsquisa;
    @FindBy(id="result-stats")
    public WebElement resutadoPEsquisa;
    public GooglePO(WebDriver chrome) {
        super(chrome);
    }
}
