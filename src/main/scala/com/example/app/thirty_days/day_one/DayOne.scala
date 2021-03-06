package com.example.app.thirty_days.day_one

import java.util.Scanner

import cats.effect.IO

object DayOne {
  def putStringLine(value: String) = IO(println(value))
  val readline: IO[String] = IO(scala.io.StdIn.readLine())

  def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Long = {
    val tip = meal_cost * tip_percent
    val tax = meal_cost * tax_percent
    val cost = meal_cost + (tip + tax) / 100
    Math.round(cost)
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val meal_cost = stdin.readLine.trim.toDouble

    val tip_percent = stdin.readLine.trim.toInt

    val tax_percent = stdin.readLine.trim.toInt

    solve(meal_cost, tip_percent, tax_percent)
    ()
  }
}
