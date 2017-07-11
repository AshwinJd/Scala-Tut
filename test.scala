import scala.collection.immutable._

object MainObject{
  def main(args:Array[String]){

    var map1 = Map(("A","Apple"),("B","Bomb"))
    var map2 = Map("A"->"Apple","B"-> "bomb")
    var empmap = Map()
    println(map1.values)
    println(map2)
    println(empmap)

  }
}
