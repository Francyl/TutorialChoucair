package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    //public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-block d-lg-none']//strong[contains(text(),'Ingresar')]"));
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("where do were write the user").located(By.id("username"));
    public static final Target INPUT_PASSWORD= Target.the("where do were write the password").located(By.id("password"));
    public static final Target ENTER_BUTTON= Target.the("button to confirm login").located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));

}
