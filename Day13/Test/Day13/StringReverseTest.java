package Day13;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    @Test
    public void isEmptyString() {
        assertEquals("",StringReverse.reverse(""));
    }

    @Test
    public void normalString(){
        assertEquals("smada",StringReverse.reverse("adams"));
        assertEquals("smadA",StringReverse.reverse("Adams"));
    }

    @Test
    public void SingleCharacter(){
        assertEquals("g",StringReverse.reverse("g"));
    }

    @Test
    public void SpecialCharacter(){
        assertEquals("smada",StringReverse.reverse("adams"));
        assertEquals("!smada",StringReverse.reverse("adams!"));
        assertEquals("$smada!",StringReverse.reverse("!adams$"));
    }

    @Test
    public void NullCheck() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringReverse.reverse(null);
        });
        assertEquals("String can't be null", exception.getMessage());
    }
}
