package com.example.test.codingTest.model.service;

import java.util.Scanner;

public class BarkjoonTest {

    // 성적 구하기
    public void abc() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }

    // 윤년구하기
    public void abc1() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    // 사분면 고르기
    public void abc2() {
        
    }

}