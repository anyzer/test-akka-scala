package com.example.app

import java.io.PrintWriter

import com.example.app.anagrams.Anagrams
import com.example.app.twoSum.SolutionTwoSum

object LeetCodeApp {

  def main(args: Array[String]): Unit = {
    println("==================== anagrams https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem  ==============================")
    val stdin = scala.io.StdIn
    val printWriter = new PrintWriter("/Users/guoch/ttt.txt")
    val q = stdin.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val s = stdin.readLine
      val result = Anagrams.sherlockAndAnagrams(s)
      printWriter.println("main: " + result)
    }
    printWriter.close()


    println("==================== two sum ==============================")
    val nums = Array[Int](10, 7, 2, 4, 5, 11, 15)
    val sum = 9
    println("two sum -  https://leetcode.com/problems/two-sum/")
    val result = SolutionTwoSum.twoSum(nums, sum)
    result.map(println)
    val result_1 = SolutionTwoSum.twoSum_1(nums, sum)
    result_1.map(println)

  }

}
