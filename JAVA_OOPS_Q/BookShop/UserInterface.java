package BookShop;
import java.util.Scanner;

public class UserInterface {

    public static Book extractDetails(String bookDetails){
        
        String info[] = bookDetails.split(":");
        Book obj = new Book(info[0],info[1],Integer.parseInt(info[2]),Double.parseDouble(info[3]));
        return obj;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book  details");
        String bookDetails = sc.nextLine();
        Book obj = new Book();
        obj = extractDetails(bookDetails);
        if(obj.calculateBookCost() == 0){
            System.out.println("Invalid book details");
        }else{
            System.out.println("Book Details");
            System.out.println("Book Name:"+obj.getBookName());
            System.out.println("Author Name:"+obj.getAuthorName());
            System.out.println("Published Year:"+obj.getPublishedYear());
            System.out.println("Book cost:"+obj.calculateBookCost());
        }
        sc.close();
    }
}
