import scala.io.StdIn.readDouble
import scala.math.pow

object Main {
    def main(args: Array[String]) {
        val r = readDouble()
        val A = calcArea(r)
        println(f"A=$A%.4f")
    }

    def calcArea(r: Double): Double = {
        val A = pow(r,2) * 3.14159
        return A
    }
}
