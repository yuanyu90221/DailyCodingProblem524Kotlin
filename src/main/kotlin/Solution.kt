class Solution {
    fun maxSubArraySum(nums: IntArray): Int {
        var max: Int = 0
        var accum: Int = 0
        for (num in nums) {
            accum += num
            if (accum < num) {
                accum = num
            }
            if (max < accum) {
                max = accum
            }
        }
        return max
    }
}