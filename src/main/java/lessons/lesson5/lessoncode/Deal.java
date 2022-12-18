package lessons.lesson5.lessoncode;

import java.util.Arrays;
import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        // часть 1 - инициализация переменных
        int cardsPerPlayer = 5;
        int players =5 ;
        String [][] playersCard = new String [players][cardsPerPlayer];

        String[] suits = {
                "Пик", "Бубен", "Черв", "Треф"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"
        };

        int n = suits.length * rank.length; // количество карт

        // часть 2 - ввод с консоли

        // часть 3 - инициализация колоды
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        System.out.println(Arrays.toString(deck));

        // часть 4 - перетасовка колоды
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        System.out.println(Arrays.toString(deck));

        // часть 5 - перетасованная колода выводится на экран
        for (int i = 0; i < cardsPerPlayer ; i++)
            for (int j = 0; j < players; j++) {
               playersCard[j][i] = deck[i*cardsPerPlayer+j];
               System.out.println(" Player  "+ j+ " card " +playersCard[j][i]);
            }

        System.out.println();

        }

}
