/**
 * Created by annayushina on 13/12/16.
 */

package advent_5_1

import java.security.MessageDigest
import jdk.nashorn.tools.ShellFunctions.input
import java.math.BigInteger


/**
 * Created by anna on 12.12.2016.
 */

fun main (args: Array<String>) {
    val input = "abbhdwsy"

    fun getHash(input: String): String {
        val bytesOfMessage = input.toByteArray(Charsets.UTF_8)
        val md: MessageDigest = MessageDigest.getInstance("MD5")
        md.update(bytesOfMessage)
        val digest: ByteArray = md.digest()
        val bigInt = BigInteger(1, digest)
        val hashText = bigInt.toString(16).padStart(32, '0')
        return hashText
    }


    fun getPassword(input: String) = buildString {
        (0..Int.MAX_VALUE).forEach { i ->
            val hash: String = getHash(input + i)
            if (hash.startsWith("00000")) {
                append (hash[5])
                print(hash[5])
            }

            if (length == 8) return@buildString
        }
    }


    getPassword(input)
}
