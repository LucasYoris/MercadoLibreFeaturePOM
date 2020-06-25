Feature: Verificar precio
    como usuario quiero poder validar el precio de un articulo

  Scenario: validar precio
    Given el usuario se encuentra en la página home de mercadolibre
    And el usuario ingresa a categoria tvs
    When el usuario filtra por menor precio
    Then Se debe verificar el precio de 22999