package dbStepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;


public class Stepdefinition {

        String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=hotelmycamp ; user=techproed;password=P2s@rt65";

       String username="techproed";
        String password="P2s@rt65";

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        @Given("kullanici HMC veri tabanina baglanir")
        public void kullanici_hmc_veri_tabanina_baglanir() throws SQLException {

connection= DriverManager.getConnection(url,username,password);
statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        }
        @Given("kullanici {string} tablosundaki {string} verilerini alir")
        public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
String readQuery = "SELECT "+ field + " FROM "+ table;
resultSet = statement.executeQuery(readQuery);
        }
        @Given("kullanici {string} sutunundaki verileri okur")
        public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {
            resultSet.first();
            for (int i = 0; i < Integer.MAX_VALUE ; i++) {
            System.out.println(resultSet.getString(field));
            if (resultSet.next()==false) break;
        }
            resultSet.last();
            System.out.println(resultSet.getRow());
        }
}
