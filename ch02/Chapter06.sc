for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")

//FOR- expression with guard
for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")

for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")
for { i <- 1 to 3
      from = 4 - i
      j <- from to 3 }
  print((10 * i + j) + " ")

//YIELD -> FOR-COMPREHENSION
for(i <- 1 to 10) yield i % 3

for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar

for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar