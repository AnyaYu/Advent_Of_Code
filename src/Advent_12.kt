import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue

/**
 * Created by annayushina on 22/01/17.
 */
fun main(args: Array<String>) {
    val input: kotlin.collections.List<String> = """cpy 1 a
cpy 1 b
cpy 26 d
jnz c 2
jnz 1 5
cpy 7 c
inc d
dec c
jnz c -2
cpy a c
inc a
dec b
jnz b -2
cpy c b
dec d
jnz d -6
cpy 17 c
cpy 18 d
inc a
dec d
jnz d -2
dec c
jnz c -5""".lines()

    val test = """cpy 41 a
inc a
inc a
dec a
jnz a 2
dec a""".lines()


    val registers = ('a'..'d').map { Register(it.toString()) }.associateBy { it.name }

    val a by registers
    val c by registers
    c.value = 1

    fun myRegister(st: String): Register = registers[st] ?: error("!")


    fun regConst(s: String): RegOrConst = s.toIntOrNull()?.let(::Const) ?: myRegister(s)


    fun lineToAction(line: String): Action {
        val tokens = line.split(" ")
        return when (tokens[0]) {
            "cpy" -> Action.cpy(regConst(tokens[1]), myRegister(tokens[2]))

            "jnz" -> Action.jnz(regConst(tokens[1]), tokens[2].toInt())

            "inc" -> Action.inc(myRegister(tokens[1]))

            "dec" -> Action.dec(myRegister(tokens[1]))

            else -> error("Can't parse line $line")
        }
    }


    fun doInstructions(list: List<Action>) {
        var lineNumber = 0
        while (lineNumber <= list.lastIndex) {
            if (lineNumber < 0) {
            error("lineNumber = $lineNumber")
            }

            val action1: Action = list[lineNumber]
            var jump: Int = 1
            when (action1) {
                is Action.cpy -> action1.register.value = action1.regOrConst.value
                is Action.jnz ->
                {
                    if (action1.register.value != 0)
                        jump = action1.value

                }

                is Action.inc -> action1.register.value++
                is Action.dec -> action1.register.value--

            }
            lineNumber+=jump
        }
    }

    val actionList = input.map(::lineToAction)
    for (action in actionList) {
        println(action)
    }
    doInstructions(actionList)
    println(a.value)
}


interface RegOrConst {
    val value: Int
}

//val RegOrConst.value: Int
//    get() = when (this) {
//        is Const -> value
//        is Register -> value
//    }

data class Register(val name: String) : RegOrConst {
    override var value = 0
}

data class Const(override val value: Int) : RegOrConst


sealed class Action {
    data class cpy(val regOrConst: RegOrConst, val register: Register) : Action()
    data class jnz(val register: RegOrConst, val value: Int) : Action()
    data class inc(val register: Register) : Action()
    data class dec(val register: Register) : Action()
}



