package labka.lesson.com.models;

public class Employer extends Person
{
    private String positionTitle;
    private double monthSalary;
    private int stageOfWork;

    @Override
    public String toString()
    {
        return super.getFullName() + " | position - " + positionTitle + " | salary - " + monthSalary + " | stage - " + stageOfWork;
    }

    public Employer(Person person)
    {
        super(person.getFirstName(), person.getLastName(), person.getAge());
    }

    public String getPositionTitle()
    {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle)
    {
        this.positionTitle = positionTitle;
    }

    public double getMonthSalary()
    {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary)
    {
        this.monthSalary = monthSalary;
    }

    public int getStageOfWork()
    {
        return stageOfWork;
    }

    public void setStageOfWork(int stageOfWork)
    {
        this.stageOfWork = stageOfWork;
    }
}
