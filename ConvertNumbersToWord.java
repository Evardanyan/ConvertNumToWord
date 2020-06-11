package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Խնդրում եմ մուտքագրեք փոխարկման ենթակա թիվը,որը պետք է բացասական չլինի և չգերազանցի 9999999.99՝ օրինակ: 124.56 ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        convertNumToWord(input);
    }





//------------------ Convert to Word Method ---------------------------------------------------
    static void convertNumToWord(String input) {
        int index = input.indexOf('.');
        char[] convert = input.toCharArray();
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(0,"");
        numbers.put(1,"մեկ");
        numbers.put(2,"երկու");
        numbers.put(3,"երեք");
        numbers.put(4,"չորս");
        numbers.put(5,"հինգ");
        numbers.put(6,"վեց");
        numbers.put(7,"յոթ");
        numbers.put(8,"ութ");
        numbers.put(9,"ինը");
        Map<Integer, String> tens = new HashMap<>();
        tens.put(0,"");
        tens.put(1,"տասն");
        tens.put(2,"քսան");
        tens.put(3,"երեսուն");
        tens.put(4,"քառասուն");
        tens.put(5,"հիսուն");
        tens.put(6,"վաթսուն");
        tens.put(7,"յոթանասուն");
        tens.put(8,"ութսուն");
        tens.put(9,"իննսուն");
        char[] money = Arrays.copyOf(convert, index);
        char[] cent = Arrays.copyOfRange(convert, index + 1, convert.length);
        String haryur = "հարյուր";
        String haryur1 = "հարյուր";
        String hazar = "հազար";
        String hazar1 = "հազար";

        int[] luma = {cent[0] - 48, cent[1] - 48};

        int[] num = new int[money.length];
        if(money.length >1)

        {
            for (int i = 0; i < money.length; i++) {
                num[i] = money[i] - 48;
            }
        } else

        {
            System.out.println(numbers.get(money[0] - 48) + " " + "դրամ"
                    + " " + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");
        }

        if(num.length ==2)

        {
            System.out.println(tens.get(num[0]) + numbers.get(num[1]) + " " + "դրամ" + " "
                    + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");

        }

        if(num.length ==3)

        {
            System.out.println(numbers.get(num[0]) + " " + "հարյուր" + " " + tens.get(num[1]) + numbers.get(num[2])
                    + " " + "դրամ" + " " + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");
        } else if(num.length ==4)

        {
            if (num[1] == 0) {
                haryur = "";
            }
            System.out.println(numbers.get(num[0]) + " " + "հազար" + " " + numbers.get(num[1]) + " " + haryur + " "
                    + tens.get(num[2]) + numbers.get(num[3]) + " " + "դրամ" + " "
                    + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");
        } else if(num.length ==5)

        {
            if (num[2] == 0) {
                haryur = "";
            }
            System.out.println(tens.get(num[0]) + numbers.get(num[1]) + " " + "հազար" + " " + numbers.get(num[2])
                    + " " + haryur + " " + tens.get(num[3]) + numbers.get(num[4]) + " " + "դրամ" + " "
                    + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");
        } else if(num.length ==6)

        {
            if (num[3] == 0) {
                haryur = "";
            }
            System.out.println(numbers.get(num[0]) + " " + "հարյուր" + " " + tens.get(num[1]) + numbers.get(num[2])
                    + " " + "հազար" + " " + numbers.get(num[3]) + " " + haryur + " " + tens.get(num[4]) + numbers.get(num[5]) + " " + "դրամ"
                    + " " + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");

        } else if(num.length ==7)

        {
            if (num[1] == 0) {
                haryur = "";
            }
            if (num[4] == 0) {
                haryur1 = "";
            }
            if (num[2] == 0) {
                hazar = "";
            }
            if (num[3] == 0) {
                hazar1 = "";
            }
            if (num[3] != 0) {
                hazar = "";
            }
            System.out.println(numbers.get(num[0]) + " " + "միլլիոն" + " " + numbers.get(num[1]) + " " + haryur + " " + tens.get(num[2])
                    + " " + hazar + " " + numbers.get(num[3]) + " "
                    + hazar1 + " " + numbers.get(num[4]) + " " + haryur1 + " " + tens.get(num[5]) + numbers.get(num[6]) + " " + "դրամ"
                    + " " + tens.get(luma[0]) + numbers.get(luma[1]) + " " + "լումա");


        }
    }
}
