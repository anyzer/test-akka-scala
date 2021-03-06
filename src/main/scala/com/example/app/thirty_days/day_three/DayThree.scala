package com.example.app.thirty_days.day_three

import cats.effect.IO

object DayThree {
  def putStringLine(value: String) = IO(println(value))
  val readline: IO[String] = IO(scala.io.StdIn.readLine())

  def solve(inputNumber: Int): Unit = {
    inputNumber match {
      case x if(x % 2 != 0) => println("Weird")
      case x if(x >= 2 && x <= 5) => println("Not Weird")
      case x if(x >= 6 && x <= 20) => println("Weird")
      case x if(x > 20) => println("Not Weird")
    }
  }

  def main(args: Array[String]): Unit = {
    solve(4)
  }
}
