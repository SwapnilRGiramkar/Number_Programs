//This program convert the number to words
import java.util.Scanner;

class NumberToWords {
    // Arrays for words
    static String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-9999): ");
        int num = sc.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Out of range!");
        } else {
            System.out.println("In words: " + convert(num));
        }
    }

    public static String convert(int num) {
        if (num == 0)
            return "Zero";

        String result = "";

        if (num >= 1000) {
            result += units[num / 1000] + " Thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            result += units[num / 100] + " Hundred ";
            num %= 100;
        }

        if (num > 0) {
            if (!result.equals("")) result += "and ";

            if (num < 20) {
                result += units[num];
            } else {
                result += tens[num / 10];
                if (num % 10 > 0) {
                    result += "-" + units[num % 10];
                }
            }
        }

        return result.trim();
    }
}

