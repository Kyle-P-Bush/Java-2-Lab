javac -cp "lib/*" *.java
java -jar "lib/junit-platform-console-standalone-1.8.0-M1.jar" -cp "." --select-class "$1"