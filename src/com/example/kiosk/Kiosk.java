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


    public void selectMenu() {      // 메뉴 선택
        System.out.println("원하시는 메뉴를 선택해 주세요: ");

        while(true){
            int a = sc.nextInt();

            if(a == 1) {
                System.out.println("아메리카노");
                System.out.println("추가 선택(종료는 0): ");
            } else if(a == 2) {
                System.out.println("에스프레소");
                System.out.println("추가 선택(종료는 0): ");
            } else if(a == 3) {
                System.out.println("카푸치노");
                System.out.println("추가 선택(종료는 0): ");
            } else if(a == 4) {
                System.out.println("카페모카");
                System.out.println("추가 선택(종료는 0): ");
            } else if(a == 5) {
                System.out.println("바닐라 라떼");
                System.out.println("추가 선택(종료는 0): ");
            } else if(a == 0) {
                System.out.println("키오스크 종료");
                break;

            } else {
                System.out.println("잘못된 번호를 입력하셨습니다.");     // 예외 처리
                System.out.println("추가 선택(종료는 0): ");
            }
        }
    }

    public void start() {
        firstGreet();
        menu.showMenu();
        selectMenu();
    }


}
