package Intermediate.ScopeFunctions

// Clase de datos que representa la información de un producto
// 'priceInDollars' puede ser un Double o null
data class ProductInfo(val priceInDollars: Double?)
// Clase que representa un producto
class Product {
    // Función que devuelve la información del producto, puede ser null
    fun getProductInfo(): ProductInfo? {
        return ProductInfo(100.0) // Por ahora siempre devuelve un ProductInfo con 100 dólares
    }
}

// Función de extensión para la clase Product
// Devuelve el precio en euros si la información está disponible, o null si no lo está
fun Product.getPriceInEuros() =
    getProductInfo()?.priceInDollars?.let { convertToEuros(it) }
// Explicación paso a paso:
// 1. getProductInfo()? → intenta obtener la info del producto, puede ser null
// 2. priceInDollars? → si ProductInfo no es null, accede a priceInDollars (puede ser null también)
// 3. let { convertToEuros(it) } → si priceInDollars no es null, lo convierte a euros usando convertToEuros

// Función que convierte dólares a euros
fun convertToEuros(dollars: Double): Double {
    return dollars * 0.85 // Tasa de conversión fija 1 USD = 0.85 EUR
}

// Función main: punto de entrada del programa
fun main() {
    val product = Product() // Creamos un producto
    val priceInEuros = product.getPriceInEuros() // Obtenemos el precio en euros usando la función de extensión

    // Comprobamos si se obtuvo un precio válido
    if (priceInEuros != null) {
        println("Price in Euros: €$priceInEuros")
        // Imprime: Price in Euros: €85.0
    } else {
        println("Price information is not available.")
        // Este caso ocurriría si getProductInfo() devolviera null o priceInDollars fuera null
    }
}
