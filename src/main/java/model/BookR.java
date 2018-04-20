package model;

import java.util.List;

public class BookR
    {
        private String isbn;
        private String title;
        private String subtitle;
        private String publisher;
        private String publishedDate;
        private String description;
        private String pageCount;
        private String thumbnailUrl;
        private String language;
        private String previewLink;
        private double averageRating;
        private String[] authors;
        private List categories;

        public String[] getAuthors ()
        {
            return authors;
        }

        public void setAuthors (String[] authors)
        {
            this.authors = authors;
        }

        public String getPageCount ()
        {
            return pageCount;
        }

        public void setPageCount (String pageCount)
        {
            this.pageCount = pageCount;
        }

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
        }

        public double getAverageRating ()
        {
            return averageRating;
        }

        public void setAverageRating (double averageRating)
        {
            this.averageRating = averageRating;
        }

        public String getPreviewLink ()
        {
            return previewLink;
        }

        public void setPreviewLink (String previewLink)
        {
            this.previewLink = previewLink;
        }

        public String getDescription ()
        {
            return description;
        }

        public void setDescription (String description)
        {
            this.description = description;
        }

        public String getThumbnailUrl ()
        {
            return thumbnailUrl;
        }

        public void setThumbnailUrl (String thumbnailUrl)
        {
            this.thumbnailUrl = thumbnailUrl;
        }

        public String getIsbn ()
        {
            return isbn;
        }

        public void setIsbn (String isbn)
        {
            this.isbn = isbn;
        }

        public String getSubtitle ()
        {
            return subtitle;
        }

        public void setSubtitle (String subtitle)
        {
            this.subtitle = subtitle;
        }

        public List getCategories ()
        {
            return categories;
        }

        public void setCategories (List categories)
        {
            this.categories = categories;
        }

        public String getLanguage ()
        {
            return language;
        }

        public void setLanguage (String language)
        {
            this.language = language;
        }

        public String getPublishedDate ()
        {
            return publishedDate;
        }

        public void setPublishedDate (String publishedDate)
        {
            this.publishedDate = publishedDate;
        }

        public String getPublisher ()
        {
            return publisher;
        }

        public void setPublisher (String publisher)
        {
            this.publisher = publisher;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [authors = "+authors+", pageCount = "+pageCount+", title = "+title+", averageRating = "+averageRating+", previewLink = "+previewLink+", description = "+description+", thumbnailUrl = "+thumbnailUrl+", isbn = "+isbn+", subtitle = "+subtitle+", categories = "+categories+", language = "+language+", publishedDate = "+publishedDate+", publisher = "+publisher+"]";
        }
    }
