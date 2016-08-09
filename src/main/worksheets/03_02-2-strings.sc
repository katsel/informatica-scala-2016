// Motivation: remove the last char of a string

// a) the Java-Way
val s: String = "hello"
s.substring(0,s.length-1)

val sEmpty = ""
// TODO What happens here???
// sEmpty.substring(0, sEmpty.length-1)
// ------------------ Exercise

//// b) the Scala-Way
s.dropRight(1)
//// TODO What happens here???
// sEmpty.dropRight(1)
//
//// -------- EXERCISES
//
// 1. Check http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps
//    Find for a) and b) each 2 solutions with 'take', 'takeRight', 'drop' and/or 'dropRight'
// a)
"Hello".takeRight(2) // =>lo
"Hello".drop(3) // =>lo

// b)
"Hello".dropRight(3) // => 'He'
"Hello".take(2) // => 'He'

// 2 extract the energy value (99) as integer from the following token1-String
val token1="energy=99)" // --> 99
val energylevel = token1.split('=')(1).dropRight(1)

// 3. implement 'respond': It should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=${energy-2})" as string if the input state is 'Goodbye'
// - else: "Status(text=?)"
// try to solve with: 'split' and toXXX and dropRight
def respond(input:String) : String = {
  val tokens = input.split('(')
  val answer = if(tokens(0) == "nothing") {
    "?"
  } else if(tokens(0) == "React") {
    "onReact"
  } else if(tokens(0) == "Goodbye") {
    val energy = tokens(1).split('=')(1).dropRight(1)
    val energynew = energy.toInt - 2
    s"$energynew"
  }
  s"Status(text=$answer)"
}

respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)"
respond("Goodbye(energy=99)") // expected: Status(text=97)

// 4. Instead of an if-statement a match can be used, which is ressembles a
//    switch in java/js.
//    See http://docs.scala-lang.org/tutorials/tour/pattern-matching.html for how it works.
//    Implement 3 with pattern-matching.

def respond_match(input:String) : String = {
  val tokens = input.split('(')
  tokens(0) match {
    case "React" => "Status(text=onReact)"
    case "Goodbye" => {
      val energy = tokens(1).split('=')(1).dropRight(1)
      val energynew = energy.toInt - 2
      s"Status(text=$energynew)"
    }
    case _ => "Status(text=?)"
  }
}

respond_match("nothing") // expected: Status(text=?)
respond_match("React(...") // expected: Status(text=onReact)"
respond_match("Goodbye(energy=99)") // expected: Status(text=97)
