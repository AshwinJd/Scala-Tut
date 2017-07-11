import scala.collection.mutable.ListBuffer


object test1{
  def main(args:Array[String]){
    var arr = Array(1,1,2,3,4,5,5,6);
    var newList = new ListBuffer[Int]()
    var nonrepeat = new ListBuffer[Int]()
    for(i <-1 to (arr.length -2)){
      if((arr(i) == arr(i+1)) || (arr(i-1)==arr(i)) )
        newList+= arr(i);
      else
        nonrepeat += arr(i)
    }
    println(newList.toList.distinct);
    println(nonrepeat.toList.distinct);
  }
}
