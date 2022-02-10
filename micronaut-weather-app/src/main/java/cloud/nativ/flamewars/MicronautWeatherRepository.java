package cloud.nativ.flamewars;

import io.micronaut.context.annotation.Value;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Singleton
public class MicronautWeatherRepository {
    private Map<String, MicronautWeather> weather = new HashMap<>();

    @Value("${sleep.bound:250}")
    int sleepBound;

    @PostConstruct
    void initialize() {
        weather.put("Rosenheim", new MicronautWeather("Rosenheim", "Sunshine"));
        weather.put("London", new MicronautWeather("London", "Rainy"));
    }

    public MicronautWeather getWeatherForCity(String city) {
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextLong(sleepBound));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return weather.getOrDefault(city, new MicronautWeather(city, "Unknown"));
    }
}
