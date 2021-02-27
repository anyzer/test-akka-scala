package com.example.app.twoSum

object Solution {

  //  def twoSum(arr: Array[Long], sum: Long): Array[Int] = {
  //    val tmp = arr.zipWithIndex
  //    val r: Array[(Int, Int)] = for {
  //      t1 <- tmp
  //      t2 <- tmp if t1._2 != t2._2 && (t1._1 + t2._1 == sum)
  //    } yield (t1._2, t2._2)
  //
  //    r.flatMap(x => Array(x._1, x._2))
  //  }

  //  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
  //    val numsMap: Map[Int, Int] = nums.zipWithIndex.toMap
  //
  //    println(s"numsMap: ${numsMap}")
  //    nums.flatMap{ x =>  // x= 1
  //      val left = target - x // left = 9 -1 = 8
  //      numsMap.get(left) match {
  //        case Some(s) if(numsMap.get(x).get < s) => Array(numsMap.get(x).get, s)
  //        case _ => Array(-1)
  //      }
  //    }.filter(x => x != -1)
  //  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val withIndex = nums.zipWithIndex
    val hashMap = withIndex.toMap
    withIndex
      .collectFirst {
        case (value, index) if hashMap.get(target - value).exists(_ != index) =>
          Array(index, hashMap(target - value)).foreach(print)
          println("")
          Array(index, hashMap(target - value))
      }
      .get
  }

  def twoSum_1(nums: Array[Int], target: Int) = {
    val withIndex = nums.zipWithIndex
    val hashMap = withIndex.toMap
    withIndex
      .collect {
        case (value, index) if hashMap.get(target - value).exists(x => index < x) =>
          Array(index, hashMap(target - value)).foreach(print)
          println("")
          (index, hashMap(target - value))
      }
  }

}


//object Solution {
//  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
//    val withIndex = nums.zipWithIndex
//    val hashMap = withIndex.toMap
//    withIndex
//      .collectFirst {
//        case (value, index) if hashMap.get(target - value).exists(_ != index) =>
//          Array(index, hashMap(target - value))
//      }
//      .get
//  }
//}