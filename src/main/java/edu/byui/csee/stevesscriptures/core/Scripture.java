/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.csee.stevesscriptures.core;

/**
 *
 * @author sburton
 */
public class Scripture {
    private String book;
    private int chapter;
    private int verse;

    public Scripture() {
        book = "";
        chapter = 0;
        verse = 0;
    }
    
    public Scripture(String book, int chapter, int verse) {
        this.book = book;
        this.chapter = chapter;
        this.verse = verse;
    }

    
    
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getVerse() {
        return verse;
    }

    public void setVerse(int verse) {
        this.verse = verse;
    }
    
    @Override
    public String toString() {
        return book + " " + chapter + ":" + verse;
    }
    
}
