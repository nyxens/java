package w4_4.library.books;
public class Book{
    private String title;
    private String author;
    private int ISBN;
    private boolean isBorrowed;
    public Book(String title,String author,int ISBN){
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.isBorrowed = false;
    }        
    public String getTitle(){
            return title;
    }     
    public String getAuthor(){
        return author;
    }
    public int getISBN(){
        return ISBN;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public boolean borrowBook(){
        if(!isBorrowed){
            isBorrowed = true;
            return true;
        }
        return false;
    }
    public boolean returnBook(){
        if(isBorrowed){
            isBorrowed = false;
            return true;
        }
        return false;
    }
    public String getDetails(){
        return "Title: " + title + ", Author: " + author +  ", Borrowed: " + isBorrowed;
    }
}