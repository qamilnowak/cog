package model;


import java.util.HashMap;
import java.util.Map;

public class IndustryIdentifiers
{
    private String type;
    private String identifier;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    private int pageCount;

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getIdentifier ()
    {
        return identifier;
    }

    public void setIdentifier (String identifier)
    {
        this.identifier = identifier;
    }

    @Override
    public String toString()
    {
if(type.equals("ISBN_13")) {
    return identifier;
}
        return "1";
    }
}


