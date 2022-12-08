/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGurjar
 */
public class Book {
    private String bookTitle;
    private int bookPages;
    private int bookPublicationYear;
    
    public Book(String title, int pages, int year) {
        this.bookTitle = title;
        this.bookPages = pages;
        this.bookPublicationYear = year;
    }
    
    public String getTitle() {
        return this.bookTitle;
    }
    
    public int getPages() {
        return this.bookPages;
    }
    
    public int getPublicationYear() {
        return this.bookPublicationYear;
    }
    
    public String toString() {
        return (this.bookTitle + ", " + this.bookPages + " pages, " + this.bookPublicationYear);
    }
}
