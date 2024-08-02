package uz.kh.weather_desktop_app;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherController {
    @FXML private ImageView weatherIcon;
    @FXML private ImageView monIcon;
    @FXML private ImageView tueIcon;
    @FXML private ImageView wedIcon;
    @FXML private ImageView thuIcon;

    public void initialize() {

        weatherIcon.setImage(new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/clear.png")));
        monIcon.setImage(new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/cloudy.png")));
        tueIcon.setImage(new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/location.png")));
        wedIcon.setImage(new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/rain.png")));
        thuIcon.setImage(new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/snow.png")));
    }
}
