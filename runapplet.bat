@echo off
setlocal enabledelayedexpansion

REM === Ask for the Java filename ===
set /p javafile=Enter the name of your Java file (e.g., DemoApplet.java): 

REM === Check if the file exists ===
if not exist "!javafile!" (
    echo ❌ File "!javafile!" not found.
    pause
    exit /b
)

REM === Compile the file ===
echo 📦 Compiling %javafile%...
javac "%javafile%"
if errorlevel 1 (
    echo ❌ Compilation failed.
    pause
    exit /b
)

REM === Run appletviewer on the source file directly ===
echo 🚀 Running AppletViewer on %javafile%...
appletviewer "%javafile%"

pause