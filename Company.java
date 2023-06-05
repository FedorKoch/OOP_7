import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    

    private Publisher jobAgency;
    private JobFactory jobFactory;

    public Company(Publisher jobAgency, String nameCompany, double maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        random = new Random();
        jobFactory = new VacancyFactory(nameCompany, maxSalary);
    }
    
    
    public Job createVacancy(String position) {
        // Создание нового объекта класса Vacancy
        Job vacancy = jobFactory.createVacancy(position);
        return vacancy;
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }

    public void needSpecialist(){

    }

}