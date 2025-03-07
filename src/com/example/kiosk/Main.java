package com.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("     ----------Nov Cafe----------");
        System.out.println("     ------------Menu------------");
        System.out.println("     ---Coffee---         hot/ice");
        System.out.println("     1.아메리카노           4.5/5.0");
        System.out.println("     2.에스프레소           5.0/5.5");
        System.out.println("     3.카푸치노             5.0/6.0");
        System.out.println("     4.카페모카             5.5/6.0");
        System.out.println("     5.바닐라라떼           5.5/6.0");
        System.out.println("     0.종료                       ");

        System.out.println("원하시는 메뉴를 선택해 주세요: ");

        while(true){
            int a = sc.nextInt();

             if(a == 1) {
                 System.out.println("에스프레소에 뜨거운 물을 희석하여 만든 커피 음료");
                 System.out.println("추가 선택: ");
             } else if(a == 2) {
                 System.out.println("볶은 커피를 가늘게 분쇄한 뒤, 고온의 물을 가해 짧은 시간에 추출한 진한 커피");
                 System.out.println("추가 선택: ");
             } else if(a == 3) {
                 System.out.println("에스프레소를 베이스로 한 우유를 넣은 커피 음료");
                 System.out.println("추가 선택: ");
             } else if(a == 4) {
                 System.out.println("에스프레소, 우유, 초콜릿 시럽을 넣어 만든 커피 음료");
                 System.out.println("추가 선택: ");
             } else if(a == 5) {
                 System.out.println("에스프레소에 우유와 바닐라시럽을 섞어 만든 커피");
                 System.out.println("추가 선택: ");
             } else if(a == 0) {
                 System.out.println("키오스크 종료");
                 break;
             } else {
                 System.out.println("잘못된 번호를 입력하셨습니다.");
                 System.out.println("추가 선택: ");
             }
        }
    }
}
