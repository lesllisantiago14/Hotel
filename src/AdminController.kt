class AdminController {
    private val printer= println()
    private val clienteController = ClientesController()
    private val HabitacionController = HabitacionController()
    private val reservaController = ReservasController()

    fun showMenu() {
        println().apply {
            println("Ingrese una opcion")
            println("1.- Registrar un cliente")
            println("2 .- Registrar una habitacion")
            println("3:.- Registrar una reserva")
            println("4:.-Mostrar Clientes")
            println("5:.-Mostras habitacions")
            println("6:.-Mostrar reservas")

            val selectedOption = readln().toInt()
            (selectedOption)
        }

        fun valida(selectedOption: Int) {
            when (selectedOption) {
                1 -> {
                    clienteController.registrarCliente()
                    showMenu()
                }
                2 -> {
                    HabitacionController.registrarHabitacion()
                    showMenu()

                }
                3 -> {
                    reservaController.registrarReserva()
                    showMenu()
                }
                4 -> {
                    clienteController.showCliente()
                    showMenu()
                }
                5 -> {
                    HabitacionController.showHabitacion()
                    showMenu()

                }
                6  -> {
                    reservaController.showReserva()

                }
            }

        }
    }


    private fun seleccionarCliente() {

        if (clienteController.areNotClientsRegistered()) {
            println("No se encuentran clientes registrados")
            showMenu()
            return
        }
        if (HabitacionController.areNotRoomsRegistered()) {
            println("No se encuentran habitaciones registradas")
            showMenu()
            return
        }

        println("Seleccione un cliente")
        ClientesController ()

        val selectedCustomerIndex = readln().toInt()
        val Cliente = clienteController.getCustomerByIndex(selectedCustomerIndex - 1)

        println("Seleccione una habitacion")
        HabitacionController.showHabitacion()
        val selectedRoomIndex = readln().toInt()
        val Habitacion = HabitacionController.ObtenerHabitacionIndice(selectedRoomIndex - 1)
        }
  }



