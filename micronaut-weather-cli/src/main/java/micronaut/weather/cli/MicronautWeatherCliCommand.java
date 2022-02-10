package micronaut.weather.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "micronaut-weather", mixinStandardHelpOptions = true)
public class MicronautWeatherCliCommand implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "Micronaut", description = "Your name.")
    String name;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(MicronautWeatherCliCommand.class, args);
    }

    public void run() {
        System.out.printf("Hello %s\n", name);
    }
}
