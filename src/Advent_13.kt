/**
 * Created by annayushina on 09/02/17.
 */
fun main(args: Array<String>) {

    val labirint = maze(1362);
    for (x in 0..31)
    {
        for (y in 0..39) {

           if(labirint.EmptyOrWall(x, y))print('.')
            else print('#')

        }

        println(x)
    }



    fun move(endX: Int, endY: Int, labirint: maze): Int {
        var count = 0
        var x = 1
        var y = 1

        while (x!=endX && y!=endY) {

            if (labirint.EmptyOrWall(x + 1, y)) {
                count++
                x++
            } else if (labirint.EmptyOrWall(x, y + 1)) {
                count++
                y++
            } else if (labirint.EmptyOrWall(x, y - 1)) {
                count++
                y--
            } else if (labirint.EmptyOrWall(x - 1, y)) {
                count++
                x--
            }
        }

        return count
    }

    println(move(31, 39, labirint))

}

class maze(val number: Int){

    fun EmptyOrWall (x: Int, y: Int): Boolean {
        val sum = x*x + 3*x + 2*x*y + y + y*y+number
        val bitCount = Integer.bitCount(sum);
        if (bitCount%2==0) return true
        else return false

    }
}




