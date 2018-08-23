package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            Random rand = new Random();
            int randNum = 0;
            int upperLimit = 100;
            int lowerLimit = 1;
            String myAnswer = "";

            do {
                randNum = rand.nextInt(upperLimit - lowerLimit + 1)/2;
                System.out.println("I think it's " + randNum);
                myAnswer = in.nextLine();

                if (myAnswer.equals("too low")) {
                    lowerLimit = randNum + 1;
                } else if (myAnswer.equals("too high")) {
                    upperLimit = randNum - 1;
                }
            } while (!myAnswer.equals("yes"));

            in.close();
            System.out.println("You guessed my number!");
        }
    }

