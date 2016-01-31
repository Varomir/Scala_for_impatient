//throw new IllegalArgumentException("x should not be negative")
println("after unhandled exception, it would be never run")

val z = -0
if (z >= 0) { math.sqrt(z)
} else throw new IllegalArgumentException("x should not be negative")
//Return type Double & Nothing => Double

//CATCH exception
def root(x: Double) =
  if (x >= 0) { math.sqrt(x)
  } else throw new IllegalArgumentException("x should not be nagative")
try {
  println(root(4))
  println(root(-4))
} catch {
  case e: Exception => println(e)
}

import java.net._
import javax.imageio._
import javax.swing._
import java.io.IOException

def process(u: URL): Unit = {
  val img = ImageIO.read(u)
  JOptionPane.showMessageDialog(null, null, null, 0, new ImageIcon(img))
}

val url = "http://horstmann.com/fred.gif"
try {
  process(new URL("http://horstmann.com/cay-tiny.gif"))
  process(new URL(url))
} catch {
  case _: MalformedURLException => println("Bad URL: " + url)
  case ex: IOException => ex.printStackTrace()
}


//TRY-FINALLY
import java.io._

def process(in: InputStream): Unit = {
  var bytes = -1
  var next = 0
  while (next != -1) {
    next = in.read()
    bytes += 1
  }
  println(bytes + " bytes")
}

var in = new URL("http://horstmann.com/cay-tiny.gif").openStream()
try {
  process(in)
} finally {
  in.close()
}

// TRY-CATCH-FINALLY is no good. What happen if close method throws an exception?
in = new URL("http://horstmann.com/cay-tiny.gif").openStream()
try {
  process(in)
} catch {
  case ex: IOException => println(ex)
} finally {
  in.close()
}

//Double TRY like in Java
try {
  in = new URL("http://horstmann.com/cay-tiny.gif").openStream()
  try {
    process(in)
  } finally {
    in.close()
  }
} catch {
  case ex: IOException => println(ex)
}
