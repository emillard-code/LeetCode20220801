package com.project.attempt;

public class LeetCodeApp {

    private static int unique_paths = 0;

    public static void main(String[] args) {

        method(3, 7);
        System.out.println(unique_paths);

    }

    public static void method(int vertical, int horizontal) {

        if (horizontal > 1) {
            method(vertical, horizontal - 1);
        }

        if (vertical > 1) {
            method(vertical - 1, horizontal);
        }

        if (vertical == 1 && horizontal == 1) {
            unique_paths++;
        }

    }

}