package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task {

    private String tipoCategoria;
    private String descripcion;
    public BuscarProducto(String descripcion, String tipoCategoria){
        this.descripcion = descripcion;
        this.descripcion = tipoCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //SelectFromOptions.byVisibleText(tipoCategoria).from(SELECT_TIPO_CATEGORIA), //selecion de categoria
                Enter.theValue(descripcion).into(INPUT_BUSCAR_ARTICULO),//diligencia campo de busqueda
               Hit.the(Keys.ENTER).into(INPUT_BUSCAR_ARTICULO),   //presiona tecla enter para lanzar la busquedaClick.on(LINK_ARTICULO_ENCONTRADO.of(descripcion)) //selecciona el producto a agregar
                Click.on(LINK_ARTICULO_ENCONTRADO)
        );

    }
    public static BuscarProducto conDescripcion(String descripcion, String tipoCategoria) {
        return instrumented(BuscarProducto.class, descripcion, tipoCategoria);
    }
}
