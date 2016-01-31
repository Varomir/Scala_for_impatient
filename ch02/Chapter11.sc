lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
println(words.length)
//lazy val potencialError = scala.io.Source.fromFile("~/unexistingFile").mkString
//println("No appeal, no 'java.io.FileNotFoundException'")
//val - evaluate only once when 'words1'declared
// -> lazy - evaluate only once when first appeal to 'words2'
// def - evaluate each time whet 'words3' appeals
val words1 = scala.io.Source.fromFile("/usr/share/dict/words").mkString
lazy val words2 = scala.io.Source.fromFile("/usr/share/dict/words").mkString
def words3 = scala.io.Source.fromFile("usr/share/dict/words").mkString
import javax.swing.JOptionPane._
println("Defining First Name")
val firstName = showInputDialog("Your First Name")
println("Printing once")
println(firstName)
println("Printing twice")
println(firstName)

println("Defining Last Name")
lazy val lastName = showInputDialog("Your Last Name")
println("Printing once")
println(lastName)
println("Printing twice")
println(lastName)
println("Defining age")
def age = showInputDialog("Your age")
println("Printing once")
println(age)
println("Printing twice")
println(age)
