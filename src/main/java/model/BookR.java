package model;

public class BookR
    {
        private String[] authors;

        private int pageCount;

        private String title;

        private String averageRating;

        private String previewLink;

        private String description;

        private String thumbnailUrl;

        private String isbn;

        private String subtitle;

        private String[] categories;

        private String language;

        private String publishedDate;

        private String publisher;

        public String[] getAuthors ()
        {
            return authors;
        }

        public void setAuthors (String[] authors)
        {
            this.authors = authors;
        }

        public int getPageCount ()
        {
            return pageCount;
        }

        public void setPageCount (int pageCount)
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

        public String getAverageRating ()
        {
            return averageRating;
        }

        public void setAverageRating (String averageRating)
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

        public String[] getCategories ()
        {
            return categories;
        }

        public void setCategories (String[] categories)
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
