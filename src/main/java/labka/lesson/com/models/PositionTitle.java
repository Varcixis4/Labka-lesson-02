package labka.lesson.com.models;

public enum PositionTitle
{
    JUNIOR("Junior Java Software Engineer", 500),
    MIDDLE("Middle Java Software Engineer", 2000),
    SENIOR("Senior Java Software Engineer", 5000);

    private final String positionName;
    private final double positionSalary;

    PositionTitle(String positionName, double positionSalary)
    {
        this.positionName = positionName;
        this.positionSalary = positionSalary;
    }

    public String getPositionName()
    {
        return positionName;
    }

    public double getPositionSalary()
    {
        return positionSalary;
    }
}
