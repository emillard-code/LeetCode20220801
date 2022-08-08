package com.project.attempt;

public class LeetCodeAppRevised {

    public static void main(String[] args) {

        System.out.println(method(3, 7));

    }

    public static int method(int vertical, int horizontal) {

        int paths = 0;

        if (horizontal > 1) {
            paths = paths + method(vertical, horizontal - 1);
        }

        if (vertical > 1) {
            paths = paths + method(vertical - 1, horizontal);
        }

        if (vertical == 1 && horizontal == 1) {
            return 1;
        }

        return paths;

    }

}