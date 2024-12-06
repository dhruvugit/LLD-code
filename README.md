# LLD Code Repository

This repository contains multiple Java Maven projects related to Low-Level Design (LLD). Each sub-folder represents a separate project or module.

## Projects

- **Project 1**: TDB
- **Project 2**: TDB
- **Project 3**: TDB

Please refer to the individual `README.md` files inside each project folder for more details.


Some basic notes: 

1. Single Responsibility: There should be one and only one reason to change a class, in short just have a one method in your class because keeping multiple methods in that class can cause multiple reasons to change that class.


2. Open Close Principle: It says a class should be open for extension but close for modification. Let you have a writer class where you're writing data to a file, but now you want to write to db as well now you won't create a new method under same class, instead you can have a interface as `write` and have classes for it like `writeToFile` and `writeToDb`. Here in interface mention the method as save and override that method in your both implementing classes. 


3. Liskov Substitution Principle: It says if class B is a subtype of class A, then we should be able to replace the object of A with B, without breaking the behaviour of the program, output can be different but it should not break the code. Subclass should extend the capability of the parent class not narrow it down. Let say you have a class Bird, now you extend this class with class Sparrow and class Penguin. Now Sparrow can have the class fly implemented although it may give different result but it can fly. On the other side if class Pengiun overrides that method then it will either throw exception or give incorrect result which is wrong. So in simple terms don't extend that you can't handle is LSP. 


4. Interface Segmented Principle: Interfaces should be such that the client should not implement the unnecessary function that they don't need. So solution for this is to break your interfaces into small parts this way your sub class should be able to implement those methods and do not need to bother about the other methods which they don't need because we are now mentioning them into other smaller interface. 


5. Dependency Inversion Principle: Class should depend on interface, rather than on concrete class. 
It simply says: 
Do:    `List<Integer> list = new ArrayList<>();`
Don't: `ArrayList<Integer> list = new ArrayList<>();`
