//ROCK-PAPER-SCISSOR GAME
//YOU vs COMPUTER
//Author : Muquim Akhter


package com;
import java.util.Scanner;
import java.util.Random;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int track=0,comp_track=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter your choice : 0.ROCK  1.PAPER  2.SCISSOR");
            byte choice= sc.nextByte();
            if(choice<0 || choice>2)
                System.out.println("INVALID CHOICE");
            else{
                Random rand= new Random();
                int comp = rand.nextInt(3);
                System.out.println("Computer : "+ comp);
                if(choice==comp)
                    System.out.println("D R A W");
                else if((choice==0 && comp==2) || (choice==1 && comp==0) || (choice==2 && comp==1))
                {
                    System.out.println("You won! ");
                    track=track+1;
                }
                else
                {
                    System.out.println("Computer won! ");
                    comp_track=comp_track+1;
                }
            }
        }
        if(track>comp_track)
            System.out.println("CONGRATULATIONS!! YOU WON THE GAME...");
        else if(comp_track>track)
            System.out.println("COMPUTER WON THE GAME");
        else
            System.out.println("THE GAME IS TIED...");
    }
}