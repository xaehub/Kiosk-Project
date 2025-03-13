package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //속성
    Scanner sc = new Scanner(System.in);            // 스캐너 생성
    List<MenuItem> allMenu = new ArrayList<>();     // 리스트 생성
    Menu menu = new Menu();

    // 생성자
    public Kiosk() {        // 메뉴 추가

    }

    // 기능

    public void firstGreet() {      // 인사
        System.out.println("--------------------Nov Cafe--------------------");
        System.out.println("----------------------Menu----------------------");
    }

    public void selectMainMenu() {
        menu.showCategories();
        System.out.println("원하시는 메뉴를 선택해 주세요: ");

        int a = sc.nextInt();

        if(a == 1) {
            menu.selectCategori(a);
        } else if(a == 2) {
            menu.selectCategori(a);
        } else if( a == 0){
            System.out.println("키오스크를 종료합니다.");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다: ");
            selectMainMenu();
        }
    }






    public void start() {
        firstGreet();
        selectMainMenu();
    }


}
