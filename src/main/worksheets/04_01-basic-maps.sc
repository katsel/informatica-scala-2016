// Starting Point
val react = "React(generation=0,time=0,view=__W_W_W__,energy=100)"
val params: Array[String] = react.split('(')(1).dropRight(1).split(',')

// We want the params in a dictionary/map like ...
val paramsMap = Map (("generation","1"),("time","0"),("view","__W_W_W__"),("energy", "100"))
val paramsMapAlternative = Map ("generation"->"1","time"->"0","view"->"__W_W_W__","energy"-> "100")

// ... so that we can access the values of the single parameters
paramsMap("generation")
//TODO paramsMap("x")

val energy: String = paramsMap("energy") // less errorprone/more flexible than:
val energy1 = params(3).split('=')(1)

// useful methods
paramsMap.keys
paramsMap.values

// Coming next: How do the parameters come into a map-structure ???