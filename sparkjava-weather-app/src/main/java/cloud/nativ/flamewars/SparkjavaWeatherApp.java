package cloud.nativ.flamewars;

import com.google.gson.Gson;

import java.util.Optional;

import static spark.Spark.*;

public class SparkjavaWeatherApp {
    public static void main(String[] args) {
        port(8080);
        staticFileLocation("/public");
        
        get("/api/hello", (req, res) -> "Hello " + req.queryParamOrDefault("name", "Sparkjava"));

        Gson gson = new Gson();
        get("/api/weather", "application/json", (request, response) -> {
            Optional<String> city = Optional.ofNullable(request.queryParams("city"));
            if (city.isEmpty()) {
                halt(400);
            }
            SparkjavaWeatherRepository repository = SparkjavaWeatherRepository.getInstance();
            SparkjavaWeather weather = repository.getWeatherForCity(city.get());

            response.type("application/json");
            return weather;
        }, gson::toJson);
    }
}
