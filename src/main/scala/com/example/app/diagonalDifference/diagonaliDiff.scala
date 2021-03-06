package com.example.app.diagonalDifference

import com.example.app.ListNode

object diagonaliDiff {

  def solution(arr: Array[Array[Int]]): Int = {
    val size = arr.size
    val list = List.range(0, size)

    list.map(println)

    val first = list.map { x =>
      arr(x)(x)
    }.sum
    println("First: " + first)

    val second = list.map { x =>
      arr(x)(size - x - 1)
    }.sum
    println("Second: " + second)

    Math.abs(first - second)
  }

}
