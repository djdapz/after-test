import org.junit.Test
import kotlin.test.assertEquals

internal class MultiplierTest{
    @Test
    fun `should multiply`(){
        println("TEST")
        val product =  Multiplier().multiply(3, 4)
        assertEquals(product, 12)
    }
}