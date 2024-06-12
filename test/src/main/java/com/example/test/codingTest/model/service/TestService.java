package com.example.test.codingTest.model.service;

import com.example.test.codingTest.model.vo.Answer;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    // 실수의 합 계산
    public int getSumNumber(){
        int sumNum = 0;
        int a = 10;

        for (int i = 2; i <= a; i++){
            if(isNumber(i)){
                sumNum += i;
            }
        }

        return sumNum;
    }

    public boolean isNumber(int num){
        if(num <= 1) return false;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    // 찍신 찾기
    public String getTopScore(){
        List<Answer> arr = new ArrayList<>();
        arr.add(new Answer(1, 5));
        arr.add(new Answer(3, 3));
        arr.add(new Answer(2, 4));
        arr.add(new Answer(5, 5));

        int aScore = 0;
        int bScore = 0;
        int cScore = 0;

        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i).getAnswer() == 1){
                aScore += arr.get(i).getScore();
            } else if (arr.get(i).getAnswer() == 3) {
                bScore += arr.get(i).getScore();
            } else if (arr.get(i).getAnswer() == 5) {
                cScore += arr.get(i).getScore();
            }
        }

        String str = "";

        int max = Math.max(aScore, Math.max(bScore, cScore));

        if(max == aScore) {
            str += "a : " + aScore;
        }
        if(max == bScore) {
            str += "b : " + bScore;
        }
        if(max == cScore){
            str += "c : " + cScore;
        }

        return str;
    }

    // 최소 공배수의 합
    public int getSumMultiples(){
        List<Integer> arr = new ArrayList<>();
        int max = 10;
        int sum = 0;

        for(int i = 1; i <= max; i++){
            arr.add(i);
        }
        // 모든 쌍의 최소 공배수를 구하여 합산
        for (int i = 0; i < arr.size(); i++){
            for (int j = i + 1; j < arr.size(); i++){
                sum += lcm(arr.get(i), arr.get(j));
            }

        }

        return sum;
    }

    // 최대공약수(gcd) 계산
    public int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // 최소공배수(lcm) 계산
    public int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }






}
