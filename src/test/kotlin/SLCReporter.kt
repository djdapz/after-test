import org.junit.Test
import java.lang.Thread.sleep

class SLCReporter {
    init {
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("SEND REPORT")
                println("START DOING SOMETHING SLOW")
                sleep(10000)
                println("FINISH SENDING")
            });
    }

    @Test
    fun `noop to ensure slc is sent`() {

    }
}