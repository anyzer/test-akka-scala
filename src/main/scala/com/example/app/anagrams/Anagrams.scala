package com.example.app.anagrams

import com.example.app.ListNode

import scala.collection.immutable

object Anagrams {

  def sherlockAndAnagrams(s: String): Int = {
    s.inits.flatMap { x =>
      x.tails.toList.init.map(_.toCharArray.sorted.mkString)
    }.toList.groupBy(identity).map { x => x._2.size
    }.map { x => List.range(0, x).foldLeft(0)(_ + _)
    }.foldLeft(0)(_ + _)
  }

  def sherlockAndAnagrams_1(s: String): Int = {
    println("s: " + s)

    val temp1 = s.inits.flatMap { x =>
      x.tails.toList.init.map(_.toCharArray.sorted.mkString)
    }.toList
    temp1.foreach(println)
    println("=====")

    val temp1_1 = temp1.groupBy(identity).map { x =>
      x._2.size
    }
    temp1_1.foreach(println)
    println("=====")

    val temp2 = temp1_1.map { x =>
      if (x == 0 || x == 1) {
        0
      }
      else if (x == 2) {
        1
      }
      else if (x == 3) {
        3
      }
      else if (x == 4) {
        6
      }
      else if (x == 5) {
        10
      }
      else {
        15
      }
    }
    temp2.foreach(println)
    println("=====")

    val temp3 = temp2.foldLeft(0)(_ + _)
    println("temp3: " + temp3)

    temp3
  }

}
