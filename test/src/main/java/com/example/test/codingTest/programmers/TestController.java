package com.example.test.codingTest.programmers;

import java.util.ArrayList;
import java.util.Arrays;
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

    // 주사위 게임3
    public int solution23(int a, int b, int c, int d) {
        int[] numbers = {a, b, c, d};
        Arrays.sort(numbers);

        if(numbers[0] == numbers[3]) return 1111 * numbers[0];
        if(numbers[0] == numbers[2] || numbers[1] == numbers[3]) {
            int p = (numbers[0] == numbers[2]) ? numbers[0] : numbers[3];
            int q = (numbers[0] == numbers[2]) ? numbers[3] : numbers[0];
            return (10 * p + q) * (10 * p + q);
        }
        if (numbers[0] == numbers[1] && numbers[2] == numbers[3]) {
            return (numbers[0] + numbers[2]) * Math.abs(numbers[0] - numbers[2]);
        }

        if (numbers[0] == numbers[1] || numbers[1] == numbers[2] || numbers[2] == numbers[3]) {
            int p = (numbers[0] == numbers[1]) ? numbers[0] : (numbers[1] == numbers[2]) ? numbers[1] : numbers[2];
            int q = (numbers[0] == numbers[1] && numbers[2] != numbers[3]) ? numbers[2] : (numbers[1] == numbers[2] && numbers[0] != numbers[3]) ? numbers[3] : numbers[0];
            int r = (q == numbers[0] || q == numbers[1]) ? (numbers[2] == p ? numbers[3] : numbers[2]) : numbers[1];
            return q * r;
        }

        return numbers[0];
    }

    // 9로나눈 나머지
    public int solution24(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sum % 9;
    }

    // 문자 여러번 뒤집기
    public String solution25(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);

        for(int [] query : queries){
            int s = query[0];
            int e = query[1];

            while(s < e){
                char ch = answer.charAt(s);
                answer.setCharAt(s, answer.charAt(e));
                answer.setCharAt(e, ch);
                s++;
                e--;
            }
        }

        return answer.toString();
    }

    // 배열 만들기5
    public int[] solution26(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(num > k){
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    // 접미사 배열
    public String[] solution27(String my_string) {
        int n = my_string.length();
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public String solution28(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);

        while(s < e){
            char ch = my_string.charAt(s);
            answer.setCharAt(s, answer.charAt(e));
            answer.setCharAt(e, ch);
            s++;
            e--;
        }

        // 문자열.reverse(); 메서드도 있음!!!

        return answer.toString();
    }

    //세로읽기
    public String solution29(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        for(int i = c - 1; i < my_string.length(); i += m){
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    //qr code
    public String solution30(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < code.length(); i++){
            if(i % q == r) answer.append(code.charAt(i));
        }

        return answer.toString();
    }

    // 문자 개수세기
    public int[] solution31(String my_string) {
        int[] answer = new int[52];

        for(char ch : my_string.toCharArray()){
            if(ch >= 'a' && ch <= 'z') answer[ch - 'a'  + 26]++;
            else if(ch >= 'A' && ch <= 'Z') answer[ch - 'A' ]++;
        }

        return answer;
    }
    
    //글자 지우기
    public String solution32(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        int j = 0;
        Arrays.sort(indices);

        for(int i = 0; i < my_string.length(); i++){
            if(j < indices.length && i == indices[j]) {
                j++;
                continue;
            }
            answer.append(my_string.charAt(i));
        }

        return answer.toString();

//        String[] str = my_string.split("");
//        for (int i=0;i<indices.length;i++) str[indices[i]] = "";
//        return String.join("",str);
    }
    
    // 가장 가까운 1 찾기
    public int solution33(int[] arr, int idx) {
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1) return i;
        }

        return -1;
    }

    //배열만들기 3
    public int[] solution34(int[] arr, int[][] intervals) {
        int first = intervals[0][1] - intervals[0][0] + 1;
        int second = intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[first + second];

        System.arraycopy(arr, intervals[0][0], answer, 0, first);
        System.arraycopy(arr, intervals[1][0], answer, first, second);

        return answer;
    }

    //리스트 자르기
    public int[] solution35(int n, int[] slicer, int[] num_list) {
        if(n == 1){
            int[] answer = new int[slicer[1] + 1];
            System.arraycopy(num_list, 0, answer, 0, slicer[1] + 1);
            return answer;
        } else if(n == 2){
            int[] answer = new int[num_list.length - slicer[0]];
            System.arraycopy(num_list, slicer[0], answer, 0, num_list.length - slicer[0]);
            return answer;
        } else if(n == 3){
            int[] answer = new int[slicer[1] - slicer[0] + 1];
            System.arraycopy(num_list, slicer[0], answer, 0, slicer[1] - slicer[0] + 1);
            return answer;
        } else if(n == 4){
            int[] answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
            int idx = 0;
            for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]){
                answer[idx] = num_list[i];
                idx++;
            }
            return answer;
        }
        return null;
//      다른풀이
//        int start = n == 1 ? 0 : slicer[0];
//        int end = n == 2 ? num_list.length - 1 : slicer[1];
//        int step = n == 4 ? slicer[2] : 1;
//        int[] answer = new int[(end - start + step) / step];
//        for (int i = start, j = 0; i <= end; i += step) {
//            answer[j++] = num_list[i];
//        }
//        return answer;
//    }
//        }
    }

    // 2의 영역
    public int[] solution36(int[] arr) {
        int[] answer = {};
        int first = -1;
        int last = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        return first != -1 ? Arrays.copyOfRange(arr, first, last + 1) : new int[]{-1};
    }
    
    //배열조각하기
    public int[] solution37(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length;

        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                end = start + query[i] + 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end);
    }

    //왼쪽 오른쪽
    public String[] solution38(String[] str_list) {
        int start = 0;
        int end = str_list.length;
        boolean flag = false;

        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                end = i;
                flag = true;
                break;
            }
            else if(str_list[i].equals("r")) {
                start = i + 1;
                flag = true;
                break;
            }
        }

        return flag ? Arrays.copyOfRange(str_list, start, end) : new String[]{};
    }


}
