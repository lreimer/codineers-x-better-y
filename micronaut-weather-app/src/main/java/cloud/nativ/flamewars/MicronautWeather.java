package cloud.nativ.flamewars;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class MicronautWeather {
    public MicronautWeather(final String city, final String weather) {
        this.city = city;
        this.weather = weather;
    }

    private String city;
    private String weather;

    public String getCity() {
        return city;
    }

    public String getWeather() {
        return weather;
    }
}
