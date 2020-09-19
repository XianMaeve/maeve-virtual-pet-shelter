import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {

    @Test
    public void canNamePet() {
        VirtualPet testPet = new VirtualPet("bob", "a cat", 45, 45, 45);
        assertEquals("bob", testPet.getName());
        assertEquals("ron",testPet.setName("ron"));
    }

    @Test
    public void canFeedPet() {
        VirtualPet testPet = new VirtualPet("bob", "a cat", 45, 45, 45);
        testPet.setHunger(10);
        assertEquals(10, testPet.getHunger());
        assertEquals(50,testPet.setHunger(50));
    }

    @Test
    public void canWaterPet() {
        VirtualPet testPet = new VirtualPet("bob", "a cat", 45, 45, 45);
        testPet.setThirst(10);
        assertEquals(10, testPet.getThirst());
        assertEquals(50, testPet.setThirst(50));
    }

    @Test
    public void canEntertainPet() {
        VirtualPet testPet = new VirtualPet("bob", "a cat", 45, 45, 45);
        testPet.setBoredom(10);
        assertEquals(10, testPet.getBoredom());
        assertEquals(50, testPet.setBoredom(50));
    }

    @Test
    public void canConstructSimple() {
        VirtualPet testPet = new VirtualPet("bob", "a cat");
        assertEquals("bob", testPet.getName());
        assertEquals("a cat", testPet.getDescription());
    }

    @Test
    public void canConstructFull() {
        VirtualPet testPet = new VirtualPet("bob", "a cat", 10, 10, 10);
        assertEquals("bob", testPet.getName());
        assertEquals("a cat", testPet.getDescription());
        assertEquals(10, testPet.getThirst());
        assertEquals(10, testPet.getBoredom());
        assertEquals(10, testPet.getHunger());
    }

    @Test
    public void canDescribe() {
        VirtualPet testPet = new VirtualPet("bob", "");
        assertEquals("", testPet.getDescription());
        assertEquals("a cat", testPet.setDescription("a cat"));
    }

}
