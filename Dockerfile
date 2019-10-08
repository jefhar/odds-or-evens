FROM openjdk:13
COPY ./out/production/us.jeffharris.oddsorevens.OddsOrEvens/ /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "us.jeffharris.oddsorevens.OddsOrEvens"]