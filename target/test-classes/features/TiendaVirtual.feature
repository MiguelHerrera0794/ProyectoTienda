# language: es
  Característica: Realizar compra de un articulo
    como un cliente
    quiero ingresa a la pagina http://automationpractice.com/index.php
    para realizar la compra de un articulo

  @EscenarioSinEjemplo
  Escenario: agregar articulo al carrito de compras
    Dado que un cliente accede hasta la web de compras
    Cuando el agrega 2 unidades del producto Printed Chiffon Dress de la categoria Dresses al carro
    Entonces el ve los productos en el carro de compras

  @EscenarioConEjemplo
  Esquema del escenario: agregar articulo al carro de compras
    Dado que un cliente accede hasta la web de compras
    Cuando el agrega productos al carro
        | <nombreProducto> |
    Entonces el ve los productos en el carro de compras

      Ejemplos:
      | nombreProducto |
      | blouse         |