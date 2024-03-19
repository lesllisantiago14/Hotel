fun main() {

    val adminController = AdminController()
    adminController.showMenu()
    val clientesController = ClientesController()
    clientesController.showCliente()
    val HabitacionController = HabitacionController()
    HabitacionController.showHabitacion()
    val ReservasController = ReservasController()
    ReservasController.showReserva()
}
