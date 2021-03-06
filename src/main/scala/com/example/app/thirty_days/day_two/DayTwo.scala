package com.example.app.thirty_days.day_two

import cats.effect.IO

object DayTwo {
  def putStringLine(value: String) = IO(println(value))
  val readline: IO[String] = IO(scala.io.StdIn.readLine())

  def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Long = {
    val tip = meal_cost * tip_percent
    val tax = meal_cost * tax_percent
    val cost = meal_cost + (tip + tax) / 100
    Math.round(cost)
  }
}
