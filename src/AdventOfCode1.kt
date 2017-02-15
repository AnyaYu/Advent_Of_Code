import Direction.*
import java.util.*

fun main(args: Array<String>) {

    val myString = "L5, R1, R3, L4, R3, R1, L3, L2, R3, L5, L1, L2, R5, L1, R5, R1, L4, R1, R3, L4, L1, R2, R5, R3, R1, R1, L1, R1, L1, L2, L1, R2, L5, L188, L4, R1, R4, L3, R47, R1, L1, R77, R5, L2, R1, L2, R4, L5, L1, R3, R187, L4, L3, L3, R2, L3, L5, L4, L4, R1, R5, L4, L3, L3, L3, L2, L5, R1, L2, R5, L3, L4, R4, L5, R3, R4, L2, L1, L4, R1, L3, R1, R3, L2, R1, R4, R5, L3, R5, R3, L3, R4, L2, L5, L1, L1, R3, R1, L4, R3, R3, L2, R5, R4, R1, R3, L4, R3, R3, L2, L4, L5, R1, L4, L5, R4, L2, L1, L3, L3, L5, R3, L4, L3, R5, R4, R2, L4, R2, R3, L3, R4, L1, L3, R2, R1, R5, L4, L5, L5, R4, L5, L2, L4, R4, R4, R1, L3, L2, L4, R3"
    //   val myString ="R3, R4, R5, R1, R6"

    val list = myString.split(", ")

    val listPair: List<Pair<Move, Int>> = list.map { Pair(Move.valueOf(it.take(1)), it.drop(1).toInt()) }

    val startPoint: Point = Point(0, 0)


    fun nextDirection(currentd: Direction, move: Move): Direction = when (move) {
        Move.R -> when (currentd) {
            N -> E
            E -> S
            S -> W
            W -> N
        }
        Move.L -> when (currentd) {
            N -> W
            E -> N
            W -> S
            S -> E
        }
    }


    fun endPoint(startP: Point, directions: List<Pair<Move, Int>>): Point {

        var direction = N
        val setPoints: MutableSet<Point> = mutableSetOf(Point(0, 0))
        var nextPoint = startP
        for ((turn, steps) in directions) {

            direction = nextDirection(direction, turn)
            setPoints.add(nextPoint)

            var point = nextPoint

            for (i in 1..steps) {

                point = when (direction) {

                    N -> Point(nextPoint.x, nextPoint.y + i)

                    E -> Point(nextPoint.x + i, nextPoint.y)

                    S -> Point(nextPoint.x, nextPoint.y - i)

                    W -> Point(nextPoint.x - i, nextPoint.y)

                }
                if (!setPoints.add(point)) {
                    return point
                }

            }
            nextPoint = point

        }

        return nextPoint
    }


    print(endPoint(startPoint, listPair))
}

data class Point(val x: Int, val y: Int)
enum class Move {
    R, L;
}

enum class Direction {
    N, E, S, W;
}