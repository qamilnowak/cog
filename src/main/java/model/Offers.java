package model;

public class Offers
{
    private int finskyOfferType;

    private ListPrice listPrice;

    private RetailPrice retailPrice;

    public void setFinskyOfferType(int finskyOfferType){
        this.finskyOfferType = finskyOfferType;
    }
    public int getFinskyOfferType(){
        return this.finskyOfferType;
    }
    public void setListPrice(ListPrice listPrice){
        this.listPrice = listPrice;
    }
    public ListPrice getListPrice(){
        return this.listPrice;
    }
    public void setRetailPrice(RetailPrice retailPrice){
        this.retailPrice = retailPrice;
    }
    public RetailPrice getRetailPrice(){
        return this.retailPrice;
    }
}