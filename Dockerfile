FROM openjdk:13
COPY ./out/production/OddsOrEvens/ /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "OddsAndEvens"]