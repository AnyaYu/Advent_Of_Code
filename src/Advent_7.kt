/**
 * Created by annayushina on 14/12/16.
 */

import java.io.File


fun main(args: Array<String>) {

    val input: List<String> = File("/Users/annayushina/Documents/advent_7.txt").readLines().filter { it.isNotBlank() }


    fun hasAbba(string: String): Boolean {
        var result = false
        for (i in 0..string.length - 4) {
            if (string[i] == string[i + 3] && string[i + 1] == string[i + 2] && string[i] != string[i + 1]) {
                result = true
            }
        }
        return result
    }


    fun separateString(string: String): Pair<List<String>, List<String>> {
        val split: List<String> = string.split("[\\[\\]]".toRegex())

        val inB = "\\[[a-z]*\\]".toRegex().findAll(string).map { it.value }.toList()
        //split.slice(1..split.lastIndex step 2)
        val notInB = split.slice(0..split.lastIndex step 2)
        return Pair<List<String>, List<String>>(notInB, inB)
    }

    fun isValidPair(pair: Pair<List<String>, List<String>>) =
            pair.first.any { hasAbba(it) } && !pair.second.any { hasAbba(it) }

    fun hasABAandBAB(pair: Pair<List<String>, List<String>>): Boolean {

        for (notInB in pair.first) {
            for (k in 0..notInB.length - 3) {
                if (notInB[k] == notInB[k + 2] && notInB[k] != notInB[k + 1]) {
                    val a = notInB[k]
                    val b = notInB[k + 1]
                    val bab = "$b$a$b"
                    if (pair.second.any { bab in it }) return true

                }
            }
        }
        return false
    }

    val sumABA = input.count { hasABAandBAB(separateString(it)) }

    val sum = input.count{isValidPair(separateString(it))}


    println(sum)
    println(isValidPair(Pair(listOf("iooi", "uuoo"), listOf("yuui", "yooy"))))
    println(sumABA)
    println(separateString(input[1]))
    println(hasABAandBAB(separateString("asattttt [saiuiui] idjdjdij")))
}
