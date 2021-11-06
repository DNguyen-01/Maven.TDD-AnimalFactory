package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void addCatTest(){
        //given
        CatHouse.clear(); //calls the .clear() method to clear the cat house
        Cat expected = new Cat("name", new Date(),4); //using the house
        //when
        CatHouse.add(expected); //adding expected to the cathouse
        //then
        Cat actual = CatHouse.getCatById(4); //we check the cathouse to see how to fetch it, and we match the id with the expected variable id.
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeCatTest(){
        //given an empty cathouse
        CatHouse.clear();
        Cat expected = new Cat("name", new Date(),4); // we create our own test cat
        CatHouse.add(expected); //we add the cat to the cathouse
        //when
        CatHouse.remove(expected); //remove the cat
        Cat actual = CatHouse.getCatById(4); //we try to find the cat id(4)
        //then
        Assert.assertNull(actual); //We expect the cat to not be there.We utilize the helper method (assertNull)

    }

    @Test
    public void removeCatByNameTest(){
        //given an empty cathouse
        CatHouse.clear();
        Cat expected = new Cat("name", new Date(),4); // we create our own test cat
        CatHouse.add(expected); //we add the cat to the CatHouse
        //when
        CatHouse.remove(expected);
        Cat actual = CatHouse.getCatById(4);
        //then
        Assert.assertNull(actual);
    }

    @Test
    public void removeCatCat(){
        //given an empty cathouse
        CatHouse.clear();
        Cat expected = new Cat("name", new Date(),4); // we create our own test cat
        CatHouse.add(expected); //we add the cat to the CatHouse
        //when
        CatHouse.remove(expected);
        Cat actual = CatHouse.getCatById(4);
        //then
        Assert.assertNull(actual);
    }

    @Test
    public void getCatById(){
        //given an empty cathouse
        CatHouse.clear();
        Cat expected = new Cat("name", new Date(),4);
        CatHouse.add(expected);
        //When
        CatHouse.getCatById(4);
        Cat actual = CatHouse.getCatById(4);
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getNumberOfCats(){
        //given
        CatHouse.clear();
        Cat expected = new Cat("name", new Date(),4);
        CatHouse.add(expected);
        int expectedCat = 1;
        //When
        Integer actualNumberOfCats = CatHouse.getNumberOfCats(); //we get the number of cats by calling
        //upon the method in CatHouse.
        //Then
        Assert.assertEquals(Integer.valueOf(expectedCat),actualNumberOfCats);
        //We assert that the expected number of cats would be the same as the actual number of cats
        //the use of the .valueOf (Helper method) allows us to box the int(primitive type) into an
        //Integer to match the CatHouse method type.
    }

}



