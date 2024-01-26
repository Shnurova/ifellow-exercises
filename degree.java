package ifellow;
import java.util.Scanner;

class BaseConverter
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы = ");
        double celsius = scanner.nextInt();
        System.out.println("Для перевода в Кельвины введите 1, для перевода в Фарингейты введите 2 = ");
        double degree = scanner.nextInt();
        double result = convert(celsius, degree);
        System.out.println(result);

        scanner.close();
    }

    public static double convert(double celsius, double degree){
        double result = 0;
        if (degree == 1) {
            result = (celsius + 273.15);
        }
        else if (degree == 2){
            result = celsius*9/5 + 32;
        }
        return result;
        }
}