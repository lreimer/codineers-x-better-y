package cloud.nativ.flamewars;

public class JavalinWeather {
    public JavalinWeather(final String city, final String weather) {
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
