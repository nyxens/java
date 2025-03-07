package w4_4;
import w4_4.library.books.*;
import w4_4.library.users.*;
public class Main{
    public static void main(String[] args){
    
        User user = new User("Alice","U001");
        Book book1 = new Book("DATA STRUCTURES","JANE SMITH",67890);
        Book book2 = new Book("JAVA PROGRAMMING","JOHN DOE",12345);
        

        user.getDetails();
        System.out.println(book1.getDetails());
        book1.borrowBook();
        System.out.println(book1.getDetails());
        
        System.out.println(book2.getDetails());
        book2.returnBook();
        System.out.println(book2.getDetails());
    }
}