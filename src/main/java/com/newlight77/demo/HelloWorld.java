package com.newlight77.demo;

public class HelloWorld {

    public String sayHello() {
        return "hello!";
    }

    public static void main(String ...args) {
        String hello = new HelloWorld().sayHello();

        System.out.print(hello);
    }
}
