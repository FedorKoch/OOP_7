public class Program {

    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company(jobAgency, "GeekBrains", 70000);
        Company google = new Company(jobAgency, "Google", 100000);
        Company yandex = new Company(jobAgency, "Yandex", 120000);
        
        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Student petrov = new Student("Petrov");
        Senior kotov = new Senior("Kotov");
        
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(kotov);

        jobAgency.addVacancy(geekBrains.createVacancy("Software Developer"));
        jobAgency.addVacancy(geekBrains.createVacancy("Mobile Developer"));
        jobAgency.addVacancy(geekBrains.createVacancy("System Administrator"));
        
        jobAgency.addVacancy(google.createVacancy("Data Analyst"));
        jobAgency.addVacancy(google.createVacancy("Information Security Specialist"));
        jobAgency.addVacancy(google.createVacancy("Network Engineer"));

        jobAgency.addVacancy(yandex.createVacancy("Web Developer"));
        jobAgency.addVacancy(yandex.createVacancy("Project Manager"));
        jobAgency.addVacancy(yandex.createVacancy("Technical Writer"));
        
        jobAgency.notifyObservers();

    }

}