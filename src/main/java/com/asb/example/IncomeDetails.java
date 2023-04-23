package com.asb.example;
public class IncomeDetails {
    private int incomeInRupees;
    private double incomeTaxPercentage;
    private String saySomething;
    public int getIncomeInRupees() {
        return incomeInRupees;
    }
    public void setIncomeInRupees(int incomeInRupees) {
        this.incomeInRupees = incomeInRupees;
    }
    public double getIncomeTaxPercentage() {
        return incomeTaxPercentage;
    }
    public void setIncomeTaxPercentage(double incomeTaxPercentage) {
        this.incomeTaxPercentage = incomeTaxPercentage;
    }

    public String getSaySomething() {
        return saySomething;
    }

    public void setSaySomething(String saySomething) {
        this.saySomething = saySomething;
    }
}