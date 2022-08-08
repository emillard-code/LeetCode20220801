package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        System.out.println(method(3, 7));

    }

    public static int method(int vertical, int horizontal) {

        if (vertical == 1 && horizontal == 1) {
            return 1;
        }

        if (vertical < 0 || horizontal < 0) {
            return 0;
        }

        int up = method(vertical - 1, horizontal);

        int right= method(vertical, horizontal - 1);

        return up + right;

    }

}