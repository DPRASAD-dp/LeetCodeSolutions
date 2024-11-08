class Solution {
    public int bulbSwitch(int n) {
        // The number of bulbs that are on corresponds to the number of perfect squares <= n
        return (int) Math.sqrt(n);
    }
}
