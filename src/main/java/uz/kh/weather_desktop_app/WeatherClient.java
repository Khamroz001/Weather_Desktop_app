package uz.kh.weather_desktop_app;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class WeatherClient {
    private final String apiKey;
    private final OkHttpClient client;

    public WeatherClient(String apiKey) {
        this.apiKey = apiKey;
        this.client = new OkHttpClient();
    }
    public JSONObject getWeatherData(String city) throws IOException {
        String url = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric", city, apiKey);
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            String responseData = response.body().string();
            return new JSONObject(responseData);
        }
    }
}
