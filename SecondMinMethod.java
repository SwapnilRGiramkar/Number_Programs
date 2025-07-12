//This program find Second minimum number of given number
class SecondMinDigit 
{
    public static void main(String[] args) 
    {
        System.out.println(minNum(4892, 2)); // Expected: 4
    }

    public static int minNum(int num, int min) 
    {
        int[] freq = new int[10]; // store digit frequencies

        int temp = num;
        // Count digit frequencies
        while (temp != 0) {
            int digit = temp % 10;
            freq[digit] = 1; // mark digit as present
            temp /= 10;
        }

        int count = 0;
        // Traverse from smallest to largest digit
        for (int i = 0; i <= 9; i++) {
            if (freq[i] == 1) {
                count++;
                if (count == min) {
                    return i; // return k-th minimum digit
                }
            }
        }

        // If there aren't enough unique digits
        return -1;
    }
}

