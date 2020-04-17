import scala.io.StdIn.readInt

object Main {
    def main(args: Array[String]) {
        val x: Int = readInt()
        val y: Int = readInt()
        val prod: Int = x * y
        println(f"PROD = $prod")
    }
}
