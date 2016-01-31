//Short syntax
def box(s: String) {
  val border = "-" * s.length + "--\n"
  println(border + "|" + s +"|\n" + border)
}

box("procedure")
box("side effect")

//Full syntax
def boxFull(s: String): Unit = { val border = "-" * s.length+"--\n"; print(border+"|"+s+"|\n"+border) }
boxFull("Scala")