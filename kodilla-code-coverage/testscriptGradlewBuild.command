#!/bin/bash

cd /Users/khm/IdeaProjects/kodilla-course/kodilla-code-coverage/
rm build/libs/*.jar

/Users/khm/IdeaProjects/kodilla-course/gradlew build

cd build/libs/

test ! -f kodilla-code-coverage-1.0-SNAPSHOT.jar && echo "File does not exist"

test -f kodilla-code-coverage-1.0-SNAPSHOT.jar && mv kodilla-code-coverage-1.0-SNAPSHOT.jar /Users/khm/project/kodilla-code-coverage-1.0-SNAPSHOT.jar

