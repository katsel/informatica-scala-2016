// ----------------- convert vice-versa
val anInt = 24345

anInt.toString
s"$anInt"

val asInt = "235".toInt

// TODO: What happens, if the String is not a number???
// "aber".toInt

// TODO: or if the String is a Double???
// val asInt2 = "234.5".toInt

// ----------------- operations on strings

val aConcatenatedString1 = anInt + ", " + anInt + ", " + anInt + " ..." // toString called implicitly
val aConcatenatedString2 = s"$anInt, $anInt, $anInt ..."

val aString: String = "Das ist ein String"
aString.length

val tokens: Array[String] = aString.split(' ')
tokens(0)
tokens(1)
// TODO What happens???
// tokens(10)

tokens(1)="hello"
tokens

// equals in scala ==
val equalsOp = 234.toString=="234"
val refEqualsOp = 234.toString eq "234"

// ------------------ EXERCISE 03 - 2
// respond should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=onGoodbye)" if the input state is 'Goodbye'
// - else "Status(text=?)"
// try to solve with: 'split' and toXXX

def respond(input:String):String = {

  val tokens = input.split('(')

  val res = if (tokens(0) == "nothing") "?"
    else if (tokens(0) == "React") "onReact"
    else if (tokens(0) == "Energy") "onGoodBye"

  s"Status(text=$res)"
}



respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)
respond("Goodbye(energy=99)") // expected: Status(text=onGoodbye)
