"Harry".patch(1, "ung", 2)
//Replace "ar" => "ung"
//H-ar+ung+ry => H+ung+ry
"Harry".patch(1, "ung", 1)

//SCALA DOC
//StringOpt.scala - function as a parameter
def count(p: (Char) ⇒ Boolean): Int
//def patch(from: Int, that: GenSeq[A], replaced: Int)(implicit bf: CanBuildFrom[String, B, That]): That
//def patch(from: Int, that: GenSeq[A], replaced: Int): String[A]