class Student {
    private int Student_id;
    private String Student_name;
    private int Student_age;
    private Double Student_marks;
    
    public Student(int Student_id, String Student_name){
        this.Student_id = Student_id;
        this.Student_name = Student_name;
        this.Student_age = 0;
        this.Student_marks = 0.0;
    }
    public Student(int Student_id, String Student_name, int Student_age, Double Student_marks){
        this.Student_id = Student_id;
        this.Student_name = Student_name;
        this.Student_age = Student_age;
        this.Student_marks = Student_marks;
    }

    public int getStudent_id() {
        return Student_id;
    }
    public String getStudent_name() {
        return Student_name;
    }
    public  int getStudent_age(){
        return Student_age;
    }
    public Double getStudent_marks(){
        return Student_marks;
    }

    public void setStudent_id(int Student_id){
        this.Student_id = Student_id;
    }
    public void setStudent_name(String Student_name){
        this.Student_name = Student_name;
    }
    public void setStudent_age(int age){
        this.Student_age = age;
    }
    public void setStudent_marks(Double marks){
        this.Student_marks = marks;
    }

    public void Display(){
        System.out.println("Student ID: " + getStudent_id());
        System.out.println("Student Name: " + getStudent_name());
        System.out.println("Student Age: " + getStudent_age());
        System.out.println("Student Marks: " + getStudent_marks());
    }

}


public class Student_Mn {
    public static void main(String[] args){
        Student Student1 = new Student(101, "John Doe");
        Student Student2 = new Student(102, "Jane Smith", 20, 85.5);
        Student1.Display();
        Student2.Display();
    }

}
