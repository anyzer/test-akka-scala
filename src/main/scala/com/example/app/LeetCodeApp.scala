package com.example.app

import com.example.app.twoSum.Solution

object LeetCodeApp {

  def main(args: Array[String]): Unit = {

    println("==================== two sum ==============================")
    val nums = Array[Int](10, 7, 2, 4, 5, 11, 15)
    val sum = 9
    println("two sum -  https://leetcode.com/problems/two-sum/")
    val result = Solution.twoSum(nums, sum)
    result.map(println)
    val result_1 = Solution.twoSum_1(nums, sum)
    result_1.map(println)

  }
}
