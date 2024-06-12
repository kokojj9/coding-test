package com.example.test.codingTest.controller;

import com.example.test.codingTest.model.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class TestController {

    public static void main(String[] args) {

        TestService ts = new TestService();
        // 실수의 합
        System.out.println(ts.getSumNumber());
        // 찍신 찾기
        System.out.println(ts.getTopScore());

        // 최소 공배수의 합
        System.out.println(ts.getSumMultiples());




    }



}
