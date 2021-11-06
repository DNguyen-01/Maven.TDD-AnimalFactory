package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    private Dog testDog;

    @Before
    public void setUp() throws Exception {
        String name = "Simba";
        Date birthday = new Date();
        Integer id = 0;
        testDog = new Dog(name, birthday, id);

    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void getNameTest() {
        //Given
        String newName = "Brownie";
        //When
        testDog.setName(newName);
        String actual = testDog.getName();
        //Then
        Assert.assertEquals(newName,actual);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        Date birthday = new Date();

        //When
        testDog.setBirthDate(birthday);

        //expected
        Assert.assertEquals(birthday, testDog.getBirthDate());
    }

    @Test
    public void speakTest() {
        //Given
        String expecetedSpeak = "bark!";

        Assert.assertEquals(expecetedSpeak, testDog.speak());

    }

    @Test
    public void getDogIdTest() {
        //Given an expected ID of dog is zero because have set it in the @before
        Integer expectedIdOfDog = 0;
        //When you get the cat ID, actually ID
        Integer actualId = testDog.getId();
        //Then
        Assert.assertEquals(expectedIdOfDog,actualId);
    }

    @Test
    public void inhertianceMammalTest() {
        //given
        boolean isMammal = testDog instanceof Mammal; //is the cat related to the mammal, did the cat inherit the attributes of the mammal

        Assert.assertTrue(isMammal); //is test class dog is mammal
    }

    @Test
    public void inhertianceAnimalTest() {
        //Given
        boolean isAnimal = testDog instanceof Animal;

        Assert.assertTrue(isAnimal);
    }

}

