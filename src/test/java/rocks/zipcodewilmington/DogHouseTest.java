package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void removeDogTest() {

        //Given the doghouse, we clear te doghouse
        DogHouse.clear();
        Dog expected = new Dog("name", new Date(), 4); //we create the new dog
        DogHouse.add(expected);
        //When
        DogHouse.remove(expected); //remove the dog
        Dog actual = DogHouse.getDogById(4);
        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void removeDogDogTest() {
        //Given
        DogHouse.clear();
        Dog expected = new Dog("name", new Date(), 4); //we create the new dog
        DogHouse.add(expected);
        //When
        DogHouse.remove(expected); //remove the dog
        Dog actual = DogHouse.getDogById(4);
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void getDogByIdTest() {
        //Given
        DogHouse.clear();
        Dog expected = new Dog("name", new Date(), 4); //we create the new dog
        DogHouse.add(expected);
        //When
        DogHouse.getDogById(4);
        Dog actual = DogHouse.getDogById(4);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfDogs(){
        //Given
        DogHouse.clear();
        Dog expected = new Dog("name", new Date(), 4);
        DogHouse.add(expected);
        int expectedDog = 1;
        //When
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(Integer.valueOf(expectedDog), actualNumberOfDogs);

    }
}
