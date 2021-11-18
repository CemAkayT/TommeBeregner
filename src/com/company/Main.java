package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);


        System.out.println("Dette program omregner tommer til centimeter");
        System.out.print("Indtast en længde i tommer : ");
        double tomme = userInput.nextDouble();
        double centimeter = tomme * 2.54;
        System.out.println(tomme + " tommer er "+ centimeter + " centimeter");

    }
}
