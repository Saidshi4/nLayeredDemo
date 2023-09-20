package homework_day3;
public class Instructor extends User {
    String teach_language;
    double salary;

    public Instructor(){

    }
    public Instructor(String name, String surname, String email, String teach_language, double salary) {
        super(name, surname, email);
        this.teach_language = teach_language;
        this.salary = salary;
    }

    @Override
    public void add(User user){
        System.out.println("Instructor " + user.getName() + "added.");
    }
}
