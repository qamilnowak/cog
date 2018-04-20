package model;

public class ListPrice
{




    public int getAmountInMicros() {
        return amountInMicros;
    }

    public void setAmountInMicros(int amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    private int amountInMicros;
    private double amount;

    private String currencyCode;

    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setCurrencyCode(String currencyCode){
        this.currencyCode = currencyCode;
    }
    public String getCurrencyCode(){
        return this.currencyCode;
    }
}
