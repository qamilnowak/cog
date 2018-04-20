package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class haloPanieJSON
{

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    private int pageCount;
    private Items[] items;
@JsonIgnore
    private String requestedUrl;

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    public String getRequestedUrl ()
    {
        return requestedUrl;
    }

    public void setRequestedUrl (String requestedUrl)
    {
        this.requestedUrl = requestedUrl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [items = "+items+", requestedUrl = "+requestedUrl+"]";
    }
}

