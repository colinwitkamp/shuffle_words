import java.io.File
import java.lang.Integer.min

fun isShuffle(a: String, b:String, c: String): Boolean {
    // println("isShuffle $a, $b,$c")
    if (a.startsWith(c) || b.startsWith(c)) {
        return true
    }

    for (i in c.length - 1 downTo 1) {
        val sa = a.substring(0, min(i, a.length))
        val ae = a.substring(min(i, a.length), a.length)
        val sb = b.substring(0, min(i, b.length))
        val be = b.substring(min(i, b.length), b.length)
        val sc = c.substring(0, min(i, c.length))
        val ce = c.substring(min(i, c.length), c.length)

        if (sa == sc) {
            if (isShuffle(ae,b,ce)) {
                return true
            }
        }

        if (sb == sc) {
            if (isShuffle(a,be, ce)) {
                return true
            }
        }
    }
    return false
}

fun main(args: Array<String>) {
    val input = File("input.txt").readText().split(" ")
    println(input.toString())
    val answer = if (isShuffle(input[0], input[1], input[2])) {
        "CORRECT"
    } else {
        "INCORRECT"
    }
    println(answer)
    File("output.txt").writeText(answer)
}
