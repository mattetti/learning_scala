import scala.util._

val name = "Matt Aimonetti"
val email = "matt.aimonetti@email.com"
println("#head retreives the first character")
println(name.head)

println("The same thing can be achieved with #take(1) (from StringOps)")
println(name.take(1))
println("To print the last character we can use #takeRight")
println(name.takeRight(1))

println("Of course, we could have also used #substring")
println(name.substring(0,1))
println(name.substring(name.length-1, name.length))

println("On the oter hand, #drop & #dropRight can be used to 'removed' characters")
println(name.drop(1))
println(name.drop(5))
println(name.dropRight(10))

println("We could also split the string using the white space")
println(name.split(" ")(0))
println(name.split("""\s""")(1))

println("Split takes a string that gets converted in a regexp so you need to be careful, here is an example:")
println("array size after splitting on '.': " + "matt.aimonetti@email.com".split(".").length)
println("in this case, you want to escape the string")
println("array size after splitting on '\\.': " + email.split("\\.").length)
// Or you can quote the entire string, which makes sense in long strings
println("array size after splitting on '\\Q.\\E': "+ email.split("\\Q.\\E").length)
println("array size after splitting on '\"\"\"\\.\"\"\"': "+ email.split("""\.""").length)
