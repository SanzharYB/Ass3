
Adapter Pattern - Audio Player
Bridge Pattern - Remote Control System
Composite Pattern - Menu System
Decorator Pattern - Pizza Ordering System
Facade Pattern - Smart Home System
Flyweight Pattern - Character Rendering in a Text Editor
Proxy Pattern - Online Learning Platform

Pattern Name	Java File	Description
Adapter Pattern	MusicPlayerApp.java	Adds support for WAV and AAC file formats in a music player.
Bridge Pattern	HomeEntertainmentSystem.java	Implements a universal remote control for different devices.
Composite Pattern	RestaurantApp.java	Represents a restaurant menu system with nested sub-menus.
Decorator Pattern	PizzaShop.java	Implements a pizza ordering system with customizable toppings.
Facade Pattern	SmartHomeApp.java	Simplifies control of a smart home system.
Flyweight Pattern	TextEditorApp.java	Optimizes memory usage in a text editor by using flyweight characters.
Proxy Pattern	LearningPlatformApp.java	Lazily loads video lectures for an online learning platform.
Usage
Clone the repository or download the source files.
Open the project in your preferred Java IDE or editor.
Compile and run any of the provided .java files to see the design pattern in action.
Example: Running MusicPlayerApp.java
To run the Adapter Pattern example (MusicPlayerApp.java):

Navigate to the directory containing MusicPlayerApp.java.

Compile the Java file:
javac MusicPlayerApp.java
Run the compiled class:
java MusicPlayerApp
This will demonstrate how the Adapter pattern enables the MusicPlayer to play different audio formats (MP3, WAV, AAC) without changing the core MP3Player.

Design Patterns Overview
1. Adapter Pattern
The Adapter Pattern is used to allow incompatible interfaces to work together. In this case, the MusicPlayerApp supports only MP3 files initially, and we use the Adapter to add support for WAV and AAC files.

2. Bridge Pattern
The Bridge Pattern decouples an abstraction from its implementation, allowing both to vary independently. This pattern is used in HomeEntertainmentSystem to create a flexible remote control system for various devices.

3. Composite Pattern
The Composite Pattern allows you to treat individual objects and compositions of objects uniformly. This is implemented in RestaurantApp to create a hierarchical menu system where both individual menu items and sub-menus can be handled in the same way.

4. Decorator Pattern
The Decorator Pattern allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class. PizzaShop demonstrates this by allowing dynamic pizza topping customizations.

5. Facade Pattern
The Facade Pattern provides a simplified interface to a complex subsystem. In SmartHomeApp, this pattern is used to manage multiple smart home devices through a single SmartHomeFacade.

6. Flyweight Pattern
The Flyweight Pattern is used to minimize memory usage by sharing common data between objects. TextEditorApp uses this pattern to efficiently render a large number of characters in a text editor.

7. Proxy Pattern
The Proxy Pattern is used to control access to an object. In LearningPlatformApp, it is used to load video lectures only when they are accessed for the first time, optimizing resource usage.
