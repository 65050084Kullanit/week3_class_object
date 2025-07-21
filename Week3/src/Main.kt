fun main(){
    // Learn about pairs and triples
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")

//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")

//    val numbers = Triple(6, 9, 42)
//    println(numbers.toString())
//    println(numbers.toList())

//    val equipment2 = ("fish net" to "catching fish") to "equipment"
//    println("${equipment2.first} is ${equipment2.second}\n")
//    println("${equipment2.first.second}")

//    val equipment = "fish net" to "catching fish"
//    val (tool, use) = equipment
//    println("$tool is used for $use")

//    val numbers = Triple(6, 9, 42)
//    val (n1, n2, n3) = numbers
//    println("$n1 $n2 $n3")

//-----------------------------------------------------------------------------------------------------------------------------------------------
    //Learn more about collections
//    val list = listOf(1, 5, 3, 4)
//    println(list.sum())

//    val list2 = listOf("a", "bbb", "cc")
//    println(list2.sum())
//    //error: none of the following functions can be called with the arguments supplied:

//    val list2 = listOf("a", "bbb", "cc")
//    //println(list2.sumBy { it.length }) // 6
//    for (s in list2.listIterator()) {
//        println("$s ")
//        /*  a
//            bbb
//            cc  */
//    }

//    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
//    println (scientific.get("guppy")) //poecilia reticulata
//    println(scientific.get("zebra fish")) //danio rerio
////    println("scientific.get("swordtail"") // Error : Kotlin: Unresolved reference 'swordtail'.
//    println(scientific.getOrDefault("swordtail", "sorry, I don't know")) //sorry, I don't know
//    println(scientific.getOrElse("swordtail") {"sorry, I don't know"}) //sorry, I don't know
//--------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Understand extension functions
//    fun String.hasSpaces(): Boolean {
//        val found = this.indexOf(' ')
//        // also valid: this.indexOf(" ")
//        // returns positive number index in String or -1 if not found
//        return found != -1
//    }
//    fun String.hasSpaces() = indexOf(" ") != -1
//
//    class AquariumPlant(val color: String, private val size: Int)
//
//    fun AquariumPlant.isRed() = color == "red"    // OK
//    fun AquariumPlant.isBig() = size > 50         // gives error ⇒ error: cannot access 'size': it is private in 'AquariumPlant'

//    open class AquariumPlant(val color: String, private val size: Int)

//    class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)
//
//    fun AquariumPlant.print() = println("AquariumPlant")
//    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
//
//    val plant = GreenLeafyPlant(size = 10)
//    plant.print()
//    println("\n")
//    val aquariumPlant: AquariumPlant = plant
//    aquariumPlant.print()  // what will it print?
//    /*  GreenLeafyPlant
//
//
//        AquariumPlant
//    */
//    val AquariumPlant.isGreen: Boolean
//    get() = color == "green"
//
//    aquariumPlant.isGreen

//    fun AquariumPlant?.pull() {
//        this?.apply {
//            println("removing $this")
//        }
//    }
//
//    val plant: AquariumPlant? = null
//    plant.pull()

}
    //Organize and define constants
//const val rocks = 3
//val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok
//
//object Constants {
//    const val CONSTANT2 = "object constant"
//}
//val foo = Constants.CONSTANT2
//
//class MyClass {
//    companion object {
//        const val CONSTANT3 = "constant in companion"
//    }
//}