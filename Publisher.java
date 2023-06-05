public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void addVacancy(Job vacancy);

    void notifyObservers();

    void sendOffer(String nameCompany, double salary);

}