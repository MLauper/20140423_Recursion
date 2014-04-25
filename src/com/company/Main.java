package com.company;


import palindrom.Sentence;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sentence greeting = new Sentence("Hello!");
        greeting.reverse();
        System.out.println(greeting.getReverse());

        Sentence greeting2 = new Sentence("Hello!");
        greeting2.reverse2();
        System.out.println(greeting2.getText());
    }
}
