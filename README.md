README
SERENITY WEB TRAINING


Para ejecutar por consola, agregar el proyecto como Gradle y ejecutar el siguiente comando en la terminal:
gradle clean test -Dwebdriver.driver=chrome -Denvironment=staging --warning-mode=all


Para ejecutar de manera grafica, dar clic derecho al archivo "CucumberTestSuite1" y run




Install skipping the tests:
mvn install -DskipTests

Run the tests:
GRADLE
gradle clean test -Dwebdriver.driver=firefox -Denvironment=staging
gradle clean test -Dwebdriver.driver=chrome -Denvironment=staging

MAVEN
mvn clean verify -Dwebdriver.driver=chrome -Denvironment=staging



Running by tags

Maven:
mvn verify -Dcucumber.options="--tags '@login or @foo'"
mvn verify -Dcucumber.options="--tags @login"


gradle clean test -Dcucumber.options="--tags '@login or @foo'"
gradle clean test -Dcucumber.options="--tags @login"

CHROME PREFERENCES:

https://johnfergusonsmart.com/configuring-chromedriver-easily-with-serenity-bdd/
https://chromium.googlesource.com/chromium/src/+/master/chrome/common/pref_names.cc
