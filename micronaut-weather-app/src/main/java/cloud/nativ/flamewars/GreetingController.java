package cloud.nativ.flamewars;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller("/api/hello")
public class GreetingController {
    @Get(produces = "text/plain")
    public HttpResponse<?> hello(@QueryValue(value = "name", defaultValue = "Micronaut") String name) {
        return HttpResponse.ok("Hello " + name);
    }
}
