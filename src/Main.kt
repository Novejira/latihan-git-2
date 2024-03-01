import kotlin.math.sqrt
import kotlin.math.PI

class triangle (
    val alas: Double,
    val tinggi: Double,
    val sisiA: Double,
    val sisiB: Double,
    val sisiC: Double ) {

    fun hitungLuas(): Double {
        return 0.5 * alas * tinggi
    }

    fun hitungKeliling(): Double {
        return sisiA + sisiB + sisiC
    }
}
class  circle (val jarijari:Double){
    fun hitungluas():Double{
        return PI*jarijari*jarijari
    }
    fun hitungkeliling():Double{
        return 2* PI*jarijari
    }
}

fun main() {
    // menghitung luas dan keliling lingkaran
    val segitiga = triangle(
        alas = 1.0,
        tinggi = 2.0,
        sisiA = 3.0,
        sisiB = 4.0,
        sisiC = 5.0)

    val luassegitiga = segitiga.hitungLuas()
    val kelilingsegitiga = segitiga.hitungKeliling()

    println("Luas segitiga: $luassegitiga")
    println("Keliling segitiga: $kelilingsegitiga")

    println("")

    // menghitung luas dan keliling lingkaran
    val lingkaran = circle (jarijari = 5.0)

    val luaslingkaran = lingkaran.hitungluas()
    val kelilinglingkaran = lingkaran.hitungkeliling()

    println("Luas lingkaran: $luaslingkaran")
    println("Keliling lingkaran: $kelilinglingkaran")
}