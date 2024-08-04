package uz.kh.weather_desktop_app;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherImageUtil {
    private ImageView imageView;
    private Image clearSkyImage;
    private Image scatteredCloudsImage;
    private Image overcastCloudsImage;
    private Image showerRainImage;
    private Image rainImage;
    private Image thunderstormImage;
    private Image snowImage;
    private Image mistImage;
    private Image noImage;

    public WeatherImageUtil(ImageView imageView) {
        this.imageView = imageView;
        clearSkyImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/sunny.png"));
        scatteredCloudsImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/scatteredClouds.png"));
        overcastCloudsImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/overcastClouds.png"));
        showerRainImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/showerRain.png"));
        rainImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/rain-weather.png"));
        thunderstormImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/thunderstorm.png"));
        snowImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/snow.png"));
        mistImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/mist.png"));
        noImage = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/icons/no_image.png"));

    }

    public void updateWeather(String condition) {
        switch (condition.toLowerCase()) {
            case "clear sky", "few clouds" ->
                imageView.setImage(clearSkyImage);
            case "broken clouds", "scattered clouds" ->
                    imageView.setImage(scatteredCloudsImage);
            case "overcast clouds" ->
                    imageView.setImage(overcastCloudsImage);
            case "shower rain", "light rain" ->
                    imageView.setImage(showerRainImage);
            case "rain" ->
                    imageView.setImage(rainImage);
            case "thunderstorm" ->
                    imageView.setImage(thunderstormImage);
            case "snow" ->
                    imageView.setImage(snowImage);
            case "mist" ->
                    imageView.setImage(mistImage);
            default ->
                    imageView.setImage(noImage);
        }
    }
}
