package part2

//import part2.Expr.stringify

// ----------------------------------------------

// Step 1. Write a definition for Expr here!
case class Add(first:Expr, second:Expr) extends Expr {
  override def stringify = s"${first.stringify} + ${second.stringify}"
}
case class Subtraction(first:Expr, second:Expr) extends Expr{
  override def stringify = s"$first - $second"
}
case class Mul(first:Expr, second:Expr) extends Expr{
  override def stringify = s"$first x $second"
}
case class Division(first:Expr, second:Expr) extends Expr {
  override def stringify = s"$first / $second"
}
case class SquareRoot(num:Expr) extends Expr {
  override def stringify = s"√$num"
}

case class Num(num:Double) extends Expr {
  override def stringify: String = num.toString
  override def toString: String = stringify

}

sealed abstract class Expr {
  def stringify:String
}



// Handle the following types of equation:
// - addition
// - subtraction
// - multiplication
// - division
// - square root

// Give it a `stringify` method
// that renders the expression as a string.

// ----------------------------------------------

// Step 2. Implement eval
// for each of the "calculator" objects below:

object Calculator {
  def eval(calc: Expr): Double = {
    ???
  }
}

object IntCalculator {
  def eval(calc: Expr): Int = {
    ???
  }
}

// ----------------------------------------------

// Step 3. Write some convenience methods
// for constructing common calculations:

// ----------------------------------------------

object Expr {

//  def stringify:String = this match {
//    case Add(num1, num2) => s"$num1 + $num2"
//          case Subtraction(num1, num2) => s"$num1 - $num2"
//          case Mul(num1, num2) => s"$num1 x $num2"
//          case Division(num1, num2) => s"$num1 / $num2"
//          case SquareRoot(num) => s"√$num"
//          case Num(num) => num.toString
//  }

//  def stringify: String = {
//    this match {
//      case Add(num1, num2) => s"$num1 + $num2"
//      case Subtraction(num1, num2) => s"$num1 - $num2"
//      case Mul(num1, num2) => s"$num1 x $num2"
//      case Division(num1, num2) => s"$num1 / $num2"
//      case SquareRoot(num) => s"√$num"
//      case Num(num) => num.toString
//    }
//  }
  // def pythag(a: Double, b: Double): Expr = {
  //   ???
  // }

  // def factorial(n: Int): Expr = {
  //   ???
  // }
}

object Exercise11Calculator {
   val calc1: Add = Add(Num(1.1), Mul(Num(2.2), Num(3.3)))

  // val calc2 = Add(Mul(Num(1.1), Num(2.2)), Num(3.3))

  def main(args: Array[String]): Unit = {
    println("stringify")
    println(calc1.stringify)
    // println(calc2.stringify)

    println("Calculator.eval")
    // println(Calculator.eval(calc1))
    // println(Calculator.eval(calc2))

    println("IntCalculator.eval")
    // println(IntCalculator.eval(calc1))
    // println(IntCalculator.eval(calc2))

    println("pythag")
    // println(Expr.pythag(3, 4))
    // println(Calculator.eval(Expr.pythag(3, 4)))
    // println(IntCalculator.eval(Expr.pythag(3, 4)))

    println("factorial")
    // println(Expr.factorial(4))
    // println(Calculator.eval(Expr.factorial(4)))
    // println(IntCalculator.eval(Expr.factorial(4)))
  }
}
