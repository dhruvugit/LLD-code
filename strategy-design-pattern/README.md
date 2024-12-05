1. Is-a Relationship: The "is-a" relationship describes inheritance, where a subclass is a specialized version of its superclass.


2. Has-a Relationship: The "has-a" relationship refers to composition, where one class contains an instance of another class as a field, rather than inheriting from it.



Problem Statement (Strategy Design Pattern):
Suppose we have a class Vehicle where there is a method engine(). Now it's sub classes are Sporty Vehicle, Passenger Vehicle and Off-Road Vehicle. Now let say passesnger will tkae default method that is there in Vehicle. Now if let say sporty and offroad override that method but they internally have same requirement so they have same method implementation. So here is the chance of code duplicacy or redundancy. So we will see how to resolve this issue. 


Solution: Our capability was drive method, and our mistake was that we were defining the capability in the base class. So if you have different types of capabilites, make an interface and then make class using that interface (eg; Normal drive, special drive) and then use this Drive interface in the Vehicle class. So it's Vehicle has driv (composition)

So in our vehicle we can have a constructor for our child class where with constructor injection we can mention which drive capability we need. 

`We use this design pattern when there is some new code in child classe which is not there in parent class and those child class have common code to implement.`