# Alfresco logger-authenticator
-------------------------------

##Caution##

This module is only a proof of concept to learn how to include a custom authenticator which logs user login attempt. It's not production ready and it's not provided as a deployable artifact.

Features
--------
Includes a new authenticator `logger` which can be included in authentication chain to capture login attempts. By default it's included in the first position, but you may remove `alfresco-global.properties` from this project before deploying on a real system in order to control your authentication chain in global properties file.

Currently just writes a log on each user login attempt.


Building the artifacts
----------------------
You can build the artifacts from source code using maven
```$ mvn clean package```
