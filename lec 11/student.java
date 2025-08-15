class teacher{
        String teachername;
        int salaries;
        String department;
    }

public class student {
    int rollno;
    String studentname;

    

    public static void main(String[] args) {
        student sc = new student();
        sc.rollno = 1;
        sc.studentname = "abhi";
        System.out.println(sc.rollno);
        System.out.println(sc.studentname);

        teacher t = new teacher();
        t.teachername = "ramesh";
        t.salaries = 5000;
        t.department = "cs";

        System.out.println(t.department);
        System.out.println(t.teachername);

        
    }

}
