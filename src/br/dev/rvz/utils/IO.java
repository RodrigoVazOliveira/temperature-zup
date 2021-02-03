package br.dev.rvz.utils;

import java.util.Scanner;

public class IO {

    public Scanner input() {
        return new Scanner(System.in);
    }

    public void out(String value) {
        System.out.println(value);
    }
}
