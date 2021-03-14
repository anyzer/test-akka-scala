package com.example.app

import java.text.SimpleDateFormat
import java.util.Calendar

import cats.instances.{char, map}

import scala.collection.immutable._

object LeetCodeApp {

  def main(args: Array[String]): Unit = {
    println("==================== Solution ==============================")




    println("==================== Solution ==============================")
    ()
  }

  def charCountPairs(s: String): List[(Char, Long)] = {
    s.foldLeft(List.empty[(Char, Long)]) {
      case (Nil, char) => (char, 1L) :: Nil
      case ((prevChar, prevCount) :: tail, char) if prevChar == char => (char, prevCount + 1) :: tail
      case (pairs, char) => (char, 1L) :: pairs
    }
  }

  //  All of the characters are the same, e.g. aaa.
  //  All characters except the middle one are the same, e.g. aadaa.
  def specialString(str: String): Boolean = {
    val size: Int = str.size
    val m: List[Int] = str.toCharArray.toList.groupBy(identity).map {
      _._2.size
    }.toList

    if (size == 1 || m.size == 1) {
      true
    } else if (size % 2 == 0) {
      false
    } else {
      val halfIndex = Math.floor(size.toDouble / 2).toInt
      println("halfIndex: " + halfIndex)
      val firstHalf = str.substring(0, halfIndex)
      println("firstHalf: " + firstHalf)
      val secondHalf = str.substring(halfIndex + 1, size)
      println("secondHalf: " + secondHalf)
      if(firstHalf.equals(secondHalf)) {
        true
      } else {
        false
      }
    }
  }

  def fib1(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fib1(n - 1) + fib1(n - 2)
  }

}

//01 1111111111 1111111111 1111111111