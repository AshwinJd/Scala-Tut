object manyArgsFunction{
  def main(args:Array[String]){

    def sumNum (numbers: Int*): Int = {
      var sum: Int = 0
      for(num <- numbers){
        sum+=num;
      }
      sum;
    }

    println("Sum = " + sumNum(1,2,3,4,5,6,7,8,9,10));
  }
}
