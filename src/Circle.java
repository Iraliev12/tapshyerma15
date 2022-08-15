import java.util.Scanner;

public class Circle {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Введите радиус круга");
        double radius = scanner.nextDouble();
        double area = Math.PI  * (radius * radius);
        System.out.println("Площадь круга ровна:" + area);
        double circumference = Math.PI* 2 * radius;
        System.out.println("Длина окружности равно:" + circumference);
    }
}
