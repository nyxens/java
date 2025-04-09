@echo off
echo Switching to JDK 23 for current session...
set JAVA_HOME=C:\Program Files\Java\jdk-23
set PATH=%JAVA_HOME%\bin;%PATH%
echo JAVA_HOME set to %JAVA_HOME%
java -version
pause