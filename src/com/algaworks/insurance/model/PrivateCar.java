package com.algaworks.insurance.model;

public class PrivateCar extends MotorVehicle {

    public PrivateCar(String model, double marketValue, int yearOfManufacture) {
        super(model, marketValue, yearOfManufacture);
    }

    @Override
    public double calculatePremium() {
        double premium = getMarketValue() * 0.04;

        if (getYearOfManufacture() < 2000) {
            return premium + (premium * 0.05);
        }

        return premium;
    }

    @Override
    public String describe() {
        return String.format("""
                --------------------------
                Proposta de seguro
                --------------------------
                Carro particular %s ano %d, avaliado em R$%.2f
                """, getModel(), getYearOfManufacture(), getMarketValue());
    }
}
