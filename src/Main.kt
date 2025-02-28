
class Alcancia {
    var Monedas20 = 0
    var Monedas50 = 0
    var Monedas100 = 0
    var Monedas200 = 0
    var Monedas500 = 0

    fun AgregarMonedas(DenominacionMonedas: Int){
        when (DenominacionMonedas){
            20 -> Monedas20++
            50 -> Monedas50++
            100 -> Monedas100++
            200 -> Monedas200++
            500 -> Monedas500++
            else -> println("Ingresa tu mondedas de $20, $50, $100, $200, $500. ")
        }
    }

    fun CantidadMonedas (){
        println("Espere un momento, Usted tiene las siguientes monedas: ")
        println("Monedas de $20: $Monedas20")
        println("Monedas de $50: $Monedas50")
        println("Monedas de $100: $Monedas100")
        println("Monedas de $200: $Monedas200")
        println("Monedas de $500: $Monedas500")
    }
    fun ValorTotal (){
        var total = 0
        repeat(Monedas20){ total += 20 }
        repeat(Monedas50){ total += 50 }
        repeat(Monedas100){ total += 100 }
        repeat(Monedas200){ total += 200 }
        repeat(Monedas500){ total += 500 }

        println("Perfecto su total ahorrado es: $ $total")
    }
    fun RomperAlcancia(){
        println("Estamos rompiendo su alcancia por favor espere...")

        Monedas20 = 0
        Monedas50 = 0
        Monedas100 = 0
        Monedas200 = 0
        Monedas500 = 0
        println("Su alcancia se a vaciado con satisfaccion.")
    }
}

fun main() {
    val alcancia = Alcancia()

    while (true){
        println("Bienvenido a su alcancia.")
        println("1. Agregar Monedas.")
        println("2. Contar sus Monedas.")
        println("3. Calcular sus Ahorros.")
        println("4. Romper su Alcancia.")
        println("5. Salir de su alcancia.")
        print("que le gustaria hacer hoy: ")

        val opcion = readln().toIntOrNull()

        when (opcion){
            1 -> {
                print("Ingrese la denominacion de su moneda ($20, $50, $100, $200, $500):" )

                val valor = readln().toIntOrNull()
                if (valor != null)
                    alcancia.AgregarMonedas(valor)
                else println("Opcion Erronea.")
            }
            2 -> alcancia.CantidadMonedas()
            3 -> alcancia.ValorTotal()
            4 -> alcancia.RomperAlcancia()
            5 -> {
                println("Gracias por confiar tu dinero en nosotros, vuelva pronto.")
                break
            }
            else -> println("Seleccione una opcion valida.")
        }
    }
}