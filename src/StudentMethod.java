import java.util.Scanner;

public class StudentMethod {
    public String firstName;
    public String lastName;
    public static int studentID;
    public static int id = 0;
    public int totalClass = 180;
    public static int presentDay;
    public static int pD = 0;
    public static int exAbsentDay;
    public static int eAD = 0;
    public static int unEXabsentDay;
    public static int uAD = 0;
    public static int remainingClass = 180 - presentDay+exAbsentDay+unEXabsentDay;

    public void Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        setStudentID();
        System.out.println(firstName + " "+ lastName + "\nStudent ID is: "+ studentID);
    }
    public void setStudentID(){
        id++;
        this.studentID = id;
    }
    public void Attendence(){

        System.out.println("Today you are:\nPresent= use PresentMethod\nExcused Absent = use EAmethod\nUnexcused Absent = use UAmethod");
    }
    public void PresentMethod(){
        pD++;
        this.presentDay=pD;
        System.out.println("Total present day is: "+ presentDay);
    }
    public void EAmethod(){
        eAD++;
        this.exAbsentDay=eAD;
        System.out.println("Total excused absent day is: "+ exAbsentDay);
    }
    public void UAmethod(){
        uAD++;
        this.unEXabsentDay=uAD;
        System.out.println("Total unexcused absent day is: "+ presentDay);
    }
    public void AttendenceRecord(){
        System.out.println(firstName+ " "+ lastName+ "\n"+ studentID);
        System.out.println("Total present day is: "+presentDay+"\n Total excused absent day is: "+ exAbsentDay+"\nTotal unexcused absent day is: "+unEXabsentDay);
        double percentageOfPresent = (presentDay*100)/180;
        System.out.println("Total percentage of present day is: "+ percentageOfPresent);
        if (percentageOfPresent>70){
            System.out.println("You are the future of the institution");
        }
        else if (percentageOfPresent<70 && percentageOfPresent>= 50){
            System.out.println("keep trying to attend regularly");
        }
        else {
            System.out.println("You are ineligible to attend this year");
        }
    }


}
