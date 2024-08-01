module uz.kh.weather_desktop_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens uz.kh.weather_desktop_app to javafx.fxml;
    exports uz.kh.weather_desktop_app;
}