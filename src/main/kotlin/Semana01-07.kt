fun main() {
    //1
    print("Digite um número de 1 a 7: ")
    val dia = readln().toInt()

    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Número inválido")
    }
    //2
    print("Digite o nome do animal: ")
    val animal = readln().lowercase()

    when (animal) {
        "cachorro", "gato", "vaca", "cavalo" -> println("Mamífero")
        "papagaio", "pomba", "águia", "coruja" -> println("Ave")
        "cobra", "jacaré", "tartaruga", "lagarto" -> println("Réptil")
        else -> println("Não sei que tipo de animal é esse")
    }
    //3
    print("Digite uma letra: ")
    val letra = readln().lowercase()

    when (letra) {
        "a", "e", "i", "o", "u" -> println("Vogal")
        "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" -> println("Consoante")
        else -> println("Não é uma letra")
    }
    //4
    print("Digite um número de 1 a 12: ")
    val mes = readln().toInt()

    when (mes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Número inválido")
    }
}