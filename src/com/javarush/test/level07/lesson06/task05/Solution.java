package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> aList = new ArrayList<String>();
       Scanner sc = new Scanner(System.in);
        
       for(int i = 0; i<5; i++){
           aList.add(sc.nextLine());
       }
       
       String s; 
       for(int i = 0; i < 13; i++){
           s = aList.get(aList.size()-1);
           aList.remove(aList.size()-1);
           aList.add(0, s);
       }
       
        for (int i = 0; i < aList.size(); i++){
            System.out.println(aList.get(i));
        }

    }
}
