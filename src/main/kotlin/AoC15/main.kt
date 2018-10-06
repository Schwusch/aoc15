package AoC15

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import java.io.File
import java.lang.Exception
import java.security.MessageDigest
import javax.xml.bind.DatatypeConverter
import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    /*
    day1()
    day2()
    day3()
    day4()
    day5()
    day6()
    day7()
    day8()
    day9()
    day10()
    day11()
    day12()
    day13()
    */
    day14()
}

fun lines(num: Int) = File("./src/main/kotlin/AoC15/input/day$num.txt").readLines()

fun day1() {
    println("\nDay 1:")
    val input = "()(((()))(()()()((((()(((())(()(()((((((()(()(((())))((()(((()))((())(()((()()()()(((())(((((((())))()()(()(()(())(((((()()()((())(((((()()))))()(())(((())(())((((((())())))(()())))()))))()())()())((()()((()()()()(()((((((((()()())((()()(((((()(((())((())(()))()((((()((((((((())()((()())(())((()))())((((()())(((((((((((()()(((((()(()))())(((()(()))())((()(()())())())(()(((())(())())()()(()(()((()))((()))))((((()(((()))))((((()(()(()())())()(((()((((())((((()(((()()(())()()()())((()((((((()((()()))()((()))()(()()((())))(((()(((()))((()((()(()))(((()()(()(()()()))))()()(((()(((())())))))((()(((())()(()(())((()())))((((())))(()(()(()())()((()())))(((()((()(())()()((()((())(()()((())(())()))()))((()(())()))())(((((((()(()()(()(())())))))))(()((((((())((((())((())())(()()))))()(())(()())()())((())(()))))(()))(()((()))()(()((((((()()()()((((((((()(()(())((()()(()()))(())()())()((())))()))()())(((()))(())()(())()))()((()((()(()()())(())()()()((())())))((()()(()()((()(())()()())(((()(()()))))(())))(()(()())()))()()))))))()))))((((((())))())))(()(())())(()())))))(()))()))))))()((()))))()))))(()(()((()())())(()()))))(((())()))())())())(((()(()()))(())()(())(())((((((()()))))((()(()))))))(()))())(((()()(()))()())()()()())))))))))))))(())(()))(()))((()(())(()())(())())(()())(())()()(()())))()()()))(())())()))())())(())((())))))))(())))(())))))()))))((())(()(((()))))(()))()((()(())))(()())(((((()))()())()()))))()))))()))())(()(()()()))()))))))((()))))))))))()((()))((()(())((())()()(()()))()(()))))()()(()))()))(((())))(())()((())(())(()())()())())))))))())))()((())))()))(()))()()))(((((((()))())(()()))(()()(()))()(()((()())()))))))(((()()()())))(())()))()())(()()))()()))))))))(())))()))()()))))))()))()())))()(())(())))))()(())()()(()()))))())((()))))()))))(()(((((()))))))))())))())()(())()()))))(())))())()()())()()())()(()))))()))()))))))))())))((()))()))()))())))()())()()())))())))(()((())()((()))())))))())()(())((())))))))))))())()())(())())())(()))(()))()))())(()(())())()())()()(()))))(()(())))))))(())))())(())))))))())()()(())())())))(())))))()))()(()())()(()))())())))))()()(()))()))))())))))))))()))))()))))))())()())()()))))()())))())))))))))))()()))))()()(((()))()()(())()))))((()))))(()))(())())))(())()))))))(()))()))))(())())))))()))(()())))))))))))))())))))))))()((()())(()())))))))((()))))(())(())))()(()())())))())())(()()()())))()))))))())))))())()()())))))))))))()()(()))))()())()))((()())(()))))()(()))))))))))()())())(((())(()))))())()))()))()))))))()))))))(()))))()))))()(())))(())))(()))())()()(()()))()))(()()))))))))()))(()))())(()()(()(()())()()))()))))))))(())))))((()()(()))())())))))()))())(()())()()))())))()(()()()()))((())())))())()(()()))()))))))))(()))(())))()))))(()(()())(()))))()())())()))()()))())))))))))))())()))))))()))))))))())))))()))))())(()())))(())()))())())))))()()(()()())(()())))()()))(((()))(()()()))))()))))()))))((())))()((((((()()))))))())))))))))))(((()))))))))))))(())())))))())(()))))))(()))((()))())))()(()((()))()))()))))))))))())()))()(()()))))())))())(())()(()))()))())(()))()))))(()()))()()(())))))()))(())(()(()()))(()()())))))(((()))))))()))))))))))))(())(()))))()())())()()((()()))())))))(()))))())))))))()()()))))))))())))()(((()()))(())))))(((())())))))((()))()(()))(()))))(()())))(()))())))))()))))(())(())))()((()))(())())))()()))()))))))))()))(()()()(()()()(()))())(())()())(((()))(())))))))))(((()())))()()))))))))()(())(()))()((((())(())(()())))()))(((())()()()))((()))(()))())())))())))(()))())()())())(()(())())()()()(())))())(())))(())))(())()))()))(()((()))))))))())(()))))))())(()()))()()))()(()(()())))()()(()((()((((((()))(())))()()()))())()))((()()(()))())((()(()(()))(()()))))()())))()))()())))))))()()((()())(())))()))(()))(())(()))())(()(())))()()))))))(((()(((()()))()(()(())())((()()))()))()))()))()(()()()(()))((()())()(())))()()))(((())()()())(())()((()()()()(()(())(()()))()(((((()())))((())))))(()()()))))(((()(())))()))((()((()(())()(()((())))((()())()(()))(((()())()()(()))(())(((()((()())()((())()())(((()()))((()((())(()))(()())(()()()))((()))(())(()((()()())((()))(())))(())(())(())))(()())))(((((()(()(((((()())((((()(()())(())(()()(((())((()(((()()(((()()((((((())))())(()((((((()(()))()))()()((()((()))))()(()()(()((()()))))))(((((()(((((())()()()(())())))))))()))((()()(())))(())(()()()())))))(()((((())))))))()()(((()(()(()(()(()())()()()(((((((((()()())()(()))((()()()()()(((((((()())()((())()))((((((()(()(()(()())(((()(((((((()(((())(((((((((())(())())()))((()(()))(((()()())(())(()(()()(((()(())()))())))(())((((((())(()()())()()(((()(((())(()(((())(((((((()(((((((((()))(())(()(()(()))))((()))()(())())())((()(()((()()))((()()((()(())(())(()((())(((())(((()()()((((((()()(())((((())()))))(())((()(()((())))(((((()(()()())())((())())))((())((()((()()((((((())(((()()(()())())(()(()))(()(()))())())()(((((((()(((()(())()()((())((()(()()((()(()()(((((((((((())((())((((((())((()((((()(()((((()(((((((())()((()))))())()((()((((()(()(((()((()())))(())())(((()(((())((((((()(((((((((()()(())))(()(((((()((((()())))((()((()((()(()()(((())((((((((((((()(((())(()(((((()))(()()(()()()()()()((())(((((((())(((((())))))())()(()()(()(()(((()()(((((())(()((()((()(((()()((()((((())()))()((((())(())))()())(((())(())(()()((()(((()()((((((((((()()(()())())(((((((((())((((()))()()((((())(()((((()(((())())(((((((((((()((((())))(())(()(((()(((()((())(((((()((()()(()(()()((((((()((((()((()(()((()(()((((((()))))()()(((((()((()(()(())()))(())(((((((()((((()())(()((()((()(()))())))(())((()))))(((((((()()()())(()))(()()((()())()((()((()()()(()(()()))(()())(())(((((()(((((((((((()((()(((()(((((((()()((((((()(((((()(()((()(((((())((((((()))((((())((()()((())(((())()(((((()()(((((()((()(()(((((((()(((((()((()((()((())(())((())(()))()()))(()()(()(()()(((((((()(((()(((())()(((((()((((((()())((((())()((()((()(()()())(()))((((()()((((((()((()(()(()((((()((()((())((((((()(()(())((((((()((((((((((()((())()))()(()(()(((((()()()))((())))()(()((((((((((((((()(((()((((()((())((()((()(((()()(()(((()((())(()()())))()(()(()(((((()()(()(()((((()(((((())()(()(()))(((((()()(((()()(())((((((((((((((())((())(((((((((((())()()()(())()(()(()(((((((((())(((()))(()()())(()((((()(())(((((()())(())((((((((())()((((()((((((())(()((()(())(((()((((()))(((((((((()()))((((()(())()()()(())(()((())((()()))()(((())(((((())((((((()()))(((((((((()((((((())))(((((((()((()(()(())))())(()(()))()(((((()())(()))()(()(())(((()))))())()())))(((((()))())()((()(()))))((()()()((((((()))()()((((((((())((()(()(((()(()((())((()())(()((((())(()(((()()()(()(()()))())())((((((((((())())((()))()((())(())(())))())()(()()(())))())(()))(((()(()()(((()(((())))()(((()(())()((((((())()))()))()((((((()(()(((((()())))()))))())()()(((()(((((())((()()(()((()((()(()(()(())))(()()()()((()(())(((()((()))((((()))())(())))())(()))()()()())()))(((()()())()((())))(())(()()()()(()())((()(()()((((())))((()((()(())((()(()((())()(()()(((()())()()())((()))((())(((()()(())))()()))(((()((())()(((((()())(())((())()())())((((((()(()(((((()))(()("

    val floor = input.count { it == '(' } - input.count { it == ')' }
    println("Arriving at floor <$floor>")
    var floorCount = 0
    input.forEachIndexed { index, c ->
        when(c) {
            '(' -> floorCount++
            ')' -> floorCount--
        }
        if (floorCount < 0) {
            println("basement position at ${index + 1}")
            return
        }
    }
}

fun day2() {
    println("\nDay 2:")

    val lines = lines(2).map { it.split('x').map { it.toInt() } }
    val sum = lines.map { measures ->
        val sides = measures.zipWithNext().map {
            it.first * it.second * 2
        }.toMutableList().apply {
            add(measures.first() * measures.last() * 2)
        }
        sides.sum() + sides.min()!! / 2
    }.sum()

    val ribbon = lines.map {
        it.toMutableList().apply { remove(it.max()!!) }.sum() * 2 + it.fold(1) {acc, side -> acc * side}
    }.sum()

    println("$sum square feet")
    println("$ribbon feet ribbon")
}

fun day3() {
    println("\nDay 3:")
    val input = "^><^>>>^<^v<v^^vv^><<^<><<vv^<>^<^v>^vv<>v><vv^^<>>^^^v<<vv><<^>^<^v<^>^v><<<v^<v<<<v<<vv<v<^><^>><>v>v^<<v^^<^v<><^>^<<^^^>v>>v^^<v>>^>vv><v>>^>>v^>^v>^<^^v>^>^^v<v>^^<v<>>v^^v><^><^<<>v^<^<^v<v>v^>>>v^v^>^<>^v<^^vv<v>^>^<>^^<vv^<><<v<^<^^>vv<>^>v<^>^v>v^>^v<>^><>><vv<>v^v<><>v^v>>>>v^^>^><^^<v<^><^<v>>^v^v<>v<<<^<<vvvv<<v^vv^>v^^^<^^^<v>>v<^v>>>>>v<^^^^>v<^<><v>>>>><v>>v^vvvv^^<v^<>^v<^v^>v><^>^v<<>>vv^>v>v^^>vv^<^vvv<>><>><><^^^<v<>^<^^^<v><^v>>v>^v<v^vv^<>^^^>v^^^v>>^v^^<^>>^>^<<v>>>^^<>>^vv>v^<^>>>><v<><><^^v<><<<<^^<>>^<vvv^><>v<v<<<<><v<<v>v<v^><vv<v^>^<^>v^^><^v>^^>v<>^v^<>^vv^><v^^vv>vvv>v>^<vv^>>^>>^>><>>>^^^^v<vv>^<>v^^><v^>^<>v<^^v><v<<><^v><>^^^^^v^v>>^^v><<><<vv>^^^^><^>v>><<<^v>v^^>^v^<^^v>v<^<<>>^v<<<v<<>>v<^v^><vv<v^v>v^<v>><v>^v<<<vv^>v<v>>v>>v><v><v^>v^^v>^v^>>>><>^>v>^v^>>>>v^<<vv<^v><<>v<v^<^^<<v<^v^^v^>vv><vv<v^<^>><^^>^<><^^<v<><^v^v^<^^>^<v><^<v>v^<<<^^v<v>^v>>><>^^>vv<<^v^<<<<^^>>>v>v<<<>^^>>>v>^>v>vv<<>^<^><v^>^^<^<v<<v<^>>^v^<vvv><>v^><<v>^^<v^vv^^^<vvv^<^>^>vv>><^v<^<<v<><<><<^^<><><vv>v>^<v>>^<>>^^v>vv^<^^v>><^vv^<<v^^><<>vv<v<><v<><v^^^v^v>^v<^<>v^^>><>^<^<v^<v^v^>v<<<^<<^>>>^^<^^v>v^<v>vvvv>v<>><^>^<<<<v^<v<>v^^^v<>v>^<v<<^^v^^<>^<<v^^<^<v>v>>v>>v^>^<vv<<<<<^<><>v><>>>v^>^v<^<><<v<^v^^<^<><^>^^^>^><>^><<vv>^<>vv<<v^v<<<<<>>>v<vv>^v>^>^>^<^><>v<><>>>^^<v>^<^v>>^<><v^><v^>>>v<v^^vvv^><v<v>v^>vvvv>>><^>v<>^^^>v>>v^<v<>v^>^<v^>^<<^>^>>v<<><<v^^>>v^<v^<^v^>^>v^><<^<v>v^<v>>^^<<v>v><<<^v^<>^<>^>>^<<v>^^<>^v<>v^>>><<v>><v^>^><v^<><v><>><v^<>vv>v^<^^^>v>^^<vv>>^v<><>>><>><^<>>v>v^^>^^<^^>^>>v>vv^^v<^<^v><vv<v<^>><<vvv<<><^>^v>^^^<<>v^<v<v><<v>^^v<<<>^^vv<^>vv>^>^<><<>vv<^>v^vv>^^^v><<^vv>^v<><v^^^^v^>vv^^<^<>^^v^<^vv<v<vv<>v>v^^<>^^>^^>^<><<^v>^><^^vvvv<><>^<v^^>v<>^><>v>><>vv^<<><<>><>v<^>^v>>^^v><<<>>^<^v^<v<<<v^>^^<^<><><^><<<<^<vv><v<<><vvv^^><vv>^<<vv<<<^v<>>><><>>v><<<v>vvvv^^vv<v>><<^v^vvv><><vv>v><>v<<<^<v^>><^^>v^<v>><v>^^^v^v>><<<v<^^>>^v<>v^<vv^^<<v<v>v<<<<^^^v^v<<>>>v>>vv>^^<><^v<v><>>v^>>>>>^>v^v^<^v^v^vvv>v<v<^>vv^<<v>vv>>v^^vv<^v>>>>vv<>v<>^^vv^<v>v^>>vvv<<<v<<^vv^^^^>v>v>^><<<^>v^><v<^<<<v>^v^^^><<><<<^^<^^<>^<v>^<v<<v<^^vv>v<^v><v><v<>^v<^<v<^<v^v><v>><v<v<<>^<v<>>><>^v^v<<^><v^<<v<v^>^>v><^>^vv^^<v<v<vv<v>^v^v^>^<<>>>>>v^<>^>v^vv^><<>>^^<>v^><v>^vvv^>v^v><>^><<>v>v<^<^><^^vv<<><>>v>>v><vv>>^v<<>^vv<>^vv>v>v>^>^>>><><<>v<v>^<<^v^^<<<><v>>vv<^<vv<vv^<<v<<^v><<>v<^^^<<^v^>^v>^^^v^v>>>v>v^v>^>^vv<^^<<vv^>^<<<vv>v^<><<^vvv^^><>vv^v>v>^><<^^^^vvv^<vvv>><^v<^>^<>>^<v<<vv>>><v>vv^<>><v^<v>^v>^>v>^<^<^^^<<vvvv^>>>>>>>v><vv>^<>^^v^><>><^v^^<v^v<<<<v^>><>v^v<vv<><^<<<<^>^^>vv>><^v<v^v<<>^vvv>v^^><^^<^<>>^^v^vv<>v<^<<<v^^^><v<vv<<>v>v<>^v^><v^vv^v^^v<^^v^^v><>v<^v>><<^<^v^>><<vv<<^>^<<v^<>^><>v><vv^v>>^<v<<<^>vv<^v>^>v<<v>^>>^>>v^<v<v>>^v<^v^v><<><>^><<<><v<vvvv<v^<v^v><>^<>^^^^v>^>^vvvvv>v>>v><<vv<<v<><<^><<^v><<v<<<v><vv<^>^v>>>>^v<^v<<>>^>^<<vv^<^>v>><<^>^>^v><><>^><<v<>v^><<^v^<^^><^^v^<<^v^^>>^v^<^><vv>v^^<<^^^<><>^>v^v>v^>^v^vv>^^>>>>^^<^>>>^^v<vv<><^^<vvv<^^^vv>v<v<v>><<<>^>^^>^>^v<<<<>>^<<>><v>>v>^^<^v<>v<>v^>v^><^<^^><v^^v>^^vv<v<<>><<vv<>>v>^<<<<v<<v>^><^^<^<^<v^<<^^v>^v<^>v^v^<v^vv^>^^><^>v^v>>^^v^><vv<v<v<v>>>>><<><v><v^v^<v^<^^<v<>^>v>v<>>>v>^^^^>><v^v^^v<<<>v^<<^<v>>>><^v^<<><v<>>v><><v<v^v>^v^^<v<^<^^v>><<vv<<vv><>>^>^>vv<^<>^vvv^v<v^^<>v^v>^^<<<<<>^v^>^<>v^^<>v^v<vv>^<>vv^<^vv>><v^^vvvvv>><<>v<vv^<^<vv^v^<>^^<v^<vv^<v^v^v<<^>^>^>^^>>>vvv>^>v>v>>>^>vv^><>^><>v>^^<v^>^><<v>><<<>>v<vvvv^>^v<^<>^<v>^<>^^<<><>^v<><>>>^vv<^<<^<^v>v<<<<<^^v<^v<><v<<><^>v>^v>>^v^><^^^^v<><><>vv^<>vv<^v<^^><v^<^><^^v^v^<^^<<><v>v<v<v^<<^v><>v^v<^>vvv><<^v>>v><><v<<^>>>v<^>>v>^<>><>^<v^v^<vv<<^>v<^^>^<^v<^<<^^v<>>^>^>^v^^v^v<v^^vv^<v>>v><vv^vv>v<>v^>v^^>^^>><v><v^<<><<>><<^^>><^v<v<><<><<><v<v^<^<v>>>><v^^v^^>>>^^^^^<<vv<^><>^<<<vv^^^>^><<<v<^v>^<v<^>^vvv<<>vv><<>v>v^v>>>>>^<>><^^^><<<<v><<vv>>>v<^<vv^v^<<v>>>>^^vvv>v<>><v>>>v>>^v^vvv<<>vvv<<^^^<>vv^^v<<>^^^>>^<^v^<^^>v^><v>>^<<^v<<vv<vv>v^>>^>v^><^><>^>>>vv>><^^^>vv<<^^vv><^<>^>^^<^<>>^vv^>>^v><>v^>>><<<^^<^>^>v<^>^<^^<>>><^^<>^v^<<vvv<v><>vvv><v>v^v<<^<v>^^><<^vv^v>v>v<<^v^<<<>^><><vvv>v>^vv^v<>vv^>^^<^>^>v^^<vv^>v><v<<<><>>^v<^<><><^<v^^<<^<v>vv<><<>v^<v^>^>^^<><<>^<^<<v^^v<v^<><<>v>><^<<>^>^v^v<v^v><^>>^v<^>v<<>^^^<^v>>>^<v>vvvv<<v^<^^>vvvv>v<>v<v><vvvvv>^<><>vvv<>^<<>^>>>>v^<^<><^v>v^>>v><>^><<v^>^<<>^>^v^<v^^>>^v><v>^<v><>v^<^^>v>^>>>v^v>>>^<>^<>>>>>v>>vv^v<><<<><><v><<vv<<v<><>>vv<^<vv>^v<<>v^v<^v<><v>>^v>>vvv^^v>>v>^>^>v><v><^>^^<<>^v<^<<<<^>v<^>>v^<^v>^v<<>^>^vvv<^^vv>^vv>vv<>>v>v<v>>v^<<<<<^^v^>v>^<<<v^v>>v<v><vvv><v>^<vv><<>>^<^>^^<>>>>^<^v<>v^^>^<^^v<^><>><v>>^v^vv<^v<^><<vvv<>><>><^^>^<^v^<^<>v<<<^v>v^^^<>v^<v^>^v^>><>^^<v<^><<^^v^<>^<^vv>>><^v><v^>vv<^v<<<v^>>v>v^v>^<v>v<^<>v^vvv>^vv<<<<v><^><v>>^^>><^v><<^>v^^<<v^^<^<><<<<>^<v<^v^>v<<^^>v<<<<<vvv<v<^>^>^>^>>^>>>v^<<v>>^^v><vv<^v<v<^^^>>>^vvv<^v<>>>vv>^^><^v>vv^>>v>v^<>^<vv>^>^<<^>^^^>>^vv>^^>vvvv<>>^^^^>>>v>v^^>vv>vv^<<>^><^<v^vvvv><v<><v>><<<v<v<<^v><vv^vv^<>>>^>^<v<^v<>><^<vv^^><v>v^>v^<><v^vvv>^>v^^v^>^^>v<<<<^<<^>>v>v^^^<<<v>>>^^v>v<v><<<<^^^v>^vv^>><>^v<v<<^^<<<<><>>>v>vvv^v^^v^>>vv>^>><>^v><^v^><^^>vv>^<^<^>><v>v>><><><v>^>^>v>vv>vv>^^>v>v^><v<<v^<>^>^v>^^v>^<^v<>>vvv^^>^>vv<v<v<<^<^<v^<>v^^v<^<^>vv^^<v><^^^>v>vv<<v>v<<v^<v^^><vv>^>^v^<^>v<^>^<>vv^><v<^><>>^>>^<^><<>^<^>v>v><>>>^<<^><<v><^v<v><>>vv<^><v^>>v>v>>>>^^>v<^v^>><<^<>>v><^><<^>^<vv^^<><<>><vvvv^>^^<><^^v>^^>vv>^v<v>>^^v^<v<^><^<<>>v^^^<^><^<<><<v<>><<>^v>vvv^vvv^^>>^<^<v>><>^<<<<^^<>>>v^<<^^v>><><<v<^>v>^v<v^>v>vv^><>^><<><^^>^>^<><>><^^<v^v<^><><><v>^<v<<v^<<^^^v<v<^v<>>><^v<<<<>>^v>^^vv^v^<<v>><<<v>vv>>v>>^v^<>>vv^<^>^<<>v<<<^vv<^vv^vv<^v^^^<vv^>v>>v<^^<^^vvv<^^v<>>>^>v^><v>^^><>vv>v>v<<<^^v<^vv^v>^^^>>>^^<>^^<^vvv>><><<><^<v>><<>^>^^<v^v^>vv>vv<v>^^<^^<<><><<v><v^^>v><v><<>v>vvv<^^^^<^>>><<<^^^<^>vv^^v>>v<<v^^<vv^<^>vvv^^v^^<^<vv>v<^<>^<<vv^^>^v>>^><><>v<v<v<>><v>>>^^>>v^><v^^<^>><>v<><<v^v<v<<>>>><>>>>><<^vvv<<><><<>^><><<^^v><<^>v>^>^v>v>>^^<><^>vv<^<^v>v<><^<<v<><^><>^^^<v^<><vvv^^^<>^^v><v<<<v>><>^>^vv<v^<vv>v>v^vv<v^v<v>^v^>v><>v^><>v>^^^^><<vv^><v<<v<^<>^v^^^>^^><<<v<^<v^>^^>v><vvvvv^<^<v^^>v<^v^^vv^<<<<v><^>v>v^v><><v^<<^<<v<^^^>^><v^v^<><><>^v<v>^<>^v>^v>v^<><^><v>>v<<^><^vv^<><^<>><>><v<v><<^^^^>v<^<^vv<><^vv><<^<<v>v^>>^v>^>v^^v>vv<v>v<<v>v<>^>>vv^>>><>^v^^<^>v<<^<^^v^^v^<<v<<v<^v<>vv^<v>><^v<^>>>vv^^<v^<>^^v<v<v>>^><^^^<><<^^>v<<vv>><<vvv>><<v^v^>><>vv^><<^>^><^v<^<^<vv<^^vv>v^v<<<<<<><<vv^vv>vv>v<^><<><><<>>v>><v><^>^v>^v^<>v^^^><^^<<<^vv^vv>^v^vvv^^>v^<v>><^<^<^<>^vv<vv^v^^>^^^>vv^v>>><<<^<>>v>v<^^<><v>>><><^v^^<<><<<>^<^^v^>v<vv^^^^>><v><^<<v<<v<>^>^>>^<>^v><>>^<v<vv^<<^<<>vv^>^^<<<^v<>>^v<>vvv<<^^<<><vvvvv<<^<^^<>>>>^^<><>^><>^v<v^^v<<v^^<^<^>v<v>^v<^>^v<>v^vv<><<v>^vvv<><<^>>^^><><>^<>^>v^^v^><v<><>>v><v^<v<<v>><^v>^<v<^>v<<<>vvv^<^^v<vvv^vv<>^<>^>>v<>^^><><v>>^><^^vv>><<>><v><^><>>^vv>v<vv<>v^v^^v<<^^<vv>v^^vv<<^<<><>^<><v^><^<^<>>^vv<v>v>>^<^vv>^vv^>v>^<><^><^<>v^v^^<^<>^^v>>><^v<>v^v<<^>v><>^^<<v^v<>v^>>v>^<><vv^v<v^<vv<>^>^>^<^>v><<><><><<<>^>><v^^><^>><v>>^v<<<^<<>^><<^>>>>>v<^>v>>v^<v^>^>v^^><>v^v^vvvv<v<v<>v>>><<>^<<vvv><v^v^>v<v^^^>>^<v>>^vv^^<vv><^>>v<v^><vvv<^^>>vv^v<^<>^v^<<v>^<<><<<^vvv^>^^<<>>><v<^>vv<<^<><^v<^<><<^^>vv^v>v^^^>>>>^>vv<<v>v>>^^v^^><>v<<^><^<v^>>^>v^v>><^v^>v<<^<v><^<^<^<>>v^^>><<<>v<v>v<^^>^vv<<<^^<v<>v^^>v<<><^<>^^>^v<>v>><^^^vv^>^><>v^^<v^<>>^<v^^^><v<><vvv>v>^<<^v>^>>>>><^^^<>v<v>>v^^<^v^>>v^<<v^>^>v^v>>>>^>>vv<>^<^v><v^^<>v>v^v>^<>^>v<vv><<v<^v<<^v<<^v^vv<><>^<>>^<>>^<>v^><<>^v>>^^^^<<^v><>^<^>^^v><^^<^<v^<^^v>^v><vv>v<<^>^>><<^^^vvv<<^vv<^^>v^^vv^<^^<<^^>>^^<vv<v<<v^^<<v<^vvv<<><<v>v^>>v^^>v<^>^><v<^>v<v^v<v^^<>v>><<v^v^v<^^^><v>v><^<^vv>^^v>^>v<<^vv><^^^^^^><<^>>>^v<>^^v<<<>><<<v^><>^<<<v>v^>^^^<^><v>^^^v<<>v<v>^<v^>><<^^<<^v<<>^v>>vv>><v<^><v<<<vvv><vv><<^v^^<v^vvv<^v>>v^v<v^v^>>^^v<><^^^<^^>v>^<><v<<v^^>vvv^v^^<v<v^v>^>v^^v<^><v^^<<<<>^^>>^v<><^><^<<^vv^<><<>v^vv^<v^<><<<^^>v<<>>>v<>v<><<<v>^v>^^v>^^>v>^>^>v<>><>^>^>^vvvv<^<v^<>^^^^v>v>><<v>>^<vv>>^<v<^v^vv>><>^^>v^^<<><^<v>><<<<>v>^^><v^^v<<v<><vv^v>^<v^^>v<<<<v^v<<>>vv<v<<<v>v>>v<^v>>v>v^<<<>^>^>^<>v<^^vv><^v<<^v<vvv^vv>v<^<<^^vv^^>vv<^>v>^^<<v^<<^^v<>^>v<<^^<^>^^^v^^<v<^<^>>>v^vv^<^v>^<>^<^<v<^v>>>^<^v<><v<^vv<v>v><v^v^^v<vv><^^<><>^>v<^<^vv>><^v><v<>^<>^^>^<><<<v^>>^<>><<><v>vvv^<<^<vv<v><v<^<<<^>^>>v<^>>vv>^v^^^v<>v<>><>^vv^>vv^"
    var x = 0
    var y = 0
    val houses = mutableMapOf<Pair<Int, Int>, Int>()
    houses[x to y] = 1

    input.forEach {
        when(it) {
            '^' -> y++
            'v' -> y--
            '<' -> x--
            '>' -> x++
        }

        houses[x to y] = houses.getOrDefault(x to y, 0) + 1
    }
    println("${houses.size} houses were lucky")

    var sx = 0
    var sy = 0
    var rx = 0
    var ry = 0

    val houses2 = mutableMapOf<Pair<Int, Int>, Int>()
    houses2[sx to sy] = 1

    input.chunked(2).forEach {
        when(it.first()) {
            '^' -> sy++
            'v' -> sy--
            '<' -> sx--
            '>' -> sx++
        }
        when(it.last()) {
            '^' -> ry++
            'v' -> ry--
            '<' -> rx--
            '>' -> rx++
        }
        houses2[sx to sy] = houses.getOrDefault(sx to sy, 0) + 1
        houses2[rx to ry] = houses.getOrDefault(rx to ry, 0) + 1
    }

    println("${houses2.size} houses were lucky next year")
}

fun day4() {
    println("\nDay 4:")
    val input = "bgvyzdsv"
    val md = MessageDigest.getInstance("MD5")
    fun getKey(startsWith: String) : Int = generateSequence(0) { it + 1 }.find {
        val hash = DatatypeConverter.printHexBinary(md.digest((input + it.toString()).toByteArray()))
        md.reset()
        hash.startsWith(startsWith)
    }!!

    println("Secret key five zeroes: ${getKey("00000")}")
    println("Secret key six zeroes: ${getKey("000000")}")
}

fun day5() {
    println("\nDay 5:")
    val lines = lines(5)
    println("${lines.count { line ->
        line.count {
            when (it) {
                'e', 'i', 'o', 'u', 'a' -> true
                else -> false
            }
        } > 2
                && line.zipWithNext { a, b -> a == b }.contains(true)
                && line.zipWithNext { a, b ->
            when ("$a$b") {
                "ab", "cd", "pq", "xy" -> true
                else -> false
            }
        }.contains(true).not()
    }} nice lines")

    val nicelines2 = lines.filter {line ->
        line.withIndex().any { it.value == line.getOrNull(it.index + 2) }
    }.filter { line ->
        val chunked = line.chunked(2) + line.drop(1).chunked(2)
        chunked.any { test -> test.length > 1 && (line.lastIndexOf(test) - line.indexOf(test)) > 1 }
    }

    println("${nicelines2.size} nice lines in part two")
}

fun day6() {
    println("\nDay 6:")
    val lines = lines(6)

    fun String.splitToCoords() = split(',').map { it.toInt() }

    fun MutableList<MutableList<Int>>.manipulate(xrange: IntRange, yrange: IntRange, op: (Int) -> Int) {
        for(x in xrange) {
            for (y in yrange) {
                this[x][y] = op(this[x][y])
            }
        }
    }

    fun operate(grid: MutableList<MutableList<Int>>, toggle: (Int) -> Int, on: (Int) -> Int, off: (Int) -> Int) : MutableList<MutableList<Int>> {
        for (line in lines) {
            val parts = line.split(" ")
            when(parts[0]) {
                "toggle" -> {
                    val (startx, starty) = parts[1].splitToCoords()
                    val (endx, endy) = parts[3].splitToCoords()
                    grid.manipulate(startx..endx, starty..endy, toggle)
                }
                "turn" -> {
                    val (startx, starty) = parts[2].splitToCoords()
                    val (endx, endy) = parts[4].splitToCoords()
                    when(parts[1]) {
                        "on" -> grid.manipulate(startx..endx, starty..endy, on)
                        "off" -> grid.manipulate( startx..endx, starty..endy, off)
                    }
                }
            }
        }
        return grid
    }

    println("${operate(MutableList(1000) { _ -> MutableList(1000){ 0 }}, { if (it == 1) 0 else 1 }, { 1 }, { 0 }).sumBy { row -> row.sum() }} lamps on")

    println("brightness is ${operate(MutableList(1000) { _ -> MutableList(1000){ 0 }}, { it + 2 }, { it + 1 }, { maxOf(0, it - 1) }).sumBy { row -> row.sum() }}")
}

@UseExperimental(ExperimentalUnsignedTypes::class)
fun day7() {
    println("\nDay 7:")
    val gateMap = mutableMapOf<String, () -> UShort>()
    val cache1 = mutableMapOf<String, UShort>()
    val cache2 = mutableMapOf<String, UShort>()
    var cache = cache1

    fun getValue(str: String) : UShort = cache.getOrPut(str) { gateMap[str]?.invoke() as UShort }

    for (line in lines(7)) {
        val parts = line.split(" ")

        gateMap[parts.last()] = when {
            parts.first().toIntOrNull() is Int && parts.size == 3 -> {{ parts.first().toUShort() }}
            parts.first() == "NOT" -> {{ getValue(parts[1]).inv() }}
            else -> {
                when(parts[1]) {
                    "->" -> {{ getValue(parts.first()) }}
                    else -> {{
                        val firstInt: UShort = parts.first().toUShortOrNull() ?: getValue(parts.first())
                        val secondInt: UShort = parts[2].toUShortOrNull() ?: getValue(parts[2])

                        when(parts[1]) {
                            "AND" -> { firstInt and secondInt }
                            "OR" -> { firstInt or secondInt }
                            "LSHIFT" -> { (firstInt.toInt() shl secondInt.toInt()).toUShort() }
                            "RSHIFT" -> { (firstInt.toInt() shr secondInt.toInt()).toUShort() }
                            else -> { throw Exception("you dun goofed") }}}}}}}}

    println("first result wire 'a': ${getValue("a")}")
    cache2["b"] = cache1["a"]!!
    cache = cache2
    println("second result wire 'a': ${getValue("a")}")
}

fun day8() {
    println("\nDay 8:")
    val lines = lines(8)
    val originalLength = lines.sumBy { it.length }
    val parsedLength = lines.sumBy {
        it.substring(1 until it.lastIndexOf('"'))
                .replace("\\\\", "\\")
                .replace("\\\"", "\"")
                .replace("\\\\x(\\d|[a-f])(\\d|[a-f])".toRegex(), "x").length

    }
    println("difference is ${originalLength - parsedLength}")

    val escapedLength = lines.sumBy {
        val quotes = it.count { it == '"' }
        val slashes = it.count{ it == '\\' }

        it.length + quotes + slashes + 2
    }

    println("escaped difference is ${escapedLength - originalLength}")
}

fun day9() {
    println("\nDay 9:")
    val lines = lines(9)

    val destinations = mutableSetOf<String>()
    val routes = mutableMapOf<Pair<String, String>, Int>()

    lines.forEach { line ->
        val parts = line.split(" ")
        val distance = parts.last().toInt()
        val from = parts.first()
        val arrive = parts[2]

        destinations.add(from)
        destinations.add(arrive)
        routes[from to arrive] = distance
        routes[arrive to from] = distance
    }

    val dests = destinations.toList()

    val tjuhu = Permutations(dests.size).map { conf ->
        conf.zipWithNext().sumBy { routes[dests[it.first] to dests[it.second]]!! }
    }

    println("shortest path is ${tjuhu.min()}")
    println("longest path is ${tjuhu.max()}")
}

fun day10() {
    println("\nDay 10:")
    val inputinput = "1321131112".reversed()

    fun doTheThing(times: Int): Int {
        var input = inputinput
        (1 until times + 1).forEach {

            var last = input.first()
            var counter = 0
            val temp = buildString {
                input.forEach {
                    if (it == last) {
                        counter++
                    } else {
                        append(last)
                        append(counter)
                        counter = 1
                        last = it
                    }
                }
                append(last)
                append(counter)
            }

            input = temp
        }
        return input.length
    }

    println("40 iterations is ${doTheThing(40)} long")
    println("50 iterations is ${doTheThing(50)} long")
}

fun day11() {
    println("\nDay 11:")
    val input = "cqjxjnds".reversed()
    val a = 'a'.toByte().toInt()
    val z = 'z'.toByte().toInt()
    val i = 'i'.toByte().toInt()
    val o = 'o'.toByte().toInt()
    val l = 'l'.toByte().toInt()

    val asNumbers = input.map { it.toByte().toInt() }.toMutableList()

    fun Int.increment(): Pair<Int, Boolean> = if (this >= z) a to true else this + 1 to false

    fun MutableList<Int>.increment() {
        var ret = 0 to true
        var index = 0
        while (ret.second) {
            ret = this[index].increment()
            this[index] = ret.first
            index++
        }
    }

    fun MutableList<Int>.containsBadLetters(): Boolean = contains(i) || contains(o) || contains(l)
    fun MutableList<Int>.containsConsecutive(): Boolean = windowed(size = 3).any { it[0] == it[1] + 1 && it[1] == it[2] + 1 }
    fun MutableList<Int>.containspairs(): Boolean {
        val windows = windowed(size = 2)
        windows.forEachIndexed { index, nuffra ->
            if (windows.filterIndexed { ind, i -> (ind > index + 1 || index - 1 > ind) && nuffra.first() == nuffra.last() && i.first() == i.last() }.isNotEmpty())
                return true
        }
        return false
    }

    fun findNext() {
        var notOk = true
        while (notOk) {
            with(asNumbers) {
                increment()
                if (containsBadLetters().not() && containsConsecutive() && containspairs())
                    notOk = false
            }
        }
    }

    findNext()
    println("new password is ${String(asNumbers.reversed().map { it.toByte() }.toByteArray())}")
    findNext()
    println("password after that is ${String(asNumbers.reversed().map { it.toByte() }.toByteArray())}")
}

fun day12() {
    println("\nDay 12:")
    val json = Parser().parse("./src/main/kotlin/AoC15/input/day12.txt") as JsonObject

    var redOrNo = false

    fun traverse(obj: Any): Int {
        return when(obj) {
            is JsonObject -> if (obj.values.any { it == "red" } && redOrNo) 0 else obj.values.map { traverse(it!!) }.sum()
            is Int -> obj
            is JsonArray<*> -> obj.map { traverse(it!!) }.sum()
            else -> 0
        }
    }

    println(traverse(json))
    redOrNo = true
    println(traverse(json))
}

fun day13() {
    println("\nDay 13:")
    val guests = mutableSetOf<String>()
    val seatings = mutableMapOf<Pair<String, String>, Int>()

    lines(13).forEach { line ->
        val parts = line.split(" ")
        val points = when(parts[2]) {
            "gain" -> { parts[3].toInt() }
            else -> { -parts[3].toInt() }
        }
        val guest1 = parts.first()
        val guest2 = parts.last().dropLast(1)
        guests.addAll(listOf(guest1, guest2))
        seatings[guest1 to guest2] = points
    }

    fun maximumHappiness(guests: List<String>): Int = Permutations(guests.size).mapIndexed { index, conf ->
        val sum = conf.zipWithNext().sumBy { (seatings[guests[it.first] to guests[it.second]] ?: 0) + (seatings[guests[it.second] to guests[it.first]] ?: 0) }
        sum + (seatings[guests[conf.first()] to guests[conf.last()]] ?: 0) + (seatings[guests[conf.last()] to guests[conf.first()]] ?: 0)
    }.max()!!

    println("max change in happiness is ${maximumHappiness(guests.toList())}")
    println("max change in happiness, me included, is ${maximumHappiness(guests.apply { add("me") }.toList())}")
}

fun day14() {
    println("\nDay 14:")
    data class ReinDeer(val speed: Int, val flying: Int, val resting: Int, val name: String)

    val reindeers = lines(14).map { line -> line.split(" ").let { parts -> ReinDeer(parts[3].toInt(), parts[6].toInt(), parts[13].toInt(), parts.first())} }

    val seconds = 2503

    fun getDistances(second: Int) = reindeers.map {
        val x = second / (it.flying + it.resting)
        val y = second % (it.flying + it.resting)
        (x * it.flying * it.speed + min(y, it.flying) * it.speed)
    }

    val points = MutableList(size = reindeers.size, init = {0})
    for (second in 1 until seconds) {
        getDistances(second).let {
            val max = it.max()
            it.forEachIndexed { index, i ->
                if (i == max) points[index] = points[index] + 1
            }
        }
    }

    println("distance: ${getDistances(seconds).max()}")
    println("most points: ${points.max()}")

}