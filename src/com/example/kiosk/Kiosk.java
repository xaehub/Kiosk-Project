package com.example.kiosk;

public class Kiosk {

    //속성
    private Menu menu = new Menu();     //메뉴 객체 생성

    // 생성자
    public Kiosk() {

    }

    // 기능

    public void firstGreet() {      // 인사
        System.out.println("--------------------Nov Cafe--------------------");
        System.out.println("----------------------Menu----------------------");
    }


    public void start() {           // 키오스크 프로그램 시작 클래스
        firstGreet();
        menu.selectMainMenu();
    }


}
