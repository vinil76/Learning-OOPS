import java.util.ArrayList;
import java.util.List;

public class Book {

    public List<String> title;
    public List<String> author;
    private final List<Boolean> isAvailable;

    public Book(){
        this.title = new ArrayList<>();;
        this.author = new ArrayList<>();
        this.isAvailable = new ArrayList<>();
    }

    public Book(List<String> titles, List<String> authors, List<Boolean> isAvailable){
        this.title = titles;
        this.author = authors;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName){
        for(int i = 0;i< title.size();i++){
            if(title.get(i).equals(bookName)){
                if(isAvailable.get(i)){
                    isAvailable.set(i,false);
                }else{
                    System.out.println("Book is not available.");
                }
            }
        }
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                if (isAvailable.get(i)) {
                    isAvailable.set(i, true);
                }
            }
        }
    }

    public void getAvailability(String bookName){
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                System.out.println(isAvailable.get(i));
            }
        }
    }
}
