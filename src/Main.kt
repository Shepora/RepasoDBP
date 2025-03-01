
fun main() {
    var IntentosPermitidos = 0
    var CodigoAcceso: Int
    var NombreVisitante: String
    var MotivosVisita: String

    while (IntentosPermitidos < 3){
        println("Bienvenido, Por favor ingrese su codigo de acceso.")
        CodigoAcceso = readln().toInt()

        if (CodigoAcceso in 1000..1999){
                print("Bienvenido, Empleado su ID es: $CodigoAcceso.")
                break
            } else if (CodigoAcceso in 2000..2999){
                println("Bienvenido Visitante, Ingrese su nombre por favor: ")
            NombreVisitante = readln().toString()

            println("Por favor ingrese el motivo de su visita: ")
           MotivosVisita = readln().toString()

            println("Acceso Autorizado, Visitante: $NombreVisitante, Motivo: $MotivosVisita")
            break
            }
            else {
            IntentosPermitidos++
            println("Su codigo es incorrecto. Intento $IntentosPermitidos de 3")

            if (IntentosPermitidos == 3) {
                println("Su acceso ha sido Bloqueado")

            }
        }
    }
}