package com.universityOfKelaniya.cricket;


public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.demo(10);
        main.demo(10, 12);
    }


    void demo(int number) {
	System.out.println("Only one number: " + number);
    }

    void demo(int number, int numberTwo){
        System.out.println(("Two number : " + number + ":" + numberTwo));
    }

}
