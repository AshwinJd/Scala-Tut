object fibonacciPatternMatching{
  def main(args: Array[String]){
    val ser = 5
    (1 to ser).map(n => println(fib(n)))
  }
  def fib(n: Int): Int ={
    
    n match {
      case x if x<=0 => 0
      case 0 | 1 => 1
      case x => fib(x-1) + fib(x-2)
    }
  }
}
