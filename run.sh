#!/bin/bash

mvn compile && mvn exec:java -Dexec.mainClass="Main" -Dorg.slf4j.simpleLogger.defaultLogLevel=info
