package Homework4;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.util.Locale;

public class homework4 {
    public static void main(String[] args) {


        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        String sentence1 = "Homework";
        int result1 = 10;
        boolean isGreaterOrEqual = true;








        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */

        String myName = "Rukon Talukdar";
        System.out.println(myName);
        System.out.println(myName.endsWith("a"));
        System.out.println(myName.contains("a"));





        /**
         *
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */

        String news = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        System.out.println(news.contains("king"));
        System.out.println(news.indexOf("EW"));






        String task4 = "kINg";
        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        String sentence = "KINg";
        System.out.println(sentence.toLowerCase());

        String sentence2 = "queen";
        System.out.println(sentence2.toLowerCase());


    }
}
