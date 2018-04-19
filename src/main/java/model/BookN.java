package model;

public class BookN
{
    private SaleInfo saleInfo;

    private String id;

    private String etag;

    private VolumeInfo volumeInfo;

    private String selfLink;

    private AccessInfo accessInfo;

    private String kind;

    public SaleInfo getSaleInfo ()
    {
        return saleInfo;
    }

    public void setSaleInfo (SaleInfo saleInfo)
    {
        this.saleInfo = saleInfo;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEtag ()
    {
        return etag;
    }

    public void setEtag (String etag)
    {
        this.etag = etag;
    }

    public VolumeInfo getVolumeInfo ()
    {
        return volumeInfo;
    }

    public void setVolumeInfo (VolumeInfo volumeInfo)
    {
        this.volumeInfo = volumeInfo;
    }

    public String getSelfLink ()
    {
        return selfLink;
    }

    public void setSelfLink (String selfLink)
    {
        this.selfLink = selfLink;
    }

    public AccessInfo getAccessInfo ()
    {
        return accessInfo;
    }

    public void setAccessInfo (AccessInfo accessInfo)
    {
        this.accessInfo = accessInfo;
    }

    public String getKind ()
    {
        return kind;
    }

    public void setKind (String kind)
    {
        this.kind = kind;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [saleInfo = "+saleInfo+", id = "+id+", etag = "+etag+", volumeInfo = "+volumeInfo+", selfLink = "+selfLink+", accessInfo = "+accessInfo+", kind = "+kind+"]";
    }
}
