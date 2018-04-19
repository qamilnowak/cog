package model;

public class AccessInfo
{
    private String webReaderLink;

    private String textToSpeechPermission;

    private String publicDomain;

    private String viewability;

    private String accessViewStatus;

    private Pdf pdf;

    private Epub epub;

    private String embeddable;

    private String quoteSharingAllowed;

    private String country;

    public String getWebReaderLink ()
    {
        return webReaderLink;
    }

    public void setWebReaderLink (String webReaderLink)
    {
        this.webReaderLink = webReaderLink;
    }

    public String getTextToSpeechPermission ()
    {
        return textToSpeechPermission;
    }

    public void setTextToSpeechPermission (String textToSpeechPermission)
    {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    public String getPublicDomain ()
    {
        return publicDomain;
    }

    public void setPublicDomain (String publicDomain)
    {
        this.publicDomain = publicDomain;
    }

    public String getViewability ()
    {
        return viewability;
    }

    public void setViewability (String viewability)
    {
        this.viewability = viewability;
    }

    public String getAccessViewStatus ()
    {
        return accessViewStatus;
    }

    public void setAccessViewStatus (String accessViewStatus)
    {
        this.accessViewStatus = accessViewStatus;
    }

    public Pdf getPdf ()
    {
        return pdf;
    }

    public void setPdf (Pdf pdf)
    {
        this.pdf = pdf;
    }

    public Epub getEpub ()
    {
        return epub;
    }

    public void setEpub (Epub epub)
    {
        this.epub = epub;
    }

    public String getEmbeddable ()
    {
        return embeddable;
    }

    public void setEmbeddable (String embeddable)
    {
        this.embeddable = embeddable;
    }

    public String getQuoteSharingAllowed ()
    {
        return quoteSharingAllowed;
    }

    public void setQuoteSharingAllowed (String quoteSharingAllowed)
    {
        this.quoteSharingAllowed = quoteSharingAllowed;
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
        return "ClassPojo [webReaderLink = "+webReaderLink+", textToSpeechPermission = "+textToSpeechPermission+", publicDomain = "+publicDomain+", viewability = "+viewability+", accessViewStatus = "+accessViewStatus+", pdf = "+pdf+", epub = "+epub+", embeddable = "+embeddable+", quoteSharingAllowed = "+quoteSharingAllowed+", country = "+country+"]";
    }
}