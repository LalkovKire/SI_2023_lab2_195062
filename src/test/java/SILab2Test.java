import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    RuntimeException ex;
    List<User> emptyList = new ArrayList<>();
    List<User> fullList = new ArrayList<>();
    User userTest2 = new User(null,"Cigan@ che","user@gmail.com");
    User userTest3 = new User("blagoj","kozuvc","user2@gmail.com");
    User userTest4 = new User("david","lazickaa234","user3gmail.com");
    User userTest5 = new User("kire","lozinka^$23411","kire@gmail.com");
    User userMultipleCondition1 =  new User("kire",null,"kire@gmail.com");
    User userMultipleCondition2 =  new User("kire","lozinka^12345",null);

    public void init(){
        fullList.add(new User("trajce","asdafasdasdc233","user@gmail.com"));
        fullList.add(new User("blagoj","kozuvc","user2@gmail.com"));
        fullList.add(userTest4);
    }
    @Test
    public void everyBranch() {
        init();
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,emptyList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertFalse(SILab2.function(userTest2, fullList));

        assertFalse(SILab2.function(userTest3, fullList));

        assertFalse(SILab2.function(userTest4, fullList));

        assertTrue(SILab2.function(userTest5, fullList));
    }

    @Test
    public void multipleCondition(){
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,emptyList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(userMultipleCondition1,emptyList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(userMultipleCondition2,emptyList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertTrue(SILab2.function(userTest5,fullList));
    }
}
