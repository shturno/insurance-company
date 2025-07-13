package com.algaworks.insurance.model;

public class ResidentialProperty extends Property {

    public ResidentialProperty(double marketValue, int builtArea) {
        super(marketValue, builtArea);
    }

    @Override
    public double calculatePremium() {
        return (getMarketValue() * 0.1) + (getBuiltArea() * 0.3);
    }

    @Override
    public String describe() {
        return String.format("""
                --------------------------
                Proposta de seguro
                --------------------------
                Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f
                """, getBuiltArea(),  getMarketValue());
    }
}
