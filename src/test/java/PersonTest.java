import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person test;


    @BeforeEach
        public void init(){
         test = new Person("Barbara", "Steissand", "female", 67);
    }

    @Test
    void addParent(Person mother, Person father){
        //arrange
        Person testmother = new Person("Moeder", "van", "Klaas", "female", 43);
        Person testfather = new Person("Vader", "van", "Klaas", "male", 45);

        //Act
        test.addParent(testmother, testfather);

        //assert
        Assertions.assertEquals( test.getFather().getName().equals("Vader"), "Vader");
    }
/*

    @Test
    void addPet(Pet pet){
        pets.add(pet);
    }
*/

    @Test
    void getMiddleName() {
        // Arrange
        Person testpersoon = new Person("Barbara", "de", "Pauw", "female", 67);
        // ACT
        String result = testpersoon.getMiddleName();
        // assert
        Assertions.assertEquals("de", result);
        }

    @Test
    void getName() {
        // Arrange
        Person test = new Person("Barbara", "Steissand", "female", 67);
        // ACT
        String result = test.getName();
        // assert
        Assertions.assertEquals("Barbara", result);
    }

    @Test
    void getSex() {

        //Arrange
        //Act
        String result = test.getSex();
        //assert
        Assertions.assertEquals("female", result);
    }

    @Test
    public void getFather(){
    // arrange
        Person test = new Person("Barbara", "Steissand", "female", 67);
        Person testFather = new Person("Henk", "Penkie", "male", 167);
        test.setFather(testFather);
        // act
        Person result = test.getFather();
        // Assert
        Assertions.assertEquals(testFather, result);
    }




}
