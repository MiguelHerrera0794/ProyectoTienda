package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class ProyectoTiendaSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Miguel");
    private HomePage homePage  = new HomePage();

    @Dado("^que un cliente accede hasta la web de compras$")
    public void queUnClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @Cuando("^el agrega (.*) unidades del producto (.*) de la categoria (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String cantidad, String descripcion, String tipoCategoria) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad)
        );
    }
    @Entonces("^el ve los productos en el carro de compras$")
    public void elVeLosProductosEnElCarroDeCompras() {
    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {
    }
}
