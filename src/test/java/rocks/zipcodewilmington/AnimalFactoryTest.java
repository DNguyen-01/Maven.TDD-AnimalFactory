package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void CreateDogTest() {
        //given
        String expectedName = "Simba";
        Date expectedBirthDate = new Date();

        //When
        Dog actualDog = AnimalFactory.createDog(expectedName, expectedBirthDate); //assert to make it clean,

        //Then
        Assert.assertEquals(expectedName, actualDog.getName());
        Assert.assertEquals(expectedBirthDate, actualDog.getBirthDate());
    }

    @Test
    public void CreateCatTest() {

        //given
        String expectedName = "Feline";
        Date expectedBirthDate = new Date();

        //When
        Cat actualCat = AnimalFactory.createCat(expectedName, expectedBirthDate); //assert to make it clean,

        //Then
        Assert.assertEquals(expectedName, actualCat.getName());
        Assert.assertEquals(expectedBirthDate, actualCat.getBirthDate());

    }
}