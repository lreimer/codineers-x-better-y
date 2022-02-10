package cloud.nativ.flamewars;

import io.micrometer.core.annotation.Timed;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;

import javax.validation.constraints.NotBlank;

@Controller("/api/weather")
public class MicronautWeatherController {

    @Inject
    MicronautWeatherRepository repository;

    @Get(produces = "application/json")
    @Timed(value = "getWeather")
    public HttpResponse<?> getWeather(@QueryValue("city") @NotBlank String city) {
        return HttpResponse.ok(repository.getWeatherForCity(city));
    }
}
