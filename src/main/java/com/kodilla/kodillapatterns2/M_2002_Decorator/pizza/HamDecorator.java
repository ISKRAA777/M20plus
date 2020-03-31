package com.kodilla.kodillapatterns2.M_2002_Decorator.pizza;

import java.math.BigDecimal;

public class HamDecorator extends AbstractPizzaOrderDecorator {
    protected HamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ham";
    }
}
