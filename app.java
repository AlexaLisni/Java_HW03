import java.util.Scanner;

public class app {
    static int[] input_text() {
        System.out.println("Введите числа a, b, c, d \nкак показано на приметре:a:22 b:333 c3 d: 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        System.out.print("c:");
        int c = sc.nextInt();
        System.out.print("d:");
        int d = sc.nextInt();
        int[] array_abcd = new int[] { a, b, c, d };

        return array_abcd;

    }

    static boolean check(int[] arrar) {
        if (arrar[0] >= arrar[1] && arrar[2] >= arrar[1] && arrar[3] >= arrar[1]) {
            return false;
        } else {
            return true;
        }

    }

    static String how_way(int[] array) {
        long[] resultArray = new long[array[1] + 1];
        resultArray[array[0]] = 1;
        int i = 0;
        while (i <= array[1]) {
            if (i % array[2] == 0 && i / array[2] > 0) {
                resultArray[i] += resultArray[i / array[2]];
            }
            if (i > array[0] && i - array[3] > 0) {
                resultArray[i] += resultArray[i - array[3]];
            }
            i++;
        }
        String resultText = Long.toString(resultArray[array[1]]);
        return resultText;
    }

    static void show_text(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        int[] arr_for_check = input_text();
        boolean check_arr = check(arr_for_check);
        if (check_arr == true) {
            String showMe = how_way(arr_for_check);
            show_text(showMe);
        } else {
            System.out.println("Не коректные данные");
        }
    }

}