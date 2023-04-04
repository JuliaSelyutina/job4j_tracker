package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Spring 5 Design Patterns", 320);
        Book book2 = new Book("Effective Java", 464);
        Book book3 = new Book("Clean code", 464);
        Book book4 = new Book("The Object-Oriented Thought Process", 256);
        Book bookTMP;
        Book[] books = {book1, book2, book3, book4};
        for (Book book : books) {
            System.out.println(book.getName() + " - number of pages: " + book.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Array of books after replace:");
        bookTMP = books[3];
        books[3] = books[0];
        books[0] = bookTMP;
        for (Book book : books) {
            System.out.println(book.getName() + " - number of pages: " + book.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Array elements with name \"Clean code\":");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - number of pages: " + book.getNumberOfPages());
            }
        }
    }
}
