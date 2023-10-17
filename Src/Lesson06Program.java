import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson06Program {
    public static void main(String[] args) {
        Random random = new Random();
        //int[][][] array3D = new int[8][][];
//
//        int[][] array2D = new int[5][8];
//        System.out.println(Arrays.deepToString(array2D));
//        System.out.println(array2D.length);
//        System.out.println(array2D[0].length);
//        int[][] array2D = new int[8][];
//        for (int i = 0; i < array2D.length; i++) {
//            array2D[i] = new int[i+1];
//        }
//        for (int i = 0; i < array2D.length; i++) {
//            System.out.println(Arrays.toString(array2D[i]));
//        }

//        int[][] manualArray2D = new int[][] {{1,2,3}, {1,2,3,4}, {1,2,3}};
//        for (int i = 0; i < manualArray2D.length; i++) {
//            System.out.println(Arrays.toString(manualArray2D[i]));
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter value for M:");
//        int m = scanner.nextInt();
//        System.out.println("Enter value for N:");
//        int n = scanner.nextInt();
        int[][] array2D = new int[8][8];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = random.nextInt(10);
            }
        }
//
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + ", ");
            }
            System.out.println();
        }

//        int[] arr = {1, 2, 3, 4};
//        int[] arr2 = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr2[i] = arr[i];
//        }
//        System.arraycopy(arr, 0, arr2, 0, arr.length);
//        System.out.println(Arrays.toString(arr2));
//        arr2[0] = 10;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr));
//
//        arr2[0] = 10;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        int[] arr2 = arr;
//        arr2[0] = 10;
//        System.out.println(Arrays.toString(arr));

//        String str1 = "GFG";
//        String str2 = "GFG";
//        String str3 = new String("GFG");
//
//        char[] chars1 = str1.toCharArray();
//        System.out.println(Arrays.toString(chars1));
//        String str4 = new String(chars1);
//        System.out.println(str4);

//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str3));


        //reverse array
//        int[] mas = new int[]{1, 6, 3, 8, 2, 25, 12, 14};
//        System.out.println(Arrays.toString(mas));
//        for (int index = 0; index < mas.length / 2; index++) {
//            int temp = mas[index];
//            mas[index] = mas[mas.length - index - 1];
//            mas[mas.length - index - 1] = temp;
//        }
//        System.out.println(Arrays.toString(mas));


//        int[] array = new int[100];
//        for (int index = 0; index < array.length; index++) {
//            array[index] = random.nextInt(100);
//        }
//
//        Arrays.sort(array);
//        int index = Arrays.binarySearch(array, 52);
//        System.out.println(Arrays.toString(array));
//        System.out.println(index);
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//        int elementToSearch = 49;
//        // умова зупинки
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // якщо середній елемент - цільовий елемент, вернути його індекс
//            if (array[middleIndex] == elementToSearch) {
//
//                System.out.println("find element = " + elementToSearch +
//                        " index = " + middleIndex);
//                break;
//            }
//
//            // якщо середній елемент менший
//            // прирівнюємо наш індекс в middle+1, прибираючи першу частину для перебирання
//            else if (array[middleIndex] < elementToSearch) {
//                firstIndex = middleIndex + 1;
//            }
//            // якщо середній елемент більший
//            // прирівнюємо наш індекс в middle-1, прибираючи другу частину для перебирання
//            else if (array[middleIndex] > elementToSearch) {
//                lastIndex = middleIndex - 1;
//            }
//        }

//        int[] array = new int[100000];
//        array[99999] = 7;
////        int[] array = new int[10];
////        for (int i = 0; i < array.length; i++) {
////            array[i] = random.nextInt(10);
////        }
//        //System.out.println(Arrays.toString(array));
//        int searchElement = 7;
//        long beforeTime = System.currentTimeMillis();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == searchElement) {
//                System.out.println("Element = " + searchElement +
//                        " index = " + i);
//                break;
//            }
//        }
//        long afterTime = System.currentTimeMillis();
//        System.out.println("Time = " + (afterTime - beforeTime));
//        int[] array = new int[100_000];
//        //int[] array = new int[]{4, 2, 8, 5, 1, 0, 14};
//        for (int index = 0; index < args.length; index++) {
//            array[index] = random.nextInt();
//        }
//
//        long beforeTime = System.currentTimeMillis();

//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i; j--) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        Arrays.sort(array);
//        long afterTime = System.currentTimeMillis();
//        System.out.println("Time = " + (afterTime - beforeTime));
        // System.out.println(Arrays.toString(array));
    }
}
