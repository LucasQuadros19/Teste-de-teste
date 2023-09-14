package uniamerica.UniamericaPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePO {
    public WebDriver chrome;
    public BasePO(WebDriver chrome){
        this.chrome=chrome;
        PageFactory.initElements(chrome,this);
    }
}
