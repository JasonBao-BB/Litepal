package com.example.boyangbao.litepal;

import org.litepal.crud.DataSupport;

/**
 * Created by boyangbao on 2017/1/21.
 */

public class Book extends DataSupport {
    private int id;
    private String author;
    private double price;
    private int page;
    private String name;

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPage() {
        return page;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }
}
