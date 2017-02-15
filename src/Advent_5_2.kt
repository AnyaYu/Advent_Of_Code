/**
 * Created by annayushina on 13/12/16.
 */

import java.security.MessageDigest
import jdk.nashorn.tools.ShellFunctions.input
import java.math.BigInteger


fun main(args: Array<String>) {
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


    fun getNewPassword(input: String): String = buildString() {
        this.setLength(8)
        for (i in 0..Int.MAX_VALUE) {
            val hash: String = getHash(input + i)

            if (hash.startsWith("00000")) {
                val position = hash[5]
                val value = hash[6]

                if (position in '0'..'7') {
                    val positionToInt = position.toString().toInt()
                    if (this[positionToInt] == 0.toChar()) {
                        this[positionToInt] = value
//                        print("\u007F".repeat(8))
                        print(this)
                        if (0.toChar() !in this) return@buildString
                    }
                }
            }
        }


    }
    println(getNewPassword(input))

}




