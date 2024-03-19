class ReservasController {

    val ReservaList = mutableListOf<Reserva>()
    fun registrarReserva() {
        println("Ingresa el nombre")
        val nombre = readln()
        println("Ingresa el apellido")
        val Apellido = readln()
        println("Ingresa la Hbitacion")
        val Habitacion = readln()
        println("Ingresa el fecha de inicio")
        val FechaDeInicio = readln().toInt()
        println("ingresa la fecha de fin")
        val FechaDeFin = readln().toInt()
        println("Ingresa el tipo de habitacion")
        val TipoDeHabitacion = readln()
        println("Ingresa el Email")
        val Email = readln()
        println("Ingresa el credit card")
        val CreditCard = readln().toLong()

        val Reserva =
            Reserva(nombre, Apellido, Habitacion, FechaDeInicio, FechaDeFin, TipoDeHabitacion, Email, CreditCard)
        ReservaList.add(Reserva)

    }

    fun showReserva() {
        if (ReservaList.isEmpty()) {
            println("No hay habitaciones registradas")
        } else {
            var Contar = 1
            for (Reserva in ReservaList) {
                println("$Contar" + Reserva)
                Contar
            }
        }
    }
}
