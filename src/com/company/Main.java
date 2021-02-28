package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
	    //z1();
	    //z2();
	    //z3();
        //z4();
        //z5();
        //z6();
        //z7();
        //z22();
        //z24();
        //z25();
        z26();
    }
    public static void z1()
    {
        for (int i=11; i<34; i++)
        {
            System.out.println(i);
        }
    }
    public static void z2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę potęgi większą od 0");
        int b = scanner.nextInt();

        if(b<0)
        {
            System.out.println("b>+0");
        }
        else {


            int wynik = 2;
            for (int i = 1; i < b; i++)
            {
                wynik=wynik*2;
            }
            System.out.println("b2^" + b + " =" + wynik );
        }

    }
    public static void z3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę potęgi większą od 0");
        int b = scanner.nextInt();

        if(b>2)
        {
            int wynik = 0;
            for (int i = 0; i <= b; i++)
            {
                wynik=wynik +i ;

            }
            System.out.println(wynik);
        }
    }
    public static void z4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę potęgi większą od 0 ");
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for (int i = 0; i < b; i++)
        {

            for (int j = 0; j < c; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void z5()
    {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        for (int i = 0; i < b+1; i++)
        {

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void z6()
    {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int przerwa = b -1 ;



        for (int i = 1; i <= b;i++)
        {
            for (int j = 0; j <= przerwa; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1 ; j++)
            {
                System.out.print("*");
            }
            przerwa--;
            System.out.println();
        }

    }
    public static void z7()
    {
        int dzielnik = 13;

        for (int i = 1; i < 100 ; i++)
        {
            System.out.println();
        }
    }
    public static void z22()

    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;


        while (a<n+1)
        {

            System.out.println(2*a-1);
            a++;

        }


    }
    public static void z24()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = 0;
        int b = 0;




        while (a<n)
        {
            while (b<m)
            {
                System.out.print("*");
                b++;
            }
            b = 0;
            a++;
            System.out.println();
        }

    }
    public static void z25()
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0 ;

        do
            {
                System.out.print("podaj lcizbe");
                n = scanner.nextInt();
            }
        while (n>0);
        {
            System.out.print("ZLE");
        }
    }
    public static void z26()
    {
        Scanner scanner = new Scanner(System.in);
        int a=0;


        do {
            System.out.println("Wybierz opcje");
            System.out.println("1-Pole prostokata");
            System.out.println("2-Pole kwadratu");
            System.out.println("3-Pole trojkata");
            int m = scanner.nextInt();


                if (m == 1) {
                    System.out.println("Wpisz bok a: ");
                    int boka = scanner.nextInt();
                    System.out.println("Wpisz bok b: ");
                    int bokb = scanner.nextInt();
                    System.out.println("Pole prosotkata= " + boka * bokb);
                }
                else if( m == 2) {
                    System.out.println("Wpisz bok : ");
                    int boka = scanner.nextInt();
                    System.out.println("Pole kwadratu= " + boka * boka);
                }
                else if( m == 3) {
                    System.out.println("Wpisz wysokosc : ");
                    int wysokosc = scanner.nextInt();
                    System.out.println("Wpisz boku : ");
                    int boku = scanner.nextInt();
                    System.out.println("Pole trojakta= " + (wysokosc*boku)/2);
                }

        }
            while(a==0);

                System.out.println("Od nowa");

        }


    }

