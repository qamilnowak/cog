package model;

public class VolumeInfo
{
    private ReadingModes readingModes;

    private String infoLink;

    private String printType;

    private String allowAnonLogging;

    private String publisher;

    private String canonicalVolumeLink;

    private String title;

    private String previewLink;

    private ImageLinks imageLinks;

    private String contentVersion;

    private IndustryIdentifiers[] industryIdentifiers;

    private String language;

    private String maturityRating;

    public ReadingModes getReadingModes ()
    {
        return readingModes;
    }

    public void setReadingModes (ReadingModes readingModes)
    {
        this.readingModes = readingModes;
    }

    public String getInfoLink ()
    {
        return infoLink;
    }

    public void setInfoLink (String infoLink)
    {
        this.infoLink = infoLink;
    }

    public String getPrintType ()
    {
        return printType;
    }

    public void setPrintType (String printType)
    {
        this.printType = printType;
    }

    public String getAllowAnonLogging ()
    {
        return allowAnonLogging;
    }

    public void setAllowAnonLogging (String allowAnonLogging)
    {
        this.allowAnonLogging = allowAnonLogging;
    }

    public String getPublisher ()
    {
        return publisher;
    }

    public void setPublisher (String publisher)
    {
        this.publisher = publisher;
    }

    public String getCanonicalVolumeLink ()
    {
        return canonicalVolumeLink;
    }

    public void setCanonicalVolumeLink (String canonicalVolumeLink)
    {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getPreviewLink ()
    {
        return previewLink;
    }

    public void setPreviewLink (String previewLink)
    {
        this.previewLink = previewLink;
    }

    public ImageLinks getImageLinks ()
    {
        return imageLinks;
    }

    public void setImageLinks (ImageLinks imageLinks)
    {
        this.imageLinks = imageLinks;
    }

    public String getContentVersion ()
    {
        return contentVersion;
    }

    public void setContentVersion (String contentVersion)
    {
        this.contentVersion = contentVersion;
    }

    public IndustryIdentifiers[] getIndustryIdentifiers ()
    {
        return industryIdentifiers;
    }

    public void setIndustryIdentifiers (IndustryIdentifiers[] industryIdentifiers)
    {
        this.industryIdentifiers = industryIdentifiers;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    public String getMaturityRating ()
    {
        return maturityRating;
    }

    public void setMaturityRating (String maturityRating)
    {
        this.maturityRating = maturityRating;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [readingModes = "+readingModes+", infoLink = "+infoLink+", printType = "+printType+", allowAnonLogging = "+allowAnonLogging+", publisher = "+publisher+", canonicalVolumeLink = "+canonicalVolumeLink+", title = "+title+", previewLink = "+previewLink+", imageLinks = "+imageLinks+", contentVersion = "+contentVersion+", industryIdentifiers = "+industryIdentifiers+", language = "+language+", maturityRating = "+maturityRating+"]";
    }
}