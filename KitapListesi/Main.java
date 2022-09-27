package KitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Çalıkuşu", 541, "Reşat Nuri Güntekin", 1922));
        bookList.add(new Book("Beyaz Zambaklar Ülkesinde", 248, " Grigoriy Petrov", 1923));
        bookList.add(new Book("Aylak Adam", 192, "Yusuf Atilgan", 1959));
        bookList.add(new Book("Bu Ulke", 339, "Cemil Meric", 1975));
        bookList.add(new Book("Sol Ayağım", 89, "Christy Brown", 1985));
        bookList.add(new Book("Dönüşüm", 160, "Franz Kafka", 1940));
        bookList.add(new Book("Siyah İnci", 150, "Anna Sewell", 2014));
        bookList.add(new Book("Yılkı Atı", 95, "Peyami Safa", 1977));
        bookList.add(new Book("Ateş ve Kan", 800, "George R. R. Martin", 2020));
        bookList.add(new Book("Momo", 119, "Ende", 1980));


        Map<String,String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(),book.getAuthor()));

        for (String i: bookMap.keySet()){
            System.out.println("Kitap adi: "+i+" ||  Yazar adi: "+ bookMap.get(i));
        }
        System.out.println("---------------------------------------------");


        List<Book> listB = bookList.stream().filter(book -> book.getPageNo() > 100).collect(Collectors.toList());
        listB.stream().forEach(b -> System.out.println("Kitap adi: "+ b.getName()));



    }

}
