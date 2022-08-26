package labka.lesson.com.services;

import labka.lesson.com.models.Person;

import java.io.BufferedReader;
import java.io.IOException;

public class CreateNewPerson
{

    public Person cretePerson(BufferedReader reader)
    {
        Person person = new Person();

        try
        {
            System.out.print("Enter person firstname: ");
            person.setFirstName(reader.readLine());
            System.out.print("Enter person lastname: ");
            person.setLastName(reader.readLine());
            System.out.print("Enter person age: ");
            person.setAge(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return person;
    }

}
