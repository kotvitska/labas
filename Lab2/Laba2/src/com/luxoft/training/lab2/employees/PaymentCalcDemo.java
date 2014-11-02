package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.*;
import com.luxoft.training.lab2.employees.*;
import java.util.*;



public class PaymentCalcDemo {
     public static void main(String[] args) {
        
         Random r = new Random();
         
         //создание и инициализаци€ массива работников
        Employer[] EmpArray = new Employer[4];
        for(int i =0;i<EmpArray.length;i++)
        {
            EmpArray[i] = new Employer();
            EmpArray[i].Employer(""+r.nextInt()%10, ""+r.nextInt()%10, r.nextInt()%5, ""+Math.abs(r.nextInt()%200000),Math.abs(r.nextInt()%1000));
           // EmpArray[i].PrintEmploer();
            //System.out.println("");
        } 
        //сортировка массива работников по фамилии
        for(int i = 0;i<EmpArray.length;i++)
        {
            for(int j = 0;j<EmpArray.length-1;j++)
            {
                if(EmpArray[j].ESurName.charAt(0)>EmpArray[j+1].ESurName.charAt(0))
                {
                    Employer temp = new Employer();
                    temp = EmpArray[j];
                    EmpArray[j]=EmpArray[j+1];
                    EmpArray[j+1]=temp;
                }
            }
        }
        //¬ывод результата на экран ( каждый раз новый список)
        for(int i =0;i<EmpArray.length;i++)
        {
            EmpArray[i].PrintEmploer();
            System.out.println("");
        }
       
        // TODO code application logic here
    }
    
}




