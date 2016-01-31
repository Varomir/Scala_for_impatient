val x = 0
if (x > 0) 1 else -1
//equals Java or C++
//x > 0 ? 1 : -1
val s = if (x > 0) 1 else -1

if (x > 0) "positive" else -1
//Expression type Any, Any is supertype for String and Int
if (x > 0) 1
if (x > 0) 1 else ()
//Expression type AnyVal (old type was Unit())

//Only in REPL
if (x > 0) { 1
} if (x > 0) { 1
} else if (x == 0) 0 else -1

{
  if (x > 0) { 1
    } else if (x == 0) 0 else -1
}