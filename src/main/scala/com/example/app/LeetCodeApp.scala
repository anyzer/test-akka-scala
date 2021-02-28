package com.example.app

import java.io.PrintWriter

import com.example.app.anagrams.Anagrams
import com.example.app.twoSum.SolutionTwoSum

object LeetCodeApp {

  def main(args: Array[String]): Unit = {
    println("==================== anagrams https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem  ==============================")
    println("abba => 4, abcd => 0, ifailuhkqq => 3, kkkk => 10, cdcd => 5")

    println(s"<abba> has result: ${Anagrams.sherlockAndAnagrams("abba")}")
    println(s"<abcd> has result: ${Anagrams.sherlockAndAnagrams("abcd")}")
    println(s"<ifailuhkqq> has result: ${Anagrams.sherlockAndAnagrams("ifailuhkqq")}")
    println(s"<kkkk> has result: ${Anagrams.sherlockAndAnagrams("kkkk")}")
    println(s"<cdcd> has result: ${Anagrams.sherlockAndAnagrams("cdcd")}")


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
