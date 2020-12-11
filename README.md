## :inbox_tray: Resultados - TSE 2020 
Mobile Automation project based on Java + Appium + Cucumber.

## :ballot_box_with_check: Requirements
* Java 1.8
* Appium
* Cucumber
* Android Emulator

For more information about how to set up the environment to use Appium for functional test automation on mobile devices, plus how to emulate an Android device using Android Studio, please check this awesome documentation https://github.com/clarabez/appium-en from my friend :woman_teacher: [@clarabez][https://github.com/clarabez].

## :triangular_ruler: Project Structure
```bash
src
📦 src
 ┣ 📂 main
 ┃ ┣ 📂 java
 ┃ ┗ 📂 resources
 ┃ ┃ ┣ 📂 apk
 ┃ ┃ ┃ ┗ 📜 Resultados.apk
 ┃ ┃ ┗ 📂 features
 ┃ ┃ ┃ ┗ 📜 Resultados.feature
 ┗ 📂 test
 ┃ ┣ 📂 java
 ┃ ┃ ┣ 📂 manager
 ┃ ┃ ┃ ┗ 📜 AppiumDriverManager.java
 ┃ ┃ ┣ 📂 pages
 ┃ ┃ ┃ ┣ 📜 InitialSetupPage.java
 ┃ ┃ ┃ ┣ 📜 MainPage.java
 ┃ ┃ ┃ ┗ 📜 SearchPage.java
 ┃ ┃ ┣ 📂 runner
 ┃ ┃ ┃ ┗ 📜 CucumberTestRunner.java
 ┃ ┃ ┗ 📂 stepDefinition
 ┃ ┃ ┃ ┣ 📜 Hooks.java
 ┃ ┃ ┃ ┣ 📜 InitialSetupSteps.java
 ┃ ┃ ┃ ┗ 📜 MainSteps.java
 ┃ ┗ 📂 resources
 ┃ ┃ ┗ 📜 cucumber.properties
```
## :rocket: How to run the project?
1. Launch the Android Emulator;
2. Launch the Appium Server;

Then execute the tests according to your preference: 
* via CLI: `./gradlew runFeatures`
* via IDE: right click on `CucumberTestRunner.java` class > and select the option `Run 'CucumberTestRunner'`



[https://github.com/clarabez]: https://github.com/clarabez