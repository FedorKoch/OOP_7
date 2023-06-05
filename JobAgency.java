import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();
    private List<Job> vacancies = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * 
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(String nameCompany, double salary) {
        for (Observer observer : observers) {
            observer.receiveOffer(nameCompany, salary);
        }
    }

    @Override
    public void addVacancy(Job vacancy) {
        vacancies.add(vacancy);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            for (Job offer : vacancies) {
                observer.receiveVacancy(offer);
            }

        }
    }
}