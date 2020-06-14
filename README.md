# Design Patterns in Java
* Once we create a class, it is known as a blueprint. We create an instance of a class which are known as objects. *
* They are composed of fields which are what an object can comprehend and these are the instance variables *
* The functionality of a class are what we call methods. These are all the functions that an object can do. *
* We will create a super class of an Animal(CLASS)
* The Animal Super Class will have the following charateristics
    - a name Field which returns a Strings
    - a height Field which returns a double
    - a weight Field whih returns an int
    - a favoriteFood Field which returns a String
    - a speed Field which returns a double
    * Animal() method: void
    * move(int) method: void
    * eat() method: void
    * setName(String) method: void
    * getName() method: String
* The two derived classes will be Bird and Dog
* The Bird subclass will have a void method of move which takes an int as an argument
* The Dog subclass will have a void method of digHole which doesn't take any arguments.
* Using OOP we will find the similarities between Dog and Bird and we will abstract out their features into the Super Class
