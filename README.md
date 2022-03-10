# DailyCodingProblem524Kotlin

## 問題描述

給定一個數字陣列，找出所有子陣列元素總和的最大值。

舉例來說，給定一個陣列 [34, -50, 42, 14, -5, 86] ，最大子陣列的和是 137，子陣列為 [42, 14, -5, 86] 。

給定陣列 [-5, -1, -8, -9] ，最大子陣列的和是 0 ，這個狀況拿空陣列的做子陣列。

實作這個演算法符合時間複雜度 O(N) 。

## 解題思路

要找出最大子陣列的之和

已知子陣列需要符合一個條件

每個值需要是連續的

假設陣列 A ， 存在一個  n > 1 使得 A 的前 n 的和 < An ，

可以透過以下關係去理解則要形成最大和就會直接從第 n 個開始算，因為必須要連續

所以計算方式如下

初始化最大值 S = 0 ， 當下累計連續何 Accum = 0

遍歷每個元素 A[i]， 每次計算 Accum += A[i]， i 為該元素位址

比較 Accum 跟 A[i] 大小，如果 A[i] > Accum 則設定 Accum = A[i]

比較 S 跟 Accum 大小，如果 Accum > S 則設定  S = Accum

## 程式碼

```kotlin
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
```