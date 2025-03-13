package com.example.kiosk;

public class Kiosk {

    //속성
    Menu menu = new Menu();

    // 생성자
    public Kiosk() {        // 메뉴 추가

    }

    // 기능

    public void firstGreet() {      // 인사
        System.out.println("--------------------Nov Cafe--------------------");
        System.out.println("----------------------Menu----------------------");
    }


    public void start() {
        firstGreet();
        menu.selectMainMenu();
    }


}
