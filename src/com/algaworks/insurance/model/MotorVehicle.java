package com.algaworks.insurance.model;

public abstract class MotorVehicle implements InsurableAsset {

    private String model;
    private double marketValue;
    private int yearOfManufacture;

    public MotorVehicle(String model, double marketValue, int yearOfManufacture) {
        this.model = model;
        this.marketValue = marketValue;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
