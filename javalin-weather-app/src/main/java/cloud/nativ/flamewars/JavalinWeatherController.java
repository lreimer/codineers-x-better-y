package cloud.nativ.flamewars;

import io.javalin.http.Handler;
import io.javalin.http.HttpCode;

import java.util.Optional;

public class JavalinWeatherController {
    public static Handler fetchByCity = ctx -> {
        Optional<String> city = Optional.ofNullable(ctx.queryParam("city"));
        if (city.isEmpty()) {
            ctx.status(HttpCode.BAD_REQUEST);
        } else {
            JavalinWeatherRepository repository = JavalinWeatherRepository.getInstance();
            JavalinWeather weather = repository.getWeatherForCity(city.get());
            ctx.json(weather);
        }
    };
}
