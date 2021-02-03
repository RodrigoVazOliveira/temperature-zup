package br.dev.rvz.core;

public class ConvertTemperature {

    private double valueTemperature;

    public ConvertTemperature(double valueTemperature) {
        this.valueTemperature = valueTemperature;
    }

    public double convertFarenheit() {
        return (this.getValueTemperature() * 1.8 + 32);
    }

    public double convertKelvin() {
        return (this.getValueTemperature() + 273.15);
    }

    public double converReaumur() {
        return (this.getValueTemperature() * 0.8);
    }

    public double convertRankine() {
        return (this.getValueTemperature() * 1.8 + 32 + 459.67);
    }

    public double getValueTemperature() {
        return valueTemperature;
    }

    public void setValueTemperature(double valueTemperature) {
        this.valueTemperature = valueTemperature;
    }

    @Override
    public String toString() {
        return "valores convertidos: \n" +
                "valor em Cº " + valueTemperature +
                "\nFareinheit: " + this.convertFarenheit() +
                "\nKelvin: " + this.convertKelvin() +
                "\nReaumur: " + this.converReaumur() +
                "\nRankine: " + this.convertRankine() +
                "\n";
    }
}
