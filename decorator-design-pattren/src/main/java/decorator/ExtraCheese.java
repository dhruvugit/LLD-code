package decorator;

import pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    public BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return basePizza.cost() + 10;
    }
}
