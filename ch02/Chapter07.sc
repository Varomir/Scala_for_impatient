def abs(x: Double) = if (x >= 0) x else -x
//don't requiere to set type of return value if function isn't recursive
println(abs(3))
println(abs(-3))


def fac(n: Int) = {
  var r = 1
  for (i <- 1 to n) r = r * 1
  r
}
println(fac(10))

//RECURSIVE
def recursiveFact(n: Int): Int = if (n <= 0) 1 else n * recursiveFact(n - 1)
println(recursiveFact(10))
//Recuire require set type of return value for recursive function
