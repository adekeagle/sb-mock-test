package pl.adcom.sbmocktest;

import java.util.List;

public interface AnimalService {
    List<Animal> getAnimals();
    void add(Animal animal);
}
