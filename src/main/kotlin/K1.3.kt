//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.

fun main() {
   print("Введите число: ")
   val input = readln().toIntOrNull() ?: return
   println("Результат: ${input.toString(2)}")
}