public class Vacancy extends Job {

    public Vacancy(String nameCompany, double salary, String position) {
        super(nameCompany, salary, position);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getNameCompany() {
        return nameCompany;
    }

    @Override
    public String getPosition() {
        return position;
    }
    
}