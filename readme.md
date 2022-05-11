# Description

This is a demo on different way to package a Java app.

The goal is to check the vulnerable dependency can be found.

# Usage

## Assembly usage

From: https://www.baeldung.com/executable-jar-with-maven

mvn -Passembly clean verify

java -jar target/packaging-demo-0.1-SNAPSHOT-jar-with-dependencies.jar [UserDefinedContent]

## Shade usage

From: https://www.baeldung.com/executable-jar-with-maven

mvn -Pshade clean verify

java -jar target/packaging-demo-0.1-SNAPSHOT-shaded.jar [UserDefinedContent]

## Native usage

Setup GraalVM as per: https://www.graalvm.org/java/quickstart/

mvn -Pnative clean verify

target/packaging-demo [UserDefinedContent]

## SBOM generation

mvn org.cyclonedx:cyclonedx-maven-plugin:2.6.2:makeAggregateBom
