package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> allMenu = new ArrayList<>();     // 리스트 생성
    List<String> categories = new ArrayList<>();

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
        System.out.println("1. Coffee");
        System.out.println("2. Desserts");
        System.out.println("0. 종료");
    }

    public void showMenu() {        // 메뉴 보여주기
        for(MenuItem cafeMenu : allMenu) {      // for 반복문으로 allMenu에 있는 MenuItem들을 순차적으로 탐색
            cafeMenu.cafeMenu();
        }
    }


}
