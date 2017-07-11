object test2{
  def main(args:Array[String]){
    var x = Array(1,2,3,4,5,6,7,8);
    var sum = x.reduceLeft(_+_);
    println(sum);
  }
}
