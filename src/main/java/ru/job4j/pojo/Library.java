package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Spring 5 Design Patterns", 320);
        Book book2 = new Book("Effective Java", 464);
        Book book3 = new Book("Clean code", 464);
        Book book4 = new Book("The Object-Oriented Thought Process", 256);
        Book bookTMP;
        Book[] books = {book1, book2, book3, book4};
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - number of pages: " + books[index].getNumberOfPages());
        }
        System.out.println();
        System.out.println("Array of books after replace:");
        bookTMP = books[3];
        books[3] = books[0];
        books[0] = bookTMP;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - number of pages: " + books[index].getNumberOfPages());
        }
        System.out.println();
        System.out.println("Array elements with name \"Clean code\":");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - number of pages: " + books[index].getNumberOfPages());
            }
        }
    }
}
