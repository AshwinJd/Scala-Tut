import scala.io.Source
import java.io.File
import java.io.PrintWriter

object yahooFiltering{

  def filter(){
    val data = Source.fromFile("yahoo_stocks.csv")

    val listData = data.getLines.toList.tail
    val export = new PrintWriter(new File("2010_filtered_data.csv"))

    listData.foreach{item =>
      val date = item.split(",").toList.head.split("-").head
      if(date == "2010"){
        // println(item);
        export.write(item+"\n")
      }
    }


    export.close()

  }

  // def monthlyReports(){
  //   val data = Source.fromFile("yahoo_stocks.csv")
  //
  //   val listData = data.getLines.toList.tail
  //   val newList = listData.map(item => {
  //     // var temp
  //     item.split(",").toList.head.split("-").toList.
  //     // println(temp)
  //   })
  //   // for(e<-newList){println(e.head)}
  //   // var new = listData.groupby(_.head.split("-").toList.)
  //
  // }
  def main(args: Array[String]){
    filter()
    // monthlyReports()
  }

}
