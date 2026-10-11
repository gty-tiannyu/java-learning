package leetcode.p0009;

// 9. 回文数（简单）  https://leetcode.cn/problems/palindrome-number/
//
// 思路：把一个整数整个反转过来，再和原数比。
//   - 负数一定不是回文（'-' 只出现在左边，右边没有），所以先挡掉。
//   - 反转用 while 循环：每次取出最后一位（x % 10），接到 reversed 的后面（reversed * 10 + 取出的位）。
//   - 循环里必须让 x 变小（x = x / 10），否则死循环。
//
// 复杂度：时间 O(log n)（n 有几位就转几次），空间 O(1)。
// 踩过的坑：① 比较用 == 不是 =；② 分号必须是英文的；③ x = x / 10 不能忘。
class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return reversed == original;
    }
}
