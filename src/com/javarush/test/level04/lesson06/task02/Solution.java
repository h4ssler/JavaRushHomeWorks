package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c ,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        
        System.out.print(findMax(findMax(a, b), findMax(c, d)));

    }
    
    public static int findMax(int a, int b){
        int m;
        if(a < b){
            m = b;
        }  
        else{
            m = a;
        }

        return m;
    } 
}
