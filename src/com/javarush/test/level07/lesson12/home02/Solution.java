package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m,n;
        ArrayList<String> list = new ArrayList<String>();
        
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        
        for(int i = 0; i < n; i++){
            list.add(reader.readLine());
        }

        for(String s:reverseList(list, m)){
            System.out.println(s);
        }

        //Напишите тут ваш код
    }
    
    public static ArrayList<String> reverseList(ArrayList<String> list, int m ){
        String s;
        
        for(int i = 0; i < m; i++){
            s = list.get(0);
            list.add(s);
            list.remove(0);
        }
        
        return list;
    }
}
