Feature: US1003 tablo ismi ve field ile listeleme

  Scenario: TC03 Kullanici Tablo ismi ve field ile listeleme yapabilmeli

    Given kullanici DBUtil ile HMC veri tabanina baglanir
    And kullanici DBUtil ile "tHOTEL" tablosundaki "Email" verilerini alir
    And DBUtil ile tum "Email" degerlerini sira numarasi ile yazdirir