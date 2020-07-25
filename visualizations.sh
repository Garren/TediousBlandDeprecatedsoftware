#!/bin/bash

javac -d classes -sourcepath code code/com/oozinoz/visualization/Visualization.java
java -classpath images:libs:classes com.oozinoz.visualization.Visualization