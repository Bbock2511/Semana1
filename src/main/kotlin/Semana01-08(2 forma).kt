fun main() {
    print("Qual tipo de unidade você deseja converter? (temperatura, distância ou tempo) ")
    val tipoUnidade = readln().lowercase()

    when (tipoUnidade) {
        "temperatura" -> {
            print("Qual é a unidade de origem? (Celsius ou Fahrenheit) ")
            val unidadeOrigem = readln().lowercase()
            print("Qual é a unidade de destino? (Celsius ou Fahrenheit) ")
            val unidadeDestino = readln().lowercase()
            print("Qual é a temperatura em $unidadeOrigem? ")
            val temperatura = readLine()?.toDouble()

            var resultado = 0.0
            if (unidadeOrigem == "celsius" && unidadeDestino == "fahrenheit") {
                resultado = temperatura!! * 9 / 5 + 32
            } else if (unidadeOrigem == "fahrenheit" && unidadeDestino == "celsius") {
                resultado = (temperatura!! - 32) * 5 / 9
            }

            println("$temperatura $unidadeOrigem é equivalente a $resultado $unidadeDestino")
        }
        "distância" -> {
            print("Qual é a unidade de origem? (metros ou quilômetros) ")
            val unidadeOrigem = readln().lowercase()
            print("Qual é a unidade de destino? (metros ou quilômetros) ")
            val unidadeDestino = readln().lowercase()
            print("Qual é a distância em $unidadeOrigem? ")
            val distancia = readLine()?.toDouble()

            var resultado = 0.0
            if (unidadeOrigem == "metros" && unidadeDestino == "quilômetros") {
                resultado = distancia!! / 1000
            } else if (unidadeOrigem == "quilômetros" && unidadeDestino == "metros") {
                resultado = distancia!! * 1000
            }

            println("$distancia $unidadeOrigem é equivalente a $resultado $unidadeDestino")
        }
        "tempo" -> {
            print("Qual é a unidade de origem? (horas ou minutos) ")
            val unidadeOrigem = readln().lowercase()
            print("Qual é a unidade de destino? (horas ou minutos) ")
            val unidadeDestino = readln().lowercase()
            print("Quantas $unidadeOrigem são? ")
            val tempo = readLine()?.toDouble()

            var resultado = 0.0
            if (unidadeOrigem == "horas" && unidadeDestino == "minutos") {
                resultado = tempo!! * 60
            } else if (unidadeOrigem == "minutos" && unidadeDestino == "horas") {
                resultado = tempo!! / 60
            }

            println("$tempo $unidadeOrigem é equivalente a $resultado $unidadeDestino")
        }
        else -> println("Tipo de unidade inválido")
    }
}
