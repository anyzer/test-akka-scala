package com.example.app

import com.example.app.twoSum.Solution

object LeetCodeApp {

  def main(args: Array[String]): Unit = {
    val nums = Array[Int](2, 7, 11, 15)
    val sum = 9

    println("two sum -  https://leetcode.com/problems/two-sum/")
    val result: Array[Int] = Solution.twoSum(nums, sum)
    result.map(println)

  }
}
