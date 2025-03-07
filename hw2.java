class Library{
    private boolean bookAvailable = false;
    public synchronized void checkOutBook(){
        while(!bookAvailable){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Student checked out the book 📖");
        bookAvailable = false;
        notify(); 
    }
    public synchronized void addBook(){
        while(bookAvailable){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Librarian added a new book 📚");
        bookAvailable = true;
        notify();
    }
}
class Librarian extends Thread{
    private Library library;
    public Librarian(Library library){
        this.library = library;
    }
    public void run(){
        for(int i=0;i<5;i++){ 
            library.addBook();
        }
    }
}
class Student extends Thread{
    private Library library;
    public Student(Library library){
        this.library = library;
    }
    public void run(){
        for (int i=0;i<5;i++){ 
            library.checkOutBook();
        }
    }
}
public class hw2{
    public static void main(String[] args){
        Library library = new Library();
        Librarian librarian = new Librarian(library);
        Student student = new Student(library);
        librarian.start();
        student.start();
    }
}