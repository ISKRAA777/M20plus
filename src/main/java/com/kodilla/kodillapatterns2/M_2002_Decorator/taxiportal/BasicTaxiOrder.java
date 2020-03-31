package com.kodilla.kodillapatterns2.M_2002_Decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.0);
    }

    @Override
    public String getDescription() {
        return "Drive a course";
    }
}