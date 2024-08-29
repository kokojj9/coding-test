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

    //코드 처리
    public String solution13(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (ch == '1') {
                mode = !mode;
            } else if ((mode && i % 2 == 1) || (!mode && i % 2 == 0)) {
                answer.append(ch);
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }

    //등차수열 특정항 더하기
    public int solution14(int a, int d, boolean[] included) {
        int answer = 0;
        int curNum = a;

        for(int i = 0; i < included.length; i++){
            answer = included[i] ? answer + curNum : answer;
            curNum += d;
        }

        return answer;

//        int answer = 0;
//
//        for(int i = 0; i < included.length; i++){
//            if(included[i]){
//                answer +=  a + (d*i);
//            }
//        }
//
//        return answer;
    }

    // 원소들의 곱과 합
    public int solution15(int[] num_list) {
        int pro = 1;
        int sum = 0;

        for(int num: num_list){
            pro *= num;
            sum += num;
        }

        return pro > sum * sum ? 0 : 1;
    }

    // 수 조작하기 2
    public String solution16(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i < numLog.length; i++){
            int diff = numLog[i] - numLog[i - 1];

            switch(diff){
                case 1   -> answer.append("w");
                case -1  -> answer.append("s");
                case 10  -> answer.append("d");
                case -10 -> answer.append("a");
            }
        }

        return answer.toString();
    }

    // 수열과 구간 쿼리3
    public int[] solution17(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];

            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }

        return arr;
    }

    // 수열과 구간 쿼리2
    public int[] solution18(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){

            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = 1000000;

            for(int j = s; j <= e; j++){
                if(arr[j] > k && arr[j] < min) {
                    min = arr[j];
                }
            }
            answer[i] = min != 1000000 ? min : -1;
        }

        return answer;
    }

    //수열과 구간 쿼리4
    public int[] solution19(int[] arr, int[][] queries) {
        for(int q = 0; q < queries.length; q++){
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];

            for(int i = s; i <= e; i++){
                if(i % k == 0){
                    arr[i] += 1;
                }
            }
        }

        return arr;
    }

    // 배열만들기2
    public int[] solution20(int l, int r) {
        int[] answer = new int[r - l + 1];
        int length = 0;

        for(int i = l; i <= r; i++){
            String numStr = String.valueOf(i);
            if(numStr.matches("[05]+")){
                answer[length++] = i;
            }
        }

        if(length == 0) return new int[]{-1};

        int[] result = new int[length];
        System.arraycopy(answer, 0, result, 0, length);

        return result;
        // 다른사람풀이
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i < 64; i++) {
//            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5; 2진수를 활용하여 5를 곱하여 사용함
//            if (l <= num && num <= r)
//                list.add(num);
//        }
//
//        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }

    // 콜라츠 수열 만들기
    public int[] solution21(int n) {
        List<Integer> answer = new ArrayList<>();

        while(n != 1) {
            answer.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        answer.add(1);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 배열 만들기4
    public int[] solution22(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while(i < arr.length){
            if (stk.isEmpty() || stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i++]);
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }












}
