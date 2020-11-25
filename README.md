# translation-service
Provides resource bundles of translated text via a rest-ish API

![badge](https://img.shields.io/github/workflow/status/NDPH-ARTS/translation-service/Java%20CI)

The following properties are required:

    -Djdbc.driver=**db driver class name** 
    -Djdbc.url=arts db url 
    -Dserver.port=**http port**

*e.g.*
```-Djdbc.driver=org.postgresql.Driver -Djdbc.url=jdbc:postgresql://localhost:5432/arts?user=postgres&password=pass -Dserver.port=8081```
