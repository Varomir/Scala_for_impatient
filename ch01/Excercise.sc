val N1 = "#1 - In the Scala REPL, type 3. followed by the Tab key. \nWhat methods can be applied?"
val ans1 = "=> Do it in REPL \ntype 3. then press TAB key. There are many methods \nlike: %, &, *, +, -, /, >, >=, >>, >>>, ^, asInstanceOf, isInstanceOf, toByte, toChar etc"


val N2 = "#2 - In the Scala REPL, compute the square root of 3, \nand then square that value. By how much does the result \ndiffer from 3? (Hint: The res variables are your friend.)"
math.pow(math.sqrt(3), 2)


val N3 = "#3 - Are the res variables 'val' or 'var'?"
"res1-resN variables actually are 'val'"


val N4 = "#4 - Scala lets you multiply a string with a number—try out \"crazy\" * 3 in the REPL.\nWhat does this operation do? Where can you find it in Scaladoc?"
"crazy" * 3
//Scaladoc StringOps.*()
//def *(n: Int): String
//Return the current string concatenated n times.


val N5 = "#5 - What does 10 max 2 mean? In which class is the max method defined?"
10 max 2
//Scaladoc RichInt.max (Int will be implicitly converted toBigInt)
//def max(that: Int): Int
//Returns this if this > that or that otherwise.


val N6 = "#6 - Using BigInt, compute 2^1024."
val two: BigInt = 2
val ans = two.pow(1024)


val N7 = "#7 -  What do you need to import so that you can get a random prime as \n'probablePrime(100, Random)', without any qualifiers before probablePrime and Random?"
import BigInt.probablePrime
import util.Random
//OR wider import
//*import BigInt._
//*import util._
probablePrime(100, Random)


val N8 ="#8 - One way to create random file or directory names is to produce a random BigInt \nand convert it to base 36, yielding a string such as \"qsnvbevtomcj38o06kul\" \nPoke around Scaladoc to find a way of doing this in Scala."
probablePrime(100, Random).toString(36)
//Scaladoc object BigInt.probablePrime(bitLength: Int, rnd: Random)
//Scaladoc class BigInt.toString(radix: Int)


val N9 = "#9 - How do you get the first character of a string in Scala? The last character?"
//*How do you get the first character of a string in Scala? The last character?
//classic "imperative" style
val someString = "Something interesting!"
someString(0)
someString(someString.length -1)
//OR
someString.take(1)
someString.takeRight(1)
//OR the most natural (functional) way
someString.head
someString.last


val N10 = "#10 - What do the take, drop, takeRight, and dropRight string functions do? What\nadvantage or disadvantage do they have over using substring?"
someString.take(3)
someString.substring(0, 3)
someString.drop(3)
someString.substring(3, someString.length)
someString.takeRight(3)
someString.substring(someString.length-3, someString.length)
someString.dropRight(3)
someString.substring(0, someString.length-3)