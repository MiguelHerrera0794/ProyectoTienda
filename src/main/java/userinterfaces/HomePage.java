package userinterfaces;

import net.bytebuddy.implementation.bind.annotation.Default;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    //public static final Target SELECT_TIPO_CATEGORIA = Target.the("select tipo de categoria").locatedBy(//a[@title='Dresses']);
    public static final Target INPUT_BUSCAR_ARTICULO = Target.the("Input donde se realiza la busqueda").located(By.id("search_query_top"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton buscar articulo").locatedBy("//button[@class='btn btn-default button-search'])");
    public static final Target LINK_ARTICULO_ENCONTRADO = Target.the("Link objeto encontrado").locatedBy("//a[contains(text(),'Printed Chiffon Dress')]");

}
