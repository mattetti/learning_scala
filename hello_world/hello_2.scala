// print the passed argument, example: scala hello_2.scala matt
// print the passed argument, example: scala hello_2.scala
// print the passed argument, example: scala hello_2.scala Matt Heidi
if (args.length < 1)
  println("Hello you!")
else
  for (name <- args)
    Console.println("Hello " + name + "!")
