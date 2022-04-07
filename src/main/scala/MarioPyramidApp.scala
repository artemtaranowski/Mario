object MarioPyramidApp extends App {

  val heightRequested = 5

  def pyramid(heightRequested: Int) =
    val height = heightRequested + 1
    for i <- 2 to height yield
      val hash = "#" * i
      val padding = " " * (height - i)
      padding + hash + " " + hash + padding

  println(pyramid(heightRequested).mkString("\n"))
}
