class Student {
    private String name;
    private int id;
    private double cgpa;
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Raiyanul");
        s.setId(253048);
        s.setCgpa(3.302);

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("CGPA: " + s.getCgpa());
    }
}
