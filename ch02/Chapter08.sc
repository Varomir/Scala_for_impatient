def decorate(str: String, left: String = "[", right: String = "]") = left + str + right
//Use default parameters
println(decorate("Scala much better then Java"))
//pass explicit all three parameters
println(decorate("Hello", "<<<", ">>>"))
//pass explicit only one parameter
println(decorate("Hello", ">>>["))
//use with named parameter with wrong order
println(decorate(left = "<<<", str = "Hello", right = ">>>"))
println(decorate("Hello", right = "]<<<"))
//Invoke decorate("Hello", "[", "]<<<")