package com.jh.zzz;

public class Song{
    // 매개변수와 리턴 값이 없는 메소드
    public void method1() {
        System.out.println("method1이 실행됩니다.");
    }

    // 매개변수로 정수를 받고, 리턴값은 없는 메소드
    public void method2(int x) {
        System.out.println(x + " 를 이용하는 method2입니다.");
    }

    // 매개변수는 없고, 정수를 리턴하는 메소드
    public int method3() {
        System.out.println("method3이 실행됩니다.");
        return 10;
    }

    // 매개변수로 정수를 받고, 정수를 리턴하는 메소드
    public int method4(int y) {
        System.out.println(y + " 를 이용하는 method5입니다.");
        return 5;
    }
}