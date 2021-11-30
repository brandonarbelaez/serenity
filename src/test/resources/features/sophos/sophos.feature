Feature: ir a sophos
  @url
  Scenario: Obtener ofertas laborales
    Given Pepito va a la url de sophos
    When obtiene las ofertas laborales
    Then imprime lo que obtuvo