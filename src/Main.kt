import kotlin.math.E


fun main() {
    var Monedas20 = 0
    var Monedas50 = 0
    var Monedas100 = 0
    var Monedas200 = 0
    var Monedas500 = 0
    var TotalDinero = 0

    var Eleccion: Int

    while (true){
        println("Bienvenido a su alcancia.")
        println("1. Agregar Monedas.")
        println("2. Contar sus Monedas.")
        println("3. Calcular sus Ahorros.")
        println("4. Romper su Alcancia.")
        println("5. Salir de su alcancia.")
        print("que le gustaria hacer hoy: ")

        Eleccion = readln().toInt()

        if (Eleccion == 1){

                print("Ingrese la denominacion de su moneda ($20, $50, $100, $200, $500):")
                val denominacion = readln().toInt()

                if (denominacion == 20) {
                    Monedas20++
                    TotalDinero += 20
                } else if (denominacion == 50) {
                    Monedas50++
                    TotalDinero += 50
                } else if (denominacion == 100) {
                    Monedas100++
                    TotalDinero += 100
                } else if (denominacion == 200) {
                    Monedas200++
                    TotalDinero += 200
                } else if (denominacion == 500) {
                    Monedas500++
                    TotalDinero += 500
                } else {
                    println("La moneda ingresada no es valida.")
                }
            }
            else if (Eleccion ==2){
                println("En su alcancia tiene: ")
            println("Monedas de $20: $Monedas20")
            println("Monedas de $50: $Monedas50")
            println("Monedas de $100: $Monedas100")
            println("Monedas de $200: $Monedas200")
            println("Monedas de $500: $Monedas500")
            }
            else if (Eleccion== 3) {
            println("Su dinero ahorrado es: $TotalDinero")
            }
            else if (Eleccion ==4) {
            println("Estamos rompiendo su alcancia... Su retiro ha sido: $$TotalDinero")
            Monedas20 =0
            Monedas50 =0
            Monedas100 =0
            Monedas200 =0
            Monedas500 =0
            }
            else if (Eleccion ==5){
                println("Gracias por confiar tu dinero en nosotros, vuelva pronto.")
                break
            }
            else {
                println("Seleccione una opcion valida.")
        }
    }
}