package labka.lesson.com.services;

import labka.lesson.com.models.Employer;
import labka.lesson.com.models.Person;
import labka.lesson.com.models.PositionTitle;

import java.io.BufferedReader;
import java.io.IOException;

public class CreateNewEmployer
{
    static CreateNewPerson createNewPerson = new CreateNewPerson();

    public Employer creteNewEmployer(BufferedReader reader) throws IOException
    {
        Person person = createNewPerson.cretePerson(reader);
        Employer employer = new Employer(person);

        System.out.print("Enter new employer stage: ");
        int stageOfWork = Integer.parseInt(reader.readLine());

        PositionTitle positionTitle = getPositionByStage(stageOfWork);

        employer.setPositionTitle(positionTitle.getPositionName());
        employer.setMonthSalary(positionTitle.getPositionSalary());
        employer.setStageOfWork(stageOfWork);

        return employer;
    }

    private PositionTitle getPositionByStage(double stageOfWork)
    {
        assert stageOfWork > 0 : "Not enough stage";

        if (stageOfWork <= 1)
            return PositionTitle.JUNIOR;
        if (stageOfWork <= 3)
            return PositionTitle.MIDDLE;
        return PositionTitle.SENIOR;
    }
}
