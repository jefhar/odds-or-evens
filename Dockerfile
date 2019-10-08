FROM adoptopenjdk/openjdk13:jdk-13_33-alpine-slim
COPY ./out/production/OddsOrEvens/ /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "us.jeffharris.oddsorevens.OddsOrEvens"]
