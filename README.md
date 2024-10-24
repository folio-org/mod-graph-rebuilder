# mod-graph-rebuilder
© 2024 EBSCO Information Services.

This software is distributed under the terms of the Apache License, Version 2.0.
See the file "[LICENSE](LICENSE)" for more information.

## Introduction
mod-graph-rebuilder works with mod-linked-date.
Further description to be added.

## Compiling
```bash
mvn clean install
```
Skip tests:
```bash
mvn clean install -DskipTests
```

## Environment Variables
| Name                                 | Default Value | Description                                                                                                                                                |
|--------------------------------------|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| DB_HOST                              | localhost     | Postgres hostname                                                                                                                                          |
| DB_PORT                              | 5432          | Postgres port                                                                                                                                              |
| DB_USERNAME                          | postgres      | Postgres username                                                                                                                                          |
| DB_PASSWORD                          | postgres      | Postgres password                                                                                                                                          |
| DB_DATABASE                          | postgres      | Postgres database name                                                                                                                                     |
| server.port                          | 8081          | Server port                                                                                                                                                |
| spring.profiles.active               | -             | Indicates if the application has to be run in FOLIO mode or standalone mode                                                                                |
| KAFKA_HOST `*`                       | kafka         | Kafka broker hostname                                                                                                                                      |
| KAFKA_PORT `*`                       | 9092          | Kafka broker port                                                                                                                                          |
| KAFKA_SECURITY_PROTOCOL `*`          | PLAINTEXT     | Kafka security protocol used to communicate with brokers (SSL or PLAINTEXT)                                                                                |
| KAFKA_SSL_KEYSTORE_LOCATION `*`      | -             | The location of the Kafka key store file. This is optional for client and can be used for two-way authentication for client.                               |
| KAFKA_SSL_KEYSTORE_PASSWORD `*`      | -             | The store password for the Kafka key store file. This is optional for client and only needed if 'ssl.keystore.location' is configured.                     |
| KAFKA_SSL_TRUSTSTORE_LOCATION `*`    | -             | The location of the Kafka trust store file.                                                                                                                |
| KAFKA_SSL_TRUSTSTORE_PASSWORD `*`    | -             | The password for the Kafka trust store file. If a password is not set, trust store file configured will still be used, but integrity checking is disabled. |
| KAFKA_CONSUMER_MAX_POLL_RECORDS `*`  | 200           | Maximum number of records returned in a single call to poll().                                                                                             |
