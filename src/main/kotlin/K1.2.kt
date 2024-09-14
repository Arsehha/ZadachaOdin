/*Создать приложение, которое подсчитывает количество различных символов во введенной строке.
Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
A - 3
D - 2
S - 3*/

fun main () {
    println("Введите символы")
    val input = readln()
    //val input = "AASADDSS"
    var chars = input.toList().distinct().sorted()
    var result =  ""

    for(char in chars) {
        result += "$char - ${input.count {c -> c ==char}}\n"
    }
    println("Результат: \n$result")
}