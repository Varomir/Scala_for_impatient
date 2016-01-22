import java.math.BigInteger

import scala.math.BigInt

val s = "Hello"
s(1)
"Hello"(4)
//C++ => s[i];
//Java => s.charAt(i);
s.apply(1)
//StringOps
//override def apply(index: Int): Char = repr charAt index
"Hello".apply(4)

//String to BigInt
BigInt("1234567890")
BigInt.apply("1234567890")
//COMPANION OBJECT BigInt.apply()
def apply(x: String): BigInt = new BigInt(new BigInteger(x))

BigInt("1234567890") * BigInt("112358111321")

Array(1, 4, 9, 16)
Array.apply(1, 4, 16, 256)
//COMPANION OBJECT Array.apply()