package com.example.bevasarlasapi;

public class ShopList {

    private int id;
    private String name;
    private int count;
    private int price;
    private String category;

    public ShopList(int id, String name, int count, int price, String category) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
