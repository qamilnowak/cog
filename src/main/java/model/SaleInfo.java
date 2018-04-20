package model;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

public class SaleInfo
{
    private String saleability;

    private String isEbook;


    public List getOffers() {
        return offers;
    }

    public void setOffers(List offers) {
        this.offers = offers;
    }

    @JsonIgnore
    private List offers;
    public ListPrice getListPrice() {
        return listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    private RetailPrice retailPrice;
    private ListPrice listPrice;

    public String getBuyLink() {
        return buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    private String buyLink;


    private String country;

    public String getSaleability ()
    {
        return saleability;
    }

    public void setSaleability (String saleability)
    {
        this.saleability = saleability;
    }

    public String getIsEbook ()
    {
        return isEbook;
    }

    public void setIsEbook (String isEbook)
    {
        this.isEbook = isEbook;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [saleability = "+saleability+", isEbook = "+isEbook+", country = "+country+"]";
    }
}
