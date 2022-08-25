import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {

    val clienteTest = Cliente("Guilherme", "555543123", "944602311")

    @Test
    fun addCompra() {
        clienteTest.addCompra("Frango")
        clienteTest.addCompra("Batata")
        clienteTest.addCompra("Arroz")

        assertEquals(3, clienteTest.ListaCompras.size)
    }
}