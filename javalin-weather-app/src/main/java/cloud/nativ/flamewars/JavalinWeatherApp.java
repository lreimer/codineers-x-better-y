package cloud.nativ.flamewars;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import java.util.Optional;

public class JavalinWeatherApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.defaultContentType = "application/json";
            javalinConfig.enableCorsForAllOrigins();
            javalinConfig.addStaticFiles(staticFileConfig -> {
                staticFileConfig.hostedPath = "/";
                staticFileConfig.directory = "/public";
                staticFileConfig.location = Location.CLASSPATH;
            });
        }).start(8080);

        app.get("/api/hello", ctx -> {
            Optional<String> name = Optional.ofNullable(ctx.queryParam("name"));
            ctx.result("Hello " + name.orElse("Javalin"));
        });

        app.get("/api/weather", JavalinWeatherController.fetchByCity);
    }
}
