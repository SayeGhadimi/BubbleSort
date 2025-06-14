public class BubbleSort {
    public static void bubbleSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] list = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextDouble();
        }

        bubbleSort(list);

        System.out.print("Sorted numbers: ");
        for (double n : list) {
            System.out.print(n + " ");
        }
    }
}
