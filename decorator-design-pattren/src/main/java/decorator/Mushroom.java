package decorator;

import pizza.BasePizza;

public class Mushroom extends ToppingDecorator {
    public BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return basePizza.cost() + 15;
    }

}
