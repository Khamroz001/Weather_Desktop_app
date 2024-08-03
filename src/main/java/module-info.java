module uz.kh.weather_desktop_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires org.json;


    opens uz.kh.weather_desktop_app to javafx.fxml;
    exports uz.kh.weather_desktop_app;
}