object pascal{
  def main(args:Array[String]){
    var x = 5;
    for(i <- 0 to x){
        println();
      for(j<-0 to i){
        print(pascalFunc(i,j)+ " ");
      }
    }
  }
  def pascalFunc(i: Int,j:Int):Int = if(j==0 || i==j) return 1 else return pascalFunc(i-1,j-1)+pascalFunc(i-1,j);
}
