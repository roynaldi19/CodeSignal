fun solution(year: Int): Int {
    var century: Int = year / 100

    if(year % 100 != 0) century++

    return century

}

fun main() {
    println(solution(201))
}