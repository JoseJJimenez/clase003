package com.josej.fundamentos;


import java.util.Scanner;

public class Ejercicio002
{
    public static void main (String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int x=sc.nextInt();


        if(x%2==0)
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }

        //estructura del switch
        String nombre ="jose";
       System.out.println("pon tu nombre mozo:");
        nombre=sc.next();
        switch (nombre)
        {
            case "jose":
                System.out.println("hola jose");
                break;
            case "pedro":
                System.out.println("hola pedro");
                break;
            case "juan":
                System.out.println("hola juan");
                break;
            case "ramon":
                System.out.println("vamos ramon, no te salio bien el farol");
                break;
            default:
                System.out.println("hola colega, no te conozco");
                break;

        }
    }
}
