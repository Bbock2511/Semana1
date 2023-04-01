fun main(){
    //1)
    var nota1: Float
    var nota2: Float
    var num: Int
    var idade: Int
    var numInteiro: Int

    print("Digite a 1ª nota: ")
    nota1 = readln().toFloat()
    print("Digite a 2ª nota: ")
    nota2 = readln().toFloat()

    var media = nota1 + nota2 / 2

    if (media >= 7)
        println("Aprovado")
    else
        println("Reprovado")

    //2)
    println("Digite um número inteiro: ")
    num = readln().toInt()
    if (num % 2 == 0)
        println("Par")
    else
        println("Ímpar")

    //3)
    println("Digite qualquer número inteiro: ")
    numInteiro = readln().toInt()
    if(numInteiro < 0)
        println("Negativo")
    else if (numInteiro > 0)
        println("Positivo")
    else if (numInteiro == 0)
        println("Zero")

    //4)
    println("Digite a sua idade: ")
    idade = readln().toInt()
    if (idade >= 18)
        println("Maior de idade")
    else
        println("Menor de idade")
}