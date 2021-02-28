package com.example

import com.example.app.ListNode
import org.scalatest.FunSuite
import scala.collection.immutable.WrappedString
import scala.runtime.Tuple2Zipped

class GeneralTest extends FunSuite {

  test("test array get") {
    val na_3 = new ListNode(3)
    val na_2 = new ListNode(2, na_3)
    val na_1 = new ListNode(1, na_2)

    val nb_3 = new ListNode(3)
    val nb_2 = new ListNode(2, nb_3)
    val nb_1 = new ListNode(1, nb_2)

    val str = "kkkk"
    val temp = str.inits.flatMap { x =>
      x.tails.toList.init.map(_.toCharArray.sorted.mkString)
    }.toList.groupBy(identity).map { x => x._2.size
    }.map { x => List.range(0, x).foldLeft(0)(_ + _)
    }.foldLeft(0)(_ + _)

    println("Result: " + temp)
  }

}
