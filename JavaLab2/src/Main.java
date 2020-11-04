import java.util.Scanner;
import java.util.Random;

public class Main {
    public static Book[] randomBookArray(int count) {
        Book[] book = new Book[count];
        Random rand = new Random();
        String[] authors = {"William Shakespeare", "Agatha Christie",
                            "J. K. Rowling", "Leo Tolstoy", "Stephen King",
                            "Alexander Pushkin", "Arthur Conan Doyle", "Victor Hugo"};
        String[] names = {"The Lord of the Rings", "The Hobbit",
                            "Harry Potter and the Philosopher's Stone", "Charlotte's Web",
                            "The Tale of Peter Rabbit", "War and Peace", "Anna Karenina"};
        String[] publishers = {"Penguin Random House", "Hachette Livre",
                                "HarperCollins", "Macmillan Publishers",
                                "Simon & Schuster"};
        for(int i = 0; i < count; i++) {
            book[i] = new Book(
                    names[rand.nextInt(names.length)],
                    authors[rand.nextInt(authors.length)],
                    publishers[rand.nextInt(publishers.length)],
                    rand.nextInt(200) + 1800,
                    rand.nextInt(400) + 100,
                    rand.nextInt(200) + 100);
        }
        return book;
    }

    public static void showListOfBookByAuthor(Book[] book, int e) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter author: ");
        String author = scan.nextLine();
        for(int i = 0; i < e; i++)
            if(book[i].getAuthor().equals(author))
                System.out.println(book[i].toString());
    }
    public static void showListOfBookByPublisher(Book[] book, int e) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter publisher: ");
        String publisher = scan.nextLine();
        for(int i = 0; i < e; i++)
            if(book[i].getAuthor().equals(publisher))
                System.out.println(book[i].toString());
    }
    public static void showListOfBookAfterYear(Book[] book, int e) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();
        for(int i = 0; i < e; i++)
            if(book[i].getYear() > year)
                System.out.println(book[i].toString());
    }

    public static void showBooks(Book[] b) {
        for (Book book : b) {
            System.out.println(book.toString());
        }
    }

    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int count = 10;
        Book[] book = randomBookArray(count);
        showBooks(book);
        showListOfBookByAuthor(book, count);
        showListOfBookByPublisher(book, count);
        showListOfBookAfterYear(book, count);
    }
}