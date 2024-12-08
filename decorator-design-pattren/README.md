1. We have a base object with basis features. If you want to add more features to it use decorator on it to add more functionality to it. 

2. And that decorator itself is also a object we can add up more decorator for the first decorator so they will keep on adding. 

3. Why do we need decorator pattern ? We need it to avoid our class from  class explosion. 

4. Decorator pattern questions can be asked on like design lld for coffee machine, pizza outlet and so on. 

5. Class explosion occurs when you try to achieve a variety of combinations of behaviors using inheritance. For example, let's say you have several types of Car objects with different combinations of features like sunroof, leather seats, GPS, etc. If you create a subclass for every possible combination, you'd end up with a large number of subclasses.


```declarative
//This is wrong way and decorator pattern can fix this 
class Car {
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class SunroofCar extends Car {
    public void drive() {
        super.drive();
        System.out.println("With a sunroof.");
    }
}

class LeatherSeatsCar extends Car {
    public void drive() {
        super.drive();
        System.out.println("With leather seats.");
    }
}

class GPSCar extends Car {
    public void drive() {
        super.drive();
        System.out.println("With GPS.");
    }
}

```

6. How to fix?

^When we write a decorator for a base class. That decorator becomes has-a and is-a both for that base class. Because decorator will extend the base class and will also have the Base class as the member. 
