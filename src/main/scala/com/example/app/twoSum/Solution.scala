package com.example.app.twoSum

object Solution {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val numsMap: Map[Int, Int] = nums.zipWithIndex.toMap

    nums.flatMap{ x =>
      val left = target - x
      numsMap.get(left) match {
        case Some(s) => if(numsMap.get(x).get < s) Array(numsMap.get(x).get, s) else Array(-1)
        case None => Array(-1)
      }
    }.filter(x => x != -1)
  }
}
