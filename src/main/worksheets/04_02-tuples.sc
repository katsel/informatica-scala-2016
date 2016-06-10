//--- EXERCISE 04 - 1
// In 03_02-2-strings.sc we had
val s: String = "hello"

val left = s.dropRight(1)
val right = s.takeRight(1)

// which equals
s.take(4)
s.drop(4)

// be:
val result: (String, String) = (left, right)

// a) What is the type of 'result'? (let Idea Help You: ALT+ENTER)
// b) retrieve 'result' as one-liner with help of 'splitAt'
//    see http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps
// c) "hello" -> "ohell" (via tuples)

val result2 = s.splitAt(4)
result2._2+result2._1