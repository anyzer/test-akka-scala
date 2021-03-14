package com.example.app.PlusMinus

import com.example.app.ListNode

object PlusMinus {

  def solution(arr: Array[Int]): Unit = {
    val plus = arr.toList.filter(_ > 0).size
    val minus = arr.toList.filter(_ < 0).size
    val zero = arr.toList.filter(_ == 0).size

    val size = arr.size
    val factor = Math.pow(10, 6)

    val plusRatio = arr.toList.filter(_ > 0).size.toDouble / size.toDouble
    val minusRatio = arr.toList.filter(_ < 0).size.toDouble / size.toDouble
    val zeroRatio = arr.toList.filter(_ == 0).size.toDouble / size.toDouble

    println(Math.round(plusRatio * factor) / factor)
    println(Math.round(minusRatio * factor) / factor)
    println(Math.round(zeroRatio * factor) / factor)


//    println(minus / size)
//    println(1 - (plus / size) - (minus / size))

  }

}
