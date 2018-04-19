package model;

public class Pdf
{
    private String acsTokenLink;

    private String isAvailable;

    public String getAcsTokenLink ()
    {
        return acsTokenLink;
    }

    public void setAcsTokenLink (String acsTokenLink)
    {
        this.acsTokenLink = acsTokenLink;
    }

    public String getIsAvailable ()
    {
        return isAvailable;
    }

    public void setIsAvailable (String isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [acsTokenLink = "+acsTokenLink+", isAvailable = "+isAvailable+"]";
    }
}

