import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Shabdanova Ilima", "ilima23@gmail.com", 'j');
        Author author2 = new Author("Zholdoshov Nuradil", "nurik@gmail.com", 'm');
        Author author3 = new Author("Akbaralieva Dasya", "das@gmail.com", 'j');
        Author author4 = new Author("Abdymomunova Saikal", "saikal@gmaail.com", 'j');
        Author author5 = new Author("Mukhammed Toichubai uulu", "mukhammed@gmail.com", 'm');

        Book book1 = new Book("NE NOY", author1, 1499, 200);
        Book book2 = new Book("Samuray bez mecha", author2, 1300, 500);
        Book book3 = new Book("Malenkiy prins", author3, 1500, 600);
        Book book4 = new Book("Magia utra", author4, 999, 300);
        Book book5 = new Book("Uzy pamyti", author5, 1999, 1000);


        Book[] books = {book1, book2, book3, book4, book5};
        Author[] authors = {author1, author2, author3, author4, author5};
        System.out.println("Name: ");
        String name = new Scanner(System.in).nextLine();
            for (Book bk : books) {
                if (Objects.equals(bk.getAuthor().getFullName().toLowerCase(),name.toLowerCase())  ) {
                    System.out.println(bk);
            }
        }
    }
}