Feature: US1001 Kullanici database'e baglanip bilgileri okuyabilir
  @wip
  Scenario: TC01 kullanici database'e baglanip istedigi bilgileri okuyabilmeli
    Given kullanici HMC veri tabanina baglanir
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    And kullanici "Price" sutunundaki verileri okur