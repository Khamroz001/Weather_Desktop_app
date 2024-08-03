package uz.kh.weather_desktop_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class WeatherApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/uz/kh/weather_desktop_app/weather_app.fxml"));
        primaryStage.setTitle("Weather Application");
        Image logo = new Image(getClass().getResourceAsStream("/uz/kh/weather_desktop_app/logo.png"));
        primaryStage.getIcons().add(logo);
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}