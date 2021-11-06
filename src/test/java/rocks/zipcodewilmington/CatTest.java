package rocks.zipcodewilmington;

import org.junit.*;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import javax.net.ssl.SSLSession;
import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    private Cat testCat;

    @Before
    public void setUp() throws Exception {
        String name = "Spotty";
        Date birthday = new Date(605334983);
        Integer id = 0;
        testCat = new Cat(name, birthday, id);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
//        //Given
//        String name = "Spotty";
//        Date birthday = new Date();
//        Integer id = 2;
//
//       // When a cat is created
//        Cat cat = new Cat(name, birthday,id);
//
//       // Then (we expect the given data, to match the retrieved data)
//        Assert.assertEquals (name,testCat);

//        //Given
        String newName = "Brownie";

        //When we set the cat's name - change the input
        testCat.setName(newName);
        String actual = testCat.getName();

        // (expected,actual code path results)
        Assert.assertEquals(newName,actual);
        System.out.println("newName; " + newName + "actual;" + actual);

    }

    @Test
    public void setBirthDateTest() {
        //Given information on the cat
        Date birthDay = new Date(629094983);

        //When we set the name of the cat
        testCat.setBirthDate(birthDay);

        //expected
        Assert.assertEquals(birthDay,testCat.getBirthDate());
    }

    @Test
    public void speakTest() {
        //Given expected cat speech
        String expectedSpeak = "meow!";

        Assert.assertEquals(expectedSpeak, testCat.speak());

    }


    @Test
    public void mealEatenTest() {
        //Given food
        Food newFood = new Food();
        Integer expectedNumberMeals = 1;

        //When cat is eat food
        testCat.eat(newFood);

        //expected
        Assert.assertEquals(expectedNumberMeals, testCat.getNumberOfMealsEaten());
    }

    @Test
    public void getCatIdTest() {
        //Given an expected ID of cat is zero because have set it in the @before
        Integer expectedIdOfCat = 0;
        //When you get the cat ID, actually ID
        Integer actualId = testCat.getId();
        //Then
        Assert.assertEquals(expectedIdOfCat,actualId);

    }


    @Test
    public void inhertianceMammalTest() {
        //given
        boolean isMammal = testCat instanceof Mammal; //is the cat related to the mammal, did the cat inherit the attributes of the mammal

        Assert.assertTrue(isMammal); //is test class cat is mammal
    }

    @Test
    public void inhertianceAnimalTest() {
        //Given
        boolean isAnimal = testCat instanceof Animal;

        Assert.assertTrue(isAnimal);
    }
}
