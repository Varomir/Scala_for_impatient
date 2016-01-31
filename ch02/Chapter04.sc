print("Answer: ")
println(42)
print("Answer"); println(42)
//printf function like in C
printf("Hello, %s! You are %d years old.\n", "Fred", 42)
//readLine() is deprecated in scala 2.11
//val name = readLine("Your name: ")
val name = scala.io.StdIn.readLine("Your name: ")
print("You age: ")
val age = scala.io.StdIn.readInt()
//readInt() is deprecated in scala 2.11
//val age = readInt()
printf("Hello, %s! Next year, you will be %d.\n", name, age + 1)
