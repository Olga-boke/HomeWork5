import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int[] arrayInt = new int[3];
        arrayInt[0] = 25;
        arrayInt[1] = 54;
        arrayInt[2] = 68;
        for (int i = 0; i < arrayInt.length - 1; i++) {
            System.out.print(arrayInt[i] + ",");
        }
        System.out.println(arrayInt.length - 1);

        double[] arrayDouble = {7.45, 15.74, 65.11, -88.24};

        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.print(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ",");
            }
        }
        System.out.println();

        boolean[] arrayBoolean = {false, true, false, false, true};

        for (int i = 0; i < arrayBoolean.length; i++) {
            if (i == arrayBoolean.length - 1) {
                System.out.print(arrayBoolean[i]);
            } else {
                System.out.print(arrayBoolean[i] + ",");
            }
        }
        System.out.println();

        int counter = arrayInt.length - 1;
        while (counter > 0) {
            System.out.print(arrayInt[counter] + ",");
            counter--;
        }
        System.out.println(arrayInt[0]);

        System.out.println();

        int counterD = arrayDouble.length - 1;
        while (counterD > 0) {
            System.out.print(arrayDouble[counterD] + ",");
            counterD--;
        }
        System.out.println(arrayDouble[0]);

        System.out.println();
        int counterB = arrayBoolean.length - 1;
        while (counterB > 0) {
            System.out.print(arrayBoolean[counterB] + ",");
            counterB--;
        }
        System.out.println(arrayBoolean[0]);

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 !=0) arrayInt[i]++;
            System.out.print(arrayInt[i] +" ");

        }

    }
}