@echo off
echo Switching to JDK 8 for current session...
set JAVA_HOME=C:\Program Files\Java\jdk8u442-b06
set PATH=%JAVA_HOME%\bin;%PATH%
echo JAVA_HOME set to %JAVA_HOME%
java -version
pause