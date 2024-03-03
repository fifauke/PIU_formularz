/**@authors: Agata Zatorska, Filip Wojda**/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckDataTest extends CheckData {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testIsValidPesel() {
        assertTrue(CheckData.isValidPesel("92101463792"));
        assertFalse(CheckData.isValidPesel(""));
        assertFalse(CheckData.isValidPesel("921014637921"));
        assertFalse(CheckData.isValidPesel("9210146379"));
        assertFalse(CheckData.isValidPesel("12345678901"));
        assertFalse(CheckData.isValidPesel("9C1014A379-"));
    }

    @Test
    public void testValidDate() {
        assertTrue(CheckData.isDateValid(15, 6, 2023));
        assertTrue(CheckData.isDateValid(28, 2, 2024));
        assertTrue(CheckData.isDateValid(31, 12, 2022));
    }

    @Test
    public void testInvalidDate() {
        assertFalse(CheckData.isDateValid(29, 2, 2023));
        assertFalse(CheckData.isDateValid(31, 4, 2023));

    }

    @Test
    void testIsFirstLetterSmall() {
        assertTrue(CheckData.isFirstLetterSmall("ania"));
        assertTrue(CheckData.isFirstLetterSmall("ania-ania"));
        assertFalse(CheckData.isFirstLetterSmall("Ania"));
        assertFalse(CheckData.isFirstLetterSmall("Ania-Ania"));
        assertFalse(CheckData.isFirstLetterSmall("ania-Ania"));
        assertFalse(CheckData.isFirstLetterSmall(""));
    }

    @Test
    void testChangeToUpperLetter() {
        assertEquals("", CheckData.changeToUpperLetter(""));
        assertEquals("Ania", CheckData.changeToUpperLetter("ania"));
        assertEquals("Ania-Ania", CheckData.changeToUpperLetter("ania-ania"));
        assertEquals("Ania-Ania", CheckData.changeToUpperLetter("ANIA-ANIA"));
        assertEquals("Ania-Ania", CheckData.changeToUpperLetter("AnIa-aNiA"));
    }
}