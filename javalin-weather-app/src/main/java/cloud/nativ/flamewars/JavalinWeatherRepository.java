package cloud.nativ.flamewars;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class JavalinWeatherRepository {

    private static JavalinWeatherRepository instance = new JavalinWeatherRepository();

    private Map<String, JavalinWeather> weather = new HashMap<>();
    private long sleepBound = 250;

    private JavalinWeatherRepository() {
        weather.put("Rosenheim", new JavalinWeather("Rosenheim", "Sunshine"));
        weather.put("London", new JavalinWeather("London", "Rainy"));
    }

    static JavalinWeatherRepository getInstance() {
        return instance;
    }

    public JavalinWeather getWeatherForCity(String city) {
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextLong(sleepBound));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return weather.getOrDefault(city, new JavalinWeather(city, "Unknown"));
    }
}
