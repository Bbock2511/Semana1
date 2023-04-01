fun main(){
    var variavel: Int = 10
    val constante: Int = 5

    print("Variáveis são representadas pela palavra-chave var." +
            "\nElas são usadas para armazenar valores que podem ser alterados durante a execução do programa.")
    print("\nConstantes são representadas pela palavra-chave val. " +
            "\nSão usadas para armazenar valores que não podem ser alterados durante a execução do programa.")
    println("\nVariável $variavel")
    variavel = 2
    println("Variável atualizada $variavel")
    println("Constante $constante")
    println("Se tentar mudar o valor de uma constante o kotlin diz que é um erro.")
}