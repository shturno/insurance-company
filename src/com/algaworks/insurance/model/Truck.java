package com.algaworks.insurance.model;

public class Truck extends MotorVehicle {

    private int axleCount;

    public Truck(String model, double marketValue, int yearOfManufacture, int axleCount) {
        super(model, marketValue, yearOfManufacture);
        this.axleCount = axleCount;
    }

    public int getAxleCount() {
        return axleCount;
    }

    public void setAxleCount(int axleCount) {
        this.axleCount = axleCount;
    }

    @Override
    public double calculatePremium() {
        return (getMarketValue() * 0.02) + (getAxleCount() * 50);
    }

    @Override
    public String describe() {
        return String.format("""
                --------------------------
                Proposta de seguro
                --------------------------
                Caminhão %s ano %d, %d eixos, avalido em R$%.2f
                """, getModel(), getYearOfManufacture(), getAxleCount(),
                getMarketValue());
    }
}
