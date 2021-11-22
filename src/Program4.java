import java.util.Scanner;



public class Program4 {
    public static void main(String[] args){
        calculate();
    }
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите знак операции(+,-,*,/):");
        String input = scanner.nextLine();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if(input.equals("/")) {
            int res = a / b;
            System.out.println("Результатом деления является число: " + res);
        } else if(input.equals("+")){
            int res = a + b;
            System.out.println("Результатом сложения является число: " + res);
        } else if(input.equals("-")){
            int res = a - b;
            System.out.println("Результатом вычитания является число: " + res);
        } else if(input.equals("*")){
            int res = a * b;
            System.out.println("Результатом умножения является число: " + res);
        } else {
            System.out.println("Такой операции не существует");
        }


    }

}
