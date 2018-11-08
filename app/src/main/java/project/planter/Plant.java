package project.planter;

public class Plant {

    private String name;
    private String species;
    private String fertilizer;

    Plant(String name, String species, String fertilizer) {

        this.name = name;
        this.species = species;
        this.fertilizer = fertilizer;

    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getFertilizer() {
        return fertilizer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }

}
