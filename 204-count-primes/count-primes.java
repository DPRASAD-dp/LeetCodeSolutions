class Solution {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }

        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = 0;
        }

        for (int i = 2; i * i <= n; i++) {
            for (int j = i + i; j <= n; j += i) {
                a[j] = 1;
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (a[i] == 0) {
                count++;
            }
        }

        return count;
    }
}
