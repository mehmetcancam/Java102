package BookList;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new OrderName());
        TreeSet<Book> books1 = new TreeSet<>(new OrderPage());

        books.add(new Book("Savas Sanati",84,"Sun Tzu",1300));
        books.add(new Book("Irade Terbiyesi",310,"Jules Payot",1754));
        books.add(new Book("Yuzuklerin Efendisi",546,"J.R.R Tolkien",1934));
        books.add(new Book("Harry Potter",453,"J.K Rowling",2001));
        books.add(new Book("Dune",678,"Frank Herbert",1965));

        books1.add(new Book("Savas Sanati",84,"Sun Tzu",1300));
        books1.add(new Book("Irade Terbiyesi",310,"Jules Payot",1754));
        books1.add(new Book("Yuzuklerin Efendisi",546,"J.R.R Tolkien",1934));
        books1.add(new Book("Harry Potter",453,"J.K Rowling",2001));
        books1.add(new Book("Dune",678,"Frank Herbert",1965));



        for (Book bks: books){
            System.out.println(bks.getName());
       }
        System.out.println("---------------");
        for (Book bks1: books1){
            System.out.println(bks1.getName());
        }





    }
}
