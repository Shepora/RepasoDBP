
fun main (){
    var Votos_Del_Candidato_1 = 0
    var Votos_Del_Candidato_2 = 0
    var Votos_Del_Candidato_3 = 0

    var Costo_Del_Candidato_1 = 0
    var Costo_Del_Candidato_2 = 0
    var Costo_Del_Candidato_3 = 0

    var Total_votos = 0
    var menu = 0

    while (menu != 6){
        println("VOTACIONES")
        println("1) Votar")
        println("2) Calcular el costo de la campaña politica")
        println("3) Vaciar las urnas")
        println("4) Mostrar el total de los votos")
        println("5) Mostrar el porcentaje de los votos")
        println("6) Finalizar")
        println("Por favor, seleccione una opcion")

        menu = readln().toIntOrNull()?:0

        if (menu == 1){
            println("Seleccione el candidato de su eleccion: ")
            println("1). Candidato 1")
            println("2). Candidato 2")
            println("3). Candidato 3")
            println("Opcion: ")

            val Candidato = readln().toIntOrNull()

            println("Medio de influencia del voto: ")
            println("1). Internet")
            println("2). Radio")
            println("3). Television")
            println("Opcion: ")

            val Medio = readln().toIntOrNull()

            var Costo_del_voto = 0
            if (Medio == 1) Costo_del_voto = 700000
            else if (Medio == 2) Costo_del_voto = 200000
            else if (Medio == 3) Costo_del_voto = 600000

            if (Candidato == 1){
                Votos_Del_Candidato_1 ++
                Costo_Del_Candidato_1 += Costo_del_voto
            } else if (Candidato == 2){
                Votos_Del_Candidato_2 ++
                Costo_Del_Candidato_2 += Costo_del_voto
            } else if (Candidato == 3){
                Votos_Del_Candidato_3 ++
                Costo_Del_Candidato_3 += Costo_del_voto
            }
            Total_votos ++
            println("Su voto se a registrado de manera exitosa.")
        } else if (menu == 2){
            println("El costo de la campaña de cada candidato.")
            println("Candidato 1: $$Costo_Del_Candidato_1")
            println("Candidato 2: $$Costo_Del_Candidato_2")
            println("Candidato 3: $$Costo_Del_Candidato_3")
        } else if (menu == 3){
            Votos_Del_Candidato_1 = 0
            Votos_Del_Candidato_2 = 0
            Votos_Del_Candidato_3 = 0
            Costo_Del_Candidato_1 = 0
            Costo_Del_Candidato_2 = 0
            Costo_Del_Candidato_3 = 0
            Total_votos = 0
            println("!!!Las urnas han sido vaciadas!!!")
        } else if (menu == 4){
            println("El total de votos fue: $Total_votos")
        } else if (menu == 5){
            if (Total_votos > 0){
                val Porcentaje_Candidato_1 = (Votos_Del_Candidato_1 * 100) / Total_votos
                val Porcentaje_Candidato_2 = (Votos_Del_Candidato_2 * 100) / Total_votos
                val Porcentaje_Candidato_3 = (Votos_Del_Candidato_3 * 100) / Total_votos

                println("El porcentaje de votos por cada candidato fue: ")
                println("Candidato 1: $Porcentaje_Candidato_1%")
                println("Candidato 2: $Porcentaje_Candidato_2%")
                println("Candidato 3: $Porcentaje_Candidato_3%")
            } else {
                println("Aun no se han registrado votos...")
            }

        } else if (menu == 6){
            println("Saliendo, por favor espere...")
        } else{
            println("Opcion invalida, por favor intentelo de nuevo.")
        }
    }
}

