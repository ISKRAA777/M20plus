package com.kodilla.kodillapatterns2.M_2002_Decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.0);
    }

    @Override
    public String getDescription() {
        return "Your ordered pizza";
    }
}
