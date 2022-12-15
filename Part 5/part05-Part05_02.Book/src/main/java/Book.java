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

    private String bookAuthor;
    private String bookTitle;
    private int bookPageCount;

    public Book(String author, String title, int pages) {
        this.bookAuthor = author;
        this.bookTitle = title;
        this.bookPageCount = pages;
    }

    public String getAuthor() {
        return this.bookAuthor;
    }

    public String getName() {
        return this.bookTitle;
    }
    public int getPages() {
        return this.bookPageCount;
    }
    
    public String toString() {
        return (getAuthor() +", " + getName() +", " + getPages() + " pages");
    }
}
