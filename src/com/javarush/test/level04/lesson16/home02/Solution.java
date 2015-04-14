package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int a, b, c, min, max, av;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a < b){
            min = a;
            max = b;
        }
        else {
            min = b;
            max = a;
        }
        
        if(c > min && c < max){
            System.out.print(c); 
        }
        
        if(c > max)
            System.out.print(max);
        
        if (c < min)
            System.out.print(min);


        
            
        

    }
}
