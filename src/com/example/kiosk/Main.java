package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 스캐너 생성
        List<MenuItem> allMenu = new ArrayList<>();     // 리스트 생성

        System.out.println("--------------------Nov Cafe--------------------");
        System.out.println("----------------------Menu----------------------");


        allMenu.add(new MenuItem("1. 아메리카노", 4.5, "에스프레소에 뜨거운 물을 희석하여 만든 커피 음료"));
        allMenu.add(new MenuItem("2. 에스프레소", 5.0, "볶은 커피를 가늘게 분쇄한 뒤, 고온의 물을 가해 짧은 시간에 추출한 진한 커피"));
        allMenu.add(new MenuItem("3. 카푸치노", 5.0, "에스프레소를 베이스로 한 우유를 넣은 커피 음료"));
        allMenu.add(new MenuItem("4. 카페모카", 5.5, "에스프레소, 우유, 초콜릿 시럽을 넣어 만든 커피 음료"));
        allMenu.add(new MenuItem("5. 바닐라 라떼", 5.5, "에스프레소에 우유와 바닐라시럽을 섞어 만든 커피"));

        for(MenuItem cafeMenu : allMenu) {      // for 반복문으로 allMenu에 있는 MenuItem들을 순차적으로 탐색
            cafeMenu.cafeMenu();
        }

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
                 System.out.println("잘못된 번호를 입력하셨습니다.");
                 System.out.println("추가 선택(종료는 0): ");
             }
        }
    }
}
