package com.my.library.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;

@DatabaseTable(tableName = "BOOKS")
public class Book implements BaseModel{

    public Book(){

    }

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "AUTHOR_ID", foreign = true, foreignAutoRefresh = true, foreignAutoCreate = true,canBeNull = false)
    private Author author;

    @DatabaseField(columnName = "CATEGORY", foreign = true, foreignAutoRefresh = true, foreignAutoCreate = true,canBeNull = false)
    private Category category;

    @DatabaseField(columnName = "TITLE", canBeNull = false)
    private String title;

    @DatabaseField(columnName = "RELEASE_DATE")
    private Date relaseDate;

    @DatabaseField(columnName = "ISBN", width = 1)
    private long isbn;

    @DatabaseField(columnName = "RATING", width = 1)
    private int rating;

    @DatabaseField(columnName = "ADDED_DATE")
    private Date addedDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(Date relaseDate) {
        this.relaseDate = relaseDate;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
}

