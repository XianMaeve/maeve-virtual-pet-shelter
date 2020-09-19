import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void canGenerateShelter() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        assertEquals(4, testShelter.generateShelter(4));
    }

    @Test
    public void canGetSize() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        assertEquals(3,testShelter.generateShelter(3));
    }

    @Test
    public void canAdmitPet() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        testShelter.admit("bob", "a cat");
        assertEquals(5, testShelter.getShelterSize());
    }

    @Test
    public void canFeedAll() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        ArrayList<Integer> testList = new ArrayList<Integer>();

        for (int i = 0; i <= 3; i++) {
            testList.add(50);
        }

        assertEquals(testList, testShelter.feedAll());
    }

    @Test
    public void canWaterAll() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        ArrayList<Integer> testList = new ArrayList<Integer>();

        for (int i = 0; i <= 3; i++) {
            testList.add(50);
        }

        assertEquals(testList, testShelter.waterAll());

    }

    @Test
    public void canPlay() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        LinkedHashMap<String, Integer> testMap = new LinkedHashMap<String, Integer>();
        testMap.put("winston", 45);
        testMap.put("james", 45);
        testMap.put("harold", 50);
        testMap.put("richard", 45);

        assertEquals(testMap, testShelter.play("harold"));
    }

    @Test
    public void canAdopt() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        testShelter.adopt("winston");
        assertEquals(3, testShelter.getShelterSize());
    }

    @Test
    public void canGetAll() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        LinkedHashMap<String, VirtualPet> testMap = testShelter.shelterPets;
        assertEquals(testMap, testShelter.getShelterPets());
    }

    @Test
    public void canGetOne() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(4);
        VirtualPet testPet = testShelter.shelterPets.get("winston");
        assertEquals(testPet, testShelter.getPet("winston"));
    }

    @Test
    public void canDisplay() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(3);
        assertEquals(3, testShelter.displayPets());
    }

    @Test
    public void canDisplayDescriptions() {
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.generateShelter(2);
        assertEquals(2, testShelter.displayPetDescriptions());
    }

}
