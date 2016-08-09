// Tutorial Bot #1: Hello World

class ControlFunction {

  // The only door to the EXTERNAL world:
  //
  // Callback function, which is always called, when anything in the world around changes.
  val name = "Scala"
  var counter = 0
  def respond(input: String): String = {
    counter += 1
    s"Status(text=Hello $name$counter)"
  }
}


// ----------------------------------------------------------------------------------
// INTERNALS (you don't need to touch this during the workshop!)
//
// Entry Point for the Server
class ControlFunctionFactory {
  def create = new ControlFunction().respond _
}
