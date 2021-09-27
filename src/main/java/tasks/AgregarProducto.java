package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticuloPage.*;

public class AgregarProducto implements Task {
    private String cantidad;
    public AgregarProducto(String cantidad){
        this.cantidad= cantidad;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ITEM_ARTICULO), //seleccionar color
                Enter.theValue(cantidad).into(INPUT_CANTIDAD),//ingresa cantidad
                Click.on(BOTON_ANADIR_CESTA), //selecciona agregar al carrito
                Click.on(BOTON_IR_A_CAJA) //Selecciona pasar por la caja

        );

    }
    public static AgregarProducto cantidad(String cantidad){
        return instrumented(AgregarProducto.class, cantidad);
    }
}
