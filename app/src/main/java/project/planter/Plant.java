package project.planter;

public class Plant {

    private String name;
    private String species;

    Plant(String name, String species) {

        this.name = name;
        this.species = species;

    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}
