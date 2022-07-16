package com.bridgelap;
import java.util.*;
public class Gambler {
    static final int INITIAL_STAKE = 100;
    static final int BET_AMOUNT = 1;
    static final int WIN = 1;
    static final int LOSE = 2;

    static int Gamble() {
        int n = 0;
        Random r = new Random();
        n = 1 + r.nextInt(2);
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Initial Amount = $" + INITIAL_STAKE);
        int bets = 0;
        int wins = 0;
        int currentAmount = 0;
        double Goal = INITIAL_STAKE + (0.5 * INITIAL_STAKE);
        double netLoss = INITIAL_STAKE - (0.5 * INITIAL_STAKE);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stake Amount: ");
        int stake = sc.nextInt();
        while (currentAmount < Goal && currentAmount != netLoss) {
            int gambleResult = Gamble();
            if (gambleResult == WIN) {
                System.out.println("You Won !!");
                wins++;
            } else {
                System.out.println("You Lost !!");
                wins--;
            }
            currentAmount = wins + INITIAL_STAKE;
            System.out.println(currentAmount);


        }
    }
}



