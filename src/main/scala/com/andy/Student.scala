package com.andy

//可以访问伴生对象的所有成员和方法
class Student (name:String,age:Int){
  def printInfo():Unit={
    println(this.name+" "+this.age+" "+Student.school);
  }
}

//引入伴生对象
object Student{
  val school:String="chengdu university of technology";

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 23)
    alice.printInfo();
    bob.printInfo()
  }
}
