package HW2;

import java.util.Scanner;

public class Task2Rec {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("Введите число");
        int fibonacci = f.nextInt();
        int prelastNum = 0;
        int lastNum = 1;
        fibo( lastNum, prelastNum,fibonacci);
    }
    public static int fibo (int lastNum,int prelastNum, int fibonacci){
        if (lastNum>=fibonacci){
            return 0;
        }else {
            System.out.print(lastNum+" ");
           return fibo((lastNum+=prelastNum),(prelastNum = lastNum-prelastNum),fibonacci);
        }
    }

}
