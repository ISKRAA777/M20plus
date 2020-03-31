package com.kodilla.kodillapatterns2.M_2002_Decorator.taxiportal;

import java.math.BigDecimal;

public class AbstractTaxiOrderDecorator implements TaxiOrder {

    private final TaxiOrder taxiOrder;

    protected AbstractTaxiOrderDecorator(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiOrder.getDescription();
    }
}
