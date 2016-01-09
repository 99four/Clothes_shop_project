import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main extends Application {

    Stage window;
    Scene mainScene;
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 350;
    private static List<Clothes> clothes = new ArrayList<Clothes>();

    GridPane layout = new GridPane();

    ChoiceBox<String> clothesChoiceBox = new ChoiceBox<>();
    Button addButton = new Button("Add item");
    Button showCollection = new Button("Show collection");

    //Shirt layout
    ChoiceBox<String> shirtsChoiceBox = new ChoiceBox<>();
    ChoiceBox<Integer> shirtMaterial = new ChoiceBox<Integer>();
    Label shirtMaterialLabel = new Label("Shirt material");
    Label shirtSizeLabel = new Label("TShirt size");
    ChoiceBox<Integer> tshirtSize = new ChoiceBox<Integer>();
    Label collarSizeLabel = new Label("Collar size");
    ChoiceBox<Integer> collarSize = new ChoiceBox<Integer>();
    CheckBox hasTie = new CheckBox("has tie");

    //Jacket layout
    Label seasonTypeLabel = new Label("Season type");
    ChoiceBox<String> seasonType = new ChoiceBox<String>();
    Label claspTypeLabel = new Label("Clasp type");
    ChoiceBox<String> claspType = new ChoiceBox<String>();
    Label jacketSizeLabel = new Label("size");
    ChoiceBox<Integer> jacketSize = new ChoiceBox<Integer>();
    Label jacketMaterialLabel = new Label("material");
    ChoiceBox<String> jacketMaterial = new ChoiceBox<String>();

    //Shoes layout
    Label shoesSizeLabel = new Label("shoes size");
    ChoiceBox<Integer> shoesSize = new ChoiceBox<Integer>();
    CheckBox hasHeel = new CheckBox("has heel");

    //trousers layout
    Label trousersLengthLabel = new Label("trousers length");
    ChoiceBox<Integer> trousersLength = new ChoiceBox<Integer>();
    Label trousersMaterialLabel = new Label("material");
    ChoiceBox<String> trousersMaterial = new ChoiceBox<String>();
    Label waistSizeLabel = new Label("waist size");
    ChoiceBox<Integer> waistSize = new ChoiceBox<Integer>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Zalando");

        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        Pane buttonPane = new Pane();
        buttonPane.setMaxHeight(0);
        buttonPane.setMaxWidth(0);
        buttonPane.setStyle("-fx-background-color: black;");
        addButton.setLayoutX(WINDOW_WIDTH / 2 - 50);
        showCollection.setLayoutX(WINDOW_WIDTH / 2);
        addButton.setLayoutY(WINDOW_HEIGHT / 2);
        showCollection.setLayoutY(WINDOW_HEIGHT / 2 + 50);
        buttonPane.getChildren().add(addButton);
        buttonPane.getChildren().add(showCollection);
        layout.getChildren().addAll(buttonPane);

        //gridpane constraints for shirt
        GridPane.setConstraints(shirtsChoiceBox, 1, 1);
        GridPane.setConstraints(shirtMaterial, 1, 2);
        GridPane.setConstraints(shirtMaterialLabel, 2, 2);
        GridPane.setConstraints(tshirtSize, 1, 3);
        GridPane.setConstraints(shirtSizeLabel, 2, 3);
        GridPane.setConstraints(collarSize, 1, 3);
        GridPane.setConstraints(collarSizeLabel, 2, 3);
        GridPane.setConstraints(hasTie, 1, 4);

        //gridpane constraints for jacket
        GridPane.setConstraints(seasonType, 1, 1);
        GridPane.setConstraints(seasonTypeLabel, 2, 1);
        GridPane.setConstraints(claspType, 1, 2);
        GridPane.setConstraints(claspTypeLabel, 2, 2);
        GridPane.setConstraints(jacketSize, 1, 3);
        GridPane.setConstraints(jacketSizeLabel, 2, 3);
        GridPane.setConstraints(jacketMaterial, 1, 4);
        GridPane.setConstraints(jacketMaterialLabel, 2, 4);

        //gridpane constraints for shoes
        GridPane.setConstraints(shoesSize, 1, 1);
        GridPane.setConstraints(shoesSizeLabel, 2, 1);
        GridPane.setConstraints(hasHeel, 1, 2);

        //gridpane constraints for trousers
        GridPane.setConstraints(trousersLength, 1, 1);
        GridPane.setConstraints(trousersLengthLabel, 2, 1);
        GridPane.setConstraints(trousersMaterial, 1, 2);
        GridPane.setConstraints(trousersMaterialLabel, 2, 2);
        GridPane.setConstraints(waistSize, 1, 3);
        GridPane.setConstraints(waistSizeLabel, 2, 3);

        clothesChoiceBox.getItems().addAll("Shirt", "Jacket", "Shoes", "Trousers");
        shirtsChoiceBox.getItems().addAll("Elegant", "TShirt");

        //default values
        clothesChoiceBox.setValue("Shoes");
        shirtsChoiceBox.setValue("Elegant");

        //only 1 choicebox at start
        layout.getChildren().addAll(clothesChoiceBox);

        //shirt action
        tshirtSize.getItems().addAll(1, 2, 3, 4);

        //jacket action
        seasonType.getItems().addAll("Spring", "Summer", "Autumn", "Winter");
        claspType.getItems().addAll("Suwak", "Guziki");
        jacketSize.getItems().addAll(31, 32, 33, 34, 35, 36, 37, 38);
        jacketMaterial.getItems().addAll("Cotton", "fdsfsd");

        //shoes action
        shoesSize.getItems().addAll(34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46);

        //trousers action
        trousersLength.getItems().addAll(29, 30, 31, 32, 33, 34, 35, 36);
        trousersMaterial.getItems().addAll("Cotton", "fdsfsd");
        waistSize.getItems().addAll(29, 30, 31, 32, 33, 34, 35, 36);

        clothesChoiceBox.setOnAction(e -> {
            switch(getChoice(clothesChoiceBox)){
                case "Shirt":
                    this.removeComponentsFromLayout();
                    layout.getChildren().addAll(shirtsChoiceBox, shirtMaterial, shirtMaterialLabel);
                    break;
                case "Jacket":
                    this.removeComponentsFromLayout();
                    layout.getChildren().addAll(seasonTypeLabel, seasonType,
                            claspTypeLabel, claspType, jacketSizeLabel, jacketSize,
                            jacketMaterialLabel, jacketMaterial);
                    break;
                case "Shoes":
                    this.removeComponentsFromLayout();
                    layout.getChildren().addAll(shoesSizeLabel, shoesSize, hasHeel);
                    break;
                case "Trousers":
                    this.removeComponentsFromLayout();
                    layout.getChildren().addAll(trousersLengthLabel, trousersLength,
                            trousersMaterialLabel, trousersMaterial,
                            waistSizeLabel, waistSize);
                    break;
            }
        });

        shirtsChoiceBox.setOnAction(e -> {
            switch(getChoice(shirtsChoiceBox)){
                case "Elegant":
                    Elegant elegant = new Elegant();
                    this.removeComponentsFromLayout();
                    layout.getChildren().addAll(shirtsChoiceBox, shirtMaterial, shirtMaterialLabel, collarSizeLabel, collarSize, hasTie);
                    break;
                case "TShirt":
                    TShirt tshirt = new TShirt();
                    this.removeComponentsFromLayout();
                    layout.getChildren().addAll(shirtsChoiceBox, shirtMaterial, shirtMaterialLabel, shirtSizeLabel, tshirtSize);
                    break;
            }
        });

        addButton.setOnAction(e1 -> {
            switch(getChoice(clothesChoiceBox)){
                case "Shirt":
                    System.out.println("SHIRT");
                    break;
                case "Jacket":
                    Jacket jacket = new Jacket();
                    switch(seasonType.getValue()){
                        case "Spring":
                            jacket.setSeasonType(Jacket.season.SPRING);
                            break;
                        case "Summer":
                            jacket.setSeasonType(Jacket.season.SUMMER);
                            break;
                        case "Autumn":
                            jacket.setSeasonType(Jacket.season.AUTUMN);
                            break;
                        case "Winter":
                            jacket.setSeasonType(Jacket.season.WINTER);
                            break;
                    }
                    jacket.setClaspType(claspType.getValue());
                    jacket.setSize(jacketSize.getValue());
                    jacket.setMaterial(jacketMaterial.getValue());
                    clothes.add(jacket);
                    break;
                case "Shoes":
                    Shoes shoes = new Shoes();
                    shoes.setSize(shoesSize.getValue());
                    shoes.setHasHeel(hasHeel.isSelected());
                    clothes.add(shoes);
                    break;
                case "Trousers":
                    Trousers trousers = new Trousers();
                    trousers.setLength(trousersLength.getValue());
                    trousers.setMaterial(trousersMaterial.getValue());
                    trousers.setWaistSize(waistSize.getValue());
                    clothes.add(trousers);
                    break;
            }
        });

        showCollection.setOnAction(e -> {
            for(Clothes clothe : clothes){
                System.out.println(clothe.toString());
            }
        });

        mainScene = new Scene(layout, WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setScene(mainScene);
        window.show();
    }

    //To get the value of the selected item
    private String getChoice(ChoiceBox<String> clothesChoiceBox){
        String choice = clothesChoiceBox.getValue();
        return choice;
    }

    private void removeComponentsFromLayout(){
        layout.getChildren().removeAll(shirtsChoiceBox, shirtMaterial, shirtMaterialLabel, shirtSizeLabel, tshirtSize, collarSize, collarSizeLabel, hasTie,
                                       seasonTypeLabel, seasonType, claspTypeLabel, claspType, jacketSizeLabel, jacketSize, jacketMaterialLabel, jacketMaterial,
                                       shoesSizeLabel, shoesSize, hasHeel,
                                       trousersLengthLabel, trousersLength, trousersMaterialLabel, trousersMaterial, waistSizeLabel, waistSize,
                                       showCollection);
    }
}
