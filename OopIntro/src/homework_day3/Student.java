package homework_day3;

public class Student extends User {
    private double campCompletePercent;

    private boolean graduate;

    public double getCampCompletePercent() {
        return campCompletePercent;
    }

    public void setCampCompletePercent(double campCompletePercent) {
        this.campCompletePercent = campCompletePercent;
    }

    public boolean isGraduate() {
        if (this.campCompletePercent == (double) 100) {
            return true;
        }
        return false;
    }


    public Student() {
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " graduated: " + isGraduate();
    }

    @Override
    public void add(User user){
        System.out.println("Student " + user.getName() + "added.");
    }
}
