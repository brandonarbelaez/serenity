#@stories
Feature: ir a sophos
  @url
  Scenario: Obtener ofertas laborales
    Given Pepito va a la url de sophos y busca java
    When obtiene las ofertas laborales
    Then imprime lo que obtuvo

