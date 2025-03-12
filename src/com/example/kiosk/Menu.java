package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> allMenu = new ArrayList<>();     // 리스트 생성

    public Menu() {
        allMenu.add(new MenuItem("1. 아메리카노", 4.5, "에스프레소에 뜨거운 물을 희석하여 만든 커피 음료"));
        allMenu.add(new MenuItem("2. 에스프레소", 5.0, "볶은 커피를 가늘게 분쇄한 뒤, 고온의 물을 가해 짧은 시간에 추출한 진한 커피"));
        allMenu.add(new MenuItem("3. 카푸치노", 5.0, "에스프레소를 베이스로 한 우유를 넣은 커피 음료"));
        allMenu.add(new MenuItem("4. 카페모카", 5.5, "에스프레소, 우유, 초콜릿 시럽을 넣어 만든 커피 음료"));
        allMenu.add(new MenuItem("5. 바닐라 라떼", 5.5, "에스프레소에 우유와 바닐라시럽을 섞어 만든 커피"));
    }

    public void showMenu() {        // 메뉴 보여주기
        for(MenuItem cafeMenu : allMenu) {      // for 반복문으로 allMenu에 있는 MenuItem들을 순차적으로 탐색
            cafeMenu.cafeMenu();
        }
    }


}
