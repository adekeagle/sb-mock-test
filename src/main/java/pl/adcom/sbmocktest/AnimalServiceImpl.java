package pl.adcom.sbmocktest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService{

    private List<Animal> animalList;

    public AnimalServiceImpl() {
        animalList = new ArrayList<>();
        animalList.add(new Animal(1L, "cat"));
        animalList.add(new Animal(2L, "dog"));
    }

    @Override
    public List<Animal> getAnimals() {
        return animalList;
    }

    @Override
    public void add(Animal animal) {
        animalList.add(animal);
    }
}
