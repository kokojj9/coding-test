package com.example.test.codingTest.programmers;

public class TestController {

    // n보다 커질때 까지 (리스트,배열)
    public int solution1(int[] numbers, int n) {
        int answer = 0;

        for(int num: numbers){
            answer += num;
            if(answer > n) break;
        }

        return answer;
    }

    // n개 간격의 원소들 (리스트,배열)
    public int[] solution2(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];

        int index = 0;

        for(int i = 0; i < num_list.length; i += n){
            answer[index++] = num_list[i];
        }

        return answer;
    }

    // n 번째 원소까지 (리스트,배열)
    public int[] solution3(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            answer[i] = num_list[i];
        }

        return answer;
    }

    // 순서 바꾸기
    public int[] solution4(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];

        for(int i = 0; i < length - n; i++){
            answer[i] = num_list[n + i];
        }

        for(int i = 0; i < n; i++){
            answer[length - n + i] = num_list[i];
        }

        return answer;
        // 순환배열 개념사용
        // return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }

    // n번째 원소부터 (리스트, 배열)
    public int[] solution5(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length - n + 1];
        int idx = 0;

        for(int i = n - 1; i < length; i++){
            answer[idx++] = num_list[i];
        }

        return answer;
        //int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length); 다른사람풀이
        //return a;
    }

    // 첫 번째로 나오는 음수
    public int solution6(int[] num_list) {
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0) return i;
        }

        return -1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
