/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author kotvitska
 */
import java.util.Scanner; // импортирование нужных ф-ций
import java.util.Random;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
   // простите что задержал лабораторную, прошу не занижать оценку за столь поздний срок
    public static void main(String[] args) { //обьявление класса
       int b,c,i,j; //обьявление переменных
       int mas[]; // обьявление массива выделил в отдельную строку
      int res,schetchik; // обьявление переменных для работы с циклом
       schetchik=0; // начальное значение счетчика
       Scanner a= new Scanner(System.in); //инициализация аналога cin в c++
       System.out.println("vvedite celochislenie zna43nie,razmer massiva budet na 1menshe zadanogo vami v sluchae so vtorym metodom sortirovki"); // служебный мессаг
       c=a.nextInt(); // cin
     //  c*=10; //второй случай
       c=c*100; //третий случай
       mas = new int [c];
       
       Random rnd = new Random();
           rnd.nextInt();
           
       for (i=1; i<c; i++){
          
       mas[i]= rnd.nextInt(100);
       System.out.println(mas[i]);
       } // заполнение массива
       // сортировка - метод первый
       int sc=c;
      while (sc>2){
       for (i=1; i<sc;i++)
       {
           if (mas[i-1]>mas[i])
           {
           res=mas[i-1];
           mas[i-1]=mas[i];
           mas[i]=res;
           schetchik++;    
           }
                }
       sc=sc-1;
      }   
       // сортировка - метод второй
      /*int jouk=(c / 2);
            
              for (i=1;i<jouk;i++){
       if (mas[i]>mas[jouk]){
                     if (mas[c-i]<mas[jouk]){
           res=mas[i]; 
                  mas[i]=mas[c-i];
                 mas[c-i]=res;
              schetchik++;
                  
              
         }}}
      
      */
      // вывод  данных с повторным выведением массива
       System.out.println("kol-vo iteratziy pri etom metode sostavilo "+schetchik);
       //System.out.println(schetchik); отладочная
       for (i=1; i<c; i++){
       System.out.println(mas[i]);
       }
       
      
    }
    }
