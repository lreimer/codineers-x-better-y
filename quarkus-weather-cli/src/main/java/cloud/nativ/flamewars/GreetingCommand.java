package cloud.nativ.flamewars;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "quarkus-weather", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "Quarkus", description = "Your name.")
    String name;

    @Override
    public void run() {
        System.out.printf("Hello %s\n", name);
    }

}
