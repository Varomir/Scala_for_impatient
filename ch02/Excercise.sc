val N1 = "#1 - The 'signum' of a number is 1 if the number is positive, \n–1 if it is negative, and 0 if it is zero. Write a function that computes this value."
def signum(n: Double) = if (n > 0) 1 else if (n == 0) 0 else -1
signum(2)
signum(-0.0)
signum(-3.5)
println
val N2 = "#2 - What is the value of an empty block expression {} ? \nWhat is its type?"
val emptyBlock: Unit = {}
val u = {}.getClass
println
val N3 = "#3 - Come up with one situation where \nthe assignment 'x = y = 1' is valid in Scala.\n(Hint: Pick a suitable type for x .)"
var x: Unit = print()
var y = 0
x = y = 1
println(x.isInstanceOf[Unit])
println
val N4 = "#4 - Write a Scala equivalent for the Java loop\nfor (int i = 10; i >= 0; i--) System.out.println(i);"
println("Imperative style, we must to use 'var' with while or do loop")
var n = 10
while (n >= 0) { println(n); n -= 1 }
n = 10
do { println(n); n -= 1 } while (n >= 0)
println("Functional style: use 'for-comprehension'")
for (i <- 0 to 10; from = 10 - i) println(from)
println("Or we can use 'by' to indicate specific step value")
for(i <- 10 to 0 by -1) println(i)
println
val N5 = "#5 - Write a procedure 'countdown(n: Int)' that prints the numbers from n to 0."
def countdown(n: Int) { for (i <- 0 to n; from = n - i) println(from) }
countdown(5)
countdown(-5)
def countdown2(n: Int) {for (i <- Range(n, 0, -1)) println(i)}
countdown2(4)
println
val N6 = "#6 - Write a for loop for computing the product \nof the Unicode codes of all letters in a string. " +
  "\nFor example, the product of the characters in \"Hello\" is 9415087488L"
def unicodeProduct(str: String) = {
  var result = 1l
  for (i <- str) result *= i
  result
}
println(unicodeProduct("Hello"))
println(99.toChar + " " + unicodeProduct("c"))
println
val N7 = "#7 - Solve the preceding exercise without writing a loop. \n(Hint: Look at the 'StringOps' Scaladoc.)"
println("Hello".map(_.toLong).product)
println
val N8 = "#8 - Write a function product(s : String) that computes \nthe product, as described in the preceding exercises."
def prod(str: String) = {str.foldLeft(1l)(_ * _)}
println(prod("Hello"))
println
val N9 = "#9 - Make the function of the preceding exercise a recursive function."
def prodRec(str: String): Long = {
  var result = 1l
  if (str.length > 0) { result = str.head * prodRec(str.tail) }
  result
}
prodRec("Hello")
prodRec("")
println
val N10 = "#10 - Write a function that computes x^n, where n is an integer. \nUse the following recursive definition:" +
  "\nxn = y2 if n is even and positive, where y = x ^ n / 2." +
  "\nxn = x * x ^ n - 1 if n is odd and positive.\nx0 = 1\nxn = 1 / x ^ -n if n is negative.\nDon't use a return statement."
def mySqr(x: Double, n: Int): Double = {
  var result: Double = 1.0
  if (n > 0 && n % 2 == 0) {
    mySqr(mySqr(x, n / 2), 2)
  }
  else if (n > 0) {
    result = x * mySqr(x, n - 1)
    result
  } else if (n < 0) {
    result = 1 / mySqr(x, -n)
    result
  } else result
}
mySqr(2, 2)
mySqr(10, 3)
mySqr(3, 4)
mySqr(4, -1)
mySqr(5, 0)