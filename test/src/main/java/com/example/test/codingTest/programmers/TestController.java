package com.example.test.codingTest.programmers;

import java.util.ArrayList;
import java.util.List;

public class TestController {

    // n보다 커질때 까지 (리스트,배열)
    public int solution1(int[] numbers, int n) {
        int answer = 0;

        for (int num : numbers) {
            answer += num;
            if (answer > n) break;
        }

        return answer;
    }

    // n개 간격의 원소들 (리스트,배열)
    public int[] solution2(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];

        int index = 0;

        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }

        return answer;
    }

    // n 번째 원소까지 (리스트,배열)
    public int[] solution3(int[] num_list, int n) {
        int[] answer = new int[n];

        System.arraycopy(num_list, 0, answer, 0, n);

        return answer;
    }

    // 순서 바꾸기
    public int[] solution4(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];

        if (length - n >= 0) System.arraycopy(num_list, n + 0, answer, 0, length - n);

        if (n >= 0) System.arraycopy(num_list, 0, answer, length - n + 0, n);

        return answer;
        // 순환배열 개념사용
        // return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }

    // n번째 원소부터 (리스트, 배열)
    public int[] solution5(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length - n + 1];
        int idx = 0;

        for (int i = n - 1; i < length; i++) {
            answer[idx++] = num_list[i];
        }

        return answer;
        //int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length); 다른사람풀이
        //return a;
    }

    // 첫 번째로 나오는 음수
    public int solution6(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) return i;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.toArray();

        return -1;
    }

    // 카운트 다운(리스트,배열)
    public int[] solution7(int start_num, int end_num) {
        int gap = start_num - end_num;
        int[] answer = new int[gap + 1];
        int index = 0;

        for (int i = 0; i <= gap; i++) {
            answer[index++] = start_num - i;
        }

        return answer;
    }

    // 배열 만들기1
    public int[] solution8(int n, int k) {
        int[] answer = new int[n / k];
        int index = 0;

        for (int i = k; i <= n; i += k) {
            answer[index++] = i;
        }
        String str = "banana";
        System.out.println(str.indexOf("an"));

        return answer;
    }

    // 문자열 섞기
    public String solution9(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return answer.toString();
    }

    // 리스트 문자열로 전환
    public String solution10(String[] arr) {
        return String.join("", arr);
    }

    // 문자열 곱하기
    public String solution11(String my_string, int k) {
        return my_string.repeat(k);
    }

    // 더 크게 합치기
    public int solution12(int a, int b) {
        String num1 = Integer.toString(a) + b;
        String num2 = Integer.toString(b) + a;

        return num1.compareTo(num2) >= 0 ? Integer.parseInt(num1) : Integer.parseInt(num2);
        
        //return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a)); 다른사람 풀이
    }
    
    // 두 수의 연산값 비교하기
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), (2 * a * b));
    }


}
