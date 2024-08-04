package uz.kh.weather_desktop_app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import org.json.JSONObject;

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
    private Text feels_like;

    @FXML
    private TextField search;

    @FXML
    private Button searchButton;

    @FXML
    private ImageView windPhoto;

    @FXML
    private Text windSpeed;

    private WeatherImageUtil weatherDisplay;
    private String apiKey = "b9a1329be0239bc6bd9777781de0e241";


    @FXML
    void initialize() {
        shadowEffect();
        weatherDisplay = new WeatherImageUtil(mainPhoto);

        searchButton.setOnAction(actionEvent -> {
            WeatherClient client = new WeatherClient(apiKey);
            try {
                JSONObject weatherData = client.getWeatherData(search.getText());
                city.setText(search.getText());
                int temperature = (int) weatherData.getJSONObject("main").getDouble("temp");
                degree.setText(temperature + "°C");
                int hum = weatherData.getJSONObject("main").getInt("humidity");
                humidity.setText(hum + "%");
                double wind = weatherData.getJSONObject("wind").getDouble("speed");
                windSpeed.setText(wind + "km/h");
                int feels = (int) weatherData.getJSONObject("main").getDouble("feels_like");
                feels_like.setText(feels + "°");

                String weatherDesc = weatherData.getJSONArray("weather").getJSONObject(0).getString("description");
                weatherDisplay.updateWeather(weatherDesc);

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    void shadowEffect (){
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
    }

}