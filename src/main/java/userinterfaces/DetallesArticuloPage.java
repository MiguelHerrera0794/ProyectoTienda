package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesArticuloPage {

    public static final Target ITEM_ARTICULO = Target.the("Caracteristicas del articulo").located(By.id("color_15"));
    public static final Target INPUT_CANTIDAD = Target.the("Input cantidad").located(By.id("quantity_wanted"));
    public static final Target  BOTON_ANADIR_CESTA = Target.the("Boton anadir al carrito").locatedBy("//span[contains(text(),'Add to cart')]");
    public static final Target  BOTON_IR_A_CAJA = Target.the("Boton ir a la caja").locatedBy("//a[@class='btn btn-default button button-medium']");


}