package com.josej.fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio003
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Indica un numero:");
        int x;
        x=sc.nextInt();

        if(x>0 && x <24)
        {
            System.out.println("El numero está entre 1 y 24");

        }
        else
        {
            System.out.println("El numero esta fuera de rango");
        }
        switch (x)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("has escrito un numero dentro de rango");
                break;
                default:
                    System.out.println("estas fuera de rango");
        }
    }
}
