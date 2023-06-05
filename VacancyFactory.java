import java.util.Random;

public class VacancyFactory implements JobFactory {

    private String nameCompany;
    private double maxSalary;
    private Random random;

    public VacancyFactory(String nameCompany, double maxSalary) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.random = new Random();
    }

    @Override
    public Vacancy createVacancy(String position) {
        return new Vacancy(nameCompany,
                random.nextDouble(3000, maxSalary),
                position);
    }

}