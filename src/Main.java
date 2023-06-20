public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        String[] arrString = {"Alex", "Bob", "Den"};
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        String[] arrString = {"Alex", "Bob", "Den"};
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]);
            if (i < arrInt.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]);
            if (i < arrDouble.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < arrString.length; i++) {
            System.out.print(arrString[i]);
            if (i < arrString.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        String[] arrString = {"Alex", "Bob", "Den"};
        for (int i = arrInt.length - 1; i >= 0; i--) {
            System.out.print(arrInt[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.print(arrDouble[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = arrString.length - 1; i >= 0; i--) {
            System.out.print(arrString[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[] arrInt = new int[]{1, 2, 3};
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i]++;
            }
            System.out.print(arrInt[i]);
            if (i < arrInt.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}