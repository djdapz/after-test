import org.junit.Assert
import org.junit.Test

internal class AdderTest {

    @Test
    fun `should add two numbers`() {
        val sum = Adder().add(1, 2)
        Assert.assertEquals(3, sum)
    }
}