class HabitacionController {

    val HabitacionList = mutableListOf<Habitacion>()

    fun registrarHabitacion() {
        println("Ingresa el nombre")
        val Nombre = readln()
        println("Ingresa el numero")
        val numero = readln().toInt()
        println("Ingresa la habitacion individual")
        val HabitacionIndividual = readln()
        println("Ingresa la habitacion doble")
        val HabitacionDoble = readln()
        println("Ingresa la suite")
        val Suite = readln()
        println("Ingresa la capacidad")
        val Capacidad = readln().toDouble()
        println("Ingresa el precio por noche")
        val PrecioPorNoche = readln().toDouble()

        val Habitacion =
            Habitacion(Nombre, numero, HabitacionIndividual, HabitacionDoble, Suite, Capacidad, PrecioPorNoche)
        HabitacionList.add(Habitacion)
    }

    fun ModificarHabitacion() {}

    fun ObtenerHabitacionIndice(Indice: Int): Habitacion {
        return HabitacionList[Indice]
    }

    fun showHabitacion() {
        if (HabitacionList.isEmpty()) {
            println("No se encuentran habitaciones registradas")
        } else {
            var contar = 1
            for (Habitacion in HabitacionList) {
                println("$contar " + Habitacion)
                contar
            }
        }
    }

    fun areNotRoomsRegistered(): Boolean = HabitacionList.isEmpty()

}