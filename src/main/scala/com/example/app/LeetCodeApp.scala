package com.example.app

import java.text.SimpleDateFormat
import java.util.Calendar

import cats.instances.{char, map}

import scala.collection.immutable._

object LeetCodeApp {

  def main(args: Array[String]): Unit = {
    println("==================== Solution ==============================")

    val input = 125
    val binary = input.toBinaryString

    println(binary)

    println("==================== Solution ==============================")
    ()
  }

  def longestConsecutive(s: String): (Char, Int) = {
    Iterator.iterate(('\u0000', 0, 0)) { case (ch, longestRun, i) =>
      val run = (i until s.length)
        .takeWhile(s(_) == s(i))
        .size

      if (run > longestRun) (s(i), run, i + run)
      else (ch, longestRun, i + run)
    }
      .dropWhile(i => s.isDefinedAt(i._3))
      .take(1)
      .map(x => (x._1, x._2))
      .next()
  }


}

//01 1111111111 1111111111 1111111111