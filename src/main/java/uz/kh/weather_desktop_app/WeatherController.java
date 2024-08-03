package uz.kh.weather_desktop_app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class WeatherController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text city;

    @FXML
    private Text degree;

    @FXML
    private ImageView humPhoto;

    @FXML
    private Text humidity;

    @FXML
    private ImageView mainPhoto;

    @FXML
    private ImageView prePhoto;

    @FXML
    private Text precipitation;

    @FXML
    private TextField search;

    @FXML
    private Button searchButton;

    @FXML
    private ImageView windPhoto;

    @FXML
    private Text windSpeed;

    @FXML
    void initialize() {
        DropShadow outerShadow = new DropShadow();
        outerShadow.setColor(Color.color(0.2, 0.2, 0.36, 0.25));
        outerShadow.setOffsetX(0);
        outerShadow.setOffsetY(30);
        outerShadow.setRadius(60);
        outerShadow.setSpread(-0.12);
        DropShadow innerShadow = new DropShadow();
        innerShadow.setColor(Color.color(0, 0, 0, 0.3));
        innerShadow.setOffsetX(0);
        innerShadow.setOffsetY(18);
        innerShadow.setRadius(36);
        innerShadow.setSpread(-0.18);
        innerShadow.setInput(outerShadow);
        search.setEffect(innerShadow);


        assert city != null : "fx:id=\"city\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert degree != null : "fx:id=\"degree\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert humPhoto != null : "fx:id=\"humPhoto\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert humidity != null : "fx:id=\"humidity\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert mainPhoto != null : "fx:id=\"mainPhoto\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert prePhoto != null : "fx:id=\"prePhoto\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert precipitation != null : "fx:id=\"precipitation\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert search != null : "fx:id=\"search\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert windPhoto != null : "fx:id=\"windPhoto\" was not injected: check your FXML file 'draft-weather.fxml'.";
        assert windSpeed != null : "fx:id=\"windSpeed\" was not injected: check your FXML file 'draft-weather.fxml'.";

    }

}