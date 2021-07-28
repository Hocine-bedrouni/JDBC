package com.afpa.exo;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.sql.*;

public class Exo2Controller {


    public ComboBox combobox;
    public TextArea textarea;

    public void choix(ActionEvent actionEvent) throws SQLException {

        try {

            String url = "jdbc:mysql://localhost:3306/papyrus";
            Connection con = DriverManager.getConnection(url, "root", "admin");

//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setContentText("Connexion à la BDD réussi");
//            alert.setTitle("Connexion BDD");
//            alert.showAndWait();

            // création d'un objet requête directe
            PreparedStatement stm = con.prepareStatement("SELECT * FROM papyrus.fournis WHERE numfou=? ");

            // création d'une variable qui référencera l'ensemble des résultats
            stm.setInt(1, Integer.parseInt(codfour.getText()));

            // création d'une variable qui référencera l'ensemble des résultats
            ResultSet res = stm.executeQuery();

    }
}
