package com.kodilla.kodillapatterns2.M_2002_Decorator.pizza;

import java.math.BigDecimal;

public class DriedTomatoesDecorator extends AbstractPizzaOrderDecorator {
    protected DriedTomatoesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + dried tomatoes";
    }
}
