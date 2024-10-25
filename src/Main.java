//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int [] array1 = new int [5];
        array1[0] = 2500;
        array1[1] = 10000;
        array1[2] = 12347;
        array1[3] = 15000;
        array1[4] = 1000;
        int sum = 0;
        for (int i = 0; i< array1.length; i++) {
            sum = sum + array1[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        System.out.println();
        System.out.println("Task 2");
        int maxSum = array1[0];
        int minSum = array1[0];
        for (int i = 0; i< array1.length; i++) {
            final int current = array1[i];
            if (current > maxSum) {
                maxSum = current;
            }
            if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Миниимальная сумма трат за неделю составила " + minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей");

        //Task 2_1. for each
        System.out.println();
        System.out.println("Task 2_1");
        for (final int current : array1) {
            if (current > maxSum) {
                maxSum = current;
            }
            if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Миниимальная сумма трат за неделю составила " + minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей");

        //Task 3
        System.out.println();
        System.out.println("Task 3");
        double [] array2 = new double [5];
        array2[0] = 2500;
        array2[1] = 10000;
        array2[2] = 12347;
        array2[3] = 15000;
        array2[4] = 1000;

        double averageSum = 0;
        double sum2 = 0F;
        for (int i = 0; i < array2.length; i++) {
            sum2 = sum2 + array2[i];
        }
        averageSum = sum2 / array2.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");

        //Task 4
        System.out.println();
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
                System.out.print(reverseFullName[i]);
        }
    }
}