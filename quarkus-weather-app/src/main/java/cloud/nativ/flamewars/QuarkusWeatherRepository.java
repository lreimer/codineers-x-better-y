package cloud.nativ.flamewars;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class QuarkusWeatherRepository {

    private Map<String, QuarkusWeather> weather = new HashMap<>();

    @Inject
    @ConfigProperty(name = "sleep.bound", defaultValue = "250")
    int sleepBound;

    @PostConstruct
    void initialize() {
        weather.put("Rosenheim", new QuarkusWeather("Rosenheim", "Sunshine"));
        weather.put("London", new QuarkusWeather("London", "Rainy"));
    }

    public QuarkusWeather getWeatherForCity(String city) {
        try {
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextLong(sleepBound));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return weather.getOrDefault(city, new QuarkusWeather(city, "Unknown"));
    }
}
