package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true){
            System.out.print("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int temp = scanner.nextInt();
                if(first){
                    first = false;
                    min = temp;
                    max = temp;
                }

                if(temp > max){
                    max = temp;
                }

                if(temp < min){
                    min = temp;
                }
            }
            else{
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        scanner.close();
    }
}
