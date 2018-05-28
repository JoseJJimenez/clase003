package com.josej.fundamentos;

public class fundamentos
{
    //operadores de relación -> <; <; <=; <=; !=; ==;
    //su funcionalidad es la de relacion de 2 objetos o variables
    //para conseguir una respuesta true o false


    static boolean r1 = 1>2;
    static boolean r2 = 1<2;
    static boolean r3 = 1>=2;
    static boolean r4 = 1<=2;
    static boolean r5 = 1!=2;
    static boolean r6 = 1==2;

    //operadores lógicos
    //&&; ||; |; !; ^;

    static int x=5;

    public static void main (String... argv)
    {
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        //operadores lógicos

        System.out.println(r1 && r2);
        System.out.println(r1||r2);
        System.out.println(!r1);
        System.out.println(r5 ^ r6);

        //operadores de asignación

        x++;
        System.out.println("");
        System.out.println(x);
        x--;
        System.out.println(x);
        x*=2;
        System.out.println(x);
        x/=5;
        System.out.println(x);
        ++x;// de esta forma la suma no es permanente
        x++;//de esta dorma la suma es permanente
        System.out.println(x);







    }




}
