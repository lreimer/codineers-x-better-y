package cloud.nativ.flamewars;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class SparkjavaWeatherRepository {
    private static SparkjavaWeatherRepository instance = new SparkjavaWeatherRepository();

    private Map<String, SparkjavaWeather> weather = new HashMap<>();
    private long sleepBound = 250;

    private SparkjavaWeatherRepository() {
        weather.put("Rosenheim", new SparkjavaWeather("Rosenheim", "Sunshine"));
        weather.put("London", new SparkjavaWeather("London", "Rainy"));
    }

    static SparkjavaWeatherRepository getInstance() {
        return instance;
    }

    public SparkjavaWeather getWeatherForCity(String city) {
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextLong(sleepBound));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return weather.getOrDefault(city, new SparkjavaWeather(city, "Unknown"));
    }
}
