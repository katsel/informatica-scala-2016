// Starting Point
val react = "React(generation=0,time=0,view=__W_W_W__,energy=100)"
val params: Array[String] = react.split('(')(1).dropRight(1).split(',')

// iterate over the params and get (key,value)-tuples - the imperative way

// a) for-loop: with side-effect => an anti-pattern in scala
var keyValueTuples1: Array[(String,String)] = Array.ofDim(params.length)
for (i<-0 until params.length) {
  val kv: Array[String] = params(i).split('=')
  keyValueTuples1.update(i,(kv(0),kv(1))) // Note: Arrays can be updated ==> mutable!
}
val paramMap1: Map[String, String] = keyValueTuples1.toMap

// b) the 1/2 Java way - with side-effect => an anti-pattern in scala

// ---- short trip: lambdas
def aMethodWith1StringParam (s: String) = print (s"|$s|")
params.foreach(aMethodWith1StringParam)

// ... actually 'aMethodWith1StringParam' is scala-internally converted to a lambda expression
val aLambdaExpression: (String) => Unit = (s:String) => print (s"|$s|")
params.foreach(aLambdaExpression)

// ... or even shorter
params.foreach(s => print (s"|$s|"))

// ----------------- EXERCISE 04 - 2
var keyValueTuples: Array[(String,String)] = Array.ofDim(params.length)

// - collect the kv-array-elements in a foreach-expression
// - when finished: decomment the following line and check your result
// val paramMap: Map[String, String] = keyValueTuples.toMap