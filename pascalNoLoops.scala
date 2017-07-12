object pascalNoLoops{
  def main(args: Array[String]){
    var list = List(1);
    var value = 6; // give the value for the no. of rows of pascals triangle
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
      temp = temp :+ 0    // append 0 at the end
      temp = 0 +: temp    // prepend 0 at the beginning
      temp = temp.sliding(2).toList.map(_.sum)
      j=j+1
      pascal(temp,j,value)
    }
  }
}
