package com.vat.gui.shape;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.HashMap;

class ShapeScene {

    private Label testLabel;
    private int fieldCount = 0;

    boolean createWindowAndShow() {
        return this.createWindowAndShow("Test label!", new HashMap<String, String>());
    }

    boolean createWindowAndShow(String text, HashMap<String, String> fields) {
        Stage window = new Stage();
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 30, 10, 30));

        VBox layout = new VBox(10);

        // Reset field count and reset grid
        fieldCount = 0;
        System.out.println(fields);
        layout.getChildren().removeAll(grid);



        for ( HashMap.Entry<String, String> entry : fields.entrySet()) {
            Label fieldLabel = new Label(entry.getValue());
            grid.add(fieldLabel, 0, fieldCount);
            fieldCount++;

            TextField fieldInput = new TextField();
            fieldInput.setPrefWidth(240);
            grid.add(fieldInput, 0, fieldCount);
            fieldCount++;
        }

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("VAT - Vorm aanmaken");
        window.setMinWidth(300);
        window.setMinHeight(350);

        testLabel = new Label();
        testLabel.setText(text);
        Button closeButton = new Button("Annuleren");
        closeButton.setOnAction(e -> window.close());

        Button createButton = new Button("Aanmaken");
        createButton.setOnAction(e -> window.close());

        layout.getChildren().addAll(testLabel, grid, closeButton, createButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return true;
    }
}
