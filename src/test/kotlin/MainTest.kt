import org.junit.jupiter.api.*
import java.lang.NullPointerException

class MainTest {

    @Test
    @DisplayName ("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xx3xooO"))},
        )
    }

    @Test
    @Disabled
    fun naoImplementado(){
    }

    @Test
    fun vaiFalhar() {
        fail("Não esquecer de implementar!!!")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxoo")) // runs context below only if this test results in true
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception (){
        assertThrows<NullPointerException> {abc()} //expect a exception to pass.
    }

}
