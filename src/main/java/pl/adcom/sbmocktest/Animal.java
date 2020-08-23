package pl.adcom.sbmocktest;

public class Animal {

    private Long animalId;
    private String name;

    public Animal() {
    }

    public Animal(Long animalId, String name) {
        this.animalId = animalId;
        this.name = name;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", name='" + name + '\'' +
                '}';
    }
}
