package ifellow;

import java.util.Scanner;

class ClocksHand
{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите часы = "); 
        int hours = scanner.nextInt();
        if (hours >= 12)
            hours = hours - 12;
        System.out.println("Введите минуты = "); 
        int minutes = scanner.nextInt();
        System.out.println("угол = " + ((Math.abs((minutes*6)-(hours*30))) - (minutes*0.5)));

        scanner.close();
    }
}