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
```

### Micronaut

```bash
# install the Micronaut CLI
# seee https://micronaut-projects.github.io/micronaut-starter/latest/guide/#installation
$ sdk install micronaut

```


### Helidon

```bash
# install the Helidon CLI
# see https://github.com/oracle/helidon/blob/master/HELIDON-CLI.md

```

## Maintainer

M.-Leander Reimer (@lreimer), <mario-leander.reimer@qaware.de>

## License

This software is provided under the MIT open source license, read the `LICENSE`
file for details.
