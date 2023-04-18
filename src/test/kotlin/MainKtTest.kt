import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun isShuffle() {
        assertFalse(isShuffle("TOURNAMENT", "DINNER" ,"TOUINN"))
        assertTrue(isShuffle("TOURNAMENT", "DINNER" ,"TDINOURNANMENTER"))
        assertTrue(isShuffle("TOURNAMENT", "DINNER" ,"DINTOUR"))
    }
}