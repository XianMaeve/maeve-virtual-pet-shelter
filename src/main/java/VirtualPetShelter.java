import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class VirtualPetShelter {
    private int seed = 0;
    private int shelterSize = 0;
    private ArrayList<Integer> petHungers = new ArrayList<Integer>();
    private ArrayList<Integer> petThirsts = new ArrayList<Integer>();
    private LinkedHashMap<String, Integer> petBoredoms = new LinkedHashMap<String, Integer>();
    private ArrayList<Integer> petHealths = new ArrayList<Integer>();
    private ArrayList<String> shelterPetNames = new ArrayList<String>();
    private String newName;
    private String[] starterNames = {"winston", "james", "harold", "richard"};
    private String[] starterDescriptions = {"A long-haired kitty with a round eye markings", "A goofy kitty who prefers to use his left paw", "A spaced-out kitty with a colorful coat", "The oddball kitty.  Always smacking things with his paws"};

    public int seedGet() {
        this.seed = (int) (Math.random() * 4);
        return seed;
    }

    LinkedHashMap<String, VirtualPet> shelterPets = new LinkedHashMap<String, VirtualPet>();

    public int getShelterSize() {
        return shelterSize;
    }

    public int generateShelter(int pop) {
        for (int i = 0; i <= (pop - 1); i++) {
            admit(starterNames[i], starterDescriptions[i]);
            shelterPetNames.add(starterNames[i]);
        }

        shelterSize = shelterPets.size();

        return shelterSize;
    }

    public int admit(String name, String description) {
        VirtualPet petToAdmit = new VirtualPet(name, description);
        shelterPets.put(name, petToAdmit);
        shelterSize = shelterPets.size();
        shelterPetNames.add(name);
        return shelterSize;
    }

    public int adopt(String name) {
        shelterPets.remove(name);
        shelterSize = shelterPets.size();
        shelterPetNames.remove(name);
        return shelterSize;
    }

    public ArrayList feedAll() {
        for (Map.Entry<String, VirtualPet> entry : shelterPets.entrySet()) {
            VirtualPet feedPets = entry.getValue();
            feedPets.setHunger(50);
            petHungers.add(feedPets.getHunger());
        }

        return petHungers;
    }

    public ArrayList waterAll() {
        for (Map.Entry<String, VirtualPet> entry : shelterPets.entrySet()) {
            VirtualPet waterPets = entry.getValue();
            waterPets.setThirst(50);
            petThirsts.add(waterPets.getThirst());
        }

        return petThirsts;
    }

    public LinkedHashMap<String, Integer> play(String name) {
        VirtualPet playPet = shelterPets.get(name);
        playPet.setBoredom(50);

        for (Map.Entry<String, VirtualPet> entry : shelterPets.entrySet()) {
            playPet = entry.getValue();
            petBoredoms.put(playPet.getName(), playPet.getBoredom());
        }

        return petBoredoms;
    }

    public int displayPets() {
        int i = 0;
        for (Map.Entry<String, VirtualPet> entry : shelterPets.entrySet()) {
            VirtualPet displayPet = entry.getValue();
            System.out.println(displayPet.getName() + " \t " + displayPet.getHunger() + " \t " + displayPet.getThirst() + " \t " + displayPet.getBoredom());
            i++;
        }

        return i;
    }

    public int displayPetDescriptions() {
        int i = 0;
        for (Map.Entry<String, VirtualPet> entry : shelterPets.entrySet()) {
            VirtualPet displayPet = entry.getValue();
            System.out.println(displayPet.getName() + ", " + displayPet.getDescription() + "\n");
            i++;
        }

        return i;
    }

    public void tick() {
        for (Map.Entry<String, VirtualPet> entry : shelterPets.entrySet()) {
            VirtualPet playPet = entry.getValue();
            playPet.setBoredom(playPet.getBoredom() - seedGet());
            playPet.setThirst(playPet.getThirst() - seedGet());
            playPet.setHunger(playPet.getHunger() - seedGet());
        }
    }

    public LinkedHashMap<String, VirtualPet> getShelterPets() {
        return shelterPets;
    }

    public VirtualPet getPet(String name) {
        return shelterPets.get(name);
    }
}
