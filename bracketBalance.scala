import scala.io.StdIn._

object bracketBalance{
  def main(args:Array[String]){
      println("Enter");
      var brackets = readLine.toList;
      println(brackets)
      if(check(brackets,0)) println("ALL SET");
      else println("Issues");
  }
  def check(bracket: List[Char],flag :Int) : Boolean = {
    if(bracket.isEmpty) return flag==0 ;
    else if (bracket.head == '(') check(bracket.tail,flag+1)
    else if (bracket.head == ')' && flag>0) check(bracket.tail,flag-1)
    else check(bracket.tail,flag)
  }
}
