import kotlin.random.Random

fun main() {
    var Dinero: Double
    var NumeroDeLaSuerte: Int
    var Opcion: String

    println("Por favor ingrese la cantidad que quiere apostar: ")
    Dinero = readln().toDouble()

    if (Dinero <= 0) {
        println("Por favor ingrese una cantidad valida para poder apostar")
    } else {
        while (Dinero > 0) {
            NumeroDeLaSuerte = Random.nextInt(1, 4)
            println("El numero de la suerte es: $NumeroDeLaSuerte")

            if (NumeroDeLaSuerte == 3) {
                print("Has perdido todo, !mejor suerte para la proxima!")
                Dinero = 0.0
                break
            } else if (NumeroDeLaSuerte == 2) {
                Dinero /= 2
                println("Has tenido suerte pero no todo salio bien, has perdido la mitad tu dinero. Te quedan: $Dinero ")
                println("¿Quieres seguir jugando? (si/no): ")
                Opcion = readln().lowercase()

                if (Opcion == "no") {
                    println("Te retiras con: $ $Dinero. !Gracias por jugar!")
                    break
                }
            } else if (NumeroDeLaSuerte == 1) {
                Dinero *= 2
                println("!Has Corrido Con Suerte. Haz ganado el doble de tu apuesta, ahora tienes: $ $Dinero")
                println("Quieres seguir jugando? (si/no): ")
                Opcion = readln().lowercase()

                if (Opcion == "no") {
                    println("Te vas con: $ $Dinero. !Gracias por jugar!")
                    break
                }
            }
        }
    }
}

