package com.example.app.thirty_days.day_one

import cats.effect.IO

object DayOne {
  def putStringLine(value: String) = IO(println(value))
  val readline: IO[String] = IO(scala.io.StdIn.readLine())

  //println input line
  def oneDayTask(): Unit = {
    for{
      n <- readline
      _ <- putStringLine(n)
    } yield()
  }

  def main(args: Array[String]): Unit = {
    oneDayTask()
  }
}
