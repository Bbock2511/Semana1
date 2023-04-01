import java.util.*

fun main() {
    println("Hello World!")
    print("Digite um número: ")

    val n1 = readln().toInt()

    print("Digite um número: ")

    val secound = readln()
    val n2 = secound.toInt()

    println("Soma = ${n1 + n2}")

    val scanner = Scanner(System.`in`)
    print("Digite o numerador: ")
    val n3 = scanner.nextInt()
    print("Digite o multiplicador: ")
    val n4 = scanner.nextInt()

    val multiplicacao = n3 * n4

    println("A multiplicação é: $multiplicacao")

}