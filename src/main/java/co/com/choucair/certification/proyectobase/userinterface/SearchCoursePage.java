package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("seleciona la universidad choucair").located(By.xpath("//*[@id=\"certificaciones\"]/a"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da clcik para buscar el curso").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//a[contains(text(),'Foundation Level')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//a[contains(@class, 'aalink') and text() = 'Foundation Level']"));
}
