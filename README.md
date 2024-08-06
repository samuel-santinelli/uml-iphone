# iPhone MVC Project

This project simulates an iPhone's functionality using the MVC (Model-View-Controller) design pattern. The iPhone can act as a Music Player, Phone, and Web Browser.

## Project Structure

```
src/
|-- model/
|   |-- MediaPlayer.java
|   |-- Phone.java
|   `-- WebBrowser.java
|-- view/
|   `-- iPhoneView.java
|-- controller/
|   `-- iPhoneController.java
`-- main/
    `-- iPhoneApp.java
```

## Description

- **Model**: Defines the data and business logic.
  - `MediaPlayer`: Interface defining music player functionalities.
  - `Phone`: Interface defining phone functionalities.
  - `WebBrowser`: Interface defining web browser functionalities.

- **View**: Responsible for displaying information to the user.
  - `iPhoneView`: Class that displays messages.

- **Controller**: Manages the logic of the application, handling user interactions and updating the Model and View.
  - `iPhoneController`: Implements `MediaPlayer`, `Phone`, and `WebBrowser` interfaces and interacts with `iPhoneView` for displaying messages.

- **Main**: Entry point of the application.
  - `iPhoneApp`: Main class that simulates the iPhone functionalities.

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/iPhoneMVC.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd iPhoneMVC
    ```

3. **Compile the project**:
    ```bash
    javac -d bin src/model/*.java src/view/*.java src/controller/*.java src/main/*.java
    ```

4. **Run the application**:
    ```bash
    java -cp bin main.iPhoneApp
    ```

## Example Output

When you run the application, you should see output similar to the following:

```
Playing music...
Pausing music...
Stopping music...
Calling 123-456-7890...
Ending call...
Opening page www.example.com...
Refreshing page...
Closing page...
This is an iPhone with multiple functionalities.
```

## File Descriptions

1. **model/MediaPlayer.java**
   ```java
   package model;

   public interface MediaPlayer {
       void play();
       void pause();
       void stop();
   }
   ```

2. **model/Phone.java**
   ```java
   package model;

   public interface Phone {
       void makeCall(String number);
       void endCall();
   }
   ```

3. **model/WebBrowser.java**
   ```java
   package model;

   public interface WebBrowser {
       void openPage(String url);
       void refreshPage();
       void closePage();
   }
   ```

4. **view/iPhoneView.java**
   ```java
   package view;

   public class iPhoneView {
       public void displayMessage(String message) {
           System.out.println(message);
       }
   }
   ```

5. **controller/iPhoneController.java**
   ```java
   package controller;

   import model.MediaPlayer;
   import model.Phone;
   import model.WebBrowser;
   import view.iPhoneView;

   public class iPhoneController implements MediaPlayer, Phone, WebBrowser {
       private iPhoneView view;

       public iPhoneController(iPhoneView view) {
           this.view = view;
       }

       // Implementation of MediaPlayer interface methods
       @Override
       public void play() {
           view.displayMessage("Playing music...");
       }

       @Override
       public void pause() {
           view.displayMessage("Pausing music...");
       }

       @Override
       public void stop() {
           view.displayMessage("Stopping music...");
       }

       // Implementation of Phone interface methods
       @Override
       public void makeCall(String number) {
           view.displayMessage("Calling " + number + "...");
       }

       @Override
       public void endCall() {
           view.displayMessage("Ending call...");
       }

       // Implementation of WebBrowser interface methods
       @Override
       public void openPage(String url) {
           view.displayMessage("Opening page " + url + "...");
       }

       @Override
       public void refreshPage() {
           view.displayMessage("Refreshing page...");
       }

       @Override
       public void closePage() {
           view.displayMessage("Closing page...");
       }

       // Additional methods specific to iPhone
       public void showInfo() {
           view.displayMessage("This is an iPhone with multiple functionalities.");
       }
   }
   ```

6. **main/iPhoneApp.java**
   ```java
   package main;

   import view.iPhoneView;
   import controller.iPhoneController;

   public class iPhoneApp {
       public static void main(String[] args) {
           iPhoneView view = new iPhoneView();
           iPhoneController controller = new iPhoneController(view);

           // Using MediaPlayer functionalities
           controller.play();
           controller.pause();
           controller.stop();

           // Using Phone functionalities
           controller.makeCall("123-456-7890");
           controller.endCall();

           // Using WebBrowser functionalities
           controller.openPage("www.example.com");
           controller.refreshPage();
           controller.closePage();

           // Display additional info
           controller.showInfo();
       }
   }
   ```
