import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//#1
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число:");
//        int n1 = scanner.nextInt();
//        System.out.println("Введите второе число:");
//        int n2 = scanner.nextInt();
//        int sum = n1 + n2;
//        int minus = n1 - n2;
//        int multiply = n1 * n2;
//        int subtract = n1 + n2;
//        int divide = n1 / n2;
//        int rnums = n1 % n2;
//        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nОстаток 2 чисел = %d\n "
//                , sum, minus, multiply, subtract, divide, rnums);
//
////#2
//
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//
////#3
//
//        int a, b, temp;
//        a = 111;
//        b = 222;
//        System.out.println("До : a, b = " + a + ", " + +b);
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("После  : a, b = " + a + ", " + +b);
////#4
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите первое значение : ");
//
//        int num1 = scanner1.nextInt();
//
//        System.out.print("Введите второе значение : ");
//        int num2 = scanner1.nextInt();
//
//        System.out.print("Введите третье значение : ");
//        int num3 = scanner1.nextInt();
//
//        int largest = num1;
//        if (num2 > largest) {
//            largest = num2;
//        }
//        if (num3 > largest) {
//            largest = num3;
//        }
//
//        System.out.println("Наибольшее число : " + largest);
//
////#5
//        Scanner scanner2 = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int num = scanner2.nextInt();
//
//        if (num > 0) {
//            System.out.println(num + " Это число является положительным");
//        } else if (num < 0) {
//            System.out.println(num + " Это число является отрицательным");
//        } else {
//            System.out.println(num + " Ноль");
//        }
//
////#6
//
//        Scanner scanner3 = new Scanner(System.in);
//
//        System.out.print("Введите значение: ");
//        String str = scanner3.nextLine();
//
//        str = str.replace('a', 'b');
//
//        System.out.println("Результат значение: " + str);
//
////#7
//
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        int x = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            x += numbers[i];
//        }
//        System.out.println("Сумма значений массива равна: " + sum);
//
//
////#8
//
//        int[] result = {1, 2, 3, 4, 5, 6};
//
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        for (int res : result) {
//            if (res > max1) {
//                max2 = max1;
//                max1 = res;
//            } else if (res > max2 && res != max1) {
//                max2 = res;
//            }
//        }
//        System.out.println("Второй по величине массив: " + max2);

//LeetCode

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        char[] result1 = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result1[indices[i]] = s.charAt(i);
        }

        System.out.println("Возвращаемое значение: " + new String(result1));


//#2
        int x = 121;

        boolean result = isPalindrome(x);
        System.out.println("Является ли целое число палиндромом? " + result);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return original == reverse;

//#3

//        int num = 14;
//
//        int result = numberOfSteps(num);
//        System.out.println("Number of steps: " + result);
//    }
//
//    public static int numberOfSteps(int num) {
//        int steps = 0;
//        while (num != 0) {
//            if (num % 2 == 0) {
//                num /= 2;
//            } else {
//                num -= 1;
//            }
//            steps++;
//        }
//        return steps;

//#4

//        String[] word1 = {"h", "e", "l", "l", "o"};
//        String[] word2 = {"h", "e", "l", "l", "o"};
//
//        boolean result = arrayStringsAreEqual(word1, word2);
//        System.out.println("Are the two arrays equal? " + result);
//    }
//
//
//    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        StringBuilder sb1 = new StringBuilder();
//        for (String s : word1) {
//            sb1.append(s);
//        }
//        String str1 = sb1.toString();
//
//        StringBuilder sb2 = new StringBuilder();
//        for (String s : word2) {
//            sb2.append(s);
//        }
//        String str2 = sb2.toString();
//
//        return str1.equals(str2);

//#5

//        int[] arr = {1, 4, 2, 5, 3};
//
//        int result = sumOddLengthSubarrays(arr);
//        System.out.println("Sum of odd-length subarrays: " + result);
//    }
//
//    public static int sumOddLengthSubarrays(int[] arr) {
//        int sum = 0;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int len = j - i + 1;
//                if (len % 2 != 0) {
//                    for (int k = i; k <= j; k++) {
//                        sum += arr[k];
//                    }
//                }
//            }
//        }
//        return sum;

    }
}