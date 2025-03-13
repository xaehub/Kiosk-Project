package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<MenuItem> allMenu = new ArrayList<>();     // 리스트 생성
    Scanner sc = new Scanner(System.in);

    public Menu() {
        allMenu.add(new MenuItem("커피","1. 아메리카노", 4.5, "에스프레소에 뜨거운 물을 희석하여 만든 커피 음료"));
        allMenu.add(new MenuItem("커피","2. 에스프레소", 5.0, "볶은 커피를 가늘게 분쇄한 뒤, 고온의 물을 가해 짧은 시간에 추출한 진한 커피"));
        allMenu.add(new MenuItem("커피","3. 카푸치노", 5.0, "에스프레소를 베이스로 한 우유를 넣은 커피 음료"));
        allMenu.add(new MenuItem("커피","4. 카페모카", 5.5, "에스프레소, 우유, 초콜릿 시럽을 넣어 만든 커피 음료"));
        allMenu.add(new MenuItem("커피","5. 바닐라 라떼", 5.5, "에스프레소에 우유와 바닐라시럽을 섞어 만든 커피"));

        allMenu.add(new MenuItem("디저트", "6. 초코 케이크", 7.0, "촉촉하고 부드러운 초코 시트와 버터크림이 어우러져 달콤하면서 진한 벨벳 케이크 느낌"));
        allMenu.add(new MenuItem("디저트", "7. 치즈 케이크", 7.0, "한 입 베어 무는 순간, 깊고 진한 크림치즈의 풍미가 입안 가득 퍼집니다"));
    }



    public void showCategories() {
        System.out.println("1. 커피");
        System.out.println("2. 디저트");
        System.out.println("0. 종료");
    }

    public void selectMainMenu() {
        showCategories();
        System.out.println("원하시는 메뉴를 선택해 주세요: ");

        int a = sc.nextInt();

        if(a == 1) {
            selectCategori(a);
        } else if(a == 2) {
            selectCategori(a);
        } else if( a == 0){
            System.out.println("키오스크를 종료합니다.");
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다: ");
            selectMainMenu();
        }
    }

    public void selectCoffeeMenu() {      // 메뉴 선택
        System.out.println("원하시는 메뉴를 선택해 주세요: ");

        while(true){
            int a = sc.nextInt();

            if(a == 1) {
                System.out.println("아메리카노");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 2) {
                System.out.println("에스프레소");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 3) {
                System.out.println("카푸치노");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 4) {
                System.out.println("카페모카");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 5) {
                System.out.println("바닐라 라떼");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 0) {
                System.out.println("추가 선택(뒤로가기는 0)");
                break;

            } else {
                System.out.println("잘못된 번호를 입력하셨습니다.");     // 예외 처리
                System.out.println("추가 선택(종료는 0): ");
            }
        }
    }

    public void selectDesertMenu() {      // 메뉴 선택
        System.out.println("원하시는 메뉴를 선택해 주세요: ");

        while(true){
            int a = sc.nextInt();

            if(a == 6) {
                System.out.println("초코 케이크");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 7) {
                System.out.println("치즈 케이크");
                System.out.println("추가 선택(뒤로가기는 0): ");
            } else if(a == 0) {
                System.out.println("추가 선택(뒤로가기는 0)");
                break;

            } else {
                System.out.println("잘못된 번호를 입력하셨습니다.");     // 예외 처리
                System.out.println("추가 선택(종료는 0): ");
            }
        }
    }


    public void selectCategori(int a) {
        if (a == 1) {
            System.out.println("[----------- 커피 메뉴 -----------");
            for (MenuItem item : allMenu) {
                if (item.getCategori().equals("커피")) {
                    System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getMenuInfo());
                }
            }
            selectCoffeeMenu();
        } else if (a == 2) {
            System.out.println("---------- 디저트 메뉴 -----------");
            for (MenuItem item : allMenu) {
                if (item.getCategori().equals("디저트")) {
                    System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getMenuInfo());
                }
            }
            selectDesertMenu();
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해주세요: ");
        }

        selectMainMenu();

    }


}
