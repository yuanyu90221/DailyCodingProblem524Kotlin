import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun maxSubArraySumExample1() {
        assertEquals(137, sol.maxSubArraySum(intArrayOf(34, -50, 42, 14, -5, 86)))
    }
    @Test
    fun maxSubArraySumExample2() {
        assertEquals(0, sol.maxSubArraySum(intArrayOf(-5, -1, -8, -9)))
    }
}