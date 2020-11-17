import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMethod {
    public static String nameOfStudent;
    public static int id = 0;
    public static int studentID;
    public int totalClass = 180;
    public static int presentDay;
    public static int pD = 0;
    public static int exAbsentDay;
    public static int eAD = 0;
    public static int unEXabsentDay;
    public static int uAD = 0;
    public static int remainingClass = 180 - presentDay + exAbsentDay + unEXabsentDay;
    Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> StudentList = new ArrayList<>();
    public static ArrayList<String> StudentNameList = new ArrayList<>();
    public static HashMap<Integer, String> StList = new HashMap<>();

    public void newStudent(String name) {
        nameOfStudent = name;
        id++;
        studentID = id;
        System.out.println("Name of the student is:" + name + "\nId is " + studentID);
    }

    public void SList() {
        StudentList.add(studentID);
        StudentNameList.add(nameOfStudent);
        StList.put(studentID, nameOfStudent);
        System.out.println(StudentList);
        System.out.println(StudentNameList);
        System.out.println(StList);
    }

    public void PresentMethod() {
        pD++;
        this.presentDay = pD;
        //System.out.println("Total present day is: " + presentDay);
    }


    public void EAmethod() {
        eAD++;
        this.exAbsentDay = eAD;
        //System.out.println("Total excused absent day is: " + exAbsentDay);
    }

    public void UAmethod() {
        uAD++;
        this.unEXabsentDay = uAD;
        //System.out.println("Total unexcused absent day is: " + unEXabsentDay);
    }
    public String notifyTeacher() {
        Scanner sc = new Scanner(System.in);
        String msg = "Please enter the message";
        System.out.println(msg);
        String message = sc.nextLine();
        System.out.println("Please enter the number of day you want to absent:");
        int day = sc.nextInt();
        exAbsentDay = exAbsentDay + day;
        System.out.println("Thank you for letting us know");
        return msg;


    }

    public void AttendenceRecord() {
        System.out.println("Student name is:" + nameOfStudent + "\n" + "Student ID is: " + studentID);
        System.out.println("Total present day is: " + presentDay + "\n Total excused absent day is: " + exAbsentDay + "\nTotal unexcused absent day is: " + unEXabsentDay);
        double percentageOfPresent = (presentDay * 100) / 180;
        System.out.println("Total percentage of present day is: " + percentageOfPresent);
        if (percentageOfPresent > 70) {
            System.out.println("You are the future of the institution");
        } else if (percentageOfPresent < 70 && percentageOfPresent >= 50) {
            System.out.println("keep trying to attend regularly");
        } else {
            System.out.println("You are ineligible to attend this year");
        }
    }

    public void viewRecord() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your ID: ");
        int ID = in.nextInt();
        String ID1 = StList.get(ID);
        System.out.println("Student name is: "+ ID1 +"\nID number is: "+ID);
        System.out.println("Total present day is: " + presentDay);
        System.out.println("Total unexcused absent day is: " + unEXabsentDay);
        System.out.println("Total excused absent day is: " + exAbsentDay);

    }




    public static void main(String[] args) {
        StudentMethod student1 = new StudentMethod();
        student1.newStudent("fahim");
        student1.SList();
        student1.PresentMethod();
        student1.PresentMethod();
        student1.PresentMethod();
        student1.PresentMethod();
        student1.PresentMethod();
        student1.PresentMethod();
        student1.PresentMethod();
        student1.notifyTeacher();

        student1.viewRecord();

        StudentMethod student2 = new StudentMethod();
        student2.newStudent("mohi");
        student2.SList();
        student2.PresentMethod();
        student2.viewRecord();
        StudentMethod student3 = new StudentMethod();
        student3.newStudent("sohu");
        student3.SList();
        StudentMethod student4 = new StudentMethod();
        student4.newStudent("kan");
        student4.SList();
        StudentMethod student5 = new StudentMethod();
        student5.newStudent("san");
        student5.SList();
        StudentMethod student6 = new StudentMethod();
        student6.newStudent("pan");
        student6.SList();
        StudentMethod student7 = new StudentMethod();
        student7.newStudent("chan");
        student7.SList();
        StudentMethod student8 = new StudentMethod();
        student8.newStudent("tan");
        student8.SList();
        StudentMethod student9 = new StudentMethod();
        student9.newStudent("dan");
        student9.SList();
        StudentMethod student10 = new StudentMethod();
        student10.newStudent("van");
        student10.SList();
        StudentMethod student11 = new StudentMethod();
        student11.newStudent("qan");
        student11.SList();
        StudentMethod student12 = new StudentMethod();
        student12.newStudent("lan");
        student12.SList();
        StudentMethod student13 = new StudentMethod();
        student13.newStudent("han");
        student13.SList();
        StudentMethod student14 = new StudentMethod();
        student14.newStudent("nan");
        student14.SList();
        StudentMethod student15 = new StudentMethod();
        student15.newStudent("man");
        student15.SList();

        




    }


}
