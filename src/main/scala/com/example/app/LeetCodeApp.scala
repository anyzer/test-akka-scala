package com.example.app

import java.io.PrintWriter

import com.example.app.anagrams.Anagrams
import com.example.app.twoSum.SolutionTwoSum

object LeetCodeApp {

  def main(args: Array[String]): Unit = {
    println("==================== Diagonal Difference ==============================")
    val a = Array[Int](11, 2, 4)
    val b = Array[Int](4, 5, 6)
    val c = Array[Int](10, 8, -12)
    val m = Array[Array[Int]](a, b, c)
    diagonalDifference.diagonaliDiff.solution(m)


    println("==================== https://www.hackerrank.com/challenges/solve-me-first/problem ==============================")
    val array = Array[Int](1, 2, 3)
    println(s"Sum = ${array.toList.sum}")

    val bob = Array[Int](2, 1, 2)

//    List[Int](1, 2, 3)

    val temp: Array[(Int, Int)] = array.zip(bob)
    val temp_1: Array[(Int, Int)] = temp.map{ x =>
      if(x._1 > x._2) {
        (1, 0)
      } else if(x._1 < x._2) {
        (0, 1)
      } else {
        (0, 0)
      }
    }

    val t: (Int, Int) = temp_1.unzip match {
      case (a, b) => (a.sum, b.sum)
    }

    val tt = t.productIterator.toArray
    tt.map(println)

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

    ()
  }

}
