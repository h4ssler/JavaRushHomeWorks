package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
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
        
        for(int i = 1; i < 6; i++){
            aList.add(sc.nextLine());
        }
        
        ArrayList<String> cloneAList;
        cloneAList = (ArrayList<String>)aList.clone();

        
        for(int i = 0, j = cloneAList.size()-1; i<aList.size(); i++, j--){
            aList.add(i,cloneAList.get(j));
            aList.remove(aList.size()-1);
            System.out.println(aList.get(i));

        }

    }
}
