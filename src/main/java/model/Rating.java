package model;

import java.util.List;

public class Rating
{
    private List author;

    private double averageRating;

    public List getAuthor ()
    {
        return author;
    }

    public void setAuthor (List author)
    {
        this.author = author;
    }

    public double getAverageRating ()
    {
        return averageRating;
    }

    public void setAverageRating (double averageRating)
    {
        this.averageRating = averageRating;
    }

    public String toString1()
    {
        return "author:"+author;
    }
}
