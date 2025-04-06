import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] expenses = {70_000, 53_500, 89_990, 40_000, 106_000};
        int totalExpenses = 0;
        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");

        System.out.println("Задача №2");
        int[] expenses1 = Arrays.copyOf(expenses, expenses.length);
        int maxExpenses = expenses1[0];
        int minExpenses = expenses1[0];
        for (int i = 0; i < expenses1.length; i++) {
            if (expenses1[i] < minExpenses) {
                minExpenses = expenses1[i];
            }
            if (expenses1[i] > maxExpenses) {
                maxExpenses = expenses1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses +
                " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");

        System.out.println("Задача №3");
        int[] expenses2 = Arrays.copyOf(expenses, expenses.length);
        double totalExpenses1 = 0.0;
        double mediumExpenses = 0.0;
        for (int i = 0; i < expenses2.length; i++) {
            totalExpenses1 += expenses2[i];
            mediumExpenses = (totalExpenses1 / expenses2.length);
        }
        System.out.println("Средняя сумма трат за месяц составила " + mediumExpenses + " рублей.");

        System.out.println("Задача №4");
        char[] employeeName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = employeeName.length - 1;
        while (left < right) {
            char upheaval = employeeName[left];
            employeeName[left] = employeeName[right];
            employeeName[right] = upheaval;
            left++;
            right--;
        }
        System.out.println(employeeName);
    }
}