package labka.lesson.com;

import labka.lesson.com.models.Employer;
import labka.lesson.com.services.CreateNewEmployer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static CreateNewEmployer createNewEmployer = new CreateNewEmployer();
    static boolean systemIsRun = true;

    public static void main(String[] args) throws IOException
    {
        List<Employer> employerList = new ArrayList<>();

        do {
            System.out.println("Register new employer in system? 1 - yes | another - no");
            String option = reader.readLine();

            if (option.equals("1")) {
                employerList.add(createNewEmployer.creteNewEmployer(reader));
                System.out.println("New employer was added");
            } else {
                systemIsRun = false;
            }

        } while (systemIsRun);

        for (Employer employer : employerList) {
            System.out.println(employer.toString());
        }
    }
}