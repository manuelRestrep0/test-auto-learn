Feature: Gestión de promociones en Fluffy Deals Hub
  Como usuario registrado
  Quiero iniciar sesión y gestionar promociones
  Para administrar las ofertas de la plataforma

  Background:
    Given que el usuario está en la página principal de Fluffy Deals Hub
    When accede al formulario de autenticación

  Scenario Outline: Crear una promoción válida
    And ingresa sus credenciales "<email>" y "<password>"
    And confirma el inicio de sesión
    And crea la promoción con los datos:
      | name        | <name>        |
      | start       | <start>       |
      | end         | <end>         |
      | description | <description> |
      | category    | <category>    |
      | discount    | <discount>    |
    Then debería ver la promoción "<name>" creada en la lista

    Examples:
      | email              | password      | name      | start       | end         | description         | category | discount |
      | alice@example.com  | password123   | Promo QA  | 2025-12-21  | 2025-12-22  | Descuento automático| Salud    | 20       |
