package org.example.ssu.advancedjavaprogramming;

import java.util.ArrayList;
import java.util.List;

public class BookInfo {
    int number;
    String name;
    String publisher;
    int price;

    public BookInfo(int number, String name, String publisher, int price) {
        if(number < 1) throw new IllegalArgumentException("The number must be greater than or equal to 1.");
        if(name.isEmpty()) throw new IllegalArgumentException("The name cannot be blank.");
        if(publisher.isEmpty()) throw new IllegalArgumentException("The publisher cannot be blank.");
        if(price < 0) throw new IllegalArgumentException("The number must be greater than or equal to 0.");

        this.number = number;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number < 1) throw new IllegalArgumentException("The number must be greater than or equal to 1.");
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException("The name cannot be blank.");
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if(publisher.isEmpty()) throw new IllegalArgumentException("The publisher cannot be blank.");
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 0) throw new IllegalArgumentException("The number must be greater than or equal to 0.");
        this.price = price;
    }

    public static List<BookInfo> getInitialBookList(){
        ArrayList<BookInfo> bookList = new ArrayList<>();
        bookList.add(new BookInfo(1, "축구의 역사", "굿스포츠", 7000));
        bookList.add(new BookInfo(2, "축구 아는 여자", "나무수", 13000));
        bookList.add(new BookInfo(3, "축구의 이해", "대한미디어", 22000));
        bookList.add(new BookInfo(4, "골프 바이블", "대한미디어", 35000));
        bookList.add(new BookInfo(5, "피겨 교본", "굿스포츠", 8000));
        return bookList;
    }

}
