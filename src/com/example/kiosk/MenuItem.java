package com.example.kiosk;

public class MenuItem {
    // 속성
    private String name;
    private double price;
    private String menuInfo;

    // 생성자
    public MenuItem(String name, double price, String menuInfo) {
        this.name = name;
        this.price = price;
        this.menuInfo = menuInfo;
    }

    // 기능

    public void cafeMenu() {
        System.out.println(name + "   |   " + price + "   |   " + menuInfo);
    }



}
