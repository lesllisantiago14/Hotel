class ClientesController {

    val clienteList = mutableListOf<Cliente>()

    fun registrarCliente() {

        println("Ingresa el nombre")
        val nombre = readln()
        println("Ingresa el apellido")
        val apellido = readln()
        println("ingresa la ciudad")
        val ciudad = readln()
        println("ingresa el telefono")
        val telefono = readln().toLong()
        println("ingresa el Email")
        val Email = readln()
        println("ingresa el acompañante")
        val Acompañante = readln()

        val cliente = Cliente(nombre,apellido,ciudad,telefono,Email,Acompañante)
        clienteList.add(cliente)

        clienteList.add(cliente)
    }
    fun showCliente() {
        if (clienteList.isEmpty()) {
            println("No se encuentran clientes registrados")
        } else {
            var contar = 1
            for (contar in clienteList) {
                println("$contar-" + clienteList)
                contar
            }
        }
    }

    fun getCustomerByIndex(index: Int): Cliente = clienteList[index]

    fun areNotClientsRegistered(): Boolean = clienteList.isEmpty()
}