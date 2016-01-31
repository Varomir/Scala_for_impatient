//Block ' { _ } ' is an expression, that return last line of code (las expression)
val x0, y0 = 1.0
val x = 4.0
val y = 5.0
val distance = { val dx = x - x0; val dy = y - y0; math.sqrt(dx*dx + dy*dy)}
// distance = math.sqrt(dx*dx + dy*dy)

var n = 0.0
var r = 1.0
// This is error/bug SBT plugin
//{ r = r*n; n -= 1}

var xx = 1
var yy = 2
yy = 1 //Type of expression Unit()
//Can't assign Unit to x, can't use chain
//xx = yy = 1