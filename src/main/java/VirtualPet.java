public class VirtualPet {
    private int hunger = 45;
    private int thirst = 45;
    private int boredom = 45;
    private String name = "";
    private String description = "";

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int setHunger(int hunger) {
        this.hunger = hunger;
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int setThirst(int thirst) {
        this.thirst = thirst;
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int setBoredom(int boredom) {
        this.boredom = boredom;
        return boredom;
    }
}
