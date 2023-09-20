package homework_day3;
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Said");
        student1.setSurname("Gulizada");
        student1.setEmail("sg04@gmail.com");
        student1.setCampCompletePercent(100.0);

        Student student2 = new Student();
        student2.setName("Yusif");
        student2.setSurname("Guliyev");
        student2.setEmail("yg06@gmail.com");
        student2.setCampCompletePercent(83.0);

        Student[] students = {student1,student2};

        for (Student student : students){
            System.out.println(student.toString());
        }


        Instructor instructor1 = new Instructor("Engin", "Demirog", "engin.demirog@gmail.com", "Java", 20000);
        Instructor instructor2 = new Instructor("Nicat", "Memmedli", "nicimici@gmail.com", "Python", 15000);


        User[] users = {student1,student2,instructor1,instructor2};

        for (User user : users){
            user.add(user);
        }


        
    }
}
