package com.example.kiosk;

public class MenuItem {
    // 속성
    private String name;
    private double price;
    private String menuInfo;
    private String categori;

    // 생성자
    public MenuItem(String categori, String name, double price, String menuInfo) {
        this.categori = categori;
        this.name = name;
        this.price = price;
        this.menuInfo = menuInfo;
    }

    // 기능

    public void cafeMenu() {
        System.out.println(categori + "   |   " + name + "   |   " + price + "   |   " + menuInfo);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMenuInfo() {
        return menuInfo;
    }

    public String getCategori() {
        return categori;
    }



}
