import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {

    // Replace "YOUR_API_KEY" with your actual OpenWeatherMap API key
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the city name: ");
            String cityName = reader.readLine();

            String apiUrl = String.format(API_URL, cityName, API_KEY);

            String jsonResponse = getWeatherData(apiUrl);

            if (jsonResponse != null) {
                displayWeatherInfo(jsonResponse);
            } else {
                System.out.println("Failed to fetch weather data. Please check your input and API key.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getWeatherData(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            return response.toString();
        } else {
            return null;
        }
    }

    private static void displayWeatherInfo(String jsonResponse) {
        JSONObject jsonObject = new JSONObject(jsonResponse);

        if (jsonObject.has("main") && jsonObject.has("weather")) {
            JSONObject main = jsonObject.getJSONObject("main");
            JSONArray weatherArray = jsonObject.getJSONArray("weather");

            double temperature = main.getDouble("temp");
            String description = weatherArray.getJSONObject(0).getString("description");

            System.out.println("\nWeather Information for " + jsonObject.getString("name") + ":");
            System.out.println("Temperature: " + temperature + " K");
            System.out.println("Description: " + description);
        } else {
            System.out.println("Invalid response format. Please check your input and API key.");
        }
    }
}
