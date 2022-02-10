# X is better than Y! Or is it?
## The Battle of Java Microservice Frameworks

Demo repository for the Codineers Meetup #1 on modern microservice frameworks.

### Quarkus

```bash
# install the Quarkus CLI
# see https://quarkus.io/get-started/
$ sdk install quarkus

# generate microservice
$ quarkus create app --gradle --java --wrapper --package-name=cloud.nativ.flamewars
$ mv code-with-quarkus quarkus-weather-app

# generate CLI
# see https://speakerdeck.com/lreimer/effizientes-devops-tooling-mit-java-und-graalvm
$ quarkus create cli --gradle --java --wrapper --package-name=cloud.nativ.flamewars
$ mv code-with-quarkus quarkus-weather-cli

$ cd quarkus-weather-app
$ quarkus dev

$ quarkus extension list --installable --category cloud
$ quarkus ext add quarkus-smallrye-health
$ quarkus ext add quarkus-smallrye-fault-tolerance
$ quarkus ext add quarkus-resteasy-jsonb
$ quarkus ext add quarkus-rest-client-jsonb

$ quarkus build
$ quarkus build --native
```

### Micronaut

```bash
# install the Micronaut CLI
# seee https://micronaut-projects.github.io/micronaut-starter/latest/guide/#installation
$ sdk install micronaut
$ mn create-app --build=gradle --lang=java --java-version=11 micronaut-weather-app

$ 
```

### Helidon

```bash
# install the Helidon CLI
# see https://github.com/oracle/helidon/blob/master/HELIDON-CLI.md

$ helidon init --project helidon-weather-app --flavor MP --package cloud.nativ.flamewars --groupid cloud.nativ.flamewars --artifactid helidon-weather-app
$ cd helidon-weather-app
$ helidon dev

$ mvn package
$ mvn package -Pnative-image
```

## Maintainer

M.-Leander Reimer (@lreimer), <mario-leander.reimer@qaware.de>

## License

This software is provided under the MIT open source license, read the `LICENSE`
file for details.
