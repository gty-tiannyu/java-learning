package leetcode.p0001;

// 1. 两数之和（简单）  https://leetcode.cn/problems/two-sum/
//
// 思路：暴力枚举 —— 把每一对下标都试一遍。
//   - 外层循环 i 走一遍数组；
//   - 内层循环 j 从 i + 1 开始（不能从 0 开始，否则会自己和自己相加，也会重复配对）；
//   - 一旦 nums[i] + nums[j] == target，就把 i、j 打包成数组返回。
//
// 返回值的写法：方法签名承诺返回 int[]，而 return 一次只能还一个东西，
// 所以要现场造一个数组：new int[]{i, j}（arr[0] 是 i，arr[1] 是 j）。
//
// 复杂度：时间 O(n^2)，空间 O(1)。
// 优化方向：等 S2 学完哈希表（HashMap），可以改成 O(n) —— 到时候回来重做一遍。
class Solution {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
