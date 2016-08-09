// Tutorial Bot #1: Hello World

class ControlFunction {

  // The only door to the EXTERNAL world:
  //
  // Callback function, which is always called, when anything in the world around changes.
  def respond(input: String): String = {
    val tokens = input.split('(')
    tokens(0) match {
      case "React" => {
        // React(generation=0,time=0,view=W_W_W,energy=100)
        val energy = tokens(1).dropRight(1).split(',')(3).split('=')(1)
        s"Status(text=onReact $energy)|Move(direction=0:-1)"
      }
      case "Goodbye" => {
        val energy = tokens(1).split('=')(1).dropRight(1)
        val energynew = energy.toInt - 2
        s"Status(text=$energynew)"
      }
      case _ => "Status(text=?)"
    }
  }
}


// ----------------------------------------------------------------------------------
// INTERNALS (you don't need to touch this during the workshop!)
//
// Entry Point for the Server
class ControlFunctionFactory {
  def create = new ControlFunction().respond _
}
