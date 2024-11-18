package KotlinBase

fun main()
{
    print("введите слово: ")
    val word = readln()
    if (word.length >= 2) //проверка на кол-во символов
    {
        val first = word.substring(0, 4) // ф-ия, которая определяет индексы извлекаемых символов
        val last = word.substring(4) // извлекаем оставшиеся символы входной строки
        val result = "$last $first" // объединение строк
        println("перевернутая строка: $result")
    }
    else
    {
        println("строка должна содержать более 2х символов")
    }
}