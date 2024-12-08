import decorator.ExtraCheese;
import decorator.Mushroom;
import pizza.BasePizza;
import pizza.VegDelight;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new VegDelight();
        BasePizza cheesePizza = new ExtraCheese(basePizza); //we are able to do this because the parent of ExtraCheeze is ToppingDecorator and parent of ToppingDecorator is BasePizza. Hence, this way our decorator is following is-a and has-a relationship both with the base pizza class.
        BasePizza cheeseWithMushroom = new Mushroom(cheesePizza);

        System.out.println("Price of base pizza : " + basePizza.cost());
        System.out.println("Price of cheeze pizza : " + cheesePizza.cost());
        System.out.println("Price of cheeseWithMushroom pizza : " + cheeseWithMushroom.cost());
    }
}