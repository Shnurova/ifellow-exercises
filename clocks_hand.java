package ifellow;

import java.util.Scanner;

class ClocksHand
{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите часы = "); 
        int hours = scanner.nextInt();
        if (hours > 24 || hours < 0){
            System.out.println("Ошибка в вводе часов ");
            scanner.close();
            return;
        }
        if (hours >= 12)
            hours = hours - 12;
        System.out.println("Введите минуты = "); 
        int minutes = scanner.nextInt();
        if (minutes > 59 || minutes < 0){
            System.out.println("Ошибка в вводе минут ");
            scanner.close();
            return;
        }
        double degree = (Math.abs((minutes*6)-(hours*30 + minutes*0.5)));
        if (degree <= 180) {
            System.out.println("угол = " + degree );
        }
        if (degree > 180){
            System.out.println("угол = " + (360 - degree));
        }

        scanner.close();
    }
}