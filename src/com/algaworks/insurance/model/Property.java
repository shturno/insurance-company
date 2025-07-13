package com.algaworks.insurance.model;

public abstract class Property implements InsurableAsset {

    private double marketValue;
    private int builtArea;

    public Property(double marketValue, int builtArea) {
        this.marketValue = marketValue;
        this.builtArea = builtArea;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public int getBuiltArea() {
        return builtArea;
    }

    public void setBuiltArea(int builtArea) {
        this.builtArea = builtArea;
    }
}
