package com.kodilla.kodillapatterns2.M_2002_Decorator.taxiportal;

import java.math.BigDecimal;

public class VipDecorator extends AbstractTaxiOrderDecorator {
    protected VipDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " variant VIP";
    }
}
