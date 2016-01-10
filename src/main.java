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

    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 500;
    private static final String[] materialArray = {"Jeans", "Corduroy", "Cotton", "Jacquard", "Flax"};
    private static final Integer[] lengthArray = {28, 29, 30, 31, 32, 33, 34, 35, 36};
    private static final Integer[] shoesAndCollarSizeArray = {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47};
    private static List<Clothes> clothes = new ArrayList<Clothes>();

    Stage window;
    Scene mainScene;

    GridPane layout = new GridPane();

    ChoiceBox<String> clothesChoiceBox = new ChoiceBox<>();
    Button addButton = new Button("Add item");
    Button showCollection = new Button("Show collection");

    //Clothes layout
    ChoiceBox<String> name = new ChoiceBox<String>();
    Label nameLabel = new Label("name");
    ChoiceBox<String> color = new ChoiceBox<String>();
    Label colorLabel = new Label("color");
    ChoiceBox<String> brand = new ChoiceBox<String>();
    Label brandLabel = new Label("brand");
    ChoiceBox<Double> price = new ChoiceBox<Double>();
    Label priceLabel = new Label("price");
    ChoiceBox<String> gender = new ChoiceBox<String>();
    Label genderLabel = new Label("gender");
    ChoiceBox<String> photo = new ChoiceBox<String>();
    Label photoLabel = new Label("photo");

    //Shirt layout
    ChoiceBox<String> shirtsChoiceBox = new ChoiceBox<>();
    ChoiceBox<String> shirtMaterial = new ChoiceBox<String>();
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
        buttonPane.setStyle("-fx-background-color: greenyellow;");
        addButton.setLayoutX(WINDOW_WIDTH / 2 - 50);
        showCollection.setLayoutX(WINDOW_WIDTH / 2);
        addButton.setLayoutY(WINDOW_HEIGHT / 2);
        showCollection.setLayoutY(WINDOW_HEIGHT / 2 + 50);
        buttonPane.getChildren().add(addButton);
        buttonPane.getChildren().add(showCollection);
        layout.getChildren().addAll(buttonPane);

        int i = 0;
        int j = 0;
        //gridpane constraints for clothes
        GridPane.setConstraints(name, i + 1, j + 2);
        GridPane.setConstraints(nameLabel, i + 2, j + 2);
        GridPane.setConstraints(color, i + 1, j + 3);
        GridPane.setConstraints(colorLabel, i + 2, j + 3);
        GridPane.setConstraints(brand, i + 1, j + 4);
        GridPane.setConstraints(brandLabel, i + 2, j + 4);
        GridPane.setConstraints(price, i + 1, j + 5);
        GridPane.setConstraints(priceLabel, i + 2, j + 5);
        GridPane.setConstraints(gender, i + 1, j + 6);
        GridPane.setConstraints(genderLabel, i + 2, j + 6);
        GridPane.setConstraints(photo, i + 1, j + 7);
        GridPane.setConstraints(photoLabel, i + 2, j + 7);

        //gridpane constraints for shirt
        GridPane.setConstraints(shirtsChoiceBox, i + 5, j + 2);
        GridPane.setConstraints(shirtMaterial, i + 5, j + 3);
        GridPane.setConstraints(shirtMaterialLabel, i + 6, j + 3);
        GridPane.setConstraints(tshirtSize, i + 5, j + 4);
        GridPane.setConstraints(shirtSizeLabel, i + 6, j + 4);
        GridPane.setConstraints(collarSize, i + 5, j + 4);
        GridPane.setConstraints(collarSizeLabel, i + 6, j + 5);
        GridPane.setConstraints(hasTie, i + 5, j + 5);

        //gridpane constraints for jacket
        GridPane.setConstraints(seasonType, i + 5, j + 2);
        GridPane.setConstraints(seasonTypeLabel, i + 6, j + 2);
        GridPane.setConstraints(claspType, i + 5, j + 3);
        GridPane.setConstraints(claspTypeLabel, i + 6, j + 3);
        GridPane.setConstraints(jacketSize, i + 5, j + 4);
        GridPane.setConstraints(jacketSizeLabel, i + 6, j + 4);
        GridPane.setConstraints(jacketMaterial, i + 5, j + 5);
        GridPane.setConstraints(jacketMaterialLabel, i + 6, j + 5);

        //gridpane constraints for shoes
        GridPane.setConstraints(shoesSize, i + 5, j + 2);
        GridPane.setConstraints(shoesSizeLabel, i + 6, j + 2);
        GridPane.setConstraints(hasHeel, i + 5, j + 3);

        //gridpane constraints for trousers
        GridPane.setConstraints(trousersLength, i + 5, j + 2);
        GridPane.setConstraints(trousersLengthLabel, i + 6, j + 2);
        GridPane.setConstraints(trousersMaterial, i + 5, j + 3);
        GridPane.setConstraints(trousersMaterialLabel, i + 6, j + 3);
        GridPane.setConstraints(waistSize, i + 5, j + 4);
        GridPane.setConstraints(waistSizeLabel, i + 6, j + 4);

        clothesChoiceBox.getItems().addAll("Shirt", "Jacket", "Shoes", "Trousers");
        shirtsChoiceBox.getItems().addAll("Elegant", "TShirt");

        //default values
        clothesChoiceBox.setValue("Shoes");
        shirtsChoiceBox.setValue("Elegant");

        layout.getChildren().addAll(clothesChoiceBox);
        layout.getChildren().addAll(name);
        layout.getChildren().addAll(nameLabel);
        layout.getChildren().addAll(color);
        layout.getChildren().addAll(colorLabel);
        layout.getChildren().addAll(brand);
        layout.getChildren().addAll(brandLabel);
        layout.getChildren().addAll(price);
        layout.getChildren().addAll(priceLabel);
        layout.getChildren().addAll(gender);
        layout.getChildren().addAll(genderLabel);
        layout.getChildren().addAll(photo);
        layout.getChildren().addAll(photoLabel);

        //shirt action
        tshirtSize.getItems().addAll(lengthArray);
        shirtMaterial.getItems().addAll(materialArray);
        collarSize.getItems().addAll(shoesAndCollarSizeArray);

        //jacket action
        seasonType.getItems().addAll("Spring", "Summer", "Autumn", "Winter");
        claspType.getItems().addAll("Buttons", "Snap fastener", "Zipper", "Velcro");
        jacketSize.getItems().addAll(lengthArray);
        jacketMaterial.getItems().addAll(materialArray);

        //shoes action
        shoesSize.getItems().addAll(shoesAndCollarSizeArray);

        //trousers action
        trousersLength.getItems().addAll(lengthArray);
        trousersMaterial.getItems().addAll(materialArray);
        waistSize.getItems().addAll(lengthArray);

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
                    switch(shirtsChoiceBox.getValue()){
                        case "Elegant":
                            Elegant elegant = new Elegant();
                            elegant.setMaterial(shirtMaterial.getValue());
                            elegant.setCollarSize(collarSize.getValue());
                            elegant.setHasTie(hasTie.isSelected());
                            clothes.add(elegant);
                            break;
                        case "TShirt":
                            TShirt tShirt = new TShirt();
                            tShirt.setMaterial(shirtMaterial.getValue());
                            tShirt.setSize(TShirt.sizeType.M);
                            clothes.add(tShirt);
                            break;
                    }
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
