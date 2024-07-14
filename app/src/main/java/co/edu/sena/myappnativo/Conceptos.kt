package co.edu.sena.myappnativo

fun main () {

    // Variables and Caracteres
    var Nombre: String = "Juan"
    println(Nombre)


    // Constantes
    val edad: Int = 48
    //edad = 78
    println(edad) // Error: Val cannot be reassigned


    //Opcionales
    var edadOpcional: Int? = 25
    println(edadOpcional)

    var nombreUsuario: String? = null

    if (nombreUsuario == null) {
        println("Bienvenido $nombreUsuario")
    } else {
        println("El nombre de usuario no está disponible")
    }


    // Nulos
    var nombre: String? = null
    println(nombre)



    fun Tipos_Datos () {

        // NUmericos
        println()
        var edadEnAnios: Byte = 10
        var puntajeEnVideojuego: Short = 2048
        var cantidadDeUsuarios: Int = 100000
        var numeroDeIdentificacion: Long = 1234567890123456789
        println(edadEnAnios)
        println(puntajeEnVideojuego)
        println(cantidadDeUsuarios)
        println(numeroDeIdentificacion)

        // Decimal
        var promedioDeCalificaciones: Double = 9.5
        var precioDeVenta: Float = 19.99F
        println(promedioDeCalificaciones)
        println(precioDeVenta)


        // Unico caracter
        var tallaProducto: Char = 'M'
        println(tallaProducto)

        // Boolean
        val dato: Boolean = true
        if (dato) {
            println("Verdadero")
        } else {
            println("Falso")
        }

    }

Tipos_Datos()

}