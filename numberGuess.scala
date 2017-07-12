import scala.io.StdIn._;
//import scala.io.StdIn.{readLine}; // if specifically you want this module then;

object numberGuess{
  def main(args:Array[String]){
    var number = 0;

    do{
      print("Guess a number");
      number = readLine.toInt;
      // There are other methods to take read input like readInt, readByte, readLong, readShort, readDouble
    }while(number!=7);

    printf("You guessed the number %d",number);
  }
}
