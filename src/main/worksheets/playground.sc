// use this to test out your ideas

// excercise: using foreach
val a = List(1, 2, 3, 4)
def printdouble (s: Int) = {
  val number = 2*s
  print(s"|$number|")
}
a.foreach(printdouble)

val duplicate = a.map(_ * 2)

// (Int) => List[U]
val duplicate2 = a.flatMap(i => List(i * 2))

duplicate(2)

val threePlus = a.map(_ + 3)
val threePlus2 = a.flatMap(i => List(i + 3))


a.filter(i => i%3 == 0)