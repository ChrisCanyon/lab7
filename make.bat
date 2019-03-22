@echo off
cls

javac -cp .;queues.jar *.java
java -cp .;queues.jar AdaptableTableDriver

