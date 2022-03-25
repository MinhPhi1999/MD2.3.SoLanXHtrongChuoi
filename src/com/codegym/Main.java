package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "minh.minh.minh";
        Scanner scanner = new Scanner(System.in);
        System.out.println("mày thích tìm chữ gì: ");
        char x = scanner.next().charAt(0);
        System.out.println("xuất hiện " + checkStr(str,x) + " lần");

    }
    static int checkStr(String str,char x){
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i]==x){
                count++;
            }
        }
        return count;
    }
}
