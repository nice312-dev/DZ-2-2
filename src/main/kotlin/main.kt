fun main() {
    val likes = 23101;
    val message = if (likes % 10 == 1 && likes % 100 !== 11) "человеку" else "людям"
    println("Понравилось $likes $message \n")
}
