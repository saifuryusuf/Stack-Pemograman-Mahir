package com.company;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack<Character> stack = new Stack<>();
        Scanner ketik = new Scanner(System.in);
        String fungsi = ketik.nextLine();

        try {
            for (int i = 0; i < fungsi.length(); i++) {
                char c = fungsi.charAt(i);

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    stack.pop();
                }
            }
            if (stack.empty()) {
                System.out.println("valid");
            } else {
                System.out.println("tidak valid");
            }
        }catch (Exception exception){
            System.out.println("tidak valid");
        }
    }
}
