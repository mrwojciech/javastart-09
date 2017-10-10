package ZadanieD01;

public class Test {
    public static void main(String[] args) {


        Person person = new Person();
//        Person person1 = new Person(null,"fdsfds","dsadsa",23);

        PersonManager personManager = new PersonManager();

        person = personManager.createPersonFromKeyboardInput();

        System.out.println(person);
    }

}
