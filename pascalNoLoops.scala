object pascalNoLoops{
  def main(args: Array[String]){
    var list = List(1);
    var value = 6;
    pascal(list,0,value);
  }
  def pascal(list: List[Int],i: Int, value: Int):Unit = {
    var temp = list;
    var j = i;
    if(j==value){
      println("done");
    }
    else{
      println(temp)
      temp = temp :+ 0
      temp = 0 +: temp
      temp = temp.sliding(2).toList.map(_.sum)
      j=j+1
      pascal(temp,j,value)
    }
  }
}
