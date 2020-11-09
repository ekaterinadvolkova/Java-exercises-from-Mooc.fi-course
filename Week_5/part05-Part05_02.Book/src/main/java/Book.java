/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekate
 */
public class Book {
    private String author;
    private String title;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author=author;
        this.title=name;
        this.pages=pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public String toString(){
        if(pages>1){
            return author +", "+title +", "+pages+" pages";
        } else{
            return author +", "+title +", "+pages+" page";
        }
        
    }
    
    
}
