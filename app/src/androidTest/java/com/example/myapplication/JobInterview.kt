package com.example.myapplication

fun main() {
    /*
    Реализовать метод который для строки подсчитывает количество букв и вывести на экран.
    Пример: Строка 'калашников' a - 2 к - 2 л - 1 ш - 1 н - 1 и - 1 о - 1 в - 1
     */

    /*
    почитать про
    Nothing,
    Any,
    Object
    модификатор доступа internal
    статические методы в kotlin
    корутины - попрактиковаться
    создание строки разными способами и сравнение по ссылке и equals
    */
    val str: String = "калашников"

    val obj = mutableMapOf<Char, Int>()

    str.toList().forEach { char ->
        if(obj.containsKey(char)) {
            obj[char] = obj[char]!! + 1
        } else {
            obj[char] = 1
        }
    }

    println(obj)

}