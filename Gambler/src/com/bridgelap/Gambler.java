package com.bridgelap;
import java.util.*;
public class Gambler {
    static final int INITIAL_STAKE=100;
    static final int BET_AMOUNT=1;
    static final int WIN=1;
    static final int LOSE=2;
    static int Gamble(){
        int n = 0;
        Random r = new Random();
        n=1+r.nextInt(2);
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Initial Amount = $"+INITIAL_STAKE);
        int bets=0;
        int wins=0;
        int currentAmount=0;

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Stake Amount: ");
        int stake=sc.nextInt();

        int gambleResult=Gamble();
        if(gambleResult==WIN){
            System.out.println("You Won !!");
            wins++;
        }
        else if(gambleResult==LOSE){
            System.out.println("You Lost !!");
            wins--;
        }
        else{
            System.out.println("You haven't placed your bet");
        }
        currentAmount=wins+INITIAL_STAKE;
        System.out.println(currentAmount);

    }
}



