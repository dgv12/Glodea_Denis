package homework_4;

public class homeWork4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int index = 0; index != numbers.length; index++) {
            numbers[index] = index;
            System.out.println(numbers[index]);
        }
        int suma = 0;
        long multiply = 1;
        for (int index = 1; index != numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                suma += numbers[index];
            } else {
                multiply *= numbers[index];
            }
        }
        System.out.println("Suma para = " + suma);
        System.out.println("Suma imparara inmultita = " + multiply);

        int[] copyNumbers = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            copyNumbers[index] = numbers[index];
            System.out.println(copyNumbers[index]);
        }

    }
}
