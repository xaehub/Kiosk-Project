package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Kiosk kiosk = new Kiosk();

       kiosk.firstGreet();
       kiosk.showMenu();
       kiosk.selectMenu();
    }
}
