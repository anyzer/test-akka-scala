package com.example

import org.scalatest.FunSuite

class GeneralTest extends FunSuite {

  test("test array get") {
    val test: Array[Int] = Array(1, 3, 3)

    val beforeMap: Array[(Int, Int)] = test.zipWithIndex
    println("test zipWithIndex: " + test.zipWithIndex)

    val te: Map[Int, Int] = test.zipWithIndex.toMap
    println(s"${te}")

    val getIndex: Option[Int] = te.get(3)
    println(getIndex)

    val test_map = Map[Int, Int]((10, 20), (20, 30), (30, 40))
    println(test_map)
    println(test_map.drop(2))

  }

}
