package pl.adcom.sbmocktest;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AnimalControllerTest {

    @Test
    public void getAllAnimals() {
//        given
        AnimalController animalController = mock(AnimalController.class);
        when(animalController.getAllAnimals()).thenReturn(prepareMockData());
//        when
        List<Animal> allAnimals = animalController.getAllAnimals();
//        then
        Assert.assertThat(allAnimals, Matchers.hasSize(2));
    }


//    BDD
    @Test
    public void getAllAnimals_withBDD() {
//        given
        AnimalController animalController = mock(AnimalController.class);
        given(animalController.getAllAnimals()).willReturn(prepareMockData());
//        when
        List<Animal> allAnimals = animalController.getAllAnimals();
//        then
        Assert.assertThat(allAnimals, Matchers.hasSize(2));
    }

    private List<Animal> prepareMockData(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1L, "cat"));
        animals.add(new Animal(2L, "dog"));
//        animals.add(new Animal(3L, "rat"));
        return animals;
    }

    @Test
    void addAnimal() {
        //        given
        AnimalController animalController = mock(AnimalController.class);
        given(animalController.addAnimal(Mockito.any(Animal.class))).willReturn(new Animal(4L, "dog"));
//        when
        Animal animal = animalController.addAnimal(new Animal());
//        them
        Assert.assertEquals(animal.getName(), "dog");
    }
}