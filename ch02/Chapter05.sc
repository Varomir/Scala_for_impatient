var r = 1
var n = 10

while (n > 0) {
  r = r * n
  n -= 1
}
println(r)
r = 1
n = 10
for(i <- 1 to n)
  r = r * i
println(r)
val s = "Hello"
var sum = 0
for (i <- 0 until s.length) //Last value for i is s.length -1
  sum += s(i)
println(sum)

sum = 0
for(ch <- "Hello") sum += ch
println(sum)

import scala.util.control.Breaks._
breakable {
  for(ch <- "Hello World") {
    if(ch == ' ') break;
    println(ch)
  }
}