import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import src.CalcGest;

public class CalcInterface extends Application {

    CalcGest calcGest = new CalcGest();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculatrice");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        // Zone d'affichage
        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 0, 4, 1); // occupe 4 colonnes et 1 rangée

        // Boutons
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        // Ajouter les boutons au GridPane
        int index = 0;
        for (int row = 1; row < 5; row++) {
            for (int col = 0; col < 4; col++) {
                Button btn = new Button(buttonLabels[index]);
                btn.setPrefWidth(50);
                btn.setPrefHeight(50);
                grid.add(btn, col, row);

                // Gestionnaire d'événements de base pour les boutons
                btn.setOnAction(event -> {
                    String currentText = userTextField.getText();
                    String buttonText = btn.getText();
                    if (buttonText.equals("C")) {
                        userTextField.setText(""); // Efface la zone de texte
                    } else if (buttonText.equals("=")) {
                        // Utiliser une expression régulière pour extraire les opérandes et l'opérateur
                        String[] tokens = currentText.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
                        if (tokens.length != 3) {
                            userTextField.setText("Erreur de format");
                            return;
                        }

                        int num1;
                        int num2;
                        int choix = 0; // 0 indique un choix invalide
                        try {
                            num1 = Integer.parseInt(tokens[0]);
                            num2 = Integer.parseInt(tokens[2]);
                        } catch (NumberFormatException e) {
                            userTextField.setText("Erreur de nombre");
                            return;
                        }

                        String operator = tokens[1];
                        switch (operator) {
                            case "+":
                                choix = 1;
                                break;
                            case "-":
                                choix = 2;
                                break;
                            case "*":
                                choix = 3;
                                break;
                            case "/":
                                choix = 4;
                                break;
                        }

                        if (choix == 0) {
                            userTextField.setText("Opérateur inconnu");
                        } else {
                            int result = calcGest.effectuerOperation(choix, num1, num2);
                            userTextField.setText(String.valueOf(result));
                        }
                    } else {
                        // Ajoute le texte du bouton à la zone de texte
                        userTextField.setText(currentText + buttonText);
                    }
                });

                index++;
            }
        }

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
