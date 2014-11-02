package com.luxoft.training.lab2.employees;
//import com.luxoft.training.lab2.employees.Classes;
import com.luxoft.training.utils.*;
import java.util.*;

public class Employer {
    public String EName;
    public String ESurName;
    public Classes cl;
    public Dates EDate;
    public String WorkType;//- месячная ставка
                        //- почасовая оплата
                        //- % от объема продаж
                        //- базовая месячная ставка + % от объема продаж
    public int salary;
    public int hours = -1;
    public int hourly_rate = -1;
    public int BaseSalary =-1;
    public int SalesAmount = -1;
    public int comissions = -1;
    
   public void Employer(String Name,String SurName,int num,String ImportDate,int Ssalary)
    {
        EName = Name;
        ESurName = SurName;
        cl = new Classes();
        cl.setClass(num);
        EDate = new Dates();
        EDate.setDate(ImportDate);
        
        Random r = new Random();
        if(num == 1)
        {
            WorkType = "commissions";
            SalesAmount = r.nextInt()&10000;
            comissions = r.nextInt()&100;
        }
        else
        {
            if(num == 2)
            {
                WorkType = "hourly rate";
                
                hours = r.nextInt()&100;
                hourly_rate = r.nextInt()&10;
            }
            else
            {
                if(num == 3)
                {
                    WorkType = "comissions and Base Salary";
                    BaseSalary = r.nextInt()&500;
                    SalesAmount = r.nextInt()&10000;
                    comissions = r.nextInt()&100;
                }
                else
                {
                    WorkType ="monthly Salary";
                }
            }
        }
        salary = Ssalary;
    }
   public void setSalary(int Ssalary)
   {
       salary = Ssalary;
   }
    public void PrintEmploer()
    {
        System.out.println("EName:"+EName);
        System.out.println("ESurName:"+ESurName);
        cl.PrintClasses();
        EDate.PrintDate(); 
        System.out.println("Payment type:"+WorkType);
        
        if(WorkType == "monthly Salary")
        {
            System.out.println(WorkType+":"+salary);
            System.out.println("payment:"+(salary+200));
            
            //setSalary(salary+200);
        }
        if(WorkType == "comissions and Base Salary")
        {
            System.out.println("Sales Amount:"+SalesAmount);
            System.out.println("comissions:"+comissions);
            System.out.println("Base Salary:"+BaseSalary);
            System.out.println("payment:"+(BaseSalary+SalesAmount/comissions));
        }
        if(WorkType == "hourly rate")
        {
            System.out.println("hourly rate:"+hourly_rate);
            System.out.println("hours:"+hours);
            System.out.println("payment:"+(hours*hourly_rate));
        }
        if(WorkType == "commissions")
        {
             System.out.println("Sales Amount:"+SalesAmount);
            System.out.println("comissions:"+comissions);
            System.out.println("payment:"+(SalesAmount/comissions));
        }
    }
}

