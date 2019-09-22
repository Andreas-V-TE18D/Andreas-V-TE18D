package lektion;

import java.util.Scanner;

public class homeworkV29 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average;
        int count = 0, sum = 0, num, min = 0, max = 0;

        System.out.println("Skriv in 5 heltal:");

        do{
            num=scan.nextInt();
            sum+=num;
              if(count==0){
              min=num;
              max=num;}
              if(num>max)
                       max=num;
                    if(num<min)
                       min=num;

            count++;
            }while(count<5);
             average = sum/5;

        {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

       
     

        System.out.println("Högst: " + max);
        System.out.println("Lägst: " + min);
        System.out.println("Medelvärde: " + average);
    }
}