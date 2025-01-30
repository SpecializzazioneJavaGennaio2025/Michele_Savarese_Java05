
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Person> people = List.of(
                new Person("Kevin", Gender.MALE),
                new Person("Bacon", Gender.FEMALE),
                new Person("Female", Gender.MALE),
                new Person("Male", Gender.FEMALE),
                new Person("Monica", Gender.FEMALE)
        );

        // //! approccio imperativo
        // List<Person> female = new ArrayList<>();
        // for (Person person : people) {
        //     // if (person.gender == Gender.FEMALE)
        //     // female.add(person);

        //     if (Gender.FEMALE.equals(person.gender)) {
        //         female.add(person);
        //     }
        // }

        // for (Person person : female) {
        //     System.out.println(person.name);
        // }
        System.out.println("Dati Filtrati: \n");

//! approccio dichiarativo
people.stream().filter(person-> Gender.FEMALE.equals(person.gender))
.collect(Collectors.toList())
.forEach(person->System.out.println(person.name));

System.out.println("Dati originali: \n");
for(Person person :people){
    System.out.println(person.name);
}

    }
}
