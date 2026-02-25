#  __Boiler Control System (Singleton Pattern)__
A Java-based implementation of a boiler management system using the __Singleton Design Pattern__.
This ensures that only one instance of the boiler exists throughout the application,
preventing state conflicts during the ingredient mixing process.

## Key Features
+ __Thread-Safe Intent__: Uses a private constructor to prevent external instantiation.

+ __State Management__: Tracks the boiler's status using full and resistance flags.

+ __Sequential Logic__: Methods are designed to be called in a specific order (Fill -> Mix -> Empty).

## How to Run
1. Compile the code within the packages `Machinery` and `Test`.

2. Go to the `Main` class in `Test` and run the code.

3. If needed try more combinations within the `Main` class.



