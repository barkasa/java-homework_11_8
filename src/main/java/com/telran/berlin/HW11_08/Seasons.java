package com.telran.berlin.HW11_08;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number:");
        int month = scanner.nextInt();
        String monSeasons;
        switch (month) {
            case 1:
            case 2:
            case 12:
                monSeasons = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                monSeasons = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                monSeasons = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                monSeasons = "Autumn";
                break;
            default:
                monSeasons = "there is no such month!";
        }
        System.out.println(monSeasons);

    }
    public static void checkSeason(int month) {
        System.out.println(month < 3 || month == 12 ? "зима" : month < 6 ? "весна" : month < 9 ? "лето" : "осень");
    }
}


