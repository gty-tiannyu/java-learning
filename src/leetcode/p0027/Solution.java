package leetcode.p0027;

// 27. 移除元素（简单）  https://leetcode.cn/problems/remove-element/
//
// 思路（快慢指针 / 读写双游标）：
//   - k 是「写游标」，意思是"下一个能放数的位置"，从 0 开始。
//   - i 是「读游标」，从第一个数扫到最后一个。
//   - 遇到不等于 val 的数，就把它写到 nums[k]，再把 k 往后挪一格。
//   - 遇到等于 val 的数，跳过不管（等于把它挤到后面去了）。
//   - 扫完，k 就是留下来的个数，返回它。
//
// 为什么叫"原地"：数组长度改不了，所谓删除其实是"把要留的往前挪"。
//   评测机拿你返回的 k，回头取 nums 的前 k 个元素去比对——所以必须真的改 nums。
//
// 复杂度：时间 O(n)（只扫一遍），空间 O(1)（只用了 k、i 两个变量）。
// 踩过的坑：① return 后面只能跟一个值，写 `return k;`；
//           ② 循环边界必须是 `i < nums.length`，写成 `<=` 会越界
//              （ArrayIndexOutOfBoundsException，因为最大下标是 length-1）。
// 说明：这是我自己填出来的第一道题。k 和 i 就是题解里说的"快慢指针"。
class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
