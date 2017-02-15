/**
 * Created by annayushina on 06/01/17.
 */
fun main(args: Array<String>) {
    val input = """value 23 goes to bot 208
    bot 125 gives first to bot 58 and second to bot 57
    value 13 goes to bot 161
    bot 178 gives first to bot 88 and second to bot 172
    value 59 goes to bot 128
    bot 173 gives first to bot 83 and second to bot 202
    bot 189 gives first to bot 35 and second to bot 55
    bot 123 gives first to bot 90 and second to bot 169
    bot 148 gives first to bot 101 and second to bot 134
    bot 36 gives first to bot 78 and second to bot 105
    bot 196 gives first to bot 171 and second to bot 45
    bot 157 gives first to bot 179 and second to bot 87
    bot 124 gives first to bot 25 and second to bot 80
    bot 55 gives first to bot 99 and second to bot 201
    value 17 goes to bot 4
    bot 127 gives first to bot 118 and second to bot 142
    bot 9 gives first to bot 61 and second to bot 198
    bot 71 gives first to bot 86 and second to bot 96
    bot 86 gives first to bot 98 and second to bot 149
    bot 176 gives first to bot 89 and second to bot 171
    bot 38 gives first to bot 107 and second to bot 63
    bot 67 gives first to bot 77 and second to bot 7
    bot 131 gives first to output 6 and second to bot 151
    bot 97 gives first to bot 33 and second to bot 16
    bot 89 gives first to bot 27 and second to bot 36
    bot 29 gives first to bot 185 and second to bot 11
    bot 92 gives first to bot 189 and second to bot 122
    bot 77 gives first to output 7 and second to bot 191
    bot 14 gives first to bot 152 and second to bot 179
    bot 49 gives first to bot 76 and second to bot 64
    value 2 goes to bot 155
    bot 159 gives first to bot 182 and second to bot 49
    bot 129 gives first to bot 141 and second to bot 40
    bot 50 gives first to output 1 and second to bot 47
    bot 93 gives first to output 5 and second to bot 167
    bot 112 gives first to output 13 and second to bot 51
    bot 165 gives first to bot 163 and second to bot 123
    bot 13 gives first to bot 75 and second to bot 74
    bot 141 gives first to bot 178 and second to bot 207
    bot 37 gives first to bot 42 and second to bot 139
    value 31 goes to bot 92
    bot 44 gives first to bot 16 and second to bot 91
    bot 172 gives first to bot 84 and second to bot 27
    bot 39 gives first to bot 44 and second to bot 154
    bot 170 gives first to bot 95 and second to bot 146
    bot 98 gives first to bot 193 and second to bot 17
    bot 4 gives first to bot 26 and second to bot 109
    bot 197 gives first to bot 71 and second to bot 106
    bot 132 gives first to bot 161 and second to bot 181
    bot 54 gives first to bot 156 and second to bot 148
    bot 140 gives first to bot 0 and second to bot 25
    bot 59 gives first to output 10 and second to bot 93
    bot 206 gives first to bot 2 and second to bot 200
    bot 5 gives first to bot 201 and second to bot 173
    bot 81 gives first to bot 24 and second to bot 30
    bot 33 gives first to bot 100 and second to bot 113
    bot 73 gives first to bot 60 and second to bot 129
    bot 43 gives first to output 14 and second to bot 204
    bot 143 gives first to bot 176 and second to bot 196
    bot 182 gives first to bot 70 and second to bot 76
    bot 139 gives first to bot 117 and second to bot 180
    bot 31 gives first to bot 131 and second to bot 137
    bot 179 gives first to bot 31 and second to bot 28
    bot 74 gives first to bot 29 and second to bot 160
    bot 7 gives first to bot 191 and second to bot 21
    bot 83 gives first to bot 165 and second to bot 116
    bot 142 gives first to bot 144 and second to bot 107
    bot 187 gives first to bot 129 and second to bot 68
    value 61 goes to bot 32
    bot 32 gives first to bot 72 and second to bot 53
    bot 53 gives first to bot 121 and second to bot 199
    bot 79 gives first to bot 143 and second to bot 196
    bot 0 gives first to bot 92 and second to bot 194
    bot 8 gives first to bot 56 and second to bot 209
    value 43 goes to bot 72
    bot 95 gives first to output 18 and second to bot 112
    bot 104 gives first to bot 41 and second to bot 185
    bot 198 gives first to bot 103 and second to bot 48
    bot 17 gives first to bot 69 and second to bot 156
    bot 138 gives first to output 0 and second to bot 77
    bot 76 gives first to bot 127 and second to bot 164
    bot 110 gives first to bot 206 and second to bot 60
    bot 60 gives first to bot 200 and second to bot 141
    bot 134 gives first to bot 67 and second to bot 7
    bot 90 gives first to bot 12 and second to bot 192
    bot 208 gives first to bot 155 and second to bot 182
    bot 87 gives first to bot 28 and second to bot 195
    bot 108 gives first to bot 53 and second to bot 186
    bot 150 gives first to bot 154 and second to bot 56
    bot 204 gives first to output 17 and second to bot 58
    bot 174 gives first to bot 138 and second to bot 67
    bot 195 gives first to bot 147 and second to bot 81
    bot 24 gives first to bot 146 and second to bot 3
    bot 12 gives first to bot 119 and second to bot 9
    value 37 goes to bot 35
    bot 137 gives first to bot 151 and second to bot 170
    bot 1 gives first to output 2 and second to bot 22
    bot 63 gives first to bot 150 and second to bot 8
    bot 133 gives first to bot 140 and second to bot 124
    bot 154 gives first to bot 91 and second to bot 110
    bot 145 gives first to bot 47 and second to bot 18
    bot 109 gives first to bot 159 and second to bot 82
    bot 202 gives first to bot 116 and second to bot 37
    bot 168 gives first to bot 133 and second to bot 177
    bot 193 gives first to bot 93 and second to bot 69
    bot 191 gives first to output 16 and second to bot 21
    bot 135 gives first to bot 82 and second to bot 163
    bot 130 gives first to bot 102 and second to bot 114
    bot 26 gives first to bot 208 and second to bot 159
    bot 152 gives first to bot 22 and second to bot 31
    bot 118 gives first to bot 136 and second to bot 144
    bot 149 gives first to bot 17 and second to bot 54
    bot 64 gives first to bot 164 and second to bot 119
    bot 120 gives first to bot 64 and second to bot 12
    bot 180 gives first to bot 188 and second to bot 130
    bot 203 gives first to bot 204 and second to bot 125
    bot 3 gives first to bot 46 and second to bot 104
    bot 114 gives first to bot 205 and second to bot 79
    bot 25 gives first to bot 194 and second to bot 20
    bot 65 gives first to bot 181 and second to bot 118
    bot 169 gives first to bot 192 and second to bot 117
    bot 51 gives first to output 8 and second to bot 50
    bot 41 gives first to bot 50 and second to bot 145
    bot 20 gives first to bot 23 and second to bot 10
    bot 106 gives first to bot 96 and second to bot 126
    bot 23 gives first to bot 5 and second to bot 6
    value 11 goes to bot 43
    value 47 goes to bot 189
    value 5 goes to bot 115
    bot 46 gives first to bot 51 and second to bot 41
    bot 115 gives first to bot 43 and second to bot 203
    bot 209 gives first to bot 73 and second to bot 187
    bot 16 gives first to bot 113 and second to bot 62
    bot 101 gives first to bot 174 and second to bot 134
    bot 167 gives first to output 20 and second to bot 158
    value 3 goes to bot 133
    bot 184 gives first to bot 125 and second to bot 100
    bot 155 gives first to bot 166 and second to bot 70
    bot 88 gives first to bot 81 and second to bot 84
    value 19 goes to bot 0
    bot 171 gives first to bot 36 and second to bot 45
    bot 186 gives first to bot 199 and second to bot 97
    bot 111 gives first to bot 209 and second to bot 85
    bot 22 gives first to output 4 and second to bot 131
    bot 166 gives first to bot 132 and second to bot 65
    bot 6 gives first to bot 173 and second to bot 52
    bot 75 gives first to bot 104 and second to bot 29
    bot 91 gives first to bot 62 and second to bot 206
    bot 164 gives first to bot 142 and second to bot 38
    bot 15 gives first to bot 160 and second to bot 197
    bot 66 gives first to bot 198 and second to bot 188
    bot 199 gives first to bot 184 and second to bot 33
    bot 122 gives first to bot 55 and second to bot 5
    bot 68 gives first to bot 40 and second to bot 143
    bot 128 gives first to bot 4 and second to bot 94
    bot 27 gives first to bot 13 and second to bot 78
    bot 34 gives first to bot 195 and second to bot 88
    bot 94 gives first to bot 109 and second to bot 135
    bot 158 gives first to output 3 and second to bot 138
    bot 47 gives first to output 15 and second to bot 59
    bot 163 gives first to bot 120 and second to bot 90
    bot 48 gives first to bot 111 and second to bot 102
    bot 40 gives first to bot 207 and second to bot 176
    bot 144 gives first to bot 153 and second to bot 39
    bot 201 gives first to bot 162 and second to bot 83
    bot 72 gives first to bot 115 and second to bot 121
    bot 156 gives first to bot 19 and second to bot 101
    bot 185 gives first to bot 145 and second to bot 183
    bot 103 gives first to bot 8 and second to bot 111
    bot 192 gives first to bot 9 and second to bot 66
    value 71 goes to bot 140
    bot 205 gives first to bot 68 and second to bot 79
    bot 151 gives first to output 11 and second to bot 95
    bot 153 gives first to bot 97 and second to bot 44
    bot 105 gives first to bot 15 and second to bot 175
    bot 11 gives first to bot 183 and second to bot 86
    bot 160 gives first to bot 11 and second to bot 71
    bot 56 gives first to bot 110 and second to bot 73
    bot 207 gives first to bot 172 and second to bot 89
    bot 181 gives first to bot 108 and second to bot 136
    bot 175 gives first to bot 197 and second to bot 106
    bot 69 gives first to bot 167 and second to bot 19
    bot 58 gives first to output 9 and second to bot 1
    bot 78 gives first to bot 74 and second to bot 15
    bot 21 gives first to output 12 and second to output 19
    bot 190 gives first to bot 168 and second to bot 177
    value 29 goes to bot 190
    bot 107 gives first to bot 39 and second to bot 150
    bot 61 gives first to bot 63 and second to bot 103
    bot 52 gives first to bot 202 and second to bot 37
    value 53 goes to bot 168
    bot 30 gives first to bot 3 and second to bot 75
    bot 116 gives first to bot 123 and second to bot 42
    bot 85 gives first to bot 187 and second to bot 205
    bot 99 gives first to bot 94 and second to bot 162
    bot 126 gives first to bot 54 and second to bot 148
    bot 19 gives first to bot 158 and second to bot 174
    bot 82 gives first to bot 49 and second to bot 120
    bot 42 gives first to bot 169 and second to bot 139
    value 41 goes to bot 190
    bot 188 gives first to bot 48 and second to bot 130
    bot 113 gives first to bot 14 and second to bot 157
    bot 177 gives first to bot 124 and second to bot 80
    bot 18 gives first to bot 59 and second to bot 193
    bot 96 gives first to bot 149 and second to bot 126
    bot 62 gives first to bot 157 and second to bot 2
    bot 45 gives first to bot 105 and second to bot 175
    bot 2 gives first to bot 87 and second to bot 34
    bot 147 gives first to bot 170 and second to bot 24
    bot 70 gives first to bot 65 and second to bot 127
    bot 162 gives first to bot 135 and second to bot 165
    bot 117 gives first to bot 66 and second to bot 180
    bot 100 gives first to bot 57 and second to bot 14
    bot 57 gives first to bot 1 and second to bot 152
    bot 121 gives first to bot 203 and second to bot 184
    bot 10 gives first to bot 6 and second to bot 52
    bot 84 gives first to bot 30 and second to bot 13
    value 7 goes to bot 166
    bot 136 gives first to bot 186 and second to bot 153
    bot 161 gives first to bot 32 and second to bot 108
    bot 102 gives first to bot 85 and second to bot 114
    bot 80 gives first to bot 20 and second to bot 10
    bot 200 gives first to bot 34 and second to bot 178
    bot 119 gives first to bot 38 and second to bot 61
    bot 28 gives first to bot 137 and second to bot 147
    bot 35 gives first to bot 128 and second to bot 99
    value 67 goes to bot 132
    bot 146 gives first to bot 112 and second to bot 46
    bot 194 gives first to bot 122 and second to bot 23
    value 73 goes to bot 26
    bot 183 gives first to bot 18 and second to bot 98""".lines().map(String::trim)

    val test = """value 5 goes to bot 2
bot 2 gives low to bot 1 and high to bot 0
value 3 goes to bot 1
bot 1 gives low to output 1 and high to bot 0
bot 0 gives low to output 2 and high to output 0
value 2 goes to bot 2""".lines()


    val listBot: MutableList<Bot> = mutableListOf()
    val listOutput: MutableList<MutableList<Int>> = mutableListOf()

    (0..20).forEach { listOutput.add(mutableListOf()) }
    (0..209).forEach { listBot.add(Bot(-1, -1, -1, -1, -1, -1)) }

    fun zombing(line: String) {

        val numberRegEx = "[0-9]+".toRegex()
        val botNumber: Int
        val allNumbers: List<MatchResult> = numberRegEx.findAll(line).toList()

        when {
            line.startsWith("value") -> {
                botNumber = allNumbers[1].value.toInt()
                listBot[botNumber].addValue(allNumbers[0].value.toInt())

            }
            line.startsWith("bot") -> {

                botNumber = allNumbers[0].value.toInt()

                listBot[botNumber].instructionLow = allNumbers[1].value.toInt()
                listBot[botNumber].instructionHigh = allNumbers[2].value.toInt()

                if (line.substringBefore("and").contains("output")) { //How come I can't use "low to output".toRegex.find(line)?
                    listBot[botNumber].outputLow = 1
                }
                if (line.substringAfter("and").contains("output")) {
                    listBot[botNumber].outputHigh = 1
                }


            }
            else -> error("Can't parse the line $line")
        }


    }

    fun exchanging(): Int {
        var bot1761Number = -1

        repeat(50) {


            for (bot in listBot) {

                if (bot.first != -1 && bot.second != -1) {
                    if (bot.outputLow == -1) {
                        listBot[bot.instructionLow].addValue(bot.first)
                    } else listOutput[bot.instructionLow].add(bot.first)
                    if (bot.outputHigh == -1) {
                        listBot[bot.instructionHigh].addValue(bot.second)
                    } else listOutput[bot.instructionHigh].add(bot.second)
                    if (bot.first == 17 && bot.second == 61) {
                        bot1761Number = listBot.indexOf(bot)
                    }
                    bot.first = -1
                    bot.second = -1

                }
            }
        }
        return bot1761Number
    }

    for (line in input) zombing(line)

    println(exchanging())

 //   for (i in listOutput.indices) println("$i, ${listOutput[i]}")
    println("${listOutput[0][0] * listOutput[1][0] * listOutput[2][0]}")

}


class Bot(var first: Int, var second: Int, var instructionLow: Int, var instructionHigh: Int, var outputLow: Int, var outputHigh: Int) {


    fun addValue(value: Int) {
        if (value > second) {
            first = second
            second = value
        } else if (value < second)
            first = value
    }
}