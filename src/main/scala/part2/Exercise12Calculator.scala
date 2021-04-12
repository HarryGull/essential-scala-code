package part2

import part2.IntCalculator.eval

//import part2.Expr.stringify

// ----------------------------------------------

// Step 1. Write a definition for Expr here!
case class Add(first:Expr, second:Expr) extends Expr
case class Subtraction(first:Expr, second:Expr) extends Expr
case class Mul(first:Expr, second:Expr) extends Expr
case class Division(first:Expr, second:Expr) extends Expr
case class SquareRoot(num:Expr) extends Expr

case class Num(num:Double) extends Expr
sealed abstract class Expr {

  override def toString: String = stringify

  def stringify:String  = {
    this match {
      case Add(num1, num2) => s"$num1 + $num2"
      case Subtraction(num1, num2) => s"$num1 - $num2"
      case Mul(num1, num2) => s"${num1.stringify} x ${num2.stringify}"
      case Division(num1, num2) => s"$num1 / $num2"
      case SquareRoot(num) => s"√$num"
      case Num(num) => num.toString
    }
  }
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
    calc match {
      case Add (expr1, expr2) => eval(expr1) + eval(expr2)
      case Mul (expr1, expr2) => eval(expr1) * eval(expr2)
      case Division (expr1, expr2) => eval(expr1) / eval(expr2)
      case Subtraction (expr1, expr2) => eval(expr1) - eval(expr2)
      case SquareRoot (expr) => eval(expr) / eval(expr)
      case Num (num) => num
    }
  }
}

object IntCalculator {
  def eval(calc: Expr): Int = {
    calc match {
      //case Add (Num(num1), Num(num2)) => (num1 +num2).toInt
      case Add (expr1, expr2) => eval(expr1) + eval(expr2)
      case Mul (expr1, expr2) => eval(expr1) * eval(expr2)
      case Division (expr1, expr2) => eval(expr1) / eval(expr2)
      case Subtraction (expr1, expr2) => eval(expr1) - eval(expr2)
      case SquareRoot (expr) => eval(expr) / eval(expr)
      case Num (num) => num.toInt
    }
  }
}

// ----------------------------------------------

// Step 3. Write some convenience methods
// for constructing common calculations:

// ----------------------------------------------

object Expr {


}

object Exercise11Calculator {
   val calc1: Add = Add(Num(1.1), Mul(Num(2.2), Num(3.3)))

  // val calc2 = Add(Mul(Num(1.1), Num(2.2)), Num(3.3))

  def main(args: Array[String]): Unit = {
    println("stringify")
    println(calc1.stringify)
    // println(calc2.stringify)

    println("Calculator.eval")
    println(Calculator.eval(calc1))
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