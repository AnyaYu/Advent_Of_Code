import java.io.File


fun main(args: Array<String>) {
    val test: List<String> = listOf(
            "rect 3x2",
            "rotate column x=1 by 1",
            "rotate row y=0 by 4",
          "rotate column x=1 by 1"



    )
    val input: List<String> = File("src/advent_8.txt").readLines().filter { it.isNotBlank() }
    var listListsPoints: MutableList<MutableList<MyPoint>> = mutableListOf()
    val width = 50
    val height = 6

    for (y in 0 until height) {
        listListsPoints.add(mutableListOf())

        for (x in 0 until width) {
            listListsPoints[y].add(MyPoint( false))
        }
    }



    fun action(string: String) {


        if (string.startsWith("rect")) {
            val x = string.substring(5, 7).filter{it!='x'}.toInt()
            val y = string.takeLast(1).toInt()
            println ("x=$x, y=$y")
            for (y in 0..y-1){
                for (i in 0 until x) {
                    listListsPoints[y][i] = MyPoint(true)
                }
            }
        }
        else if (string.startsWith("rotate row")){

            val y = string.substring(13, 14).toInt()
            val distance = string.takeLast(2).trim().toInt()
            println("y=$y, distance=$distance")

            val list = listListsPoints[y].toList()
            for (x in 0 until width){
                listListsPoints[y][x] = list[(width + (x - distance))%width]
            }


        }
        else if (string.startsWith("rotate column")){
            val column = string.substring(16, 18).trim().toInt()
            val distance = string.takeLast(2).trim().toInt()
            println("column=$column, distance=$distance")

            val list: List<MyPoint> = listListsPoints.map{it[column]}
            for (y in 0 until height){
                listListsPoints[y][column] =

                     list[(height + (y-distance))%height]

            }

        }
        else error("Unknown string ($string)")
    }

    for (string in input){
        action(string)
        println(string)

        for (row in listListsPoints){

            println(row.joinToString("") { if (it.vkl) "#" else "." })

        }
    }

    println(listListsPoints.sumBy { it.count{ it.vkl} })
}

data class MyPoint (val vkl: Boolean)

